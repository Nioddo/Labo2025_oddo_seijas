package eleccionesOktubre;

public class TelefonosMoviles extends Dispositivo implements Mensajeria{
    private CompaniasTelefonicas compania;
    private int telefono;
    private int credito;

    public TelefonosMoviles(int numeroSerie, String modelo, String fabricante, Boolean estado, CompaniasTelefonicas compania, int telefono, int credito) {
        super(numeroSerie, modelo, fabricante, estado);
        this.compania = compania;
        this.telefono = telefono;
        this.credito = credito;
    }

    public CompaniasTelefonicas getCompania() {
        return compania;
    }

    public void setCompania(CompaniasTelefonicas compania) {
        this.compania = compania;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public void enviarMensaje(){
        if(getEstado()==true && credito>0){
            System.out.println("Conectando con la antena más cercana..."+ "Vote por el partido para un mejor futuro");
        }
    }
}
