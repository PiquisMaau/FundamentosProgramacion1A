import java.util.Scanner;

public class ejercicioSwitch {
    //Ejercicio basado en Switch, basado en la clase espejo - El peofesor lo hizo en NetBeans
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un valor: ");
        int i = teclado.nextInt();

switch(i) {
  case 0:
    System.out.println("i es cero.");
    break;
  case 1:
    System.out.println("i es uno.");
    break;
  case 2:
    System.out.println("i es dos.");
    break;
  case 3:
    System.out.println("i es tres.");
    break;
  default:
    System.out.println("i es mayor a tres.");
}
    }

}
