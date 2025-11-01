package cote.exam07;

public class PartTimeEmployee extends Employee {
    private int hourlyRate;
    private int workHours;

    public PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    public int Pay() {
        return hourlyRate * workHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getWorkHours() {
        return workHours;
    }
}
