

public class Persona {

    private String nombre;
    private String apellido;
    private int fNacimiento;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }


    public Persona(String nombre, String apellidos, int fNacimiento) {
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

	@Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                '}';
    }


}
