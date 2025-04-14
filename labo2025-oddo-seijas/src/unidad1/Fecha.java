package unidad1;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    public void valida() {
        if (mes < 1) {
            mes = 1;
        }
        if (mes > 12) {
            mes = 12;
        }

        int diasDelMes = diasMes(mes);

        if (dia < 1) {
            dia = 1;
        }
        if (dia > diasDelMes) {
            dia = diasDelMes;
        }
    }
    public int diasMes(int m) {
        if (m == 2) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public String corta() {
        return (dia < 10 ? "0" + dia : dia) + "-" +
                (mes < 10 ? "0" + mes : mes) + "-" + anio;
    }

    public String larga() {
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        String[] mesesTexto = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
                "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        int d = dia;
        int m = mes;
        int a = anio;

        if (m < 3) {
            m += 12;
            a -= 1;
        }

        int k = a % 100;
        int j = a / 100;

        int h = (d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        int diaSemana = (h + 6) % 7;

        return diasSemana[diaSemana] + " " + dia + " de " + mesesTexto[mes - 1] + " de " + anio;
    }

    public void siguiente() {
        dia = dia + 1;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes = mes + 1;
            if (mes > 12) {
                mes = 1;
                anio = anio + 1;
            }
        }
    }

    public void anterior() {
        dia = dia - 1;
        if (dia < 1) {
            mes = mes - 1;
            if (mes < 1) {
                mes = 12;
                anio = anio - 1;
            }
            dia = diasMes(mes);
        }
    }

    public int igualQue(Fecha f) {
        if (dia == f.dia && mes == f.mes && anio == f.anio) {
            return 1;
        } else {
            return 0;
        }
    }

    public int menorQue(Fecha f) {
        if (anio < f.anio) {
            return 1;
        } else if (anio == f.anio && mes < f.mes) {
            return 1;
        } else if (anio == f.anio && mes == f.mes && dia < f.dia) {
            return 1;
        } else {
            return 0;
        }
    }

    public int mayorQue(Fecha f) {
        if (anio > f.anio) {
            return 1;
        } else if (anio == f.anio && mes > f.mes) {
            return 1;
        } else if (anio == f.anio && mes == f.mes && dia > f.dia) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Fecha f1 = new Fecha(32, 1, 2024);
        System.out.println("fecha corta: " + f1.corta());
        System.out.println("fecha larga: " + f1.larga());

        f1.siguiente();
        System.out.println("Siguiente día: " + f1.corta());

        f1.anterior();
        System.out.println("Día anterior: " + f1.corta());

        Fecha f2 = new Fecha(1, 2, 2024);
        System.out.println("f1 < f2: " + f1.menorQue(f2));
        System.out.println("f1 == f2: " + f1.igualQue(f2));
        System.out.println("f1 > f2: " + f1.mayorQue(f2));
    }
}
