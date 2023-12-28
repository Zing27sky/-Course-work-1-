public class Employee {
    private String firstName;
    private String lastName;
    private String surName;
    private int department;
    private double salary;
    public static int count;
    private int id;

    public Employee(String lastName, String firstName, String surName, int department, double salary) {
        this.id = ++count;
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return this.lastName + " " + this.firstName + " " + this.surName + ", отдел " + this.department + ", Зарплата " + this.salary;

    }
}
