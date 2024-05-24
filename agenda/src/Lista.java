import java.util.ArrayList;
import java.util.List;

/**
 * Clase Lista gestiona una colección de objetos Contacto.
 * Proporciona funcionalidades para agregar, eliminar, buscar y mostrar contactos.
 */

public class Lista {
	
    private List<Contacto> contactos;
    
    /**
     * Constructor de la clase Lista.
     * Inicializamos la lista de contactos como un ArrayList vacío.
     */
   
    public Lista() {
    	
        this.contactos = new ArrayList<>();
    }
    
    /**
     * Agrega un objeto Contacto a la lista de contactos.
     * @param contacto El objeto Contacto a agregar.
     */
    public void agregar(Contacto contacto){
    	
    	contactos.add(contacto);
    	
    }
    
    /**
     * Devuelve la lista completa de contactos.
     * @return La lista de contactos.
     */
    public List<Contacto> getContactos(){
    	
        return contactos;
    }
    
    /**
     * Obtiene el número total de contactos en la lista.
     * @return El número total de contactos.
     */
    
    public int obtenerNumeroContacto(){
        
    	return contactos.size();
    }
    
    /**
     * Muestra todos los contactos en la lista.
     * Imprime un mensaje si la lista está vacia.
     */
    
    public void mostrarContactos(){
        if (contactos.isEmpty()) {
           
        	System.out.println("No hay ningún contacto en la lista.");
        } 
        else {
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}