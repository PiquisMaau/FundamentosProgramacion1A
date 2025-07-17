import java.util.Scanner;

public class EjercicioIteraciones3 {
    public static void main(String[] args) {
        //Ejercicio de ejemplo propuesto por el Inge. Hernán
        //Crea un programa que muestre un menú con varias opciones (ej. 1.Saludar; 2.Despdir; 3.Salir).
        //El programa debe continuar mostrando en menú y ejecutando la opción seleccionada hasta que 
        //el usuario elija la opción de salir.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige una acción a realizar: ");
        System.out.println("1.Saludo");
        System.out.println("2.Despedir");
        System.out.println("3.Salir");
        int Numero = teclado.nextInt();
        do{
        switch(Numero){
            case 1: 
            System.out.println("Saludos desde Ecuador");
            break;
            case 2: 
            System.out.println("Chao");
            break;
            case 3: 
            System.out.println("Saliendo del Sistema");
            break;
            default:
            System.out.println("Escoja una opción correcta.");

        }
    }while(Numero==3);
    System.out.println("Ingresa un valor aceptado");

    }

}
