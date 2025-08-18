package PagoEmpleados;

public class MainDesing {
    public static void main(String[] args) {
        Diseñador d1 = new Diseñador("Ana", "Pérez", 30, TipoDiseñador.IT);

        Proyecto p1 = new Proyecto("Web Corporativa", 5000);
        Proyecto p2 = new Proyecto("App Móvil", 8000);

        d1.agregarProyecto(p1, p1.getSueldo());
        d1.agregarProyecto(p2, p2.getSueldo());

        System.out.println("Cantidad de proyectos: " + d1.cantidadProyectos());
        System.out.println("Ganancia sin comisión de 'Web Corporativa': $" + d1.gananciaSinComision("Web Corporativa"));
        d1.mostrarDetalleSueldo();
    }
}



