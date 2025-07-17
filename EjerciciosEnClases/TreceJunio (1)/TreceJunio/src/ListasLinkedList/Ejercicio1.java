package ListasLinkedList;

import java.util.LinkedList;

public class Ejercicio1 {
    public static void Imprimir(LinkedList lista){
        System.out.println("---------- Imprimiendo LISTA -------------");
        System.out.println(lista);
    }
    public static void main(String[] args) {
         LinkedList<String> lista = new LinkedList<>();
         LinkedList<String> lista2 = new LinkedList<>();

         lista.add("Juan");
         lista.add("Pepe");
         lista.add("papa");
        
         Imprimir(lista);
         lista.add(1, "element");
         Imprimir(lista);
         lista.remove(0);
         Imprimir(lista);
         lista.remove("Pepe");

         //Cuantos elementos tiene la lista
         System.out.println("La cantidad de elementos es: "+lista.size());

         //Validar la existencia de un elemento en la lista
         if (lista.contains("Juan")) {
            System.out.println("Si existe");
         }else{
            System.out.println("No existe");
         }
         Imprimir(lista);

         //Obtener elementos por posicion
         System.out.println(lista.get(1));
         System.out.println(lista.getFirst());
         System.out.println(lista.getLast());

         //Clonar lista
         lista2 = (LinkedList)lista.clone();
         Imprimir(lista2);



         //Encerar una lista
         lista.clear();
         Imprimir(lista);






    }

}
