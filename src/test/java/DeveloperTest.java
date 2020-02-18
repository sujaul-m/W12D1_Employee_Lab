import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jet Lee", "ZZ76123L", 20000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jet Lee", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("ZZ76123L", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        developer.setName("Jet Li");
        assertEquals("Jet Li", developer.getName());

    }

    @Test
    public void cannotSetNameToNull() {
        developer.setName(null);
        assertEquals("Jet Lee", developer.getName());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1500.00);
        assertEquals( 21500.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(200.00, developer.payBonus(), 0.1);
    }

}
