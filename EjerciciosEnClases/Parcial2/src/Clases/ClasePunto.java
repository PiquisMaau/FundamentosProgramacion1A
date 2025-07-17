package Clases;

import java.util.Scanner;

public class ClasePunto {
    /*
     * Ingresar una coordenada X, Y
     * Imprimir en que cuadrante se encuentra el punto
     * 
     */
    private int coordenadaX, coordenadaY;
    private Scanner teclado;

    public void IngresodeCoordenadas(){
        teclado = new Scanner(System.in);
        System.out.println("-----Ingrese Datos------");
        System.out.print("Ingresa tucoordenada en X: ");
        coordenadaX = teclado.nextInt();
        System.out.print("Ingresa tucoordenada en Y: ");
        coordenadaY = teclado.nextInt();

    }

    public void ImprimirCuadrante(){
        System.out.println("----- Imprimir en qué cuadrante está -----");
      /*   double angulo;
        angulo = Math.sqrt(Math.pow(coordenadaX, 2)+Math.pow(coordenadaY, 2));
        if(angulo>=0 && angulo <= 90){
            System.out.println("Está en el cuadrante 1");

        }*/
        if(coordenadaX>0 && coordenadaY>0){
            System.out.println("Está en el cuadrante 1");
        }else{
            if(coordenadaX<0 && coordenadaY>0){
            System.out.println("Está en el cuadrante 2");
        }if(coordenadaX<0 && coordenadaY<0){
            System.out.println("Está en el cuadrante 3");
        }if(coordenadaX>0 && coordenadaY<0){
            System.out.println("Está en el cuadrante 4");
        }if(coordenadaX==0 && coordenadaY==0){
            System.out.println("Está en el origen");
        }
    }
    }
    public static void main(String[] args) {
        ClasePunto Plano1 = new ClasePunto();
        Plano1.IngresodeCoordenadas();
        Plano1.ImprimirCuadrante();
    }

}
