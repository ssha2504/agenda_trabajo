public class Contacto extends Persona{
    private String telefono;
    private int direcPos;
    private String direccion;
    private String email;
    private Fecha fecha;

    public Contacto(String nombre, String apellidos, String telefono, String email, int direcPos) {
        super(nombre, apellidos);
        this.telefono = telefono;
        this.email = email;
        this.direcPos = direcPos;


    }


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

    public int getdirecPos() {
        return direcPos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }


    @Override
    public String toString() {
        return super.Nombre+ super.Apellido + "{" +
                "telefono='" + telefono + '\'' +
                ", direccionPos='" + direcPos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

<<<<<<< Updated upstream
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
=======
>>>>>>> Stashed changes

}
