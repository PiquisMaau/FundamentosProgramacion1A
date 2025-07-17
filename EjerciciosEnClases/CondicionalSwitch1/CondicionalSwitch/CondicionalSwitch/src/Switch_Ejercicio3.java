import java.util.Scanner;

public class Switch_Ejercicio3 {
public static void main(String[] args) {
    //Compra
    //enero, abril, septiembre, noviembre => 21% descuento
    //feb, march, july, agosto => 13% descuento
    //mayo, junio, octubre, diciembre => 25% descuento

    Scanner teclado = new Scanner(System.in);
    Float ValorCompra = (float) 0, descuento = 0F;
    int mesCompra = 0;
    System.out.println("Ingrese el valor de la compra: ");
    ValorCompra = teclado.nextFloat();
    System.out.println("Ingresa el mes de compra: ");
    mesCompra = teclado.nextInt();

    switch (mesCompra) {
        case 1, 4, 9, 11:
            descuento = ValorCompra*0.21F;
            System.out.println("EL DESCUENTO ES DE 21%: "+descuento);
            break;
        case 2, 3, 7, 8:
            descuento = ValorCompra*0.13F;
            System.out.println("EL DESCUENTO ES DE 13%: "+descuento);
            break;
        case 5, 6, 10, 12:
            descuento = ValorCompra*0.25F;
            System.out.println("EL DESCUENTO ES DE 25%: "+descuento);
            break;
    
        default:
        System.out.println("NO HAY DESCUENTO");
            break;
    }


    
}
}
