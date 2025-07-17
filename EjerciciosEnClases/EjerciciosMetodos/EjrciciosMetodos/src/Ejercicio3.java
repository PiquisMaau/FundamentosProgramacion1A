import java.util.Scanner;

public class Ejercicio3 {
    // Enunciado: Dada la edad de una persona, determine en qué etapa de su vida se
    // encuentra, cree un
    // procedimiento para realizar dicha tarea.

    public static void LeerImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("============ Lectura de EDAD ============");
        System.out.print(" Ingresa tu edad:) : ");
        int edad = teclado.nextInt();

        System.out.println("La etapa de vida en la que se encuentra es: " + EdadEtapa(edad));

    }

    public static String EdadEtapa(int edad_) {
        String etapa = "123";
        if (edad_ >= 0 && edad_ <= 2) {
            etapa = "Bebé";
        } else {
            if (edad_ >= 3 && edad_ <= 5) {
                etapa = "Niño";
            } else {
                if (edad_ >= 6 && edad_ <= 12) {
                    etapa = "Pubertad";
                } else {
                    if (edad_ >= 13 && edad_ <= 18) {
                        etapa = "Adolescente";
                    } else {
                        if (edad_ >= 19 && edad_ <= 25) {
                            etapa = "Joven";
                        } else {
                            if (edad_ >= 26 && edad_ <= 60) {
                                etapa = "Adulto";
                            } else {
                                if (edad_ > 60) {
                                    etapa = "Anciano";
                                } else {
                                }

                            }
                        }
                    }
                }

            }
        }
        return etapa;

    }

    public static void main(String[] args) {
        LeerImprimir();
    }
}
