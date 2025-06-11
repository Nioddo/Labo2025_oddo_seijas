package Recetas;

public class Entrada extends Plato2{
private tipotemperatura tipo;

    @Override
    void MostrarPasos() {
        if (tipo==tipotemperatura.FRIA) {
            System.out.println("Los pasos son:" + getPasos() + "guardar en la heladera!!");
        } else if (tipo==tipotemperatura.CALIENTE) {
            System.out.println("Precalentar el horno!!!");
            System.out.println("Los pasos son:" + getPasos());
        }
    }
}
