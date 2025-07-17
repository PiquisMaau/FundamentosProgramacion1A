import java.util.Scanner;

public class Ejercicio9 {

    public void LeerEImprimir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------- Calculo de las dimensiones de una esfera ------------");
        System.out.print("Ingresa el radio de una esfera: ");
        int Radio = teclado.nextInt();

        System.out.println("El Area de tu esfera es: "+ AreaEsfera(Radio));
        System.out.println("El Volumen de tu esfera es: "+ VolumenEsfera(Radio));



    }

    public double AreaEsfera(int Radio){
        double Area = 4*Math.PI*Math.pow(Radio, 2);
        return Area;
    }

        public double VolumenEsfera(int Radio){
        double Volumen = 4*Math.PI*Math.pow(Radio, 3)/3;
        return Volumen;

    }
    public static void main(String[] args) {
        Ejercicio9 esfera = new Ejercicio9();
        esfera.LeerEImprimir();
    }
    }
    


