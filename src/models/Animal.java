package models;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

    Scanner teclado = new Scanner(System.in);
     ArrayList< Expediente> listaExpediente = new ArrayList<>();
     Cliente cliente;

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
