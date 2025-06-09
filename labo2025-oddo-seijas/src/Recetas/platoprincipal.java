package Recetas;

public class platoprincipal extends Plato2{
    private int tiempococcion;
    private int numerocomensales;

    @Override
    void MostrarPasos() {

        System.out.println("el tiempo de coccion es"+ tiempococcion +"y los pasos son:"+ getPasos());
    }
}
