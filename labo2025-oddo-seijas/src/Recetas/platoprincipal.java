package Recetas;

public class platoprincipal extends Plato2{
    private int tiempococcion;
    private int numerocomensales;

    public int getTiempococcion() {
        return tiempococcion;
    }

    public void setTiempococcion(int tiempococcion) {
        this.tiempococcion = tiempococcion;
    }

    public int getNumerocomensales() {
        return numerocomensales;
    }

    public void setNumerocomensales(int numerocomensales) {
        this.numerocomensales = numerocomensales;
    }

    @Override
    void MostrarPasos() {

        System.out.println("el tiempo de coccion es"+ tiempococcion +"y los pasos son:"+ getPasos());
    }
}
