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
     * Elimina un objeto Contacto de la lista de contactos.
     * @param contacto El objeto Contacto que elimina
     */
    public void eliminar(Contacto contacto){
    	
        contactos.remove(contacto);
        
    }
    
    /**
     * Devuelve la lista completa de contactos.
     * @return La lista de contactos.
     */
    public List<Contacto> getContactos(){
    	
        return contactos;
    }
    
    
    /**
     * Busca un contacto en la lista
     * 
     * @param criterio El criterio de búsqueda.
     * @return El primer contacto que coinicida con el criterio o null si no encuentra ninguno.
     */
    
    public Contacto buscar(String criterio) {
    	for (Contacto contacto : contactos) {
            
        	if (contacto.getNombre().equalsIgnoreCase(criterio)   ||
                contacto.getApellido().equalsIgnoreCase(criterio) ||
                contacto.getTelefono().equalsIgnoreCase(criterio) ||
                contacto.getEmail().equalsIgnoreCase(criterio)) {
            	
            	return contacto;
            }
        
    	}
    	
        return null;
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