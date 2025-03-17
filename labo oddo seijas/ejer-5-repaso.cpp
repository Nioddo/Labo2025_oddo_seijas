include <iostream>
#include <vector>
using namespace std ;

struct producto{
    string nombre;
    string categoria;
    float precio;
    int cantidad_de_ventas;
    string promo;
}
struct pedido{
    string nombre_cliente;
    vector <string> nombre_producto;
    int cantidad_productos;
    float precio_total;
    string fecha;
}
void calculo( string nombre_producto, vector <producto> productos, vector <pedido> pedidos){
    for(int i=0; i<)
}
void reg_pedido(vector <producto> productos){
producto aux;
for(int i=0; i=<20;i++){
cout<<"ingrese nombre del producto"<<;
cin>>aux.nombre;
cout<<"precio del producto"<<;
cin>>aux.precio;
cout<<"cantidad de ventas del producto"<<;
cin>>aux.cantidad_de_ventas;
cout<<"categoria del producto"
cout<<"tiene promo(si/no)"<<;
cin>>aux.promo;
productos.push_back(aux);
}
}
void reg_pedido(vector <producto> productos, vector <pedido> pedidos){
pedido aux;
cout<<"nombre del cliente"<<;
cin>>aux.nombre_cliente;
cout<<"pene"<<;

}
int main()
{
vector <producto> productos;

}