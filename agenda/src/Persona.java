public class Persona {
    String Nombre;
    String Apellido;

    public Persona(String nombre, String apellidos) {
        this.Nombre = nombre;
        this.Apellido = apellidos;
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
