/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERSISTENCIA;

import PERSISTENCIA.ItemCarrito;
import PERSISTENCIA.Producto;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ProductoService {
    


    private static final String RUTA_PRODUCTOS = "C:/Users/Sebas/Documents/PRODUCTOS.txt";

    public static void guardarProducto(Producto p) throws IOException {
        File archivo = new File(RUTA_PRODUCTOS);

        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            String linea = String.join(";",
                p.getId(),
                p.getNombre(),
                String.valueOf(p.getStock()),
                String.valueOf(p.getPrecio())
            );
            bw.write(linea);
            bw.newLine();
        }
    }

    public static List<Producto> cargarProductos() {
        List<Producto> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_PRODUCTOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 4) {
                    String id = datos[0];
                    String nombre = datos[1];
                    int stock = Integer.parseInt(datos[2]);
                    double precio = Double.parseDouble(datos[3]);
                    Producto p = new Producto(id, nombre, stock, precio);
                    lista.add(p);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return lista;
    }
    public static void actualizarStock(Producto productoActualizado) {
    File archivo = new File(RUTA_PRODUCTOS);
    List<String> nuevasLineas = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            if (datos[0].equals(productoActualizado.getId())) {
                String nuevaLinea = String.join(";",
                    productoActualizado.getId(),
                    productoActualizado.getNombre(),
                    String.valueOf(productoActualizado.getStock()),
                    String.valueOf(productoActualizado.getPrecio())
                );
                nuevasLineas.add(nuevaLinea);
            } else {
                nuevasLineas.add(linea);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al leer productos: " + e.getMessage());
        return;
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {
        for (String nueva : nuevasLineas) {
            bw.write(nueva);
            bw.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar stock: " + e.getMessage());
    }
}

}
