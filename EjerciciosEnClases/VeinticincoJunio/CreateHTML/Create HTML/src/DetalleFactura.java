public class DetalleFactura {

    private String producto;	
    private double precio;	
    private int cantidad; 	
    private double subtotal;   //Esto datos voy a ir alimentando 

    public DetalleFactura(int cantidad, double precio, String producto, double subtotal) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
        this.subtotal = subtotal;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    




}
