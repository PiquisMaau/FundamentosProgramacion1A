package GetterSetter;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pepito", "1384", 12);

        System.out.println(cliente1.getNombre());
        cliente1.setCedula("1804");
        System.out.println(cliente1.getCedula());

        Cliente cliente2 = new Cliente(null, null, 0, null, 0);

        cliente2.ImprimirDatos();

    }
}
