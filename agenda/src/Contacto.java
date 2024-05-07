public class Contacto extends Persona{
    private int telefono;
    private String direccion;
    private String email;

    
   
    // Constructor que acepta nombre, apellidos y teléfono
    public Contacto(String nombre, String apellido, int telefono, String direccion, String email) {
        // Llama al constructor de la clase base (Persona) para establecer el nombre y los apellidos
        super(nombre, apellido);
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;

    }

 
    @Override
    public String getApellido() {
    	
        return super.getApellido();
    }

    @Override
    public String getNombre() {
    	
        return super.getNombre();
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }


    @Override
    public String toString() {
        return "Contacto{" +
        		super.getNombre() + super.getApellido() +
                "telefono='" + telefono + '\'' +
                ", direccionPos='" + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

   
}
