import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sammo Hug", "KL45321K", 40000.00, "Development");
    }

    @Test
    public void hasName(){
        assertEquals("Sammo Hug", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("KL45321K", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        manager.setName("Sammo Hung");
        assertEquals("Sammo Hung", manager.getName());
    }

    @Test
    public void cannotSetNameToNull() {
        manager.setName(null);
        assertEquals("Sammo Hug", manager.getName());
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Development", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals( 41000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(400.00, manager.payBonus(), 0.1);
    }
}
