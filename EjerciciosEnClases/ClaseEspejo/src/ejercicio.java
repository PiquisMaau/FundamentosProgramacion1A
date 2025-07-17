

public class ejercicio {
    //ejercicio sacado de la web basado en la clase espejo - El profesor lo hizo en netbeans
    public static void main(String[] args) {
        System.out.println("Recomendamos la suscripción Premium.");
        int horasVistas = 50;
    if (horasVistas > 40) {
        System.out.println("Recomendamos la suscripción Premium.");
    } else {
        System.out.println("Una suscripción Estándar es suficiente para ti.");
    }
    boolean esMiembro = true;
    boolean tieneCupon = false;

    if (esMiembro || tieneCupon) {
        System.out.println("¡Puedes acceder al contenido exclusivo!");
    } else {
        System.out.println("Lo sentimos, necesitas ser miembro o tener un cupón.");
    }
    }

}
