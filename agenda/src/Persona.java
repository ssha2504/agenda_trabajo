public class Persona {
    String nombre;
    String apellido;
    String fNacimiento;
   
    

    public Persona(String nombre, String apellidos, String fNacimiento) {
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


	public String getfNacimiento() {
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
