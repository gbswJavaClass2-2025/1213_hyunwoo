package cote.exam07;

public abstract class Employee {
    protected String name;
    protected String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract int Pay();

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
