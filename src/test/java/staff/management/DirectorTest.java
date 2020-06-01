package staff.management;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest{

    Director director;

    @Before
    public void setUp(){
        director = new Director("Peter", "PD875780B", 60000, "IT", 100000);
    }

    @Test
    public void hasName(){
        assertEquals("Peter", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("PD875780B", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(70000, director.raiseSalary(10000), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1200, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }

    @Test
    public void canSetName(){
        director.setName("Gregg");
        assertEquals("Gregg", director.getName());
    }

//    @Test
//    public void cantSetNullName(){
//        director.setName("");
//        assertEquals("Gregg", director.getName());
//    }

    //    @Test
//    public void cantOutputNegativeRaiseSalary(){
//        assertEquals("Raise cannot be lower or equal to 0", director.raiseSalary(-1));
//    }


}