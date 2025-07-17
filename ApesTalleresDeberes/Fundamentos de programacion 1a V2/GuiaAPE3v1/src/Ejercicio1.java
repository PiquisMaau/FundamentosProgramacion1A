
import java.util.Scanner;

public class Ejercicio1 {

    public void LeerDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------- Leer Datos ----------");
        System.out.print("Ingresa el valor de un número para obtener su Factorial: ");
        int Numero = teclado.nextInt();
        int Factorial = CalcularFactorial(Numero);
        System.out.println("Numero: "+Factorial);
    }
    public int CalcularFactorial(int Numero1){
        int factorial=1;
        for (int i = 1; i <= Numero1; i++) {
            factorial = factorial*i;
            
        }
        return factorial;
    }
    public static void main(String[] args) {
        Ejercicio1 leerdatos = new Ejercicio1();
        leerdatos.LeerDatos();
    }
    

}
