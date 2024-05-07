import java.util.Scanner;
import java.lang.System;

import static java.sql.DriverManager.println;

public class Menu {
	
	private int opcion;
	
	public Menu() {
		
		this.opcion = -1;
	
	}
	
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
	
	public int elegirOpcion() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una opción XD:");
		this.opcion = sc.nextInt();
		return this.opcion;
		
	}

    public void opcionMenu() {
    	
    	 Scanner sc = new Scanner(System.in);
    	 mostrarMenu();
    
    	 int numeroEntero = elegirOpcion();
    	   switch (numeroEntero) {
           case 0:
        	   
               break;
               
      
           case 1:
        	   
        	   break;
        	   
           case 2:
        	   
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
               
           default:
               System.out.println("Opción no válida. Selecciona otra.");

    	   }
    	 
        }
        
    }


