import java.util.Scanner;
import java.lang.System;

public class Menu {

    //datos
    private int opcion;
    Lista lista = new Lista();
    //el menu inicialmente va en -1 donde no da nada de error
    public Menu() {
        this.opcion = -1;

    }

    //los textos de obciones de menu
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

    //pide el obciones
    public int elegirOpcion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una opción XD:");
        this.opcion = sc.nextInt();
        return this.opcion;

    }

    //segun realiza funciones segun los opciones introducido
    public void opcionMenu() {
        while (this.opcion != 8) {
            Scanner sc = new Scanner(System.in);
            mostrarMenu();

            int numeroEntero = elegirOpcion();
            switch (numeroEntero) {
                case 0:

                    break;

                case 1:
                    Lista.agregar(null);
                    break;

                case 2:

                	
                	  System.out.println("Introduce el nombre del contacto que busca: ");
                      String nombreBuscado = sc.nextLine();
                      
                      Contacto contactoBuscado = Lista.buscarContacto(nombreBuscado);
                      if (contactoBuscado!= null) {
                    	  
                          System.out.println("Contacto encontrado: " + contactoBuscado.getNombre());
                          
                      } 
                      else {
                    	  
                          System.out.println("No se encontró el contacto.");
                      }


                    break;


                case 3:

                    break;

                case 4:

                    break;


                case 5:

                    break;


                case 6:

                    break;


                case 7:

                    break;


                case 8:
                    System.out.println("Saliendo... bye");
                    break;

                case 9:
                        Lista.mostrarContactos();
                    break;
                default:
                    System.out.println("Opción no válida. Selecciona otra.");


            }
        }
    }
}


