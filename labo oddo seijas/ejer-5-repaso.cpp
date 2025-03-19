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
cin>>aux.categoria;
cout<<"tiene promo(si/no)"<<;
cin>>aux.promo;
productos.push_back(aux);
}
}
void reg_pedido(vector <producto> productos, vector <pedido> pedidos){
pedido pedido;
float precio=0, valor total=0;
string siono="si";
string nombre;
cout<<"nombre del cliente"<<;
cin>>aux.nombre_cliente;
cout<<"que fecha es hoy?(ej=**/**/****)"<<endl;
cin>>pedido.fecha
cout<<"producto requerido"<<;
cin>>nombre;
pedido.nombre_producto.push_back(nombre);
cout<<"quiere pedir algo mas(si/no)"<<endl;
cin>>siono;
while (siono=="si")
{
cout<<"producto requerido"<<;
cin>>nombre;
pedido.nombre_producto.push_back(nombre);
for(int i=0; i<productos.size i++){
if (nombre==productos[i].nombre_producto)
{
    precio=productos[i].precio;
    if (productos[i].promo=="si")
    {
        precio=precio*0.8;
    }
    valor_total+=precio
}
else{
    cout<<"no se encontro el producto"<<endl;
}
cout<<"quiere pedir algo mas(si/no)"<<endl;
cin>>siono;
}
}
pedido.precio_total=valor_total;
pedidos.push_back(pedido);
}
void mostrar_producto(vector <pedido> pedidos){
    string nombre;
    cout<<"nombre del cliente a buscar el pedido"<<endl;
    cin>>nombre;
for(int i=0; i<productos.size i++){
if (nombre==productos[i].nombre_producto)
{
cout<<"nombre del cliente:"<<productos[i].nombre_producto
}
else{
    cout<<"no se encontro el producto"<<endl;
}
}
int main()
{
vector <producto> productos;
    
}