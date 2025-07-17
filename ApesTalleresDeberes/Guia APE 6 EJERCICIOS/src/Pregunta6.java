import java.util.LinkedList;

public class Pregunta6 {

    private static void MontoAnual(LinkedList<PreoductosExportacion> productos) {

        double SumatoriaGeneral = 0, Sumatoria2019 = 0,
                Sumatoria2020 = 0, Sumatoria2021 = 0, Sumatoria2022 = 0,
                Sumatoria2023 = 0, Sumatoria2024 = 0;
        for (PreoductosExportacion producto : productos) {

            SumatoriaGeneral += producto.getMontoMillones();

            switch (producto.getYear()) {
                case 2019:
                    Sumatoria2019 += producto.getMontoMillones();
                    break;
                case 2020:
                    Sumatoria2020 += producto.getMontoMillones();

                    break;
                case 2021:
                    Sumatoria2021 += producto.getMontoMillones();

                    break;
                case 2022:
                    Sumatoria2022 += producto.getMontoMillones();

                    break;
                case 2023:
                    Sumatoria2023 += producto.getMontoMillones();

                    break;
                case 2024:
                    Sumatoria2024 += producto.getMontoMillones();

                    break;
            }

        }
        ImprimirDatos(SumatoriaGeneral, Sumatoria2019, Sumatoria2020, Sumatoria2021, Sumatoria2022, Sumatoria2023,
                Sumatoria2024);

    }

    private static void ImprimirDatos(
            double sumatoriaGeneral,
            double sumatoria2019,
            double sumatoria2020,
            double sumatoria2021,
            double sumatoria2022,
            double sumatoria2023,
            double sumatoria2024) {
        System.out.println("-------- Mostrar PORCENTAJES DE MONTOS DE EXPORTACION por YEAR ---------");
        System.out.println("El valor de montos exportados desde el año 2019 hasta 2024 es: " + sumatoriaGeneral);
        System.out
                .println("El porcentaje de montos exportados en 2019 es: " + (sumatoria2019 / sumatoriaGeneral) * 100+" %");
        System.out
                .println("El porcentaje de montos exportados en 2020 es: " + (sumatoria2020 / sumatoriaGeneral) * 100+" %");
        System.out
                .println("El porcentaje de montos exportados en 2021 es: " + (sumatoria2021 / sumatoriaGeneral) * 100+" %");
        System.out
                .println("El porcentaje de montos exportados en 2022 es: " + (sumatoria2022 / sumatoriaGeneral) * 100+" %");
        System.out
                .println("El porcentaje de montos exportados en 2023 es: " + (sumatoria2023 / sumatoriaGeneral) * 100+" %");
        System.out
                .println("El porcentaje de montos exportados en 2024 es: " + (sumatoria2024 / sumatoriaGeneral) * 100+" %");

    }

    public static void main(String[] args) {
        String ruta = "src\\ProductosExportacion (3).csv";
        LinkedList<PreoductosExportacion> productos = Pregunta1.CargarListaConArchivo(ruta);

        MontoAnual(productos);
    }
}
