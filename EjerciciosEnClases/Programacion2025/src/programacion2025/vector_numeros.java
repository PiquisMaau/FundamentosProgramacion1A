package programacion2025;
//ARIEL JACHO
public class vector_numeros {

    public static void main(String[] args) {
        //Crear el vector
        int[] vector;
        vector = new int[10];
        //lenar el vector
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            ///Imprimir el cuadrado y el cubo
            for (int j = 0; j < 10; j++) {
                System.out.println(vector[i] + "\t" + Math.pow(vector[i], 2)
                        + "\t" + Math.pow(vector[i], 3) + "\n");

            }
        }

    }

}
