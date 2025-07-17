public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] StockProductosAlmacenes = new int[][] {
                { 5, 3, 7 },
                { 9, 10, 1 },
                { 8, 3, 5 },
                { 4, 2, 6 },
                { 8, 7, 12 },
                { 9, 10, 15 },
                { 3, 2, 9 },
                { 1, 7, 8 },
        };

        // Item 1 - Mostrar el inventario de cada producto.
        System.out.print("Item 1 - ");
        System.out.println("Mostrar el inventario de cada producto.");
        int Sumatoria = 0;
        for (int F = 0; F < StockProductosAlmacenes.length; F++) {
            Sumatoria = 0;
            for (int c = 0; c < StockProductosAlmacenes[0].length; c++) {
                Sumatoria = Sumatoria + StockProductosAlmacenes[F][c];
            }
            System.out.println(" >El Inventario del producto " + (F + 1) + " es = " + Sumatoria);
        }
        System.out.println();

        // Item 2 - Calcular el inventario total en el almacén 1.
        System.out.print("Item 2 - ");
        System.out.println("Calcular el inventario total en el almacén 1.");
        Sumatoria = 0;
        for (int c = 0; c < StockProductosAlmacenes.length; c++) {
            Sumatoria = Sumatoria + StockProductosAlmacenes[c][0];

        }
        System.out.println(" >El inventario total del Almacen 1 es = " + Sumatoria);
        System.out.println();

        // Item 3 - Mostrar el stock del producto 4 en el almacén 2.
        System.out.print("Item 3 - ");
        System.out.println("Mostrar el stock del producto 4 en el almacén 2.");
        System.out.println("El stock del producto 4 en el almacen 2 es: " + StockProductosAlmacenes[3][1]);
        System.out.println();

        // Item 4 - Calcular el valor total del inventario de la cadena, asumiendo que
        // el precio de cada producto es: p1= $ 100, p2= $ 200, p3= $ 50, p4= $ 40, p5=
        // $ 80, p6= $100, p7= $ 60, p8= $ 50,
        System.out.print("Item 4 - ");
        System.out.println("Calcular el valor total del inventario de la cadena.");
        int[] precioProductos = { 100, 200, 50, 40, 80, 100, 60, 50 };
        Sumatoria = 0;
        for (int c = 0; c < StockProductosAlmacenes[0].length; c++) {
            for (int F = 0; F < StockProductosAlmacenes.length; F++) {
                Sumatoria += precioProductos[F] * StockProductosAlmacenes[F][c];
            }
        }
        System.out.println("El valor total del inventario es = $" + Sumatoria);
        System.out.println();

        // Item 5 - Determinar el almacen con mayor cantidad de productos.
        System.out.print("Item 5 - ");
        System.out.println("Determinar el almacen con mayor cantidad de productos.");
        int mayorCantidad = 0;
        int almacenMayor = 0;
        for (int c = 0; c < StockProductosAlmacenes[0].length; c++) {
            int sumaAlmacen = 0;
            for (int f = 0; f < StockProductosAlmacenes.length; f++) {
                sumaAlmacen += StockProductosAlmacenes[f][c]; 
            }
            if (sumaAlmacen > mayorCantidad) {
                mayorCantidad = sumaAlmacen;
                almacenMayor = c;
            }
        }

        System.out.println("El almacén con mayor cantidad de productos es el " + (almacenMayor + 1)
                + " con un total de " + mayorCantidad + " productos.");
    }
}
