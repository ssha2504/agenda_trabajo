public class Lista {
    private Nodo inicio;
    private int size;
    private String datos[];

    public Lista() {
        inicio = null;
        size = 0;
    }



    // Método para agregar un contacto al final de la lista
    public void agregar(Contacto contacto) {
        Nodo nuevoNodo = new Nodo(contacto);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
        size++;
    }

    // Método para obtener el tamaño de la lista
    public int Tamano() {
        return size;
    }

    // Método para mostrar todos los contactos en la lista
    public void mostrarContactos() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo temp = inicio;
            int indice = 1;
            while (temp != null) {
                System.out.println(indice + ". " + temp.getContacto());
                temp = temp.getSiguiente();
                indice++;
            }
        }
    }

    //clase interna para representar los nodos de la lista
    private static class Nodo {
        private Contacto contacto;
        private Nodo siguiente;

        public Nodo(Contacto contacto) {
            this.contacto = contacto;
            this.siguiente = null;
        }

        public Contacto getContacto() {
            return contacto;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }



}

