import java.time.LocalDate;


/**
 * Clase Persona que representa a una entidad humana con atributos básicos.
 * Incluye nombre, apellido y fecha de nacimiento.
 */

public class Persona {
    //datos
    private String nombre;
    private String apellido;
    private LocalDate fNacimiento;

    /**
     * Constructor de la clase Persona.
     * Inicializa los atributos de nombre, apellido y fecha de nacimiento.
     * @param nombre El nombre completo de la persona.
     * @param apellidos El apellido de la persona.
     * @param fNacimiento La fecha de nacimiento de la persona.
     */
    public Persona(String nombre, String apellidos, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.fNacimiento = fNacimiento;
    }

    
    /**
     * Getter para el nombre de la persona.
     * @return El nombre completo de la persona.
     */
    
    public String getNombre(){ 
    	
    	return nombre; 
    	
    }
   
    /**
     * Setter para el nombre de la persona.
     * @param nombre El nuevo nombre completo de la persona.
     */
    
    public void setNombre(String nombre){ 
    	
    	this.nombre = nombre; 
    	
    }
    
    /**
     * Getter para el apellido de la persona.
     * @return El apellido de la persona.
     */
    
    public String getApellido(){
    	
    	return apellido; 
    	
    }
    
    /**
     * Setter para el apellido de la persona.
     * @param apellido El nuevo apellido de la persona.
     */
    public void setApellido(String apellido){ 
    	
    	this.apellido = apellido; 
    	
    }
    
    /**
     * Getter para la fecha de nacimiento de la persona.
     * @return La fecha de nacimiento de la persona.
     */
    
    public LocalDate getfNacimiento(){
    	
    	return fNacimiento; 
    	
    }
    
    /**
     * Setter para la fecha de nacimiento de la persona.
     * @param fechaNacimiento La nueva fecha de nacimiento de la persona.
     */
    
    public void setfNacimiento(LocalDate fechaNacimiento){ 
    	
    	this.fNacimiento = fNacimiento; 
    	
    }


    /**
     * Representación en cadena de texto de la persona.
     * Muestra el nombre, apellido y fecha de nacimiento.
     * @return Una cadena de tecto con la información personal de la persona.
     */
    @Override
    public String toString() {
    	
        return  nombre + ' ' + apellido + '{'  + "Fecha de nacimentor" +fNacimiento;
    
    }


}
