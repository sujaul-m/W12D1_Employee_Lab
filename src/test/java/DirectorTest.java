import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Tony Gaa", "FG89891T", 90000.00, "Finance", 10000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Tony Gaa", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("FG89891T", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(90000.00, director.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        director.setName("Tony Jaa");
        assertEquals("Tony Jaa", director.getName());

    }

    @Test
    public void cannotSetNameToNull() {
        director.setName(null);
        assertEquals("Tony Gaa", director.getName());
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Finance", director.getDepartmentName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000.00, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000.00);
        assertEquals( 100000.00, director.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1800, director.payBonus(), 0.1);
    }
}
