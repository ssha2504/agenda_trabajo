import java.util.Scanner;
import java.lang.System;

public class Menu {

    public int menus() {
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
        int opcion = scanner.nextInt();
        scanner.nextLine(); //limpiar el buffer del Scanner
        return opcion;


    }
}


