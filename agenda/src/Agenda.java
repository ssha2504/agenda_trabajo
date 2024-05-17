import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;
public class Agenda {
    private Lista lista;
    private List<Contacto> contactos;
    private Cifrado cifrado;

    public Agenda() {
        this.lista = new Lista();
        this.cifrado = new Cifrado(""); // Inicialización con clave vacía por defecto
    }

    public void anaContacto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse("2002-01-01", formatter);
        Contacto contactos = new Contacto("shan", "a", "1211423", "email", 12135, fechaNacimiento);
    }

    public void nuevoContacto() {

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
            scanner.nextLine();//limpiar el bafer
            LocalDate fechanc= LocalDate.parse(scanner.nextLine());

            Contacto contactos = new Contacto(nombre, apellidos, telefono, email, direcPos, fechanc);
            lista.agregar(contactos);
            System.out.println("¡Contacto agregado correctamente!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public void modificarContacto() {
        Scanner scanner = new Scanner(System.in);
        Contacto contacto = this.buscarContacto();
        if (contacto == null) {
            System.out.println("Contacto no encontrado.");
            return;
        }
        System.out.println("Seleccione el campo a modificar:");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Teléfono");
        System.out.println("4. Correo electrónico");
        System.out.println("5. Dirección postal");
        System.out.println("6. Fecha de nacimiento");
        System.out.println("Introduce el número del campo que quiere modificar:");
        int cambio = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea restante

        switch (cambio) {
            case 1:
                System.out.println("Ingrese el nuevo nombre:");
                String nombre = scanner.nextLine();
                contacto.setNombre(nombre);
                break;
            case 2:
                System.out.println("Ingrese los nuevos apellidos:");
                String apellidos = scanner.nextLine();
                contacto.setApellido(apellidos);
                break;
            case 3:
                System.out.println("Ingrese el nuevo teléfono:");
                String telefono = scanner.nextLine();
                contacto.setTelefono(telefono);
                break;
            case 4:
                System.out.println("Ingrese el nuevo correo electrónico:");
                String email = scanner.nextLine();
                contacto.setEmail(email);
                break;
            case 5:
                System.out.println("Ingrese la nueva dirección postal:");
                int direccionPostal = scanner.nextInt();
                contacto.setdirecPos(direccionPostal);
                break;
            case 6:
                System.out.println("Ingrese la nueva fecha de nacimiento (yyyy-MM-dd):");
                LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
                contacto.setfNacimiento(fechaNacimiento);
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
        return lista.obtenerNumeroContacto();
    }

    public void mostrarContactos() {
        lista.mostrarContactos();
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

    public Contacto buscarContacto() {
        String telefono = this.pedirTelefono();
        for (Contacto contacto : lista.getContactos()) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }
        return null;
    }

    public String pedirTelefono() {
        System.out.println("Introduce el teléfono del contacto:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
