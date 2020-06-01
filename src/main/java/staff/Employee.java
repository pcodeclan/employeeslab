package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name=="") throw new IllegalArgumentException("Cannot enter null value");
        this.name = name;
    }

    public double raiseSalary(double raise){
        if (raise <=0) throw new IllegalArgumentException("Raise cannot be lower or equal to 0");
        return this.salary + raise;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    //    Employee will have a name, NI number and salary.
//    Create Getters for all properties.
//    Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
//    Add a method called payBonus which returns 1% of the employees salary.
//    Don’t worry about testing just now until you create the subclasses.

//    Prevent a negative value for the raiseSalary method.
//    Allow the user to change the Employees name and prevent a null value from being entered.
//    Override the payBonus in director to return 2% of their salary.
}
