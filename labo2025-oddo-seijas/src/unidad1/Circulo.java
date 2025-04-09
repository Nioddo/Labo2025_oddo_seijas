package unidad1;

public class Circulo {
    private float radio;

    public Circulo() {
        this.radio = 2;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public double area(float radio){
    double area = Math.PI * Math.pow(radio, 2);
    return area;
    }
    public double parimetro(float radio){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    public static void main(String[] args) {
        Circulo c1 = new Circulo();

        float radio = c1.getRadio();

        double area = c1.area(radio);
        double perimetro = c1.parimetro(radio);

        System.out.println("Radio: " + radio);
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);

    }
}
