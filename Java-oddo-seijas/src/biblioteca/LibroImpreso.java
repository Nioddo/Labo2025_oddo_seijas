package biblioteca;

import java.time.LocalDate;

public class LibroImpreso extends libro{
    private int numero_paginas;


    public LibroImpreso(int isbn, LocalDate fecha_publicacion, String titulo, int codigo_verificacion, String idioma, LocalDate fecha_adquicision, int numero_paginas, int cantidad_de_idiomas) {
        super(isbn, fecha_publicacion, titulo, codigo_verificacion, idioma, fecha_adquicision);
        this.numero_paginas = numero_paginas;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
}
