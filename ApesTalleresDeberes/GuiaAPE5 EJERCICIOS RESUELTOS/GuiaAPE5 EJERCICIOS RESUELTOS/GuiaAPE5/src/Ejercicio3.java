public class Ejercicio3 {
    public static void main(String[] args) {
        // item1: Cres una tabla bidimensional de longitud 5x15 con el nombre "Marco"
        int[][] Marco = new int[5][15];

        // item2 : Carga la tabla con dos únicos valores 0 y 1, donde el valor uno
        // ocupará las posiciones o elementos que delimitan la tabla, es decir, las más
        // externas, mientras que el resto de los elementos contendrán el valor 0.
        for (int f = 0; f < Marco.length; f++) {
            for (int c = 0; c < Marco[0].length; c++) {
                if (f == 0 || f == 4 || c == 0 || c == 14) {
                    Marco[f][c] = 1;
                }
                //item3 : Visualiza el contenido de la mattriz en pantalla :)
                System.out.print(Marco[f][c] + "\t");
            }
                    System.out.println("\n");
        }
    }
}
