import models.Animal;
import models.Cliente;
import models.Expediente;
import java.util.ArrayList;
import java.util.Scanner;
public class Veterinaria {

    public static void main(String[] args) {
        Cliente cliente;
        Scanner teclado = new Scanner(System.in);
        String nombreCliente;
        int telefono;
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList< Animal> listaAnimales = new ArrayList<>();

        int opcion;
        do{
            do{
                System.out.println("Bienvenidos");
                System.out.println("1.Registrarse");
                System.out.println("3.Generar expediente de animal");
                opcion = teclado.nextInt();
            }while(opcion < 1 || opcion >3);
            switch (opcion) {
                case 1:

                        System.out.println("Cual es el nombre del cliente? ");
                        nombreCliente=teclado.next();
                        System.out.println("Id del animal: ");
                        telefono=teclado.nextInt();
                        cliente= new Cliente(nombreCliente,telefono);
                        cliente.menuCliente();

                   /* for (int i =0; i<listaClientes.length; i++){
                        System.out.println("Mascota: " + listaClientes[i].getNombre());
                        System.out.println("Telefono: " + listaClientes[i].getTelefono());
                    }*/

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Esa opcion no esta disponible");
                    break;
            }
        }while(opcion !=3);

    }
   // }
}
