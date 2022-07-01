import models.Animal;
import models.Cliente;

import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
        Cliente cliente;
        Scanner teclado = new Scanner(System.in);
        String nombreCliente; int telefono;
        Cliente listaClientes[];
        Veterinaria listaauxiliar[];

        int opcion;
        do{
            do{
                System.out.println("Bienvenidos");
                System.out.println("1.Registrar cliente");
                System.out.println("2.Ver mascotas");
                opcion = teclado.nextInt();
            }while(opcion < 1 || opcion >3);
            switch (opcion) {
                case 1:
                    int cantidad=1;
                    listaClientes = new Cliente[cantidad];

                    for (int i = 0; i <cantidad; i++) {
                        System.out.println("Cual es el nombre del cliente? ");
                        nombreCliente=teclado.next();
                        System.out.println("Id del animal: ");
                        telefono=teclado.nextInt();
                         cliente= new Cliente(nombreCliente,telefono);
                        listaClientes[i]=cliente;
                        cliente.menuCliente();
                    }

                   /* for (int i =0; i<listaClientes.length; i++){
                        System.out.println("Mascota: " + listaClientes[i].getNombre());
                        System.out.println("Telefono: " + listaClientes[i].getTelefono());
                    }*/


                    break;
                case 2:

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
   // }
}
