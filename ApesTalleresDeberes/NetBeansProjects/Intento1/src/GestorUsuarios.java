import java.io.*;
import java.util.Scanner;

public class GestorUsuarios {
    private static final String ARCHIVO = "usuarios.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número de documento (10 caracteres): ");
        String documento = scanner.nextLine();

        Usuario usuario = buscarUsuario(documento);
        if (usuario != null) {
            System.out.println("Usuario encontrado:\n" + usuario);
        } else {
            System.out.println("Usuario no encontrado. ¿Desea crear uno nuevo? (s/n)");
            if (scanner.nextLine().equalsIgnoreCase("s")) {
                usuario = crearUsuario(documento, scanner);
                guardarUsuario(usuario);
                System.out.println("Usuario creado exitosamente:\n" + usuario);
            }
        }
    }

    private static Usuario buscarUsuario(String documento) {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos[0].equals(documento)) {
                    return new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo archivo: " + e.getMessage());
        }
        return null;
    }

    private static Usuario crearUsuario(String documento, Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Área de trabajo: ");
        String area = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        return new Usuario(documento, nombre, apellidos, area, cargo, correo, telefono);
    }

    private static void guardarUsuario(Usuario usuario) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            bw.write(usuario.toLinea());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error escribiendo archivo: " + e.getMessage());
        }
    }
}

