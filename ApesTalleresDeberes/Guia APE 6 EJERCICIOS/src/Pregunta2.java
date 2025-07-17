import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Pregunta2 {

    public static void NuevoDato(PreoductosExportacion Productos_, String ruta_) {
        try (FileWriter ecritor = new FileWriter(ruta_, true)) {
            ecritor.write("\n" + Productos_.ConvertirFormatoCSV());
        } catch (IOException EX) {
            System.out.println("Error no puedes escribir sobre este archivo :v");
        } catch (Exception EX) {
            System.out.println("Error no puedes escribir sobre este archivo :v");
        }

    }

    public static void main(String[] args) {

        String ruta = "src\\ProductosExportacion (3).csv";

        LinkedList<PreoductosExportacion> Productos = Pregunta1.CargarListaConArchivo(ruta);

        NuevoDato(new PreoductosExportacion(501, "Junio", 2021, "Ecuador", "Papas", 55, 2345.565), ruta);

        Pregunta1.ImprimirLista(Productos);

    }

}
