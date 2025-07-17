import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Leer pagina 96 y 97 libro de Java
        Scanner teclado = new Scanner(System.in);
        //Declaración de variables
        float salario, impuesto, porcentajeImpuesto;
        //Solicitar salario
        System.out.print("Ingrese el salario que percibe: ($) ");
        salario = teclado.nextFloat();
        //Controlar salario mayor a cero
        if(salario<=0){
            System.out.println("El salario ingresado es incorrecto");
        }
        if(salario > 3000){
            porcentajeImpuesto = 0.15f;
         
        }
        else {
            porcentajeImpuesto = 0.10f;

        }
        impuesto = salario*0.10f;
            System.out.println("Usted debe pagar el 10% adicional "+impuesto);

    }
}
