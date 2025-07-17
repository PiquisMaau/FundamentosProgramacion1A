import java.util.Scanner;
public class App {
    

//Cargar nombre y la edad de la persona
//Imprimir un nombre si la persona es mayor de edad
    private String nombre;
    private int edad;
    //private Scanner teclado; //Declaración

    //Comportamientos que están definidos por métodos
    public void Inicializar(){
// Instaniar => new Clase();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indrese el name: ");
        nombre = teclado.next();
        System.out.print("Indrese la edad: ");
        edad = teclado.nextInt();
    } 
    public void ImprimirDatos(){
        System.out.println("-------------------Imprimiendo Datos -------------------");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
    }


    public static void main(String[] args) {
        // Instaniar => new Clase();
        App persona1 = new App();
        persona1.Inicializar();
        persona1.ImprimirDatos();

        App persona2 = new App();
        persona2.Inicializar();
        persona2.ImprimirDatos();


    }
}