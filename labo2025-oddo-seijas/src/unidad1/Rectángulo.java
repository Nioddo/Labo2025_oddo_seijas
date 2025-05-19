package unidad1;

public class Rectángulo extends Figuras{
    private float base;
    private float altura;

    public Rectángulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getbase() {
        return base;
    }

    public void setbase(float base) {
        this.base = base;
    }

    public float getaltura() {
        return altura;
    }

    public void setaltura(float altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura; 
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Rectángulo r1 = new Rectángulo(4, 6);

        System.out.println("Base: " + r1.getbase());
        System.out.println("Altura: " + r1.getaltura());
        System.out.println("Área del rectángulo: " + r1.area());
        System.out.println("Perímetro del rectángulo: " + r1.perimetro());
    }
}
