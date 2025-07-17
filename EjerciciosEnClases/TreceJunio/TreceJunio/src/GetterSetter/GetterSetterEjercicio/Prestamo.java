package GetterSetter.GetterSetterEjercicio;

public class Prestamo {
    private String Name;
    private String cedula;
    private String TipoCredito;
    private double Monto;
    private String TipoAmortizacion;
    private String Tiempo;

    public Prestamo(String name, String cedula, String tipoCredito, double monto, String tipoAmortizacion,
            String tiempo) {
        Name = name;
        this.cedula = cedula;
        TipoCredito = tipoCredito;
        Monto = monto;
        TipoAmortizacion = tipoAmortizacion;
        Tiempo = tiempo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoCredito() {
        return TipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        TipoCredito = tipoCredito;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }

    public String getTipoAmortizacion() {
        return TipoAmortizacion;
    }

    public void setTipoAmortizacion(String tipoAmortizacion) {
        TipoAmortizacion = tipoAmortizacion;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String tiempo) {
        Tiempo = tiempo;
    }

    



    


}
