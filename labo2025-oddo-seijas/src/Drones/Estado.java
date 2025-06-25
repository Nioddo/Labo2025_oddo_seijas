package Drones;

public enum Estado {
    OPERATIVO(true),VUELO(true),INACTIVO(false),MANTENIMIENTO(false);
    private boolean raestrable;

    Estado(boolean raestrable) {
        this.raestrable = raestrable;
    }

    public boolean isRaestrable() {
        return raestrable;
    }

    public void setRaestrable(boolean raestrable) {
        this.raestrable = raestrable;
    }
}
