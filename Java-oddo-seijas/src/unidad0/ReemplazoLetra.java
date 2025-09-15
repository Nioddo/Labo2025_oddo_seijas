package unidad0;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        char c;
        Scanner e = new Scanner(System.in);
        c=e.next().charAt(0);
        String frase="Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        String nuevoTexto = frase.replace('e', c );

        System.out.println(nuevoTexto);
    }
}
