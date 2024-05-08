

public class Persona {

    private String Nombre;
    private String Apellido;
    private int fNacimiento;

    public Persona(String nombre, String apellidos) {
        this.Nombre = nombre;
        this.Apellido = apellidos;
    }


    public Persona(String Nombre, String Apellidos, int fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellidos;
        this.fNacimiento = fNacimiento;
    }


    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }

	@Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }


}
