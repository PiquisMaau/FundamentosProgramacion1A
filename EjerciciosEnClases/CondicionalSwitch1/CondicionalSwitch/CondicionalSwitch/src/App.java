import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int diaSemana = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana => ");
        diaSemana = teclado.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;    
        
            default:
            System.out.println("El valor de ingreso es incorrecto :,v");
                break;
        }
    }
}
