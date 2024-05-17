import java.time.LocalDate;

public class Persona {
    //datos
    private String nombre;
    private String apellido;
    private LocalDate fNacimiento;

    //el persona que tiene fecha de nacimiento
    public Persona(String nombre, String apellidos, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.fNacimiento = fNacimiento;
    }

    //los getter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public LocalDate getfNacimiento() { return fNacimiento; }
    public void setfNacimiento(LocalDate fechaNacimiento) { this.fNacimiento = fNacimiento; }


    //tostring para mostrar no hace falta es para probar
    @Override
    public String toString() {
        return  nombre + ' ' + apellido + '{'  + "Fecha de nacimentor" +fNacimiento;
    }


}
