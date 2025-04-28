package curling;

public class Equipo {
    private unidad2.Equipo equipo1;
    private unidad2.Equipo equipo2;
    private String dia;
    private String turno; // mañana, tarde, noche

    public Equipo(unidad2.Equipo equipo1, unidad2.Equipo equipo2, String dia, String turno) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.dia = dia;
        this.turno = turno;
    }

    public void mostrarPartido() {
        System.out.println("Día: " + dia + " | Turno: " + turno);
        System.out.println(equipo1.getNombreEquipo() + " vs " + equipo2.getNombreEquipo());
        System.out.println("--------------------------------");
    }
}
