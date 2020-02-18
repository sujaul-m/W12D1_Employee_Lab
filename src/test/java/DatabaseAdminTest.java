import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jack Chan", "HW812236G", 26500.00);
    }

    @Test
    public void hasNaame(){
        assertEquals("Jack Chan", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("HW812236G", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(26500.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Jackie Chan");
        assertEquals("Jackie Chan", databaseAdmin.getName());
    }

    @Test
    public void cannotSetNameToNull() {
        databaseAdmin.setName(null);
        assertEquals("Jack Chan", databaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(4000.00);
        assertEquals( 30500.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(265.00, databaseAdmin.payBonus(), 0.1);
    }
}
