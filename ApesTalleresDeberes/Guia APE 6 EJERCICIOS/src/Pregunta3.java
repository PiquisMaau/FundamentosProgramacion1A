
import java.util.LinkedList;

public class Pregunta3 {

    public static void mostrarMontosCentroamerica(LinkedList<PreoductosExportacion> productos) {
        System.out.println("----- MONTOS DE EXPORTACIÓN - CENTROAMÉRICA -----");

        for (PreoductosExportacion producto : productos) {
            String pais = producto.getPais();
            if (pais.equals("Costa Rica") || pais.equals("El Salvador") || pais.equals("Guatemala") ||
                pais.equals("Honduras") || pais.equals("Nicaragua") || pais.equals("Panamá")) {


                System.out.println(producto.MontosDeVenta());
            }
        }
    }

    public static void main(String[] args) {
        String ruta = "src\\ProductosExportacion (3).csv";
        LinkedList<PreoductosExportacion> productos = Pregunta1.CargarListaConArchivo(ruta);

        mostrarMontosCentroamerica(productos);
    }
}
