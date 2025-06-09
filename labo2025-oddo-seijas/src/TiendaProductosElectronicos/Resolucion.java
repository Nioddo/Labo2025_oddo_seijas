package TiendaProductosElectronicos;

public enum Resolucion {
    ULTRAHD(2.1),CUATROK(8.3),FULLHD(8.8);

    private double megapixeles;

    Resolucion(double megapixeles) {
        this.megapixeles = megapixeles;
    }

    public double getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(double megapixeles) {
        this.megapixeles = megapixeles;
    }
}
