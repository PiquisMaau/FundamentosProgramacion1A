import java.util.Scanner;

public class Plano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float equis, ye;
        System.out.println("Ingrese la variable X");
        equis = teclado.nextFloat();
        System.out.println("Ingrese la variable Y");
        ye = teclado.nextFloat();



        if(equis>0&&ye>0){
            System.out.println("Está en el primer cuadrante");
        }else{
            if(equis<0&&ye>0){
                System.out.println("Está en el segundo cuadrante");
            }if(equis<0&&ye<0){
                System.out.println("Está en el tercer cuadrante");
            }else{
                if(equis>0&&ye<0){
                    System.out.println("Está en el cuarto cuadrante");
                }
                
            }
        }
        double distancia =Math.sqrt(Math.pow(equis-0, 2)+Math.pow(ye-0, 2));
        System.out.println("La distancia es: "+ distancia);

        
    }

}
