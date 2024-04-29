public class Contacto extends Persona{
    private int telefono;
    private int direccionPos;
    private String direccion;
    private String email;

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

    public int getDireccionPos() {
        return direccionPos;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }


    @Override
    public String toString() {
        return "Contacto{" +
                "telefono='" + telefono + '\'' +
                ", direccionPos='" + direccionPos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Constructor que acepta nombre, apellidos y teléfono
    public Contacto(String nombre, String apellidos, FNacimiento fNacimiento ,int telefono , String direccion, int direccionPos, String email) {
        // Llama al constructor de la clase base (Persona) para establecer el nombre y los apellidos
        super(nombre, apellidos);
        // Establece el teléfono
        this.telefono = telefono;
        this.direccionPos = direccionPos;
        this.direccion = direccion;
        this.email = email;

    }

}
