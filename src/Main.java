import es.uah.matcomp.mp.e1.ejerciciosclases.e3.Employee;

public class Main {
    public static void main(String[] args) {
// Test constructor and toString()
        Employee e3 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e3); // toString();
// Test Setters and Getters
        e3.setSalary(999);
        System.out.println(e3); // toString();
        System.out.println("id is: " + e3.getId());
        System.out.println("firstname is: " + e3.getFirstName());
        System.out.println("lastname is: " + e3.getLastName());
        System.out.println("salary is: " + e3.getSalary());
        System.out.println("name is: " + e3.getName());
        System.out.println("annual salary is: " + e3.getAnnualSalary()); // Test method
// Test raiseSalary()
        System.out.println(e3.raiseSalary(10));
        System.out.println(e3);
    }
}