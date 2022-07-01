import models.Animal;
import models.Cliente;
import models.Expediente;
import java.util.ArrayList;
import java.util.Scanner;
public class Veterinaria {

    public static void main(String[] args) {
        ArrayList< Cliente> listaCliente = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
   Cliente cliente=new Cliente("",0);
        String nombre;
        int telefono;
        System.out.println("Escriba su nombre: ");
        nombre=teclado.next();
        System.out.println("Escriba su telefono: ");
        telefono = teclado.nextInt();
        listaCliente.add(new Cliente(nombre,telefono));
        cliente.menuCliente(listaCliente);


    }
}
