package Company;

public class Programmer extends EmployeeC {
    public Programmer(String name, String address, double salary, String title) {
        super(name, address, salary, title);

    }
    @Override
    public double calculateBonus() {
        return this.salary*0.15; // Base implementation, should be overridden
    }
    @Override
    public String performanceReport() {
        return "Good"; // Base implementation, should be overridden
    }
    @Override
    public void manageProject() {
        System.out.println(this.title + " " + this.name + " is coding in Java");
    }
}
