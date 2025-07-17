import java.util.Scanner;

public class Ejercicio5 {
    public void LeereImprimir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------- Lectura de Notas ----------");
        System.out.println("Ingresa tres notas para evaluar: ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        double promedio = (EvaluarNotas1(nota1, nota2, nota3) + EvaluarNotas2(nota1, nota2, nota3))/2;
        System.out.println("El promedio de las nota mas alta 1: "+ EvaluarNotas1(nota1, nota2, nota3)+ " más la nota mas alta 2: "+EvaluarNotas2(nota1, nota2, nota3)+" es: "+ promedio);



    }

    public double EvaluarNotas1(double n1,double n2,double n3 ){
    
        double notamayor1 = Math.max(n1, Math.max(n2, n3)); // Encuentra el mayor

        return notamayor1;
    }
    public double EvaluarNotas2(double n1,double n2,double n3 ){
    
        double notamayor2;
        if (EvaluarNotas1(n1, n2, n3) == n1) {
            notamayor2 = Math.max(n2, n3);
        } else if (EvaluarNotas1(n1, n2, n3) == n2) {
            notamayor2 = Math.max(n1, n3);
        } else {
            notamayor2 = Math.max(n1, n2);
        }

        return notamayor2;
    }

public static void main(String[] args) {
    Ejercicio5 obj1 = new Ejercicio5();
    obj1.LeereImprimir();
}

}
