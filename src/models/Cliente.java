package models;

import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int telefono;
    public Animal listaAnimales[];
    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    Scanner teclado = new Scanner(System.in);

    public void menuCliente(){
        int opcion;
        do{
            do{
                System.out.println("Que tipo de animal es");
                System.out.println("1.Terrestre");
                System.out.println("2.Actuatico");
                opcion = teclado.nextInt();
            }while(opcion < 1 || opcion >3);
            switch (opcion) {
                case 1:
                    registrarMascotasT();
                    break;
                case 2:
                    registrarMascotasA();
                    break;
                case 3:
                    System.out.println("Que le vaya bien...");
                    break;
                default:
                    System.out.println("Esa opcion no esta disponible");
                    break;
            }
        }while(opcion !=3);

    }
        public void registrarMascotasT() {
            String nombreAT, tipoT; int edadT; int cantidad=0;
            if (cantidad == 0) {
                do {
                    System.out.println("Ingrese la cantidad de mascotas a registrar");
                    cantidad = teclado.nextInt();
                } while (cantidad <= 0 || cantidad > 5);
            listaAnimales = new Terrestre[cantidad];
            for (int i = 0; i <cantidad; i++) {
                System.out.println("Cual es el nombre del animal? ");
                nombreAT=teclado.next();
                System.out.println("Edad: ");
                edadT=teclado.nextInt();
                System.out.println("Tipo: ");
                tipoT=teclado.next();
                Terrestre terrestre= new Terrestre(nombreAT,edadT,tipoT);
                listaAnimales[i]=terrestre;

            }
             /*   for (int i =0; i<listaAnimales.length; i++) {
                    System.out.println("Mascota: " + listaAnimales[i].getNombre());
                    System.out.println("Eada: " + listaAnimales[i].getEdad());
                    System.out.println("Tipo: " + listaAnimales[i].getTipo());
                }*/
            }
    }

    public void registrarMascotasA(){
        String nombre, tipo; int edad, cantidad=0;
        if (cantidad == 0) {
            do {
                System.out.println("Ingrese la cantidad de mascotas a registrar");
                cantidad = teclado.nextInt();
            } while (cantidad <= 0 || cantidad > 5);

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Cual es el nombre del animal? ");
                nombre = teclado.next();
                System.out.println("Id del animal: ");
                edad = teclado.nextInt();
                System.out.println("Tipo: ");
                tipo = teclado.next();
                Acuatico acuatico = new Acuatico(nombre, edad, tipo);
                listaAnimales[i] = acuatico;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}
