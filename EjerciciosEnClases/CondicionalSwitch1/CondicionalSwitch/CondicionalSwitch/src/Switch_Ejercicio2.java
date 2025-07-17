import java.util.Scanner;

public class Switch_Ejercicio2 {
public static void main(String[] args) {
    String menu = "";
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el menu");
    menu = teclado.nextLine();

    switch (menu) {
        case "menu 1":
            System.out.println("Precio: 1.50");
            break;
        case "menu 2":
            System.out.println("Precio: 1.50");
            break;
        case "menu 3":
            System.out.println("Precio: 1.50");
            break;
    
        default:
        System.out.println("No se reconoce el menú");
            break;
    }
}
}
