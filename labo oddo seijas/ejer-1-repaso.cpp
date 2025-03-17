#include <iostream>
#include <vector>
using namespace std;

struct Empleado {
    string nombre;
    string apellido;
    string fecha;
    string sexo;
    float salario;
};

// Función para encontrar el empleado con mayor sueldo y separar a los empleados con sueldo menor a 400k
Empleado mayor_sueldo(vector<Empleado> empleados, vector<Empleado> &pobres) {
    Empleado ee;  
    ee.salario = 0;

    // Separar a los empleados con salario menor a 400k
    for (int i = 0; i < empleados.size(); i++) {
        if (empleados[i].salario <= 400000) {
            pobres.push_back(empleados[i]);
        }
    }

    // Buscar el empleado con mayor sueldo
    for (int i = 0; i < empleados.size(); i++) {
        if (empleados[i].salario > ee.salario) {
            ee = empleados[i];
        }
    }

    return ee;  // Retornar el empleado con el mayor sueldo
}

// Función para ingresar los datos de los empleados
void ingresar_empleados(vector<Empleado> &empleados) {
    int numEmpleados;
    cout << "Ingrese la cantidad de empleados: ";
    cin >> numEmpleados;

    for (int i = 0; i < numEmpleados; i++) {
        Empleado e;

        cout << "Empleado " << i + 1 << ":" << endl;
        cout << "Ingrese el nombre: ";
        cin >> e.nombre;
        cout << "Ingrese el apellido: ";
        cin >> e.apellido;
        cout << "Ingrese la fecha: ";
        cin >> e.fecha;
        cout << "Ingrese el sexo: ";
        cin >> e.sexo;
        cout << "Ingrese el salario: ";
        cin >> e.salario;

        empleados.push_back(e);
    }
}

int main() {
    vector<Empleado> empleados;
    vector<Empleado> pobres;

    // Ingresar empleados
    ingresar_empleados(empleados);

    // Obtener el empleado con mayor sueldo y los empleados con salario menor a 400k
    Empleado mejorEmpleado = mayor_sueldo(empleados, pobres);

    // Mostrar el empleado con mayor sueldo
    cout << "El empleado con mayor sueldo:" << endl;
    cout << "Nombre: " << mejorEmpleado.nombre << endl;
    cout << "Apellido: " << mejorEmpleado.apellido << endl;
    cout << "Fecha: " << mejorEmpleado.fecha << endl;
    cout << "Sexo: " << mejorEmpleado.sexo << endl;
    cout << "Salario: " << mejorEmpleado.salario << endl;

    // Mostrar empleados con sueldo menor a 400k
    cout << " Empleados con sueldo menor a 400k:" << endl;
    for (int i = 0; i < pobres.size(); i++) {
        cout << "Nombre: " << pobres[i].nombre << endl;
        cout << "Apellido: " << pobres[i].apellido << endl;
        cout << "Fecha: " << pobres[i].fecha << endl;
        cout << "Sexo: " << pobres[i].sexo << endl;
        cout << "Salario: " << pobres[i].salario << endl;
    }

    return 0;
}
