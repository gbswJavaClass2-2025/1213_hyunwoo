package cote.exam07;

public class FullTimeEmployee extends Employee {
    private int annualSalary;

    public FullTimeEmployee(String name, String employeeId, int annualSalary) {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }

    @Override
    public int Pay() {
        return annualSalary / 12;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }
}
