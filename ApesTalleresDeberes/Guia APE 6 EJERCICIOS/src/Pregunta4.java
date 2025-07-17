import java.util.LinkedList;

public class Pregunta4 {

    public static void IdentificarTrimestres(LinkedList<PreoductosExportacion> productos) {
        System.out.println("---------------- Pesos por TRIMESTRES (2022-2024) ------------------");

        double Strimestre1 = 0;
        double Strimestre2 = 0;
        double Strimestre3 = 0;
        double Strimestre4 = 0;

        for (PreoductosExportacion producto : productos) {
            int Year = producto.getYear();

            if (Year == 2022 || Year == 2023 || Year == 2024) {
                String mes = producto.getMes();

                if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Marzo")) {
                    Strimestre1 += producto.getPesoToneladas();
                } else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
                    Strimestre2 += producto.getPesoToneladas();
                } else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre")) {
                    Strimestre3 += producto.getPesoToneladas();
                } else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre")) {
                    Strimestre4 += producto.getPesoToneladas();
                }
            }
        }

        System.out.println("Sumatoria del primer trimestre: " + Strimestre1 + " toneladas");
        System.out.println("Sumatoria del segundo trimestre: " + Strimestre2 + " toneladas");
        System.out.println("Sumatoria del tercer trimestre: " + Strimestre3 + " toneladas");
        System.out.println("Sumatoria del cuarto trimestre: " + Strimestre4 + " toneladas");
    }

    public static void main(String[] args) {
        String ruta = "src\\ProductosExportacion (3).csv";
        LinkedList<PreoductosExportacion> productos = Pregunta1.CargarListaConArchivo(ruta);

        IdentificarTrimestres(productos);

    }
}

