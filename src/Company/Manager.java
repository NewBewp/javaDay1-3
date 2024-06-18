package Company;

public class Manager extends EmployeeC {
    public Manager(String name, String address, double salary, String title) {
//        Employee employee = new Employee(name, address, salary, title);
        super(name, address, salary, title);

    }
    @Override
    public double calculateBonus() {
        return this.salary*0.2; // Base implementation, should be overridden
    }
    @Override
    public String performanceReport() {
        return "Excellent"; // Base implementation, should be overridden
    }
    @Override
    public void manageProject() {
        System.out.println(this.title + " " + this.name + " is managing a project");
    }
}
