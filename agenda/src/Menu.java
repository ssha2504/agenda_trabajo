import java.util.Scanner;
import java.lang.System;
import java.time.LocalDate;


/**
 * Clase Menu gestiona la interacción del usuario con la aplicación.
 * Permite seleccionar entre diferentes opciones de menú relacionados con la gestión de contactos.
 */

public class Menu {
    private Agenda agenda;
    private int opcion;
   
    
    /**
     * Constructor de la clase Menu
     * Inicializamos la referencia a la instancia de agenda y establece la opcion inicial a -1.
     * @param agenda La instancia de Agenda a utilizar.
     */
   
    public Menu(Agenda agenda ) {
        this.agenda = agenda;
        this.opcion = -1;
    }

    
    /**
     * Muestra las opciones disponibles del menú.
     */
    
    public void mostrarMenu() {
        System.out.println("""
                = OPCIONES =
                0. Configuración cifrado
                1. Nuevo contacto
                2. Editar datos de contacto
                3. Consultar contacto
                4. Eliminar contacto
                5. Obtener número de contactos
                6. Generar listar en pantalla
                7. Generar listado en fichero
                8. Salir
                """);
    }

   
    /**
     * Solicita al usuario que selecciona una opción del menú.
     * @return La opción seleccionada por el usuario.
     */
    
    public int elegirOpcion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una opción :");
        this.opcion = sc.nextInt();
        return this.opcion;

    }

    /**
     * Ejecuta la acción correspondiente según la opción seleccionada por el usuario.
     */
    public void opcionMenu() {
        do  {
            CrearContactos();
            mostrarMenu();
            int opcion = elegirOpcion();
            switch (opcion) {
                case 0:

                    break;

                case 1:
                    agenda.nuevoContacto();
                    break;

                case 2:
                    agenda.modificarContacto();
                    break;

                case 3:
                    agenda.consultarContacto();
                    break;

                case 4:
                    agenda.eliminarContacto();
                    break;

                case 5:
                    int cont = agenda.obtenerNumeroContacto();
                    System.out.println("tiene " + cont + " contactos");
                    break;

                case 6:
                    agenda.mostrarContactos();
                    break;

                case 7:
                    agenda.guardarEnFichero();
                    break;
                case 8:
                    System.out.println("Saliendo... bye");
                    break;
                default:
                    System.out.println("Opción no válida. Selecciona otra.");
            }
            
        }while (opcion != 8);
    }
    
    /**
     * Metodo Crea un nuevo Contacto 
     * por el usuario.
     */
    
    public void CrearContactos() {

    }
}




