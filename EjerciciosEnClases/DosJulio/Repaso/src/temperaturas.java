public class temperaturas {

    public static void main(String[] args) {

        double[] Tmax = { 20, 18, 22, 24, 16 };
        double[] Tmin = { 8, 5, 6, 7, 5 };
        double[] Tmedia = new double[Tmax.length];
        double TemperaturaMaxima = 0, TemperaturaMInima = 0;
        int posicion, dia;

        //Ítem 1: Calcular la temperatura media.
        for (int i = 0; i < Tmedia.length; i++) {
            Tmedia[i] = (Tmax[i] + Tmin[i]) / 2;
        }

        // Imprimir Datos
        System.out.println("La temperatura máxima " + "\t" + "Temperatura minima " + "\t" + "Temperatura Media");

        for (int i = 0; i < Tmedia.length; i++) {
            System.out.println(Tmax[i] + "\t" + Tmin[i] + "\t" + Tmedia[i]);
        }

        //Ítem 2: Dia con la temperatura promedio más alta
        TemperaturaMaxima = Tmedia[0]; 
        posicion = 0;
        for (int i = 0; i < Tmedia.length; i++) {
            if (TemperaturaMaxima < Tmedia[i]) {
                TemperaturaMaxima=Tmedia[i];
                posicion = i;
            }
        }
        dia = posicion+1;
        System.out.println("El día com mayor temperatura es: "+dia);

        //Ítem 3: Dia con la temperatura promedio más baja
        TemperaturaMInima = Tmedia[0]; 
        posicion = 0;
        for (int i = 0; i < Tmedia.length; i++) {
            if (TemperaturaMInima > Tmedia[i]) {
                TemperaturaMInima=Tmedia[i];
                posicion = i;
            }
        }
        dia = posicion+1;
        System.out.println("El día com mayor temperatura es: "+dia);

    }

}
