package demo2_employee_comprehensive;

public class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int workHours;

    public PartTimeEmployee(String name, String employeeId, double hourlyWage, int workHours) {
        super(name, employeeId);
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * workHours;
    }
}
