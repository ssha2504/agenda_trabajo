import java.time.LocalDate;


/**
 * Clase Contacto que extiende de la  clase Persona.
 * Representa a un contacto con información adicional como teléfono, dirección postal y correo electrónico.
 */

public class Contacto extends Persona{
    
    private String telefono;
    private int direcPos;
    private String email;

 /**
  * Constructor de la clase Contacto.
  * Inicializa los atributos heredados de Persona y los nuevos atributos especifícos de Contacto.
  * @param nombre El nombre completo del contacto.
  * @param apellidos El apellido del contacto.
  * @param telefono El número de teléfono del contacto.
  * @param email El correo electrónico del contacto.
  * @param direcPos La posición de dirección postal del contacto.
  * @param fechanc La fecha de nacimiento del contacto.
  */
  
    public Contacto(String nombre, String apellidos, String telefono, String email, int direcPos, LocalDate fechanc) {
        super(nombre, apellidos,fechanc);
        this.telefono = telefono;
        this.email = email;
        this.direcPos = direcPos;
    }

    
    /**
     * Getter para el teléfono del contrato.
     * @return El número de teléfono del contrato.
     */
   
    public String getTelefono(){
        return telefono;
    }
    
   /**
    * Setter para el teléfono del contacto.
    * @param telefono El nuevo número de teléfono del contacto.
    */
    
    public void setTelefono(String telefono){
    	
        this.telefono = telefono;
    }
    
    /**
     * Getter para el correo electrónico del contacto.
     * @return El correo electrónico del contacto.
     */
    
    public String getEmail(){
    	
        return email;
    }
    
    /**
     * Setter para el correo electrónico del contacto.
     * @param email El nuevo correo electrónico del contacto.
     */
    
    public void setEmail(String email){
    	
        this.email = email;
    }
    
 
    /**
     * Getter para la posición de dirección del contacto.
     * @return La posición de dirección postal del contacto.
     */
    
    public int getdirecPos(){
    	
        return direcPos;
    }
    
    
    /**
     * Setter para la posición de dirección postal del contacto.
     * @param direcPos La nueva posición de dirección postal del contacto.
     */
    
    public void setdirecPos(int direcPos){
    	
        this.direcPos = direcPos;
    }


    /**
     * Representación en cadena de texto del contacto.
     * Muestra la información personal y adicional del contacto.
     *@return Una cadenade texto con la información del contacto
     */
    
    @Override
    public String toString(){
        return super.toString() + telefono + ',' + direcPos + ',' + email +
                '}';
    }

}