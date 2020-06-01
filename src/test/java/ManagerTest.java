import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Dave", "DE213458D", 52000, "IT");
    }

    @Test
    public void hasName(){
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("DE213458D", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(52000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(62000, manager.raiseSalary(10000), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(520, manager.payBonus(), 0.01);
    }


}
