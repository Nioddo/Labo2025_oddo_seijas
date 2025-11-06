int mesetaMasLarga (vector &v) {

int i = 0; 

int maxMeseta =0;

int meseta ;

while ( i < v.size () ) {
    int j = i + 1;
    while ( j < v.size () && v [ i ] == v [ j ]) {
        j ++;
    }

    meseta = j - i ;
    i = j ;

    if ( meseta > maxMeseta ) {
        maxMeseta = meseta ;
    }
}
return maxMeseta ;
}

//a) ¿Qué hace este programa?
//BUSCA LA SECUENCIA DE NUMEROS DESNTRO DE UN VECTR MAS LARGA

/*b) Calcular el tiempo de ejecución de peor caso de este programa en función
del tamaño del vector.*/
//

/*c) ¿Es posible escribir otro programa que resuelva el problema utilizando solo un
ciclo?*/