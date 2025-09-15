package Sistema_de_alarmas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Sensor> sensores = new ArrayList<>();
        SensorCompuesto s1 = new SensorCompuesto(true, 7, 2021, 3, new ArrayList<>());
        SensorHumo s2 = new SensorHumo(true, 7, 2021, 3);
        SensorPresion s3 = new SensorPresion(true, 7, 2021, 3);


        sensores.add(s1);
        sensores.add(s2);
        sensores.add(s3);

        Scanner scanner = new Scanner(System.in);
        boolean v=true;
        while(v) {

            try {
                int n = scanner.nextInt();
                System.out.println(sensores.get(n));
                v=false;
            } catch (InputMismatchException errorDeMismatch) {
                errorDeMismatch.getMessage();
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException errorEsp) {
                errorEsp.getMessage();
                scanner.next();

            }
        }
    }
}
