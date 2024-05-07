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

   
    public void pedirDatos() {
    
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Introduzca un nombre:");
    	String nombre = scanner.nextLine();
    	
    	System.out.println("Introduzca un nombre:");
    	String apellido = scanner.nextLine();
    	
    	System.out.println("Introduzca un telefono:");
    	int telefono = scanner.nextInt();
    	
    	System.out.println("Introduzca un telefono:");
    	String direccion = scanner.nextLine();
    	
    	System.out.println("Introduzca un telefono:");
    	String email = scanner.nextLine();
    	
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
