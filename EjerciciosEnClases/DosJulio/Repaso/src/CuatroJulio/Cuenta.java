package CuatroJulio;

public class Cuenta {
    private int id;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String genero;
    private double ingresos;
    private double egresos;

    public Cuenta(int id, String nombre, String apellido, String ciudad, String genero, double ingresos, double egresos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.genero = genero;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    @Override
    public String toString() {
        String resultado = this.id + "\t" +
                this.nombre + "\t" +
                this.apellido + "\t" +
                this.ciudad + "\t" +
                this.genero + "\t" +
                this.ingresos + "\t" +
                this.egresos;
        return resultado;

    }

}
