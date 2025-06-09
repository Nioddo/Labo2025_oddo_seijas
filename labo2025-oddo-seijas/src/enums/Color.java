package enums;

public enum Color {
    ROJO("#FF0000"),VERDE("#00FF00"),AZUL("#0000FF"),PURPURA("#8A2BE2"),AMARILLO("#FFFF00");

    private String codigo;

    Color(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
