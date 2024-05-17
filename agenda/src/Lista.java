import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Contacto> contactos;

    public Lista() {
        this.contactos = new ArrayList<>();
    }

    public void agregar(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminar(Contacto contacto) {
        contactos.remove(contacto);
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public Contacto buscar(String criterio) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(criterio) ||
                    contacto.getApellido().equalsIgnoreCase(criterio) ||
                    contacto.getTelefono().equalsIgnoreCase(criterio) ||
                    contacto.getEmail().equalsIgnoreCase(criterio)) {
                return contacto;
            }
        }
        return null;
    }

    public int obtenerNumeroContacto() {
        return contactos.size();
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay ningún contacto en la lista.");
        } else {
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}


