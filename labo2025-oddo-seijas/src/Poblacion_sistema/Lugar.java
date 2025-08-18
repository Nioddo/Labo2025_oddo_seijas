package Poblacion_sistema;

import java.util.*;

abstract class Lugar {
    protected String nombre;
    protected String codigo;
    protected HashSet<Coordenada> coordenadas = new HashSet<>();

    public Lugar(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }

    public void agregarCoordenada(double lat, double lon) {
        coordenadas.add(new Coordenada(lat, lon));
    }

    public abstract int getPoblacion();
}

class Coordenada {
    double latitud;
    double longitud;

    public Coordenada(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitud, longitud);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordenada)) return false;
        Coordenada c = (Coordenada) o;
        return Double.compare(c.latitud, latitud) == 0 &&
                Double.compare(c.longitud, longitud) == 0;
    }
}

class Barrio extends Lugar {
    private int poblacion;

    public Barrio(String nombre, String codigo, int poblacion) {
        super(nombre, codigo);
        this.poblacion = poblacion;
    }

    @Override
    public int getPoblacion() {
        return poblacion;
    }
}

abstract class LugarCompuesto extends Lugar {
    protected Set<Lugar> subLugares = new HashSet<>();

    public LugarCompuesto(String nombre, String codigo) {
        super(nombre, codigo);
    }

    public void agregarSubLugar(Lugar lugar) {
        subLugares.add(lugar);
    }

    @Override
    public int getPoblacion() {
        int total = 0;
        for (Lugar l : subLugares) {
            total += l.getPoblacion();
        }
        return total;
    }
}

class Ciudad extends LugarCompuesto {
    public Ciudad(String nombre, String codigo) { super(nombre, codigo); }
}

class ProvinciaEstado extends LugarCompuesto {
    public ProvinciaEstado(String nombre, String codigo) { super(nombre, codigo); }
}

class Pais extends LugarCompuesto {
    public Pais(String nombre, String codigo) { super(nombre, codigo); }
}

class Continente extends LugarCompuesto {
    public Continente(String nombre, String codigo) { super(nombre, codigo); }
}
