package staff.techStaff;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeveloperTest{

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Graeme", "GE875689S", 60000);
    }

    @Test
    public void hasName(){
        assertEquals("Graeme", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("GE875689S", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(70000, developer.raiseSalary(10000), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(600, developer.payBonus(), 0.01);
    }
}