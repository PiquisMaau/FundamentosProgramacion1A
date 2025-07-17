import java.util.LinkedList;

public class Pregunta5 {

    private static void TipoProducto(LinkedList<PreoductosExportacion> Productos) {
        int ContadorBanano = 0, contadorCacao = 0, contadorCosmeticos = 0, contadorCafe = 0, contadorFlores = 0,
                contadorFrutas = 0, contadorPesca = 0, contadorTextiles = 0;
        double MontoBanano = 0, MontoCacao = 0, MontoCosmeticos = 0, MontoCafe = 0, MontoFlores = 0,
                MontoFrutas = 0, MontoPesca = 0, MontoTextiles = 0;
        for (PreoductosExportacion producto : Productos) {
            switch (producto.getTipoProducto().toLowerCase()) {
                case "banano":
                    ContadorBanano++;
                    MontoBanano += producto.getMontoMillones();
                    break;
                case "cacao":
                    contadorCacao++;
                    MontoCacao += producto.getMontoMillones();

                    break;
                case "cafe":
                    contadorCafe++;
                    MontoCafe += producto.getMontoMillones();

                    break;
                case "cosmeticos":
                    contadorCosmeticos++;
                    MontoCosmeticos += producto.getMontoMillones();

                    break;
                case "flores":
                    contadorFlores++;
                    MontoFlores += producto.getMontoMillones();

                    break;
                case "frutas":
                    contadorFrutas++;
                    MontoFrutas += producto.getMontoMillones();

                    break;
                case "pesca":
                    contadorPesca++;
                    MontoPesca += producto.getMontoMillones();

                    break;
                case "textiles":
                    contadorTextiles++;
                    MontoTextiles += producto.getMontoMillones();

                    break;

            }
        }
        ImprimirCantidadesMonto(ContadorBanano, contadorCacao, contadorCosmeticos, contadorCafe, contadorFlores, contadorFrutas, contadorPesca, contadorTextiles, MontoBanano, MontoCacao, MontoCosmeticos, MontoCafe, MontoFlores, MontoFrutas, MontoPesca, MontoTextiles);
    }

    private static void ImprimirCantidadesMonto(
            int contadorBanano, int contadorCacao, int contadorCosmeticos, int contadorCafe,
            int contadorFlores, int contadorFrutas, int contadorPesca, int contadorTextiles,
            double montoBanano, double montoCacao, double montoCosmeticos, double montoCafe,
            double montoFlores, double montoFrutas, double montoPesca, double montoTextiles) {
        System.out.println("----------------- Cantidad y Monto por tipo de PRODUCTO ---------------");
        System.out.println("Banano: " + contadorBanano + "\tgeneró: "+montoBanano+"$");
        System.out.println("Cacao: " + contadorCacao+ "\tgeneró: "+montoCacao + "$");
        System.out.println("Café: " + contadorCafe+ "\tgeneró: "+montoCafe + "$");
        System.out.println("Cosméticos: " + contadorCosmeticos+ "\tgeneró: "+montoCosmeticos + "$");
        System.out.println("Flores: " + contadorFlores+ "\tgeneró: "+montoFlores + "$");
        System.out.println("Frutas: " + contadorFrutas+ "\tgeneró: "+montoFrutas + "$");
        System.out.println("Pesca: " + contadorPesca+ "\tgeneró: "+montoPesca + "$");
        System.out.println("Textiles: " + contadorTextiles+ "\tgeneró: "+montoTextiles + "$");
    }

    public static void main(String[] args) {
        String ruta = "src\\ProductosExportacion (3).csv";
        LinkedList<PreoductosExportacion> productos = Pregunta1.CargarListaConArchivo(ruta);

        TipoProducto(productos);        
    }

}
