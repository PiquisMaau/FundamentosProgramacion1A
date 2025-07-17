public class Ejercicio6 {
    public static void main(String[] args) {
        // Matriz de asistencia: filas representan facultades, columnas representan
        // materias
        int[][] asistencia = {
                { 50, 40, 30, 20, 10 },
                { 60, 55, 45, 35, 25 },
                { 70, 65, 55, 50, 40 },
                { 80, 75, 60, 65, 55 }
        };

        int totalAsistencia = 0;
        int[] asistenciaPorFacultad = new int[asistencia.length];
        int[] asistenciaPorMateria = new int[asistencia[0].length];

        // Item 1 - Informar la asistencia total por materia
        System.out.print("Item 1 - ");
        System.out.println("Asistencia total por materia:");
        for (int materia = 0; materia < asistencia[0].length; materia++) {
            asistenciaPorMateria[materia] = 0;
            for (int facultad = 0; facultad < asistencia.length; facultad++) {
                asistenciaPorMateria[materia] += asistencia[facultad][materia];
                asistenciaPorFacultad[facultad] += asistencia[facultad][materia];
                totalAsistencia += asistencia[facultad][materia];
            }
            System.out.println("Materia " + (materia + 1) + ": " + asistenciaPorMateria[materia]);
        }
        System.out.println();

        // Item 2 - Mostrar la asistencia total en la facultad 3
        System.out.print("Item 2 - "); 
        System.out.println("Asistencia total en la facultad 3: " + asistenciaPorFacultad[2]);
        System.out.println();

        // Item 3 - Mostrar la asistencia en la materia 2 de la facultad 1
        System.out.print("Item 3 - "); 
        System.out.println("Asistencia en la materia 2 de la facultad 1: " + asistencia[0][1]);
        System.out.println();

        // Item 4 - Calcular el porcentaje de asistencia en cada facultad
        System.out.print("Item 4 - "); 
        System.out.println("Porcentaje de asistencia en cada facultad:");
        for (int facultad = 0; facultad < asistenciaPorFacultad.length; facultad++) {
            double porcentaje = (double) asistenciaPorFacultad[facultad] / totalAsistencia * 100;
            System.out.println("La Facultad " + (facultad + 1) + " tiene: " + String.format("%.2f", porcentaje) + " %");
        }
        System.out.println();

        // Item 5 - Determinar la facultad con la mayor asistencia
        System.out.print("Item 5 - "); 
        System.out.println("Determinar la facultad con la mayor asistencia");
        int mayorAsistencia = asistenciaPorFacultad[0];
        int facultadMayor = 0;
        for (int facultad = 1; facultad < asistenciaPorFacultad.length; facultad++) {
            if (asistenciaPorFacultad[facultad] > mayorAsistencia) {
                mayorAsistencia = asistenciaPorFacultad[facultad];
                facultadMayor = facultad;
            }
        }
        System.out.println("La facultad con mayor asistencia es la Facultad " + (facultadMayor + 1) + " con "
                + mayorAsistencia + " asistencias.");
    }
}
