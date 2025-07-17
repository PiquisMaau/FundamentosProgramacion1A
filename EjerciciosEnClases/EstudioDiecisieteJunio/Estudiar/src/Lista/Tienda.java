package Lista;

public class Tienda {

    private String nombre;
    private int precio;
    private int id;

    
    public Tienda() {
    }


    public Tienda(String nombre, int precio, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    

    
}
