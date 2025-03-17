#include <iostream>
#include <vector>
using namespace std;

struct Fecha{
    int dia;
    int mes;
    int año;
};

struct Paciente{
    string nombre;
    int edad;
    int numero;
    Fecha proxima_cita;
};

void cancelar_cita(vector<Paciente> &pacientes){
    int e;
    cout<<"Ingrese el número de historia clínica para cancelar la cita: "<<endl;
    cin>>e;
    for (int i = 0; i < pacientes.size(); i++)
    {
        if(pacientes[i].numero == e){
            pacientes[i].proxima_cita.dia = 0;
            pacientes[i].proxima_cita.mes = 0;
            pacientes[i].proxima_cita.año = 0;
            cout << "Cita cancelada para el paciente " << pacientes[i].nombre << endl;
        }
    }
}

void mostrar_citas(vector<Paciente> &pacientes){
    int dia, mes, año, e = 0;
    cout << "Ingrese el día específico para ver qué citas hay ese día: "<<endl;
    cout << "Día: ";
    cin >> dia;
    cout << "Mes: ";
    cin >> mes;
    cout << "Año: ";
    cin >> año;
    
    for (int i = 0; i < pacientes.size(); i++)
    {
        if(pacientes[i].proxima_cita.dia == dia && pacientes[i].proxima_cita.mes == mes && pacientes[i].proxima_cita.año == año){
            e++;
            cout << pacientes[i].nombre << endl;
            cout << pacientes[i].edad << endl;
            cout << pacientes[i].numero << endl;
        }
    }

    if(e == 0){
        cout << "No se encontraron citas ese día." << endl;
    }
}

void mostrar_pacientes(vector<Paciente> &pacientes){
    int nro, e = 0;
    cout << "Ingrese el número de historia clínica: "<<endl;
    cin >> nro;

    for (int i = 0; i < pacientes.size(); i++)
    {
        if(pacientes[i].numero == nro){
            e++;
            cout << "Nombre: " << pacientes[i].nombre << endl;
            cout << "Edad: " << pacientes[i].edad << endl;
            cout << "Número: " << pacientes[i].numero << endl;
            cout << "Fecha de próxima cita: " << pacientes[i].proxima_cita.dia << "/"
                 << pacientes[i].proxima_cita.mes << "/" << pacientes[i].proxima_cita.año << endl;
        }
    }
    
    if(e == 0){
        cout << "No se encontraron pacientes con ese número de historia clínica." << endl;
    }
}

void registrar_pacientes(vector<Paciente> &pacientes){
    int e;
    Paciente aux;
    cout << "¿Cuántos pacientes quiere registrar?" << endl;
    cin >> e;
    
    for (int i = 0; i < e; i++)
    {
        cout << "Paciente " << i + 1 << endl;
        cout << "Nombre: ";
        cin >> aux.nombre;
        cout << "Edad: ";
        cin >> aux.edad;
        cout << "Número de historia clínica: ";
        cin >> aux.numero;
        cout << "- Fecha de próxima cita (en números) -" << endl;
        cout << "Día: ";
        cin >> aux.proxima_cita.dia;
        cout << "Mes: ";
        cin >> aux.proxima_cita.mes;
        cout << "Año: ";
        cin >> aux.proxima_cita.año;
        pacientes.push_back(aux);
    }
}

int main() {
    vector<Paciente> pacientes;
    int opcion;

    do {
        cout << "Menú de opciones: "<<endl;
        cout << "1. Registrar pacientes"<<endl;
        cout << "2. Cancelar cita"<<endl;
        cout << "3. Mostrar citas de un día"<<endl;
        cout << "4. Mostrar información de un paciente"<<endl;
        cout << "5. Salir"<<endl;
        cout << "Ingrese una opción: "<<endl;
        cin >> opcion;

        switch(opcion) {
            case 1:
                registrar_pacientes(pacientes);
                break;
            case 2:
                cancelar_cita(pacientes);
                break;
            case 3:
                mostrar_citas(pacientes);
                break;
            case 4:
                mostrar_pacientes(pacientes);
                break;
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Intente nuevamente." << endl;
        }
    } while (opcion != 5);

    return 0;
}
