#include <iostream>
#include <vector>
using namespace std ;

struct productos_t 
{
    string nombre ;
    int codigo ;
    string marca ;
    int precio ;
    bool vencimiento ;
};

void cargadatos (vector<vector<productos_t>> & gondola )
{
    for(int i = 0 ; i < gondola.size() ; i ++)
    {
        for(int j = 0 ; gondola[i].size() ; j++)
        {
            cout << "Ingrese el nombre del producto de la fila " << i << " y de la columna " << j << endl ;
            cin >> gondola[i][j].nombre ;
            cout << "Ingrese el codigo del producto de la fila " << i << " y de la columna " << j << endl ;
            cin >> gondola[i][j].codigo ;
            cout << "Ingrese la marca del producto de la fila " << i << " y de la columna " << j << endl ;
            cin >> gondola[i][j].marca ;
            cout << "Ingrese el precio del producto de la fila " << i << " y de la columna " << j << endl ;
            cin >> gondola[i][j].precio ;
            cout << "Ingrese si el producto de la fila " << i << " y de la columna " << j << "tiene fecha de vencimiento " << endl ;
            cin >> gondola[i][j].vencimiento ;
        }
    }
}

void columnaprecio( vector<vector<productos_t>>  gondola )
{
    int auxi = 0 ;
    for(int i = 0 ; i < gondola.size(); i ++ )
    {
        for(int j = 0 ; gondola[i].size() ; j++)
        {
            /*if(gondola[j][i])    
            {

            }*/
        }
    }

}

void nombre (vector<vector<productos_t>>  gondola)
{
    cout << "El nombre del producto de la fila 2 columna 3 es " << gondola[2][3].nombre << endl ;
}

void promedio (vector<vector<productos_t>>  gondola)
{
    int auxi = 0 ;
    for(int i = 0 ; i < gondola.size() ; i ++)
    {
        for(int j = 0 ; gondola[i].size() ; j++)
        {
            auxi = auxi + gondola[i][j].precio ;
        }
    }
    auxi = auxi/12;
    cout << "El promedio de valor de los productos es de " << auxi << endl ;
}

int main()
{
    
    vector<vector<productos_t>> gondola[3][4] ;
    cargadatos(gondola[3][4]);
    columnaprecio(gondola[3][4]);   
    nombre(gondola[3][4]);
    promedio(gondola[3][4]);
}