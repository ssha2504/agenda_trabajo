public class Persona {
<<<<<<< Updated upstream
    String Nombre;
    String Apellido;

    public Persona(String nombre, String apellidos) {
        this.Nombre = nombre;
        this.Apellido = apellidos;
=======
    private String nombre;
    private String apellido;
    protected FNacimiento fNacimiento;

    public Persona(String nombre, String apellidos, FNacimiento fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.fNacimiento = fNacimiento;
>>>>>>> Stashed changes
    }


    public String getNombre() {
<<<<<<< Updated upstream
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    @Override
=======
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}



	@Override
>>>>>>> Stashed changes
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }


}
