import java.util.Scanner;


public class Agenda {
    private static Lista listaContactos; // Suponiendo que tienes una lista de contactos en tu clase Agenda

    // Constructor, métodos y atributos adicionales

    public static void NuevoContacto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del nuevo contacto:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese los apellidos:");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese el teléfono:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico:");
        String email = scanner.nextLine();

        System.out.println("Ingrese el direcion postal:");
        int direcPos = scanner.nextInt();

        // Puedes pedir más información aquí, como dirección postal, etc.

        // Crear un nuevo contacto con los datos ingresados
        Contacto nuevoContacto = new Contacto(nombre, apellidos, telefono, email,direcPos);

        // Agregar el nuevo contacto a la lista de contactos
        listaContactos.agregar(nuevoContacto);

        System.out.println("¡Contacto agregado correctamente!");
    }
    }
