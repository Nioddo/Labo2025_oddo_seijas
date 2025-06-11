package Recetas;

import java.util.ArrayList;

public class sistemaderecetas {
private ArrayList<platoprincipal> platosprincipales;
private ArrayList<Postre> Postres;
private ArrayList<Entrada> Entradas;

public void addplatoprincipal(platoprincipal ppa1){
    platosprincipales.add(ppa1);
}
public void deleteplatoprincipal(platoprincipal ppr1){
    platosprincipales.remove(ppr1);
}
public void modificplatoprincipal(platoprincipal platoviejo, platoprincipal platonuevo){
    platosprincipales.remove(platoviejo);
    platosprincipales.add(platonuevo);
}
    public void addpEntrada(Entrada ea1){
        Entradas.add(ea1);
    }
    public void deleteEntrada(Entrada er1){
        Entradas.remove(er1);
    }
    public void modificEntradas(Entrada platoviejo, Entrada platonuevo){
        Entradas.remove(platoviejo);
        Entradas.add(platonuevo);
    }
    public void addPostre(Postre pa1){
        Postres.add(pa1);
    }
    public void deletePostre(Postre pr1){
        Postres.remove(pr1);
    }
    public void modificPostre(Postre platoviejo, Postre platonuevo){
        Postres.remove(platoviejo);
        Postres.add(platonuevo);
    }

}
