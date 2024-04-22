import java.util.Scanner;
import java.lang.System;

import static java.sql.DriverManager.println;

public class Menu {

    public void menus() {
        Scanner scanner = new Scanner(System.in);
        /* -------- */
        /* AGENDA ++ */
        /* -------- */

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
                --
                Opcion : \s""");
        int numeroEntero = scanner.nextInt();

        if (numeroEntero != 8){
            switch (numeroEntero){
                case 0:
                    Contacto contacto = new Contacto("shangfeng","shan",12345679,"avida.juan",29210,"12358435@gmail.com");

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
                    println("Saliendo ... " +
                            "bye");
                    break;


            }
        }
    }

}
