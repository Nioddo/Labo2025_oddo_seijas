package SitioWeb;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Compra> compusVendidas;
    private ArrayList<Componente> todosPerifericos;


public void AgregarCompra(){
    for (int i = 0;  i<compusVendidas.size(); i++){

    }
}

public double precioTotal(){
    double aux=0;
    for (Componente c: todosPerifericos){
        aux=c.getPrecio()*c.getStock();
    }
    return aux;
}

}
