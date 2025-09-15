void f1 (vector &vec) {
    i = vec.size() / 2; // O(2)
    while ( i >= 0 ){
        vec[ vec.size() / 2 - i ] = i; // O(3)
        vec[ vec.size() / 2 + i ] = i; // O(3)
        i--; // O(1)
    }
    // Total ≈ O(n) -> O(n)
}

void f2 (vector &vec) {
    i = 0; // O(1)
    while ( i < 10000){
        vec[ vec.size()/2 - i ] = i; // O(3)
        vec[ vec.size()/2 + i ] = i; // O(3)
        i++; // O(1)
    }
    // Total = 10000*7 -> O(1)
}

int f3 (vector &v1, int e) {
    int i = 0; // O(1)
    while ( v1[i] != e ){ // O(n)
        i++; // O(1)
    }
    return i; // O(1)
    // Total ≈ O(n) -> O(n)
}

void f4 (vector &vec) {
    int rec = 0; // O(1)
    int max_iter = 1000; // O(1)
    if (max_iter > vec.size()) {
        max_iter = vec.size(); // O(1)
    }
    for (int i = 0; i < max_iter; i++) {        // O(max_iter)
        for (int j = 0; j < max_iter; j++) {    // O(max_iter)
            res += vec[i] * vec[j]; // O(3)
        }
    }
    // Total ≈ O(max_iter^2) -> O(1) (constante, máx 1000)
}

void f5 (vector &v1 , vector &v2) {
    vector res(); 
    for (int i = 0; i < v1.size(); i++){ // O(n1)
        res.push_back(v1[i]); // O(1)
    }
    for (int i = 0; i < v2.size(); i++){ // O(n2)
        res.push_back(v2[i]); // O(1)
    }
    return res;
    // Total = O(n1+n2) -> O(n)
}
