package unidad0;

import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {
        int n;
        double a;
        int num;
        char c;
        Scanner e = new Scanner(System.in);
        n=e.nextInt();
        a=e.nextDouble();
        c=e.next().charAt(0);
        num = Character.getNumericValue(c);
        System.out.println(n);
        System.out.println(a);
        System.out.println(c);
        System.out.println(num);




    }

}


