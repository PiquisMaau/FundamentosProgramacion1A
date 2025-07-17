import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Pregunta1 {

    public static LinkedList<PreoductosExportacion> CargarListaConArchivo(String ruta_) {
        LinkedList<PreoductosExportacion> Productos = new LinkedList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta_))) {
            String linea1;

            boolean primeralinea1 = true;
            while ((linea1 = lector.readLine()) != null) {
                if (primeralinea1 == true) {
                    primeralinea1 = false;
                    continue;
                }
                String[] partes = linea1.split(";");

                if (partes.length == 7) {
                    int ID = Integer.parseInt(partes[0]);
                    String Mes = partes[1];
                    int Year = Integer.parseInt(partes[2]);
                    String Pais = partes[3];
                    String TipoProducto = partes[4];
                    int PesoToneladas = Integer.parseInt(partes[5]);
                    double MontoMillones = Double.parseDouble(partes[6]);

                    PreoductosExportacion productos1 = new PreoductosExportacion(ID, Mes, Year, Pais, TipoProducto,
                            PesoToneladas, MontoMillones);
                    Productos.add(productos1);
                }
            }
        } catch (IOException ex) {
            System.out.println("Hubo un error al momento de cargar el archivo: " + "\n" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Hubo un error al momento de cargar el archivo: " + "\n" + ex.getMessage());
        }
        return Productos;
    }

    public static void ImprimirLista(LinkedList<PreoductosExportacion> Productos_) {

        System.out.println("---------------- Impresion de la LISTA de PRODUCTOS ---------------");
        for (PreoductosExportacion producto : Productos_) {
            System.out.println(producto.toString());
        }

    }

    public static void main(String[] args) {

        String ruta = "src\\ProductosExportacion (3).csv";

        LinkedList<PreoductosExportacion> Productos = CargarListaConArchivo(ruta);

        ImprimirLista(Productos);

    }

}
