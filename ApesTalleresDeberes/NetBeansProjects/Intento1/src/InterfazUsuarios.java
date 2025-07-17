import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class InterfazUsuarios extends JFrame {
    private JTextField campoDocumento;
    private JTextArea areaResultado;
    private static final String ARCHIVO = "C:\\Users\\Sebas\\Documents\\NetBeansProjects\\Intento1\\src\\DATOS INTENTO 1.txt";

    public InterfazUsuarios() {
        setTitle("Gestión de Usuarios");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.add(new JLabel("Documento (10 dígitos):"));
        campoDocumento = new JTextField(15);
        panelSuperior.add(campoDocumento);
        JButton btnBuscar = new JButton("Buscar");
        panelSuperior.add(btnBuscar);

        areaResultado = new JTextArea(10, 40);
        areaResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultado);

        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        btnBuscar.addActionListener(e -> buscarUsuario());

        setVisible(true);
    }

    private void buscarUsuario() {
        String doc = campoDocumento.getText().trim();
        if (doc.length() != 10) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un documento de 10 caracteres.");
            return;
        }

        Usuario usuario = null;
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos[0].equals(doc)) {
                    usuario = new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
                    break;
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error leyendo archivo.");
        }

        if (usuario != null) {
            areaResultado.setText(usuario.toString());
        } else {
            int opcion = JOptionPane.showConfirmDialog(this, "Usuario no encontrado. ¿Desea crear uno nuevo?");
            if (opcion == JOptionPane.YES_OPTION) {
                crearUsuario(doc);
            }
        }
    }

    private void crearUsuario(String doc) {
        JTextField nombre = new JTextField();
        JTextField apellidos = new JTextField();
        JTextField area = new JTextField();
        JTextField cargo = new JTextField();
        JTextField correo = new JTextField();
        JTextField telefono = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("Nombre:")); panel.add(nombre);
        panel.add(new JLabel("Apellidos:")); panel.add(apellidos);
        panel.add(new JLabel("Área:")); panel.add(area);
        panel.add(new JLabel("Cargo:")); panel.add(cargo);
        panel.add(new JLabel("Correo:")); panel.add(correo);
        panel.add(new JLabel("Teléfono:")); panel.add(telefono);

        int result = JOptionPane.showConfirmDialog(this, panel, "Crear nuevo usuario", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Usuario nuevo = new Usuario(doc, nombre.getText(), apellidos.getText(), area.getText(),
                                        cargo.getText(), correo.getText(), telefono.getText());
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
                bw.write(nuevo.toLinea());
                bw.newLine();
                areaResultado.setText("Usuario creado exitosamente:\n" + nuevo);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error escribiendo archivo.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InterfazUsuarios::new);
    }
}
