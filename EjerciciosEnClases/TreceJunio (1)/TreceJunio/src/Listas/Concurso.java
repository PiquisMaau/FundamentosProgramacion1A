package Listas;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
    public static void main(String[] args) {
        List<Persona> listPersona = new ArrayList<>();

        Persona persona1 = new Persona("Ana", "F", 20);
        Persona persona2 = new Persona("Pepe", "M", 25);
        Persona persona3 = new Persona("Carlos", "M", 20);

        listPersona.add(persona1);
        listPersona.add(persona2);
        listPersona.add(persona3);

        for (Persona ValorPersona : listPersona) {
            System.out.println(ValorPersona.getNombre());
        }

        for (Persona ValorPersona : listPersona) {
            if (ValorPersona.getEdad() > 21) {
                System.out.println(ValorPersona.getNombre());
            }
        }

    }
}
