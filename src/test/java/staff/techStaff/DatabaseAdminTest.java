package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest{

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Marcos", "ME975790D", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Marcos", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("ME975790D", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(60000, databaseAdmin.raiseSalary(10000), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.01);
    }
}