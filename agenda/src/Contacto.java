import java.time.LocalDate;

public class Contacto extends Persona{
    //datos
    private String telefono;
    private int direcPos;
    private String email;

    //el funcion de clase de contacto
    public Contacto(String nombre, String apellidos, String telefono, String email, int direcPos, LocalDate fechanc) {
        super(nombre, apellidos,fechanc);
        this.telefono = telefono;
        this.email = email;
        this.direcPos = direcPos;
    }

    //los getter y setter
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getdirecPos() {
        return direcPos;
    }
    public void setdirecPos(int direcPos) {
        this.direcPos = direcPos;
    }



    @Override
    public String toString() {
        return super.toString() + telefono + ',' + direcPos + ',' + email +
                '}';
    }

}