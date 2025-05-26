package SistemaDeAlmuerzos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistem {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Plato> platos;
        public void agregarPlato(Plato p1) {
        platos.add(p1);
    }

    public void eliminarPlato(int pos) {
        platos.remove(pos);
    }

    public void addPedido(Pedido a1){
        pedidos.add(a1);

    }
    public void ModPedido(Pedido a1, int pos){
        pedidos.set(pos, a1);
    }
    public void RemovePedido(int pos){
        pedidos.remove(pos);
    }

    public void listadoDelDia(LocalDate fecha) {
        System.out.println("Pedidos para el día " + fecha + ":");
        for (Pedido pedido : pedidos) {
            if (pedido.getFechaCreacion().equals(fecha)) {
                System.out.printf("el plato es: "+ pedido.getPlato().getNombre(),"el precio es: "+ pedido.getPlato().getPrecio());
            }
        }
    }



    public void top3(){
        ArrayList<Plato>platosPedidos = null;

        for(Pedido pedido : pedidos){
            platosPedidos.add(pedido.getPlato());
            for (int i=0; i < platosPedidos.size();i++){

            }
        }

    }


}
