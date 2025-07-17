package CuatroJulio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class EjercicioArchivos {
    public static void main(String[] args) {
        LinkedList<Cuenta> lista;
        String ruta = "Repaso\\src\\CuatroJulio\\IngresosEgresos.csv";

        // Cargar lOS Datos, desde el Archivo CSV
        lista = CargarArchivoCSV(ruta);
        ImprimirDatos(lista);

        // Pregunta 1: Todtal de ingresos y egresos
        PreguntaIngresosEgresos(lista);

        //Pregunta 2:  Total ingresos y egresos en la costa
        PreguntaIngresosEgresosCosta(lista);

        //Pregunta3: Total ingresos y egresos por ciudad en la Costa
        DevolverIgresosEgresosporCiudad(lista);
    }

    private static LinkedList<Cuenta> CargarArchivoCSV(String ruta) {
        LinkedList<Cuenta> _lista = new LinkedList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            // Validamos si tiene cabecera
            boolean tieneCabecera = true;
            while ((linea = lector.readLine()) != null) {
                // Si tiene cabecera saltamos la primera linea
                if (tieneCabecera == true) {
                    // Saltamos la primera fila
                    tieneCabecera = false;
                    continue;
                }

                String[] partes = linea.split(";");
                if (partes.length >= 7) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    String apellido = partes[2];
                    String ciudad = partes[3];
                    String genero = partes[4];
                    double ingresos = Double.parseDouble(partes[5]);
                    double egresos = Double.parseDouble(partes[6]);
                    // Creamos un objto cuenta, y la añadimos a la lista
                    Cuenta account = new Cuenta(id, nombre, apellido, ciudad, genero, ingresos, egresos);
                    _lista.add(account);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar el mensaje" + e.getMessage());
        }
        return _lista;
    }

    private static void ImprimirDatos(LinkedList<Cuenta> lista_) {
        System.out.println("Imprimiendo la lista de cuentas");
        for (Cuenta cuenta : lista_) {
            System.out.println(cuenta.toString());
        }
    }

    private static void PreguntaIngresosEgresos(LinkedList<Cuenta> lista_) {
        double totalIngreesos = 0, totalEgresos = 0;
        for (Cuenta cuenta : lista_) {
            totalIngreesos += cuenta.getIngresos();
            totalEgresos += cuenta.getEgresos();
        }
        System.out.println("Total de ingresos: " + totalIngreesos);
        System.out.println("Total de egresos: " + totalEgresos);
    }

    private static void PreguntaIngresosEgresosCosta(LinkedList<Cuenta> lista_) {
        double totalIngreesos = 0, totalEgresos = 0;
        for (Cuenta cuenta : lista_) {
            if (cuenta.getCiudad().equals("Guayaquil") ||
             cuenta.getCiudad().equals("Portoviejo")) {
           totalIngreesos += cuenta.getIngresos();
            totalEgresos += cuenta.getEgresos();     
            }
        }
        System.out.println("Total de ingresos en la costa: " + totalIngreesos);
        System.out.println("Total de egresos en la costa: " + totalEgresos);
    }

    private static void DevolverIgresosEgresosporCiudad(LinkedList<Cuenta> lista_){
        Double ingresosCanton =0.0, egresosCanton =0.0;
        Double ingresosPortoviejo =0.0, egresosPortovirjo =0.0;
        for (Cuenta cuenta : lista_) {
            if (cuenta.getCiudad().equals("Guayaquil")){
                ingresosCanton+= cuenta.getIngresos();
                egresosCanton+= cuenta.getEgresos();
            }
            if (cuenta.getCiudad().equals("Portoviejo")){
                ingresosPortoviejo+= cuenta.getIngresos();
                egresosPortovirjo+= cuenta.getEgresos();
            }
        }

        LinkedList<Pregunta3> listaPreguntas = new LinkedList<>();
        listaPreguntas.add(new Pregunta3("Guayaquil", ingresosCanton, egresosCanton));
        listaPreguntas.add(new Pregunta3("Portoviejo", ingresosPortoviejo, egresosPortovirjo));

        //Imprimir resultados:
        for (Pregunta3 pregunta3 : listaPreguntas) {
            System.out.println(pregunta3.toString());
        }


    }

}
