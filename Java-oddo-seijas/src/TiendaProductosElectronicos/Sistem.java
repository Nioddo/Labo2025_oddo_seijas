package TiendaProductosElectronicos;

import java.util.ArrayList;

public class Sistem {
    private ArrayList<Pantallas> pantallas;
    private ArrayList<EquipoSonido> sound;
    private ArrayList<CargadoresPortatiles> charge;

    public Sistem(ArrayList<Pantallas> pantallas, ArrayList<EquipoSonido> sound, ArrayList<CargadoresPortatiles> charge) {
        this.pantallas = pantallas;
        this.sound = sound;
        this.charge = charge;
    }

    public ArrayList<Pantallas> getPantallas() {
        return pantallas;
    }

    public void setPantallas(ArrayList<Pantallas> pantallas) {
        this.pantallas = pantallas;
    }

    public ArrayList<EquipoSonido> getSound() {
        return sound;
    }

    public void setSound(ArrayList<EquipoSonido> sound) {
        this.sound = sound;
    }

    public ArrayList<CargadoresPortatiles> getCharge() {
        return charge;
    }

    public void setCharge(ArrayList<CargadoresPortatiles> charge) {
        this.charge = charge;
    }

    public static void main(String[] args) {

    }
}
