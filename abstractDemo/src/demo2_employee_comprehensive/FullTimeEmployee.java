package demo2_employee_comprehensive;

public class FullTimeEmployee extends Employee implements Promotable, Bonusable {
    private double baseSalary;
    private double bonus;

    public FullTimeEmployee(String name, String employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public void promote() {
        baseSalary *= 1.1;
    }
}
