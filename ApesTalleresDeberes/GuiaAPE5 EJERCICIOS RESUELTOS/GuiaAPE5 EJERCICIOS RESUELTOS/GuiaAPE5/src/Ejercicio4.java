public class Ejercicio4 {
    public static void main(String[] args) {
        double[] precioArticulo = new double[] { 10, 20, 30, 40, 50 };
        int[][] CantidadesVendidas = new int[][] {
                { 5, 3, 10, 4 },
                { 6, 4, 2, 3 },
                { 10, 5, 3, 2 },
                { 1, 3, 8, 5 },
                { 1, 10, 6, 2 }
        };
        int[][] MontosRecaudados = new int[5][4]; 
        double[] MontosUcursales = new double[5];

        // Item 1 - Las cantidades totales de cada sucursal.
        System.out.print("Item 1 - ");
        System.out.println("Las cantidades totales de cada sucursal.");
        int Sumatoria = 0;
        for (int f = 0; f < CantidadesVendidas.length; f++) {
            Sumatoria = 0;
            for (int c = 0; c < CantidadesVendidas[0].length; c++) {
                Sumatoria += CantidadesVendidas[f][c];
            }
            System.out.println(" >Cantidad total en sucursal " + (f + 1) + " = " + Sumatoria);
        }
        System.out.println();

        // Item 2 - La cantidad de artículos en el artículo 2.
        System.out.print("Item 2 - ");
        System.out.println("La cantidad de artículos en el artículo 2.");
        Sumatoria = 0;
        for (int f = 0; f < CantidadesVendidas.length; f++) {
            Sumatoria += CantidadesVendidas[f][1];
        }
        System.out.println(" >La cantidad de artículos del artículo 2 = " + Sumatoria);
        System.out.println();

        // Item 3 - La cantidad del artículo 3 en la sucursal 1.
        System.out.print("Item 3 - ");
        System.out.println("La cantidad del artículo 3 en la sucursal 1.");
        System.out.println(" >La cantidad del artículo 3 en la sucursal 1 es: " + CantidadesVendidas[2][0]);
        System.out.println();

        // Aqui cargamos la Matriz
        for (int f = 0; f < CantidadesVendidas.length; f++) {
            for (int c = 0; c < CantidadesVendidas[0].length; c++) {
                MontosRecaudados[f][c] = CantidadesVendidas[f][c] * (int) precioArticulo[f];
            }
        }

        // Impresión de la matriz de montos recaudados
        System.out.println("Montos recaudados por sucursal y artículo:");
        for (int f = 0; f < MontosRecaudados.length; f++) {
            for (int c = 0; c < MontosRecaudados[0].length; c++) {
                System.out.print("| "+MontosRecaudados[f][c] + "\t |");
            }
            System.out.println("\n");
        }
        System.out.println();

        // Cálculo de la recaudación total de cada artículo
        System.out.print("Item 4 - ");
        System.out.println("La recaudación total de cada artículo.");
        for (int c = 0; c < CantidadesVendidas[0].length; c++) {
            Sumatoria = 0;
            for (int f = 0; f < CantidadesVendidas.length; f++) {
                Sumatoria += MontosRecaudados[f][c];
            }
            System.out.println(" >Monto del artículo " + (c + 1) + " = " + Sumatoria);
            MontosUcursales[c] = Sumatoria;
        }
        System.out.println();

        // Item 5 - La recaudación total de la empresa.
        System.out.print("Item 5 - ");
        System.out.println("La recaudación total de la empresa.");
        Sumatoria = 0;
        for (double monto : MontosUcursales) {
            Sumatoria += monto;
        }
        System.out.println(" >Recaudación total de la empresa = " + Sumatoria);
        System.out.println();

        // Item 6 - El artículo de mayor recaudación.
        System.out.print("Item 6 - ");
        System.out.println("El artículo de mayor recaudación.");
        double MayorValorArticulo = MontosUcursales[0];
        int posicion = 0;
        for (int i = 0; i < MontosUcursales.length; i++) {
            if (MontosUcursales[i] > MayorValorArticulo) {
                MayorValorArticulo = MontosUcursales[i];
                posicion = i;
            }
        }
        System.out.println("Artículo " + (posicion + 1) + ", con un monto = " + MayorValorArticulo);
    }
}
