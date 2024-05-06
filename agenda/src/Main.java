import java.util.Scanner;

/**
 * Autores del Proyecto: Shang y Ángel
 */

public class Main {
    public static void main(String[] args) {
        //datos
        int obcion = 9;
        Menu menu = new Menu();

        while(obcion!=8){
            obcion=menu.menus();
            System.out.println("Introduce los datos : ");
            pedirdatos();

        }
    }

    private static void pedirdatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el Apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Introduce el Telefono: ");
        String telefono = sc.nextLine();
        System.out.println("Introduce el Correo: ");
        String correo = sc.nextLine();
        System.out.println("Introduce el Direccion postal: ");
        int direccionpos = sc.nextInt();
    }
}
