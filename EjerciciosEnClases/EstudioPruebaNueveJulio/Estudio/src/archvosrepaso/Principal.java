package archvosrepaso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {

        LinkedList<Cuenta> listacuenta = new LinkedList<>();
        String ruta = "src\\archvosrepaso\\IngresosEgresos.csv";

        // Cargar con los datos del archivo la linked list
        cargarArchivos(ruta, listacuenta);

        // Imprimir
        Imprimir(listacuenta);

        // Metodo para calcular ingresos y egresos
        SumatoriaIngresosyEgresos(listacuenta);

        // Metodo para sacar la el promedio de ingresos y egresos
        Promedio(listacuenta);

    }

    private static void Promedio(LinkedList<Cuenta> listacuenta) {
        double promedio1 = 0, promedio2 = 0;
        int sumatoria1 = 0, sumatoria2 = 0;
        for (Cuenta cuenta : listacuenta) {
            sumatoria1 += cuenta.getIngresos();
            sumatoria2 += cuenta.getEgresos();
            promedio1 = sumatoria1 / listacuenta.size();
            promedio2 = sumatoria2 / listacuenta.size();
        }
        System.out.println("Promedio de Ingresos es: " + promedio1);
        System.out.println("Promedio de Ingresos es: " + promedio2);

    }

    private static void SumatoriaIngresosyEgresos(LinkedList<Cuenta> listacuenta) {
        double SumatoriaIngresos = 0, sumtoriaEgresos = 0;
        for (Cuenta cuenta : listacuenta) {
            SumatoriaIngresos += cuenta.getIngresos();
            sumtoriaEgresos += cuenta.getEgresos();
        }
        System.out.println("La sumatoria de ingreos es: " + SumatoriaIngresos);
        System.out.println("La sumatoria de egresos es: " + sumtoriaEgresos);
    }

    private static void Imprimir(LinkedList<Cuenta> listacuenta) {
        System.out.println("----------- Imprimiendo cuenta ----------");
        for (Cuenta cuenta : listacuenta) {
            System.out.println(cuenta.toString());
        }
    }

    private static void cargarArchivos(String ruta, LinkedList<Cuenta> listacuenta) {
        try (BufferedReader lestura = new BufferedReader(new FileReader(ruta))) {
            String linea;
            boolean cabecera = true;

            while ((linea = lestura.readLine()) != null) {
                if (cabecera == true) {
                    cabecera = false;
                    continue;
                }

                String[] prtess = linea.split(";");

                if (prtess.length >= 7) {
                    String id = prtess[0];
                    String nombre = prtess[1];
                    String apellido = prtess[2];
                    String ciudad = prtess[3];
                    String genero = prtess[4];
                    int ingresos = Integer.parseInt(prtess[5]);
                    int egresos = Integer.parseInt(prtess[6]);

                    Cuenta Nuevacuenta = new Cuenta(id, nombre, apellido, ciudad, genero, ingresos, egresos);
                    listacuenta.add(Nuevacuenta);
                }

            }

        } catch (Exception e) {
            System.out.println("Error al cargar archivos");
        }
    }

}
