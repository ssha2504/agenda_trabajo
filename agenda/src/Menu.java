import java.util.Scanner;
import java.lang.System;

import static java.sql.DriverManager.println;

public class Menu {
	
	private int opcion;
	
	public Menu(int opcion) {
		opcion =-1;
	
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
		//try..catch tratamiento de excepciones o un bucle hasta que introduzca opcion correcta
		//u otro metodo que sea comprobar opcion
		this.opcion = sc.nextInt();
		
		
		
	}

    public void menus() {
    	
        int numeroEntero = scanner.nextInt();

        if (numeroEntero != 8){
            switch (numeroEntero){
                case 0:
                	
                    break;
                case 1:
                	
                	  Contacto contacto = new Contacto("shangfeng","shan",null, 12345679,"avida.juan",29210,"12358435@gmail.com");

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
                    println("Saliendo ... " +
                            "bye");
                    break;


            }
        }
    }

}
