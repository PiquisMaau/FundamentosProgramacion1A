public class dELITO {

    private String provincia;
    private String delito;
    private boolean  judicializado;
    private String victima;

    public dELITO(String delito, boolean judicializado, String provincia, String victima) {
        this.delito = delito;
        this.judicializado = judicializado;
        this.provincia = provincia;
        this.victima = victima;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public boolean isJudicializado() {
        return judicializado;
    }

    public void setJudicializado(boolean judicializado) {
        this.judicializado = judicializado;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    @Override
    public String toString() {
        String resultado = "Delito: "+ delito+"\tJudicializado:"+" "+ judicializado +"\t Provincia: "+ provincia +"\t Victima: "+victima+"\n";
        return resultado;
    }

    public String convertirFormatoCSV(){
        return provincia+"; "+delito+"; "+judicializado+";"+victima+"; ";
    }

    
}
