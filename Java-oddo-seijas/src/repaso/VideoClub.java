package repaso;

import java.util.ArrayList;

public class VideoClub {
    private String direccion;
    private String comuna;
    private int codigoPostal;
    private ArrayList<Estanteria> estanterias;

public VideoClub(){
    this.direccion="Tamborini 3574";
    this.codigoPostal=1430;
    this.estanterias=new ArrayList<>();
    this.comuna="comuna11";
}
    public VideoClub(String direccion, int codigoPostal, ArrayList<Estanteria> estanterias, String comuna){
        this.direccion=direccion;
        this.codigoPostal=codigoPostal;
        this.estanterias=estanterias;
        this.comuna=comuna;
    }

    public String getDireccion(){
        return direccion;
    }
    public String getComuna(){
        return comuna;
    }

    public int getCodigoPostal(){
        return codigoPostal;
    }
    public ArrayList<Estanteria> getEstanterias(){
        return estanterias;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;

    }
    public void setComuna(String comuna){
        this.comuna = comuna;

    }
    public void setCodigoPostal(int codigoPostal){
        this.codigoPostal = codigoPostal;

    }
    public void setEstanterias(ArrayList<Estanteria> estanterias){
        this.estanterias = estanterias;

    }

 public void mayorPelicula(ArrayList<Estanteria> estanterias){
     Pelicula aux = new Pelicula();
     Estanteria e = new Estanteria();
    for(Estanteria estanteria : estanterias ){
        for(Pelicula pelicula: estanteria.getPeliculas()){
            if(pelicula.getDuracion()>aux.getDuracion()){
                aux=pelicula;
                e=estanteria;

            }
        }
    }
     System.out.println("Duracion:"+aux+" en la estanteria:"+ e.getNumero() + " nombre:"+aux.getNombre());
 }

}
