public class Usuario {
    private String documento, nombre, apellidos, area, cargo, correo, telefono;

    public Usuario(String documento, String nombre, String apellidos, String area,
                   String cargo, String correo, String telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.area = area;
        this.cargo = cargo;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String toLinea() {
        return String.join(";", documento, nombre, apellidos, area, cargo, correo, telefono);
    }

    @Override
    public String toString() {
        return String.format("Documento: %s\nNombre: %s %s\nÁrea: %s\nCargo: %s\nCorreo: %s\nTeléfono: %s",
                documento, nombre, apellidos, area, cargo, correo, telefono);
    }
}
