import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import java.time.LocalDate;


class PersonaTest {

	
    private Persona persona;

    @Before
    public void nuevaPersona() {
        persona = new Persona("Juan", "Pérez", LocalDate.of(1990, 5, 20));
    }

    
    @Test
    public void testGetNombre() {
        assertEquals("Juan", persona.getNombre());
    }
    
    @Test
    public void testSetNombre() {
        persona.setNombre("Pedro");
        assertEquals("Pedro", persona.getNombre());
    }
    
    @Test
    public void testGetApellido() {
        assertEquals("Pérez", persona.getApellido());
    }
    
    @Test
    public void testSetApellido() {
        persona.setApellido("González");
        assertEquals("González", persona.getApellido());
    }
    
    @Test
    public void testGetfNacimiento() {
        assertEquals(LocalDate.of(1990, 5, 20), persona.getfNacimiento());
    }
    
    @Test
    public void testSetfNacimiento() {
        persona.setfNacimiento(LocalDate.of(1985, 10, 15));
        assertEquals(LocalDate.of(1985, 10, 15), persona.getfNacimiento());
    }    
    
    @Test
    public void testToString() {
        String comprobacion = "Juan Pérez{Fecha de nacimientor" + LocalDate.of(1990, 5, 20);
        assertEquals(comprobacion, persona.toString());
    }
     
}