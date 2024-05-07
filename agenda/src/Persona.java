public class Persona {
    private String nombre;
    private String apellido;
    private String fNacimiento;
   
    

    public Persona(String nombre, String apellidos, String fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.fNacimiento = fNacimiento;
        
    }


    public Persona(String nombre, String apellido) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    }
    
    
    public String getNombre() {
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}



}
