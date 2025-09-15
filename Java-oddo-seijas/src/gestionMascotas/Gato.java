package gestionMascotas;

public class Gato extends Mascota {
    private static String saludo="miau";

    public Gato(String nombre, String tipo, Dueño dueño, int alegria) {
        super(nombre, tipo, dueño, alegria);
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Gato.saludo = saludo;
    }

    @Override
    public void saludar(Dueño d, Mascota m){
        if(d==m.getDueño()){
            System.out.println(saludo);
        }
        else{
            System.out.println(saludo.toLowerCase()+"!");

        }
    }


}
