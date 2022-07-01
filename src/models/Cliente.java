package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int telefono;
    double total=0;

    ArrayList< Animal> listaAnimales = new ArrayList<>();
    ArrayList< Expediente> listaExpediente = new ArrayList<>();
    ArrayList< Producto> listaProductos = new ArrayList<>();
    Animal animal;

  public  void crearObjetosProducto(){
      listaProductos.add(new Medicamento("Analgesico","Amantadina",150.0, "Si"));
      listaProductos.add(new Medicamento("Antibiotico","Cefovecin",300.0, "No"));
      listaProductos.add(new Medicamento("Antinflamatorio","Dexametasona ",90.0, "Si"));
      listaProductos.add(new Suplementos("Proteina","Nupec ",100.0, "C"));
      listaProductos.add(new Suplementos("Probiotico","Kanino",70.0, "B"));
      listaProductos.add(new Suplementos("Omega3","Pedigree",50.0, "B"));

  }



    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    Scanner teclado = new Scanner(System.in);

    public void menuCliente(){
        int opcion;
        do{

                System.out.println("Que tipo de animal es");
                System.out.println("1.Terrestre");
                System.out.println("2.Acuatico");
                System.out.println("3.Generar expediente");
                System.out.println("4.Buscar por nombre");
                System.out.println("5.Imprimir expediente");
                System.out.println("6.Comprar");
                System.out.println("7.Ver las ventas totales");
                opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    registrarMascotasT();
                    break;
                case 2:
                    registrarMascotasA();
                    break;
                case 3: generarExpediente();
                    System.out.println("Generado con exito");
                    break;
                case 4: buscarAnimalpornombre();

                    break;
                case 5: imprimirExpediente();
                    break;
                case 6:
                    crearObjetosProducto();
                    hacerCompras();
                    break;
                case 7: ventas();
                    break;
                default:
                    System.out.println("Esa opcion no esta disponible");
                    break;
            }
        }while(opcion<8);
    }
        public void registrarMascotasT() {
            String nombreAT, tipoT;
            int edadT;
            int cantidad=0;
            if (cantidad == 0) {
                do {
                    System.out.println("Ingrese la cantidad de mascotas a registrar");
                    cantidad = teclado.nextInt();
                } while (cantidad <= 0 || cantidad > 5);

            for (int i = 0; i <cantidad; i++) {
                System.out.println("Cual es el nombre del animal? ");
                nombreAT=teclado.next();
                System.out.println("Edad: ");
                edadT=teclado.nextInt();
                System.out.println("Tipo: ");
                tipoT=teclado.next();
                listaAnimales.add(new Terrestre(nombreAT,edadT,tipoT));
            }
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
                listaAnimales.add(new Acuatico(nombre, edad, tipo));
            }
        }
    }
    public void generarExpediente(){
        String nombreAnimalExpediente , motivo ;
        int vacunas , peso;
        System.out.println("Escriba el nombre del animal del cual va a crear el expediente");
        nombreAnimalExpediente=teclado.next();
        for (Animal animal : listaAnimales ){
            if (animal.getNombre().equals(nombreAnimalExpediente)){
                System.out.println("\n");
                System.out.println("Escriba el motivo de la visita");
                motivo=teclado.next();
                System.out.println("Escriba la cantidad de vacunas que tiene el animal: ");
                vacunas=teclado.nextInt();
                System.out.println("Escriba peso del animal: ");
                System.out.println("\n");
                peso=teclado.nextInt();
                listaExpediente.add(new Expediente(animal.getNombre(),animal.getEdad(),animal.getTipo(),vacunas,peso,motivo));

            }
        }
    }
    public void imprimirExpediente(){
        String nombreBuscar;
        System.out.println("Escriba el nombre del animal para ver su expediente");
        nombreBuscar=teclado.next();
        IMPRIMIR: for (Expediente expediente : listaExpediente){
            if (expediente.getNombre().equals(nombreBuscar)){
                System.out.println("");
                System.out.println("Expediente medico");
                System.out.println("Nombre: "+ expediente.getNombre());
                System.out.println("Motivo de la visita: "+ expediente.getMotivo());
                System.out.println("Peso: "+ expediente.getPeso());
                System.out.println("Numero de vacunas que tiene: "+ expediente.getVacunas());
                System.out.println("Edad: "+ expediente.getEdad());
                System.out.println("");
            }
        }
    }

    public void buscarAnimalpornombre(){
        String nombreBUSCAR;
        System.out.println("Escriba el nombre del animal que va a buscar: ");
        nombreBUSCAR=teclado.next();
        BUSCARNOMBRE: for (Animal animal : listaAnimales ){
            if (animal.getNombre().equals(nombreBUSCAR)){
                System.out.println("\n");
                System.out.println("Nombre: " + animal.getNombre());
                System.out.println("Edad: " + animal.getEdad());
                System.out.println("Tipo: " + animal.getTipo());
                System.out.println("\n");
            }
        }
    }

   public void hacerCompras() {

    boolean bandera=false;
    String productoEleccion;
     do {
          System.out.println("Lista de productos:");
          IMPRESION: for (Producto producto : listaProductos){
              System.out.println("Nombre: " + producto.getTipo());
              System.out.println("Precio: "+ producto.getPrecio());
              System.out.println("");
          }
          System.out.println("Ecriba el producto deseado");
          productoEleccion=teclado.next();
          BUSCAR: for (Producto producto : listaProductos){
              if (producto.getTipo().equals(productoEleccion)){
                  total+=producto.getPrecio();

                  System.out.println("");
                  bandera=true;
                  System.out.println("Su compra es: "+ producto.getTipo());
                  System.out.println("");
                  break BUSCAR;
              }
          }
      }while (!bandera);
   }
   public void ventas(){
       System.out.println("El total vendido es: "+ total);
       System.out.println("");
   }
}

