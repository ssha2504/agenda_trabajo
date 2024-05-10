import java.util.Scanner;

public class Contacto extends Persona{
    private int telefono;
    private String direccion;
    private String email;

    
   
    
    public Contacto(String nombre, String apellido, int telefono, String direccion, String email) {
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
