import java.util.ArrayList;

public class Lista {
    private ArrayList<Contacto> contactos;

    public Lista() {
        this.contactos = new ArrayList<>();
    }

    public void agregar(Contacto contacto) {
        contactos.add(contacto);
    }


}

