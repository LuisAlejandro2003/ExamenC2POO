package models;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String tipo;

    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }
}
