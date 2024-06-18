package Employee;

public class HRManager extends Employee{
    public HRManager(){}
    @Override
    public void work(){
        System.out.println("Managing employees");
    }

    public void getSalary(){
        System.out.println("Manager salary:7000");
    }

    public void addEmployee(){
        System.out.println("Adding new employee");
    }
}
