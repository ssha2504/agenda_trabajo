import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Agenda {
    private Lista lista;
    private List<Contacto> contactos;
    private Cifrado cifrado;

    public Agenda() {
        this.lista = new Lista();
        this.cifrado = new Cifrado(""); // Inicialización con clave vacía por defecto
    }
    public void NuevoContacto() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre del nuevo contacto:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese los apellidos:");
            String apellidos = scanner.nextLine();
            System.out.println("Ingrese el teléfono:");
            String telefono = scanner.nextLine();
            System.out.println("Ingrese el correo electrónico:");
            String email = scanner.nextLine();
            System.out.println("Ingrese la dirección postal:");
            int direcPos = scanner.nextInt();
            System.out.println("Ingrese la fecha de nacimiento (yyyy-MM-dd):");
            LocalDate fechanc= LocalDate.parse(scanner.nextLine());

            Contacto nuevoContacto = new Contacto(nombre, apellidos, telefono, email, direcPos, fechanc);
            lista.agregar(nuevoContacto);
            System.out.println("¡Contacto agregado correctamente!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void ModificarContacto(){
        Scanner scanner = new Scanner(System.in);
        Contacto contacto = buscarContacto();
        System.out.println("1.Nombre: " +
                "           2.Apellido: " +
                "           3.telefono: " +
                "           4.email: " +
                "           5.direcion postal: " +
                "           6.Fecha de nacimiento: ");
        System.out.println("Introduce el casa que quiere modificar: en numero");
        int cambio = scanner.nextInt();
        switch (cambio){
            case 1:
                System.out.println("Ingrese el nombre del nuevo contacto:");
                String nombre = scanner.nextLine();
                contacto.setNombre(nombre);
                break;
            case 2:
                System.out.println("Ingrese los apellidos:");
                String apellidos = scanner.nextLine();
                contacto.setApellido(apellidos);
                break;
            case 3:
                System.out.println("Ingrese el telefono:");
                String telefono = scanner.nextLine();
                contacto.setTelefono(telefono);
                break;
            case 4:
                System.out.println("Ingrese el correo electronico:");
                String email = scanner.nextLine();
                contacto.setEmail(email);
                break;
            case 5:
                System.out.println("Ingrese el direcion postal:");
                int direcPos = scanner.nextInt();
                contacto.setdirecPos(direcPos);
                break;
            case 6:
                System.out.println("Ingrese la fecha de nacimiento (yyyy-MM-dd):");
                LocalDate fechanc= LocalDate.parse(scanner.nextLine());
                contacto.setfNacimiento(fechanc);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        System.out.println("Contacto modificado correctamente.");
    }

    public void consultarContacto() {
        Contacto contacto = buscarContacto();
        if (contacto != null) {
            System.out.println("Contacto encontrado: " + contacto);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void eliminarContacto() {
        boolean eliminado = false;
        pedirTelefono();
        for (Contacto contacto : contactos){
            if (contacto.getTelefono().equals(pedirTelefono())){
                contactos.remove(contacto);
                System.out.println("contacto eliminado correctamente.");
                eliminado = true;
                break;
            }
        }
        if (!eliminado){
            System.out.println("Contacto no encontrado.");
        }
    }

    public int obtenerNumeroContacto() {
        int cont = 0;
        for (Contacto contacto : contactos){
            cont ++;
        }
        return cont;
    }

    public void mostrarContactos(){
        for (Contacto contacto : contactos){
            if (contacto != null){
                System.out.println(contacto);
            }else {
                System.out.println("No hay ningun contacto en la lista.");
            }
        }
    }

    public void guardarEnFichero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del fichero destino (sin extensión):");
        String nombreFichero = scanner.nextLine() + ".txt";

        try (FileWriter writer = new FileWriter(nombreFichero)) {
            for (Contacto contacto : contactos) {
                writer.write(contacto.toString() + "\n");
            }
            System.out.println("Listado generado en el fichero " + nombreFichero);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    public Contacto buscarContacto(){
        String telefono = pedirTelefono();
        for (Contacto contacto : contactos){
            if (contacto.getTelefono().equals(telefono)){
                return contacto;
            }
        }
        return null;
    }

    public String pedirTelefono(){
        System.out.println("Introduce el telefono del contacto:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
