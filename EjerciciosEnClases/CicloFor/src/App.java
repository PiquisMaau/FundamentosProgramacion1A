public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Formato Ascendente");
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Formato Descendente");
        for (int i = 10; i >=1 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Formto ascendente o incremento variable");
        for (int i = 0; i <= 100; i+=20) {
            System.out.println(i);
            
        }
        int lastvalor = 0, limite = 100 ;
        System.out.println("Formto ascendente o incremento variable");
        for (int i = -40 ; i < 100; i+=20) {
            System.out.println("valor = "+i);
            lastvalor = i;
            
        }
        System.out.println("ultimo valor: "+lastvalor);

        for (int i = 1; i <= 50; i=2*i+1) {
            System.out.println("El valor impar es: "+ i);
            
        }

        int valor = 0;
        for (int i = 1; i <= 50; i++) {
            valor = 2*i+1;
            System.out.println(i+ " - "+ valor);
            
        }

        System.out.println("Ciclo con valores o incrementos decimales");
        for (double i = 0.75; i <= 5; i+=0.25) {
            System.out.println(i);
        }
        }
    }

