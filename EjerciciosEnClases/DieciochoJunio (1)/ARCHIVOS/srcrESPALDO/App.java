import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class App {

    public static LinkedList<dELITO> CargarListaDeLosArchivosDeTexto(String ruta_) {
        LinkedList<dELITO> liasta = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta_))) {
            String linea;
            // Controlar la PRIMERA LINEA
            boolean primeralinea = true;

            while ((linea = reader.readLine()) != null) {
                // Saltar CABECERA
                if (primeralinea == true) {
                    primeralinea = false;
                    continue; // Hace que recorra sin romper el ciclo
                }
                String[] partes = linea.split(";"); // funcion split convierte cadenas en vectores en funcion de un separador
                if (partes.length == 4) {
                    String provincia = partes[0];
                    String delito = partes[1];
                    boolean judicalizado = Boolean.parseBoolean(partes[2]);
                    String victima = partes[3];

                    dELITO delito1 = new dELITO(delito, judicalizado, provincia, victima);
                    liasta.add(delito1);
                }
            }
        } catch (IOException ex) {
            // TODO: Handle exCeption
            System.out.println("Hubo un error al momento de cargar el archivo: " + "\n" + ex.getMessage());
        } catch (Exception ex) {
            // TODO: Handle exception
            System.out.println("Hubo un error al momento de cargar el archivo: " + "\n" + ex.getMessage());
        }
        return liasta;
    }

    private static void Imprimir(LinkedList<dELITO> lista1) {
        System.out.println("------------------ Imprimiendo LISTA de Delitos -------------------");
        for (dELITO delito : lista1) {
            System.out.println(delito.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("----------- Manejo de ARCHIVOS --------------");

        // No poner RUTAS ABSOLUTAS
        String ruta = "ARCHIVOS\\src\\DelitosProvincia (1).csv";

        LinkedList<dELITO> lista1 = CargarListaDeLosArchivosDeTexto(ruta);
        Imprimir(lista1);

        // Vamos agregar informacion al archivo
        dELITO nuevoDelito = new dELITO("Peculado", true, "Loja", "EEL");

        extracted2(ruta, nuevoDelito);

        lista1 = CargarListaDeLosArchivosDeTexto(ruta);
        Imprimir(lista1);
    }

    private static void extracted2(String ruta, dELITO nuevoDelito) {
        try (FileWriter Fw = new FileWriter(ruta, true)) {
            Fw.write("\n" + nuevoDelito.convertirFormatoCSV()); // Agregamos el objeto en formato al archivo
        } catch (IOException e) {
            System.out.println("Hubo un error al momento de escribir el Archivo: " + "\n" + e.getMessage());
        } catch (Exception ex) {
            // TODO: Handle exception
            System.out.println("Hubo un error al momento de escribir los Archivos: " + "\n" + ex.getMessage());
        }
    }
}
