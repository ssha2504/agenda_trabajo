import java.util.Scanner;

public class Lista {

	private Nodo cabeza;
	 private int tamano;

	
	 
	 private static class Nodo {
	        private Contacto dato;
	        private Nodo siguiente;
	        
	        public Nodo(Contacto dato) {
	        	this.dato = dato;
	        
	        }
	    }
	 
	 		public Lista() {
		    	
		        this.cabeza = null;
		        this.tamano = 0;
		        
		    }

		 
	 		
	 		public void agregar(Contacto contacto) {
		      
		    	Nodo nuevoNodo = new Nodo(contacto);
		      
		        if (cabeza == null) {
		           cabeza = nuevoNodo;   
		        } 
		        
		        else{
		        	
		            Nodo actual = cabeza;
		           
		            while (actual.siguiente!= null) {
		                actual = actual.siguiente;
		            }
		            
		            actual.siguiente = nuevoNodo;
		        }
		       
		        tamano++;
		    }

	 		
	 		
		    public void eliminar(String nombre) {
		    	
		        if (cabeza == null) return;
		        
		        if (cabeza.dato.getNombre().equals(nombre)) {
		            cabeza = cabeza.siguiente;
		            tamano--;
		            return;
	        }
		        
		        
	        Nodo actual = cabeza;
	        
	        while (actual.siguiente!= null &&!actual.siguiente.dato.getNombre().equals(nombre)) {
	            actual = actual.siguiente;
	        }
	        
	        if (actual.siguiente!= null) {
	            actual.siguiente = actual.siguiente.siguiente;
	            tamano--;
	        }
	    }

		    public boolean buscar(String nombre) {
		        Nodo actual = cabeza;
		        
		        while (actual!= null) {
		        	
		            if (actual.dato.getNombre().equals(nombre)) {
		                return true;
		            }
		            actual = actual.siguiente;
		        }
		        return false;
		    }

		    
	    public int getTamano() {
	        return tamano;
	    }
	
	
}
 
	
	
	
	
	
	
	
	
	
	
	
	


