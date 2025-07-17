package archvosrepaso;

public class Cuenta {

    //Esta clse es para crear mi objeto
private String id;
private String nombre;
private String apellido;
private String ciudad;
private String genero;
private int ingresos;
private int egresos;

public Cuenta(String id, String nombre, String apellido, String ciudad, String genero, int ingresos, int egresos) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.ciudad = ciudad;
    this.genero = genero;
    this.ingresos = ingresos;
    this.egresos = egresos;
}

public String getId() {
    return id;
}

public void setId(String id) {
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

public int getIngresos() {
    return ingresos;
}

public void setIngresos(int ingresos) {
    this.ingresos = ingresos;
}

public int getEgresos() {
    return egresos;
}

public void setEgresos(int egresos) {
    this.egresos = egresos;
}

@Override
public String toString() {
    return "Cuenta [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", genero="
            + genero + ", ingresos=" + ingresos + ", egresos=" + egresos + "]";
}







}
