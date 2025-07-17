package GetterSetter;

public class ConvertidorStringArrays {
   public static void main(String[] args) {
       String cedula = "1804764551";
       String frutas = "Manzana,Limon,Papas";
       System.out.println(cedula.substring(0, 2));
       System.out.print(cedula.charAt(0));System.out.println(cedula.charAt(1));

       //
       String delimitador = " ";
       String[] vectorCedula = cedula.split(delimitador); //Convertimos de una variable String a Vector
       for (int i = 0; i < vectorCedula.length; i++) {
            System.out.println(vectorCedula[i]);
       }

       String[] vectorFrutas = frutas.split(","); //Convertimos de una variable String a Vector
       for (int i = 0; i < vectorFrutas.length; i++) {
            System.out.println(vectorFrutas[i]);
       }

       //Convertimos de Vector a String
       String Numeros = String.join(delimitador, vectorCedula);
       System.out.println(Numeros);

       String Ensalada = String.join(" - ", vectorFrutas);
       System.out.println(Ensalada);


   }
}
