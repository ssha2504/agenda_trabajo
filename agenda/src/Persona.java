

public class Persona {
    //datos
    private String nombre;
    private String apellido;
    private int fNacimiento;

    //el persona que no tiene fecha de nacimiento
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    //el persona que tiene fecha de nacimiento
    public Persona(String nombre, String apellidos, int fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.fNacimiento = fNacimiento;
    }

    //los getter
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    //tostring para mostrar no hace falta es para probar
	@Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                '}';
    }


}
