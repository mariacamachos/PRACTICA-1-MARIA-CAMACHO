package es.uah.matcomp.mp.e1.ejerciciosclases.e3;

/**
 * The Employee class models employee with id, firstName, lastName and salary.
 */
public class Employee { // Save as "Employee.java"
    // private instance variable, not accessible from outside this class
    private int id;
    private String FirstName;
    private String LastName;
    private int salary;

    /** Constructs an Employee instance */
    public Employee(int id, String FirstName, String LastName, int salary) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.salary = salary;
    }
    /** Returns the id */
    public int getId() {
        return id;
    }
    /** Returns the FirstName */
    public String getFirstName() {
        return FirstName;
    }
    /** Returns the LastName */
    public String getLastName(){
        return LastName;
    }
    /** Returns the FirstName, name and Lastname */
    public String getName() {
        return FirstName + " " + LastName;
    }
    /** Returns the salary */
    public int getSalary() {
        return salary;
    }
    /** Setter for id */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /** Returns the annual salary  */
    public int getAnnualSalary() {
        return salary * 12;
    }
    /** Returns the salary percentage */
    public int raiseSalary(int percentage) {
        this.salary += (this.salary * percentage) / 100;
        return this.salary;
    }
    /** Override toString() method */
    @Override
    public String toString(){
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
