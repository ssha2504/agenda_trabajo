public class Contacto extends Persona{
    private String telefono;
    private int direcPos;
    private String email;

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
        return super.getNombre() + super.getApellido() + "{" +
                "telefono='" + telefono + '\'' +
                ", direccionPos='" + direcPos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Constructor que acepta nombre, apellidos y teléfono
    public Contacto(String nombre, String apellidos ,String telefono , String direccion, int direccionPos, String email) {
        // Llama al constructor de la clase base (Persona) para establecer el nombre y los apellidos
        super(nombre, apellidos);
        // Establece el teléfono
        this.telefono = telefono;
        this.direcPos = direccionPos;
        this.email = email;

    }

}
