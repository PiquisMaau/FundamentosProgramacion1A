package Clases;

import java.util.Scanner;

public class Operaciones {
    //debe tener dos elementos, un valor uno y dos; y cremos metodos para generar suma, resta, multiplicacion, division, residuo

    private int valor1, valor2; 
    private Scanner teclado;
    public void IngresarValores(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor 1: ");
        valor1 = teclado.nextInt();
        System.out.print("Ingrese el valor 2: ");
        valor2 = teclado.nextInt();

    }

    public void Potencia(){
        double resultado;
        resultado = Math.pow(valor1, valor2);
        System.out.println("Potencia: "+ resultado);

    }
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        operaciones.IngresarValores();
        operaciones.Potencia();
    }

}
