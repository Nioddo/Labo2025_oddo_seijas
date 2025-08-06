package vacunatorio;

import java.util.*;


public class sistema_vacunacion {
    private HashMap<Integer, Ciudadano> ciudadanos = new HashMap<>();
    private HashMap<Ciudadano, HashSet<Vacuna>> historialVacunas = new HashMap<>();

    public void registrarCiudadano(Ciudadano c) {
        ciudadanos.put(c.getDni(), c);
    }

    public void registrarVacuna(int dni, Vacuna vacuna) {
        if (!ciudadanos.containsKey(dni)) {

            Ciudadano c = new Ciudadano(dni);
            ciudadanos.put(dni, c);
        }
        historialVacunas.get(ciudadanos.get(dni)).add(vacuna);
    }

    public void obtenerHistorial(int dni) {
        HashSet<Vacuna> vacunas = historialVacunas.get(dni);
        for (Vacuna v : vacunas) {
            System.out.println(v.getNombreComercial());
        }
    }

    public void vacunadosPorProvinicia() {
        HashMap<Provincia, Integer> gentePorProv = new HashMap<Provincia, Integer>();
        int aux;
        for (Map.Entry<Integer, Ciudadano> c : ciudadanos.entrySet()) {
            if (gentePorProv.containsKey(c.getValue().getProvincia())) {
                //quiere decir que ya esta la provincia y hay que sumar 1
                aux = gentePorProv.get(c.getValue().getProvincia());
                gentePorProv.put(c.getValue().getProvincia(), aux + 1);
            } else {
                gentePorProv.put(c.getValue().getProvincia(), 1);
            }

        }
    }


    public void vacunasMinimas (int vac) {

        for (Ciudadano c : ciudadanos){
            if (c.getHistorialVacunas().size()<vac){
                System.out.println(c.getNombre()+c.getApellido());
            }

        }
    }

public void vacunasDadas (Vacuna vacunita){
        HashSet<Ciudadano>ciudadanosConVacunita=new HashSet<Ciudadano>();
        for (Ciudadano c: ciudadanos){
            if (c.getHistorialVacunas().contains(vacunita)){
                ciudadanosConVacunita.add(c);
            }
            System.out.println(ciudadanosConVacunita);
        }

}

}
