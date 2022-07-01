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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
