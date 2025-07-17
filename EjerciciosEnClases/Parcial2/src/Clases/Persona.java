package Clases;

import java.util.Scanner;

//Cargar nombre y la edad de la persona
//Imprimir un nombre si la persona es mayor de edad
public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private Scanner teclado; //Declaración

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
    public  void ImprimiSiEsMayorDeEdad(){

    }


    public static void main(String[] args) {
        // Instaniar => new Clase();
        Persona persona1 = new Persona();
        persona1.Inicializar();
        persona1.ImprimirDatos();
        persona1.ImprimiSiEsMayorDeEdad();

        Persona persona2 = new Persona();
        persona2.Inicializar();
        persona2.ImprimirDatos();
        persona2.ImprimiSiEsMayorDeEdad();


    }


}
