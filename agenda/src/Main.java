/**
 * @author: Shang y Ángel
 *
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	
        Agenda agenda = new Agenda();
    
        Menu menu = new Menu(agenda);
        //llamo a opciones de menu
        menu.opcionMenu();
    }


}
