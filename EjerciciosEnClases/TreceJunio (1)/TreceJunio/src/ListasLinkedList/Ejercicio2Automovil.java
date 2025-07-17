package ListasLinkedList;

import java.util.LinkedList;

public class Ejercicio2Automovil {
    public static void main(String[] args) {
        LinkedList<Automovil> listaAutomoviles = new LinkedList<>();
        Automovil auto1 = new Automovil("VM", "GOLF", 2008, 10000);
        Automovil auto2 = new Automovil("TOYOTA", "PRADO", 2018, 25000);

        listaAutomoviles.add(auto1);
        listaAutomoviles.add(auto2);

        //Agregar objetos directamente
        listaAutomoviles.add(new Automovil("KIA", "Picanto", 2020, 11500));
        listaAutomoviles.add(new Automovil("HONDA", "Civic", 2023, 28000));
        listaAutomoviles.add(new Automovil("FORD", "FOCUS", 2019, 23000));
        listaAutomoviles.add(new Automovil("CHEVROLET", "Colorado", 2025, 40000));

        ImprimirAutomoviles(listaAutomoviles);

       /*for (Automovil auto : listaAutomoviles) {
            auto.toString();
        }*/

        //Agregar un element al INICIO
        listaAutomoviles.addFirst(new Automovil("BMW", "525", 2002, 13000));
        System.out.println("Agregado al inicio: "+listaAutomoviles.getFirst());

        //Agregar un elemento al FINAL
        listaAutomoviles.addLast(new Automovil("Mercedez Benz", "AMG G63", 2020, 45000));
        System.out.println("Agregado al inicio: "+listaAutomoviles.getLast());

        ImprimirAutomoviles(listaAutomoviles);

        //Buscar AUTOS de una MARCA ESPECÍFICA
        System.out.println("Buscar autos de una MARCA ESPECIFICA");
        String marcaBuscada = "ToYOtA";
        for (Automovil auto : listaAutomoviles) {
            if ( marcaBuscada == auto.getMarca() ) {
                System.out.println(auto.getModelo()+" - "+auto.getValor());
                
            }
        }

        System.out.println("Promedio de valores despues de 2016");
        double promedio = 0, sumatoria=0;
        int contador=0;
        for (Automovil auto : listaAutomoviles) {
            if ( auto.getAño()>2016) {
                sumatoria+=auto.getValor();
                contador++;

            }
           // sumatoria += auto.getAño();
        }
        promedio = sumatoria/contador;
        System.out.println(promedio);

        promedio = 0;
        sumatoria=0;
        contador=0;
        System.out.println("Promedio de valores despues de 2016 y HONDA");
        for (Automovil auto : listaAutomoviles) {
            if ( auto.getAño()>2016 && auto.getMarca().equals("HONDA")) {
                sumatoria+=auto.getValor();
                contador++;

            }
           // sumatoria += auto.getAño();
        }
        promedio = sumatoria/contador;
        System.out.println(promedio);










    }

    private static void ImprimirAutomoviles(LinkedList<Automovil> listaAutomoviles) {
        System.out.println("------------------- Imprimiendo AUTOMOVILES -------------------");
        for (Automovil auto : listaAutomoviles) {
            System.out.println(auto.getMarca().concat("\t"+auto.getModelo())+"\t"+auto.getAño()+"\t"+auto.getValor());
            
        }
    }

}
