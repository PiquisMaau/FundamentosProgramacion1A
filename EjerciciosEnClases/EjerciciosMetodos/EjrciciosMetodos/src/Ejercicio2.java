import java.util.Scanner;

public class Ejercicio2 {
    // Enunciado: Dadas tres notas, obtenga el promedio de las dos notas mayores,
    // cree un procedimiento para
    // realizar dicha tarea.

    public static void LeerImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("========== Ingreso de Datos ==========");
        System.out.print("Ingresa la primera nota: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Ingresa la segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Ingresa la tercera nota: ");
        double nota3 = teclado.nextDouble();

        System.out.print("El promedio de las dos notas mayores es ->"+ NumerosMayoresPromedio(nota1, nota2, nota3));


    }
    public static double NumerosMayoresPromedio(double nota_1, double nota_2, double nota_3) {
        double Mayor1, Mayor2;
        if(nota_1 >nota_2 && nota_1 >nota_3){
            Mayor1 = nota_1;
            Mayor2= Math.max((int)nota_2, (int)nota_3);
        }else{
            if(nota_2>nota_1 && nota_2>nota_3){
                Mayor1 = nota_2;
            Mayor2= Math.max((int)nota_1, (int)nota_3);

            }else{
                Mayor1 = nota_3;
            Mayor2= Math.max((int)nota_1, (int)nota_2);
            }
        }
        double promedio = (Mayor1+Mayor2)/2;
        return promedio;
    }
    public static void main(String[] args) {

        LeerImprimir();
        
    }    

}
