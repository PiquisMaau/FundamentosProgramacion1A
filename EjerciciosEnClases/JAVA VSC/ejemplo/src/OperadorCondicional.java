public class OperadorCondicional {
    public static void main(String[] args) {
        int valor1=5000, valorb=30000, valor3=60700;
        boolean resultado ;
        resultado = (valor1 > valorb)? true: false;
        System.out.println(resultado);

        if (valor1>valorb){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        String resultado2 = ((valor1>valorb)&&(valor1>valor3))? "El valor 1 es mayor":((valorb>valor1)&&(valorb>valor3))? "El valor 2 es mayor":"El valor 3 es mayor";
        System.out.println(resultado2);
        //String resultado3 = ((valorb>valor1)&&(valorb>valor3))? "El valor 2 es mayor":"El valor 2 es mayor";
        //System.out.println(resultado3);
        //String resultado4 = "valor 3 es mayor";
        //System.out.println(resultado4);



        

    }

}
