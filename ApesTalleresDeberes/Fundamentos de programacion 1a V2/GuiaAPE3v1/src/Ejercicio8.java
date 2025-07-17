
    import java.util.Scanner;

public class Ejercicio8 {
    public void LeerImprimir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------- Ingresa los datos de tu Cono ------------");
        System.out.print("Ingresa el radio del cono: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingresa la generatriz del cono: ");
        double generatriz = scanner.nextDouble();
        System.out.print("Ingresa la altura del cono: ");
        double altura = scanner.nextDouble();

        System.out.println("Área de la base: " + calcularAreaBase(radio));
        System.out.println("Área lateral: " + calcularAreaLateral(radio, generatriz));
        System.out.println("Área total: " + calcularAreaTotal(radio, generatriz));
        System.out.println("Volumen: " + calcularVolumen(radio, altura));

    }

    public  double calcularAreaBase(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public  double calcularAreaLateral(double radio, double generatriz) {
        return Math.PI * radio * generatriz;
    }

    public double calcularAreaTotal(double radio, double generatriz) {
        double areaBase = calcularAreaBase(radio);
        double areaLateral = calcularAreaLateral(radio, generatriz);
        return areaBase + areaLateral;
    }

    public double calcularVolumen(double radio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }

    public static void main(String[] args) {
        Ejercicio8 conito = new Ejercicio8();
        conito.LeerImprimir();
        
    }
}



