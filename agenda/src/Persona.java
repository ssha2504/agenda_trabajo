public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;
   
    

    public Persona(String nombre, String apellidos, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.fNacimiento = fNacimiento;
        
    }


    
    public String getNombre() {
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}


   public Fecha getFNacimiento() {
	        
	   return fNacimiento;
	}


	@Override
    public String toString() {
        return "Persona{" +
                "Nombre= " + nombre + '\'' +
                ", Apellido= " + apellido + '\'' + 
                ", FechaDeNaciemito= " + fNacimiento + '}';
    }


}
