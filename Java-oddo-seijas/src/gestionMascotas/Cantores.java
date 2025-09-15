package gestionMascotas;

public class Cantores extends  Mascota{
    private String saludo;

    public Cantores(String nombre, String tipo, Dueño dueño, int alegria, String saludo) {
        super(nombre, tipo, dueño, alegria);
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
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
