package models;

public class Producto {
    protected String tipo , nombreP;
    protected Double precio;

    public Producto(String tipo, String nombreP, Double precio) {
        this.tipo = tipo;
        this.nombreP = nombreP;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPrecio() {
        return precio;
    }


}
