package Listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploListasV2 {
    public static void main(String[] args) {
        // Para crearla :
        List<String> listanombres = new ArrayList<>();
        List<Integer> Listanumeros = new ArrayList<>();

        // Agregamos elementos a la Lista
        listanombres.add("El Pepe");
        listanombres.add("Nicolas");
        listanombres.add("Joseph");
        listanombres.add("Ana");

        Listanumeros.add(12);
        Listanumeros.add(23);
        Listanumeros.add(30);
        Listanumeros.add(40);
        Listanumeros.add(0, 50);
        Listanumeros.add(1, 60);

        // Para Imprimir
        System.out.println(listanombres);
        System.out.println(Listanumeros);

        // For-EACH
        for (String nombreValor : listanombres) {
            System.out.println(nombreValor);
        }
        System.out.println("--------- Multiplo 8 ----------");
        int contador = 0;
        for (int numeroValor : Listanumeros) {
            if (numeroValor % 8 == 0) {
                System.out.println("Multiplo = " + numeroValor);
                contador++;
            }
        }
        System.out.println("Se encontraron = " + contador + " numeros divisibles para 8.");

        System.out.println("---------- Buscar a ANA ----------");
        for (String nombreValor : listanombres) {
            if (nombreValor == "Ana") {
                System.out.println("ANA SI EXISTE");

            }
        }

        // -------------------------------------------------------------------------------------------------------------------
        // 2 Grupos
        // Promedio de todo el curso
        // Promedio de los alumnos menos de 7 - cuantos son:

        List<Double> notas1 = new ArrayList<>();
        List<Double> notas2 = new ArrayList<>();
        List<Double> notasTotales = new ArrayList<>();


        notas1.add(10.0);
        notas1.add(9.0);
        notas1.add(3.0);
        notas1.add(4.0);

        notas2.add(8.0);
        notas2.add(7.5);
        notas2.add(6.3);
        notas2.add(10.0);

        notasTotales.addAll(notas2);
        notasTotales.addAll(notas1);
System.out.println(notasTotales);

//Promedio
double sumatoria = 0, promedio = 0;
for (double nota : notasTotales) {
    sumatoria +=  nota;

promedio = sumatoria/notasTotales.size();
}
System.out.println("El promedio del curso es: "+promedio);

sumatoria = 0;
promedio = 0;
contador = 0;

for (double nota : notasTotales) {
if (nota < 7) {
    sumatoria+=nota;
    contador++;
    
}        

    }
    if (contador > 0) {
    promedio = sumatoria / contador;
    System.out.println("El promedio de notas menores a 7 es: " + promedio);
} else {
    System.out.println("No hay notas menores a 7.");
}

    }
    
}
