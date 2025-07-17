package CuatroJulio;

public class Pregunta3 {

private String ciudad;
private Double ingresos;
private Double egresos;
public Pregunta3(String ciudad, Double ingresos, Double egresos) {
    this.ciudad = ciudad;
    this.ingresos = ingresos;
    this.egresos = egresos;
}
public String getCiudad() {
    return ciudad;
}
public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
}
public Double getIngresos() {
    return ingresos;
}
public void setIngresos(Double ingresos) {
    this.ingresos = ingresos;
}
public Double getEgresos() {
    return egresos;
}
public void setEgresos(Double egresos) {
    this.egresos = egresos;
}
@Override
public String toString() {
    return "Pregunta3 [ciudad=" + ciudad + ", ingresos=" + ingresos + ", egresos=" + egresos + "]";
}




}
