package Recetas;

public class Postre extends Plato2{
    private int temperatrahorno;
    private Boolean aptodiabeticos;

    @Override
    void MostrarPasos() {
            System.out.println("Los pasos son:" + getPasos());
    }
}

