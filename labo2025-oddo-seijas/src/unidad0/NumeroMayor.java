package unidad0;

public class NumeroMayor {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Ambos números son iguales: " + numero1);
        }
    }
}
