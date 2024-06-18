import Company.Developer;
import Company.Manager;
import Company.Programmer;
import Company.EmployeeC;
import Employee.Employee;
import Employee.HRManager;
import Vehicle.Bicycle;
import Vehicle.Car;
import Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        //b1
//        Vehicle vehicle = new Vehicle();
//        vehicle.speedUp();
//
//        Car car = new Car();
//        car.speedUp();
//
//        vehicle.speedUp();
//        Bicycle bicycle = new Bicycle();
//        bicycle.speedUp();

        //b2
//        Employee employee = new Employee();
//        employee.work();
//        employee.getSalary();
//
//        HRManager hrManager = new HRManager();
//        hrManager.work();
//        hrManager.getSalary();
//        hrManager.addEmployee();

        //b3
        Manager manager = new Manager("Avril Aroldo", "123 Manager St", 60000,"manager");
        Developer developer = new Developer("Iver Dipali", "456 Developer Rd", 48000,"developer");
        Programmer programmer = new Programmer("Yaron Gabriel", "789 Programmer Ave", 48000,"programmer");

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        System.out.println("Performance report for Manager " + manager.name + ": " + manager.performanceReport());
        System.out.println("Performance report for Developer " + developer.name + ": " + developer.performanceReport());
        System.out.println("Performance report for Programmer " + programmer.name + ": " + programmer.performanceReport());

        manager.manageProject();
        developer.manageProject();
        programmer.manageProject();
    }
}