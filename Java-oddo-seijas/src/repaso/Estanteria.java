package repaso;

import java.util.ArrayList;

public class Estanteria {
    private int numero;
    private ArrayList<Pelicula> peliculas;


    public Estanteria() {
        numero = 1;
        peliculas = new ArrayList<>();
    }

    public Estanteria(int numero, ArrayList<Pelicula> peliculas) {
        this.numero = numero;
        this.peliculas = peliculas;
    }

    public int getNumero() {
        return numero;
    }
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas){
        this.peliculas=peliculas;
    }

    public void directoresRepetidos(){
        ArrayList<String> directoresTotales = new ArrayList<>();
        ArrayList<String> directoresRepes = new ArrayList<>();

        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            for (int j = 0; j < pelicula.getDirectors().size(); j++) {
                String nombre = pelicula.getDirectors().get(j).getNombre();
                directoresTotales.add(nombre);
            }
        }

        for (int i = 0; i < directoresTotales.size(); i++) {
            for (int j = i + 1; j < directoresTotales.size(); j++) {
                if (directoresTotales.get(i) == directoresTotales.get(j)) {
                    boolean yaAgregado = false;

                    for (int k = 0; k < directoresRepes.size(); k++) {
                        if (directoresRepes.get(k) == directoresTotales.get(i)) {
                            yaAgregado = true;
                        }
                    }

                    if (!yaAgregado) {
                        directoresRepes.add(directoresTotales.get(i));
                    }
                }
            }
        }

        System.out.println("Directores repetidos:");
        for (int i = 0; i < directoresRepes.size(); i++) {
            System.out.println(directoresRepes.get(i));
        }



    }

    public void menor90 (){
        System.out.println("Las peliculas menores de 90 minutos son: ");
        for (Pelicula pelicula : peliculas){
            if (pelicula.getDuracion()<90){
                System.out.println("Nombre: "+pelicula.getNombre()+" Duracion: "+pelicula.getDuracion());
            }
        }

    }

}