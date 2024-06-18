package Company;

public class Developer extends EmployeeC {
    public Developer(String name, String address, double salary, String title) {
        super(name, address, salary, title);

    }
    @Override
    public double calculateBonus() {
        return this.salary*0.19; // Base implementation, should be overridden
    }
    @Override
    public String performanceReport() {
        return "Excellent"; // Base implementation, should be overridden
    }
    @Override
    public void manageProject() {
        System.out.println(this.title + " " + this.name +  " is debugging code in Python");
    }
}
