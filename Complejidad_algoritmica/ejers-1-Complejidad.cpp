/*1-Contar la cantidad de operaciones elementales que realizan los siguientes
programas.*/

int ultimo1 (vector v) {
    return v[ v.size() - 1 ]; // O(4) -> O(1)
}

int ultimo2 (vector v) {
    int i = v.size(); // O(2)
    return v[ i - 1 ];  // O(3)
    // Total = 5 -> O(1)
}

int ultimo3 (vector v) {
    int i = 0; // O(1)
    while ( i < v.size() ) { // O(2n)
        i ++; // O(n)
    }
    return v[ i - 1 ]; // O(3)
    // Total = 3n + 6 -> O(n)
}
