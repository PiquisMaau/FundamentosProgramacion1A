/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ape;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FISEI-LB1
 */
public class Ape {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
      Random aleatorio =new Random();
      int valor = aleatorio.nextInt(1,11);
      int i=0;
      do{
          System.out.println("Ingrese un numero");
          int numero = teclado.nextInt();
          if(valor==numero){
              System.out.println("Felicidades, adivinaste el numero");
          }else{
              System.out.println("Siga participando");
              System.out.println("Quedan" +(2-i)+ "intentos");
          }
          i++;
      }while (i<3);
    }
}
