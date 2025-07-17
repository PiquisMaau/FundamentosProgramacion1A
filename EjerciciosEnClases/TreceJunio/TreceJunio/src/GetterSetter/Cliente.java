package GetterSetter;

public class Cliente {

    //Encapsulamiento - Atributos Provados
    private  String nombre;
    private  String cedula;
    private  int edad;
    private  String CtaBancaria;
    private double saldo; 

    public Cliente(String nombre_ , String cedula_ , int edad_ ){
        this.nombre = nombre_;  //Usamos la palabra reservada this. para diferenciar un atributo de un parametro
        cedula = cedula_;
        edad = edad_;
    }


    public Cliente(String nombre, String cedula, int edad, String ctaBancaria, double saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.CtaBancaria = ctaBancaria;
        this.saldo = saldo;
    }



    //Generar un getter (es un metodo) para nombre_ y los demaás: 
    public String getNombre(){
        return nombre;
    }
    //Setter para nombre (always void)
    public void setNombre(String nombre_){
        this.nombre = nombre_;
    }

    public String getCedula(){
        return cedula;
    }
    //Setter para cedula (always void)
    public void setCedula(String cedula_){
        if (cedula_.length() == 4) {
            if(cedula_.substring(0, 2) == "18"){
            this.cedula = cedula_;
        }else{
            System.out.println("La cedula no pertenece a Tungurahua");
        }
    }else{
            System.out.println("No se puede actualizar:c");
        }
    }

    public int getEdad(){
        return edad;
    }
    //Setter para nombre (always void)
    public void setEdad(int edad_){
        this.edad = edad_;
    }

    public String getCtaBancaria() {
        return CtaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCtaBancaria(String ctaBancaria) {
        this.CtaBancaria = ctaBancaria;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ImprimirDatos(){
        System.out.println();
        System.out.println("--------- Datos del CLIENTE ---------"+ "\n");
        System.out.println("Cliente: " + this.nombre);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Edad: " + this.edad);
        System.out.println("N° Cuenta: " + this.CtaBancaria);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("------------------------------------");


    }

    

    
    

}
