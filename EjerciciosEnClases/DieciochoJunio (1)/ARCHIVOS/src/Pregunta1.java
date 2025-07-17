public class Pregunta1 {
    // LLvea este nombre suponiendo que es prueba

    private String prvincia;
    private double total;

    public Pregunta1(String prvincia, double total) {
        this.prvincia = prvincia;
        this.total = total;
    }

    public String getPrvincia() {
        return prvincia;
    }

    public void setPrvincia(String prvincia) {
        this.prvincia = prvincia;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Provincia: " + prvincia + "\t Monto: " + total;
    }

}
