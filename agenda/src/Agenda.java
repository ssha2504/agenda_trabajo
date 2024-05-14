import java.util.Scanner;


public class Agenda {
    private static Lista listaContactos;

    //pide los datos de nuevo contacto
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

        //crear un nuevo contacto con los datos ingresados
        Contacto nuevoContacto = new Contacto(nombre, apellidos, telefono, email,direcPos);

        //agregar el nuevo contacto a la lista de contactos
        Lista.agregar(nuevoContacto);
        

        System.out.println("¡Contacto agregado correctamente!");
    }

    public static void ModificarContacto(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1.Nombre: " +
                "           2.Apellido: " +
                "           3.telefono: " +
                "           4.email: " +
                "           5.direcion postal: ");
        
        System.out.println("Introduce el casa que quiere modificar: en numero");
        int cambio = scanner.nextInt();
        
        switch (cambio){
            case 1:
                System.out.println("Ingrese el nombre del nuevo contacto:");
                String nombre = scanner.nextLine();

                break;
            case 2:
                System.out.println("Ingrese los apellidos:");
                String apellidos = scanner.nextLine();

            case 3:
                System.out.println("Ingrese el telefono:");
                String telefono = scanner.nextLine();

            case 4:
                System.out.println("Ingrese el correo electronico:");
                String email = scanner.nextLine();

            case 5:
                System.out.println("Ingrese el direcion postal:");
                int direcPos = scanner.nextInt();
        }

    }
    }
