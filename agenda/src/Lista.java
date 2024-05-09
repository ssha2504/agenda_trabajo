import java.util.Scanner;
import java.lang.System;

public class Lista {
    //datos
    private static Nodo inicio;
    private static int size;
    private String datos[];

    //inicializar Lista
    public Lista() {
        inicio = null;
        size = 0;
    }

    //metodo para agregar un contacto al final de la lista
    public static void agregar(Contacto contacto) {
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

    //metodo para obtener el tamaño de la lista
    public int Tamano() {
        return size;
    }

    //metodo para mostrar todos los contactos en la lista
    public static void mostrarContactos() {
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

    //funcion para hacer busqueda de contactos seguin telefono menor plovable de repitir

    public static Contacto buscarContacto(String telefonoBuscado) {
        Scanner sc = new Scanner(System.in);
        Nodo temp = inicio;
        int indice = 1;

        System.out.println("Introduce el telefono de contacto que busca: ");
        String telefono = sc.nextLine();


        while (temp != null) {
            if (temp.getContacto().getTelefono().equals(telefonoBuscado)) {

                return temp.getContacto();
            }

            temp = temp.getSiguiente();
        }
        System.out.println("No existe el contacto con el telefono " + telefonoBuscado);
        return null;
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

