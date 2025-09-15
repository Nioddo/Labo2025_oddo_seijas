package eleccionesOktubre;

import java.util.HashSet;

public class PartidoPolitico {
    private String nombre;
    private String direccion;
    private int ctdAfiliados;
    private HashSet<Mensajeria> mensajeros;

    public PartidoPolitico(String nombre, String direccion, int ctdAfiliados, HashSet<Mensajeria> mensajeros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ctdAfiliados = ctdAfiliados;
        this.mensajeros = mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCtdAfiliados() {
        return ctdAfiliados;
    }

    public void setCtdAfiliados(int ctdAfiliados) {
        this.ctdAfiliados = ctdAfiliados;
    }

    public HashSet<Mensajeria> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajeria> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(Mensajeria newmensajero){
        mensajeros.add(newmensajero);
    }
    public void hacerCampaña(){
        for (Mensajeria M: mensajeros){
            M.enviarMensaje();
        }
    }
}
