package Clases;

import java.util.Scanner;

/*
 * Ingresar los lados del triangulo
 * Imprimir los lados 
 * Imprimir lado mayor
 * Imprimir si es equilatero
 * Imprimir si el triangulo es correcto
 */

public class Triangulo {
    private int lado1, lado2, lado3;
    private Scanner teclado;

    public  void IngresarLadosTriangulo(){
        teclado = new Scanner(System.in);
        System.out.println("-----Ingresar Lados Triangulo -----");
        System.out.print("Ingrese el lado 1: ");
        lado1 = teclado.nextInt();
        System.out.print("Ingrese el lado 2: ");
        lado2 = teclado.nextInt();
        System.out.print("Ingrese el lado 3: ");
        lado3 = teclado.nextInt();
    }
    public  void ImprimirLadosTriangulo(){
        System.out.println("----- Imprimir -----");
        System.out.println("Lado 1: "+lado1);
        System.out.println("Lado 2: "+lado2);
        System.out.println("Lado 3: "+lado3);


    }
    public void ImprimirLadoMayor(){
        System.out.println("----- Imprimir lado Mayor -----");
        System.out.print("Lado Mayor: ");
        if(lado1>lado2 && lado1>lado3){
            System.out.println("Lado Mayor es 1");

        }else{
            if(lado2>lado3){
                System.out.println("Lado Mayor es 2");
            }else{
                System.out.println("Lado Mayor es 3");
            }
        }
    }
    public void ImprimirSiEsEquilatero(){
        System.out.println("----- Imprimir si es Equilatero -----");
        if(lado1==lado2&&lado2==lado3){
            System.out.println("El triangulo es equilatero");
        }else{
            System.out.println("El triangulo no es equilatero :v");
        }
    }
    public void ImprimirSiEsValido(){
        System.out.println("----- Imprimir si es válido -----");
        int sumatoriadeLAdos;
        sumatoriadeLAdos = lado1 +lado2;
        if(sumatoriadeLAdos>lado3){
            System.out.println("Si es un triangulo válido ");
        }else{
            System.out.println("No es un triángulo válido");
        }
        
    }

    public static void main(String[] args) {
        Triangulo Triangulo1 = new Triangulo();
        Triangulo1.IngresarLadosTriangulo();
        Triangulo1.ImprimirLadosTriangulo();
        Triangulo1.ImprimirLadoMayor();
        Triangulo1.ImprimirSiEsEquilatero();
        Triangulo1.ImprimirSiEsValido();
    }

}
