package staff.management;

public class Manager extends staff.Employee{

    private String deptName;

    public Manager(String name, String niNmumber, double salary, String deptName){
        super(name, niNmumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
