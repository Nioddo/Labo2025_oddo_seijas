package gestionMascotas;

public class Pajarito extends Mascota{
    private static String saludo="pio";

    public Pajarito(String nombre, String tipo, Dueño dueño, int alegria) {
        super(nombre, tipo, dueño, alegria);
    }

    public static String getSaludo() {
        return saludo;
    }

    public static void setSaludo(String saludo) {
        Pajarito.saludo = saludo;
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
