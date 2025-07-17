public class PreoductosExportacion {

    private int ID;
    private String Mes;
    private int Year;
    private String Pais;
    private String TipoProducto;
    private int PesoToneladas;
    private double MontoMillones;

    public PreoductosExportacion(int iD, String mes, int year, String pais, String tipoProducto, int pesoToneladas,
            double montoMillones) {
        ID = iD;
        Mes = mes;
        Year = year;
        Pais = pais;
        TipoProducto = tipoProducto;
        PesoToneladas = pesoToneladas;
        MontoMillones = montoMillones;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        TipoProducto = tipoProducto;
    }

    public int getPesoToneladas() {
        return PesoToneladas;
    }

    public void setPesoToneladas(int pesoToneladas) {
        PesoToneladas = pesoToneladas;
    }

    public double getMontoMillones() {
        return MontoMillones;
    }

    public void setMontoMillones(double montoMillones) {
        MontoMillones = montoMillones;
    }

    @Override
    public String toString() {
        return  String.format(ID + "\t" + Mes + "\t" + Year + "\t" + Pais
                + "\t" + TipoProducto + "\t" + PesoToneladas + "\t"
                + MontoMillones );         
    }

    public String ConvertirFormatoCSV(){
        return  String.format(ID + ";" + Mes + ";" + Year + ";" + Pais
                + ";" + TipoProducto + ";" + PesoToneladas + ";"
                + MontoMillones );
    }

    public String MontosDeVenta(){
        return  String.format(ID + "\t" + Pais + "\t" + MontoMillones );
    }



    

    

}
