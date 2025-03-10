#include <iostream>
#include <vector>
#include <fstream>
#include <sstream>
#include <string>
using namespace std;

// Estructura para representar un movimiento
struct Movimiento {
    string tipo;
    string nombre;
    string actividad;
};

// Estructura para representar un plazo fijo
struct PlazoFijo {
    float monto = 0;
    int dias = 0;
    float interes = 0;
};

// Estructura para representar una cuenta bancaria
struct Cuenta {
    string nombre = "admin";
    string contraseña = "admin";
    float saldo = 0;
    float dolares = 0;
    vector<Movimiento> movimientos;
    vector<PlazoFijo> plazos_fijos;
};

// Prototipo de la función guardar_datos_en_archivo
void guardar_datos_en_archivo(Cuenta &usuario);

// Función para mostrar el menú principal
void menu_principal(Cuenta usuario) {
    cout << endl;
    cout << "Bienvenido/a al sistema bancario, " << usuario.nombre << endl;
    cout << "Saldo en cuenta: $ " << usuario.saldo << endl;
    cout << "Dólares: USD$ " << usuario.dolares << endl;
    cout << "Plazos fijos armados: " << usuario.plazos_fijos.size() << endl;
    cout << endl;
    cout << "1 - Ingresar efectivo." << endl;
    cout << "2 - Retirar efectivo." << endl;
    cout << "3 - Comprar y/o vender dólares." << endl;
    cout << "4 - Retirar dólares." << endl;
    cout << "5 - Armar plazo fijo." << endl;
    cout << "6 - Cancelar plazo fijo." << endl;
    cout << "7 - Pedir préstamo." << endl;
    cout << "8 - Ver movimientos." << endl;
    cout << "9 - Actualizar datos." << endl;
    cout << "10 - Salir del sistema." << endl;
    cout << endl;
    cout << "Elegir una opcion del menú: " << endl;
}

// Función para registrar al usuario y guardar sus datos en un archivo
void registrate(vector<Cuenta> &usuarios) {
    Cuenta usuario;
    cout << "Ingresa tu nombre: ";
    cin >> usuario.nombre;
    cout << "Ingresa tu contraseña: ";
    cin >> usuario.contraseña;

    // Intentar abrir el archivo del usuario
    ofstream archivo("../" + usuario.nombre + ".txt", ios::out);
    if (!archivo.is_open()) {
        cout << "Error al intentar crear el archivo para el usuario." << endl;
        return;
    }

    // Guardar datos en el archivo
    archivo << "Contraseña: " << usuario.contraseña << endl;
    archivo << "Saldo: " << usuario.saldo << endl;
    archivo << "Dólares: " << usuario.dolares << endl;
    archivo << "Movimientos:" << endl;
    archivo << "Plazos Fijos:" << endl;
    archivo.close();

    // Inicializar valores de la cuenta
    usuario.saldo = 0;
    usuario.dolares = 0;
    usuarios.push_back(usuario);

    guardar_datos_en_archivo(usuario);
}

bool cargar_datos_desde_archivo(Cuenta &usuario) {
    string ruta_archivo = "../" + usuario.nombre + ".txt";
    ifstream archivo(ruta_archivo, ios::in);

    if (!archivo.is_open()) {
        archivo.open(usuario.nombre + ".txt", ios::in);
        if (!archivo.is_open()) {
            cout << "Error: No se pudo encontrar el archivo del usuario." << endl;
            return false;
        }
    }

    string linea;
    bool contraseña_validada = false;
    string contrasena_guardada;

    // Limpiar vectores existentes antes de cargar
    usuario.movimientos.clear();
    usuario.plazos_fijos.clear();

    while (getline(archivo, linea)) {
        if (linea.find("Contraseña: ") != string::npos) {
            contrasena_guardada = linea.substr(12);
            
            contrasena_guardada.erase(0, contrasena_guardada.find_first_not_of(" "));
            contrasena_guardada.erase(contrasena_guardada.find_last_not_of(" ") + 1);

            if (contrasena_guardada == usuario.contraseña) {
                contraseña_validada = true;
            } else {
                cout << "Contraseña incorrecta." << endl;
                archivo.close();
                return false;
            }
        }

        if (linea.find("Saldo: ") != string::npos) {
            try {
                usuario.saldo = stof(linea.substr(7));
            } catch(...) {
                usuario.saldo = 0;
            }
        }

        if (linea.find("Dólares: ") != string::npos) {
            try {
                usuario.dolares = stof(linea.substr(9));
            } catch(...) {
                usuario.dolares = 0;
            }
        }

        if (linea == "Movimientos:") {
            while (getline(archivo, linea) && linea != "Plazos Fijos:") {
                if (!linea.empty()) {
                    Movimiento movimiento;
                    size_t pos = linea.find(": ");
                    if (pos != string::npos) {
                        movimiento.tipo = linea.substr(0, pos);
                        movimiento.actividad = linea.substr(pos + 2);
                        usuario.movimientos.push_back(movimiento);
                    }
                }
            }
        }

        if (linea == "Plazos Fijos:") {
            while (getline(archivo, linea) && !linea.empty()) {
                istringstream ss(linea);
                PlazoFijo plazo;
                if (ss >> plazo.monto >> plazo.dias >> plazo.interes) {
                    usuario.plazos_fijos.push_back(plazo);
                }
            }
        }
    }

    archivo.close();
    return contraseña_validada;
}

void guardar_datos_en_archivo(Cuenta &usuario) {
    string ruta_archivo = "../" + usuario.nombre + ".txt";
    
    ofstream archivo(ruta_archivo, ios::out | ios::trunc);
    
    if (!archivo.is_open()) {
        archivo.open(usuario.nombre + ".txt", ios::out | ios::trunc);
        
        if (!archivo.is_open()) {
            cout << "ERROR CRÍTICO: No se pudo guardar el archivo del usuario." << endl;
            return;
        }
    }

    archivo << "Contraseña: " << usuario.contraseña << endl;
    archivo << "Saldo: " << usuario.saldo << endl;
    archivo << "Dólares: " << usuario.dolares << endl;

    archivo << "Movimientos:" << endl;
    for (const auto &movimiento : usuario.movimientos) {
        archivo << movimiento.tipo << ": " << movimiento.actividad << endl;
    }

    archivo << "Plazos Fijos:" << endl;
    for (const auto &plazo : usuario.plazos_fijos) {
        archivo << plazo.monto << " " << plazo.dias << " " << plazo.interes << endl;
    }

    archivo.close();
    
    ifstream verificacion(ruta_archivo);
    if (!verificacion.is_open()) {
        cout << "ERROR: No se pudo verificar la escritura del archivo." << endl;
    } else {
        cout << "Datos guardados correctamente." << endl;
        verificacion.close();
    }
}
void ingresar_efectivo(Cuenta &usuario, int opcion) {
    int dinero;
    cout << "Ingrese la cantidad de dinero que quiere depositar: " << endl;
    cin >> dinero;
    usuario.saldo += dinero;

    Movimiento movimiento = {"Ingreso", usuario.nombre, "Deposito de efectivo"};
    usuario.movimientos.push_back(movimiento);

    guardar_datos_en_archivo(usuario);
}

// 2 - Retirar efectivo
void retirar_efectivo(Cuenta &usuario, int opcion) {
    int monto;
    cout << "Ingrese el monto en pesos (múltiplo de 100) que desea retirar: ";
    cin >> monto;

    if (monto % 100 != 0) {
        cout << "El monto debe ser un múltiplo de 100. Intente nuevamente." << endl;
        return;
    }

    if (monto > usuario.saldo) {
        cout << "No tiene suficiente saldo. Intente con un monto menor." << endl;
        return;
    }

    int billetes1000 = monto / 1000;
    int resto = monto % 1000;
    int billetes500 = resto / 500;
    resto %= 500;
    int billetes200 = resto / 200;
    resto %= 200;
    int billetes100 = resto / 100;

    cout << "Retiro realizado con los siguientes billetes:" << endl;
    if (billetes1000 > 0) cout << "Billetes de $1000: " << billetes1000 << endl;
    if (billetes500 > 0) cout << "Billetes de $500: " << billetes500 << endl;
    if (billetes200 > 0) cout << "Billetes de $200: " << billetes200 << endl;
    if (billetes100 > 0) cout << "Billetes de $100: " << billetes100 << endl;

    usuario.saldo -= monto;

    Movimiento movimiento = {"Retiro", usuario.nombre, "Retiro de efectivo de $" + to_string(monto)};
    usuario.movimientos.push_back(movimiento);

    guardar_datos_en_archivo(usuario);

    cout << "Saldo actual: $" << usuario.saldo << endl;
}

void manejar_dolares(Cuenta &usuario) {
    int eleccion;
    cout << "1 - Comprar dólares\n2 - Vender dólares\nElija una opción: ";
    cin >> eleccion;

    if (eleccion == 1) {
        float monto_dolares;
        cout << "Ingrese el monto en dólares que desea comprar: ";
        cin >> monto_dolares;

        float costo_pesos = monto_dolares * 1000;
        if (costo_pesos <= usuario.saldo) {
            usuario.saldo -= costo_pesos;
            usuario.dolares += monto_dolares;

            Movimiento movimiento = {"Compra", usuario.nombre, "Compra de USD " + to_string(monto_dolares)};
            usuario.movimientos.push_back(movimiento);

            guardar_datos_en_archivo(usuario);

            cout << "Compra exitosa. Ahora tiene $" << usuario.saldo << " y USD " << usuario.dolares << ".\n";
        } else {
            cout << "Saldo insuficiente. Puede comprar hasta " << usuario.saldo / 1000 << " dólares.\n";
        }
    } else if (eleccion == 2) {
        float monto_dolares;
        cout << "Ingrese el monto en dólares que desea vender: ";
        cin >> monto_dolares;

        if (monto_dolares > usuario.dolares || monto_dolares < 10) {
            cout << "Dólares insuficientes o monto mínimo no alcanzado.\n";
        } else {
            usuario.dolares -= monto_dolares;
            usuario.saldo += monto_dolares * 1000;

            Movimiento movimiento = {"Venta", usuario.nombre, "Venta de USD " + to_string(monto_dolares)};
            usuario.movimientos.push_back(movimiento);

            guardar_datos_en_archivo(usuario);

            cout << "Venta exitosa. Ahora tiene $" << usuario.saldo << " y USD " << usuario.dolares << ".\n";
        }
    } else {
        cout << "Opción inválida. Regresando al menú principal.\n";
    }
}


void retirar_dolares(Cuenta &usuario) {
    int monto;
    cout << "Ingrese el monto en dólares (múltiplo de 10) que desea retirar: ";
    cin >> monto;

    if (monto % 10 != 0) {
        cout << "El monto debe ser un múltiplo de 10. Intente nuevamente.\n";
        return;
    }

    if (monto > usuario.dolares) {
        cout << "No tiene suficientes dólares. Intente con un monto menor.\n";
        return;
    }

    int billetes100 = monto / 100;
    monto %= 100;
    int billetes50 = monto / 50;
    monto %= 50;
    int billetes20 = monto / 20;
    monto %= 20;
    int billetes10 = monto / 10;

    cout << "Retiro realizado con los siguientes billetes:\n";
    if (billetes100 > 0) cout << "Billetes de USD 100: " << billetes100 << endl;
    if (billetes50 > 0) cout << "Billetes de USD 50: " << billetes50 << endl;
    if (billetes20 > 0) cout << "Billetes de USD 20: " << billetes20 << endl;
    if (billetes10 > 0) cout << "Billetes de USD 10: " << billetes10 << endl;

    usuario.dolares -= monto;
    usuario.movimientos.push_back({"Retiro", "Retiro de dólares"});
    guardar_datos_en_archivo(usuario);

    cout << "Retiro exitoso. Su nuevo saldo en dólares es: USD " << usuario.dolares << endl;
}
void armar_plazo_fijo(Cuenta &usuario) {
    float monto;
    int dias;
    cout << "Ingrese el monto que desea invertir en el plazo fijo: ";
    cin >> monto;

    if (monto > usuario.saldo) {
        cout << "Saldo insuficiente. No puede invertir más de $" << usuario.saldo << ".\n";
        return;
    }

    cout << "Ingrese la cantidad de días para el plazo fijo (mínimo 30 días): ";
    cin >> dias;

    if (dias < 30) {
        cout << "El plazo debe ser de al menos 30 días.\n";
        return;
    }

    float interes = (monto * dias * 70) / 36500.0;
    usuario.saldo -= monto;

    PlazoFijo plazo = {monto, dias, interes};
    usuario.plazos_fijos.push_back(plazo);

    Movimiento movimiento = {"Plazo Fijo", usuario.nombre, "Inversión en plazo fijo"};
    usuario.movimientos.push_back(movimiento);

    guardar_datos_en_archivo(usuario);

    cout << "Plazo fijo armado con éxito. Su saldo es ahora de: $ " << usuario.saldo << endl;
}

void cancelar_plazo_fijo(Cuenta &usuario, int opcion) {
    if (usuario.plazos_fijos.empty()) {
        cout << "No tiene plazos fijos para cancelar.\n";
        return;
    }

    cout << "Lista de plazos fijos:\n";
    for (size_t i = 0; i < usuario.plazos_fijos.size(); ++i) {
        cout << i + 1 << ". Monto: $" << usuario.plazos_fijos[i].monto
             << ", Días: " << usuario.plazos_fijos[i].dias
             << ", Interés: $" << usuario.plazos_fijos[i].interes << endl;
    }

    int opcion_cancelar;
    cout << "Seleccione el número del plazo fijo que desea cancelar: ";
    cin >> opcion_cancelar;

    if (opcion_cancelar < 1 || opcion_cancelar > usuario.plazos_fijos.size()) {
        cout << "Opción inválida.\n";
        return;
    }

    float monto_devuelto = usuario.plazos_fijos[opcion_cancelar - 1].monto;
    usuario.saldo += monto_devuelto;

    usuario.plazos_fijos.erase(usuario.plazos_fijos.begin() + (opcion_cancelar - 1));

    Movimiento movimiento = {"Cancelación", usuario.nombre, "Cancelación de plazo fijo"};
    usuario.movimientos.push_back(movimiento);

    guardar_datos_en_archivo(usuario);

    cout << "Plazo fijo cancelado exitosamente. Se han devuelto $" << monto_devuelto << " a su saldo.\n";
}


void pedir_prestamo(Cuenta &usuario, int opcion) {
    cout << "Opciones de préstamo disponibles:\n";
    cout << "1 - Préstamo del 5% (saldo superior a $20,000)\n";
    cout << "2 - Préstamo del 10% (saldo superior a $50,000)\n";
    cout << "3 - Préstamo del 15% (saldo superior a $100,000)\n";
    cout << "Seleccione una opción: ";
    int eleccion;
    cin >> eleccion;

    float monto_prestamo = 0;

    switch (eleccion) {
        case 1:
            if (usuario.saldo > 20000) {
                monto_prestamo = usuario.saldo * 0.05;
            } else {
                cout << "No cumple con el requisito de saldo para este préstamo.\n";
                return;
            }
            break;
        case 2:
            if (usuario.saldo > 50000) {
                monto_prestamo = usuario.saldo * 0.10;
            } else {
                cout << "No cumple con el requisito de saldo para este préstamo.\n";
                return;
            }
            break;
        case 3:
            if (usuario.saldo > 100000) {
                monto_prestamo = usuario.saldo * 0.15;
            } else {
                cout << "No cumple con el requisito de saldo para este préstamo.\n";
                return;
            }
            break;
        default:
            cout << "Opción no válida.\n";
            return;
    }

    usuario.saldo += monto_prestamo;
    Movimiento movimiento = {"Préstamo", usuario.nombre, "Préstamo recibido de $" + to_string(monto_prestamo)};
    usuario.movimientos.push_back(movimiento);
    guardar_datos_en_archivo(usuario);

    cout << "Préstamo otorgado exitosamente. Se han añadido $" << monto_prestamo << " a su saldo.\n";
}

// 8 - Ver movimientos
void ver_movimientos(Cuenta usuario) {
    cout << "Movimientos realizados durante la sesión:\n";
    for (size_t i = 0; i < usuario.movimientos.size(); ++i) {
        cout << i + 1 << ". " << usuario.movimientos[i].tipo << ": " << usuario.movimientos[i].actividad << endl;
    }

    string opcion;
    while (true) {
        cout << "\nIngrese el número de un movimiento para ver detalles, o escriba 'menu' para volver al menú principal: ";
        cin >> opcion;

        if (opcion == "menu") {
            break;
        }

        int numero = stoi(opcion);
        if (numero > 0 && numero <= usuario.movimientos.size()) {
            cout << "Detalles del movimiento:\n";
            cout << "Tipo: " << usuario.movimientos[numero - 1].tipo << endl;
            cout << "Nombre: " << usuario.movimientos[numero - 1].nombre << endl;
            cout << "Actividad: " << usuario.movimientos[numero - 1].actividad << endl;
        } else {
            cout << "Número inválido. Intente nuevamente.\n";
        }
    }
}



void actualizar_datos(Cuenta &usuario, int opcion) {
    cout << "¿Qué dato desea actualizar?\n";
    cout << "1 - Cambiar nombre de usuario\n";
    cout << "2 - Cambiar contraseña\n";
    cout << "Seleccione una opción: ";
    int eleccion;
    cin >> eleccion;

    if (eleccion == 1) {
        string nuevo_nombre;
        cout << "Ingrese su nuevo nombre de usuario: ";
        cin >> nuevo_nombre;
        usuario.nombre = nuevo_nombre;
        guardar_datos_en_archivo(usuario);
        cout << "Nombre de usuario actualizado exitosamente.\n";
    } else if (eleccion == 2) {
        string nueva_contraseña, repetir_contraseña;
        cout << "Ingrese su nueva contraseña: ";
        cin >> nueva_contraseña;
        cout << "Repita su nueva contraseña: ";
        cin >> repetir_contraseña;

        if (nueva_contraseña == repetir_contraseña) {
            usuario.contraseña = nueva_contraseña;
            guardar_datos_en_archivo(usuario);
            cout << "Contraseña actualizada exitosamente.\n";
        } else {
            cout << "Las contraseñas no coinciden. Intente nuevamente.\n";
        }
    } else {
        cout << "Opción inválida.\n";
    }
}

void salir_del_sistema(Cuenta usuario) {
    cout << "Gracias por utilizar nuestro sistema " << usuario.nombre << ". ¡Vuelva pronto!\n";
}


int main() {
    
    
    int opcion = 0;
    Cuenta usuario;

    cout << "Ingresa tu nombre: ";
    cin >> usuario.nombre;
    cout << "Ingresa tu contraseña: ";
    cin >> usuario.contraseña;

    if (!cargar_datos_desde_archivo(usuario)) {
        cout << "No se encontró el usuario, registrando..." << endl;
        registrate(usuarios);
    }

    // Entrar al menú principal
    while (opcion != 10) {
        menu_principal(usuario);
        cin >> opcion;

        switch (opcion) {
    case 1:
        ingresar_efectivo(usuario, opcion);
        break;
    case 2:
        retirar_efectivo(usuario, opcion);
        break;
    case 3:
        manejar_dolares(usuario);
        break;
    case 4:
        retirar_dolares(usuario);
        break;
    case 5:
        armar_plazo_fijo(usuario);
        break;
    case 6:
        cancelar_plazo_fijo(usuario, opcion);
        break;
    case 7:
        pedir_prestamo(usuario, opcion);
        break;
    case 8:
        ver_movimientos(usuario);
        break;
    case 9:
        actualizar_datos(usuario, opcion);
        break;
    case 10:
        salir_del_sistema(usuario);
        break;
    default:
        cout << "Opción no válida. Intente nuevamente.\n";
        break;
}

        }
        return 0;
    }


