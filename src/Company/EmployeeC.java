package Company;

public class EmployeeC {
        public String name ;
        String address;
        double salary;
        String title ;

        public EmployeeC(String name, String address, double salary, String title) {
                this.name = name;
                this.address = address;
                this.salary = salary;
                this.title = title;
        }

        public double calculateBonus() {
                return 0.0; // Base implementation, should be overridden
        }

        public String performanceReport() {
                return "No report"; // Base implementation, should be overridden
        }

        public void manageProject() {
                // Base implementation, should be overridden if needed
        }


}
