package unidad1;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche() {
        this.marca = "Peugeot";
        this.modelo = "GTI";
        this.color = "Blanco";
        this.velocidad = 80;
    }

    public Coche(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        velocidad += 20;
    }

    public void frenar() {
        velocidad -= 20;
    }

    public static void main(String[] args) {

        Coche c1 = new Coche();

        Coche c2 = new Coche("Toyota", "Hilux", "Negro", 90);

        System.out.println("Marca de c1: " + c1.getMarca());
        System.out.println("Modelo de c1: " + c1.getModelo());
        System.out.println("Color de c1: " + c1.getColor());
        System.out.println("Velocidad actual de c1: " + c1.getVelocidad());
        c1.acelerar();
        System.out.println("Velocidad después de acelerar c1: " + c1.getVelocidad());
        c1.frenar();
        System.out.println("Velocidad después de frenar c1: " + c1.getVelocidad());

        System.out.println();

        System.out.println("Marca de c2: " + c2.getMarca());
        System.out.println("Modelo de c2: " + c2.getModelo());
        System.out.println("Color de c2: " + c2.getColor());
        System.out.println("Velocidad actual de c2: " + c2.getVelocidad());
        c2.acelerar();
        System.out.println("Velocidad después de acelerar c2: " + c2.getVelocidad());
        c2.frenar();
        System.out.println("Velocidad después de frenar c2: " + c2.getVelocidad());
    }
}
