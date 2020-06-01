package staff.management;

public class Director extends staff.management.Manager{

    private double budget;

    public Director(String name, String niNmumber, double salary, String deptName, double budget) {
        super(name, niNmumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return getSalary() * 0.02;
    }

}
