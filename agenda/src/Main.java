import java.time.LocalDate;

/**
 * Main es la clase principal donde se crearan un objeto Agenda y
 * un objeto Menu.
 * 
 * @author: Shang y Ángel
 * @version:20/05/2024
 */

public class Main {
    public static void main(String[] args) {
    	
    	/**
    	 * Creamos la agenda
    	 */
    	
        Agenda agenda = new Agenda();
    
        
        /**
         * Cremos el menu y le pasamos la agenda creada anteriormente.
         * 
         * @param Llama al metodo opcionesMenu de la clase menu, nos
         * dara las opciones que podra elegir el usuario.
         */
        
        Menu menu = new Menu(agenda);
      
          menu.opcionMenu();
    }


}
