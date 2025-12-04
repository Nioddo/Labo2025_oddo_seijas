package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<libro> libros;
    private ArrayList<LibroImpreso> LibrosImpresos;

    public void agregarlibro(libro l){
        libros.add(l);
    }
    public boolean libromasrecientequeotro (libro libro1, libro libro2) {
        return libro1.getFecha_adquicision().isBefore(libro2.getFecha_adquicision()) ;
    }

    public libro libro_mas_reciente(ArrayList<libro> libros){
    libro mas_reciente = null;
    for (libro l: libros){
        if (l.getFecha_adquicision().isBefore(mas_reciente.getFecha_adquicision())){
            mas_reciente=l;
        }
    }
        return mas_reciente;
    }

    public int devolver_isbn(ArrayList<LibroImpreso> LibrosImpresos){
    LibroImpreso mas_reciente =  null;
    for (LibroImpreso l: LibrosImpresos){
        if (l.getFecha_publicacion().isAfter(mas_reciente.getFecha_publicacion())){
            mas_reciente=l;
        }
    }
    return mas_reciente.getIsbn();
}
    public void librosporidioma(ArrayList<libro> libros) {
        int frances=0;
        int espaniol=0;
        int ingles=0;
        for (libro l: libros){
            if (l.getIdioma()=="frances"){
                frances++;
            } else if (l.getIdioma()=="español") {
                espaniol++;
            }
            else{
                ingles++;
            }
        }
        System.out.println("libros en español: "+ espaniol+ "libros en ingles: "+ ingles+ "libros en frances: "+ frances);
    }
    
}
