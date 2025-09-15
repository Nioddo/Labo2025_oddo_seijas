package unidad0;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner esca = new Scanner(System.in);
        String e;
        String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.print("Ingresa un día de la semana: ");
        e = esca.nextLine();

        for (int i = 0; i < dia.length; i++) {
            if (e.equalsIgnoreCase(dia[i]) && i > 4) {
                System.out.println(dia[i] + " no laboral");
            } else if (e.equalsIgnoreCase(dia[i]) && i <= 4) {
                System.out.println(dia[i] + " laboral");
            }
        }

    }
}


