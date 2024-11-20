package taller2.ejercicio2;

public class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez está respirando bajo el agua.");
    }
}

