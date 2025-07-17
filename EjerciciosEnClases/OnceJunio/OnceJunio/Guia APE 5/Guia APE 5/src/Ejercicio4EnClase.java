public class Ejercicio4EnClase {
    public static void main(String[] args) {
        double[] precioArticulo = new double[] { 10, 20, 30, 40, 50 };
        int[][] CantidadesVendidas = new int[][] {
                { 5, 6, 10, 1, 1 },
                { 3, 4, 5, 3, 10 },
                { 10, 2, 3, 8, 6 },
                { 4, 3, 2, 5, 2 }
        };
        int[][] MontosRecaudados = new int[4][5];
        double[] MontosUcursales = new double[4];

        // Item 1 - Las cantidades totales de cada artículo.
        System.out.print("Item 1 - ");
        System.out.println("Las cantidades totales de cada Articulo.");
        int Sumatoria = 0;
        for (int c = 0; c < CantidadesVendidas[0].length; c++) {
            Sumatoria = 0;
            for (int F = 0; F < CantidadesVendidas.length; F++) {
                Sumatoria = Sumatoria + CantidadesVendidas[F][c];
            }
            System.out.println(" >Cantidad del articulo" + (c + 1) + " = " + Sumatoria);
        }
        System.out.println();

        // Item 2 - La cantidad de artículos en la sucursal 2.
        System.out.print("Item 2 - ");
        System.out.println("La cantidad de artículos en la sucursal 2.");
        Sumatoria = 0;
        for (int c = 0; c < CantidadesVendidas[0].length; c++) {
            Sumatoria = Sumatoria + CantidadesVendidas[1][c];
        }
        System.out.println(" >La cantidad de articulos ne la sucursal 2 = " + Sumatoria);
        System.out.println();

        // Item 3 - La cantidad del articulo 3 en la sucursal 1.
        System.out.print("Item 3 - ");
        System.out.println(" La cantidad del articulo 3 en la sucursal 1.");
        System.out.println(" >La cantidad del articulo 3 en la sucursal 1 es: " + CantidadesVendidas[0][2]);
        System.out.println();

        // Item 4 - La recaudación total de cada sucursal.
        System.out.print("Item 4 - ");
        System.out.println(" La recaudación total de cada sucursal.");
        /*
         * Sumatoria = 0;
         * for (int F = 0; F < CantidadesVendidas.length; F++) {
         * Sumatoria = 0;
         * for (int c = 0; c < CantidadesVendidas[0].length; c++) {
         * Sumatoria += CantidadesVendidas[F][c];
         * }
         * System.out.println(" >Recaudacion en cada sucursal " + (F + 1) + " = " +
         * Sumatoria);
         * }
         * System.out.println();
         */
        //Cargamos la matriz
        for (int F = 0; F < CantidadesVendidas.length; F++) {
            for (int c = 0; c < CantidadesVendidas[0].length; c++) {
                MontosRecaudados[F][c] = CantidadesVendidas[F][c] * (int) precioArticulo[c];
            }
        }
        //Imprimir la matriz por montos recaudados
        for (int f = 0; f < MontosRecaudados.length; f++) {
            for (int co = 0; co < MontosRecaudados[0].length; co++) {
                System.out.print(MontosRecaudados[f][co] + "  - \t");

            }
            System.out.println("\n");
        }
        //Imprimir valores por sucursal
        Sumatoria = 0;
        for (int F = 0; F < MontosRecaudados.length; F++) {
            Sumatoria = 0;
            for (int c = 0; c < MontosRecaudados[0].length; c++) {
                Sumatoria += MontosRecaudados[F][c];
            }
            System.out.println(" >Monto en cada sucursal " + (F + 1) + " = " + Sumatoria);
            MontosUcursales[F]= Sumatoria;

        }
        System.out.println();

        // Item 5 - La recaudación total de la empresa.
        System.out.print("Item 5 - ");
        System.out.println(" La recaudación total de la empresa.");
        Sumatoria = 0;
        for (int F = 0; F < MontosRecaudados.length; F++) {
            for (int c = 0; c < MontosRecaudados[0].length; c++) {
                Sumatoria += MontosRecaudados[F][c];
            }
        }
        System.out.println("Sumatoria total = " + Sumatoria);
        System.out.println();

        // Item 6 - La sucursal de mayor recaudación.
        System.out.print("Item 6 - ");
        System.out.println(" La sucursal de mayor recaudación.");
        double MayorValorSucursal = 0;
        int posicion = 0;
        MayorValorSucursal = MontosUcursales[0];
        for (int i = 0; i < MontosUcursales.length; i++) {
            if(MayorValorSucursal<=MontosUcursales[i]){
                MayorValorSucursal=MontosUcursales[i];
                posicion = 1;
            }
        }
        System.out.println("Sucursal "+(posicion+1)+", con un monto = "+MayorValorSucursal);
        }
    }

