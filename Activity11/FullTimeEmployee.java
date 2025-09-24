package Activity11;

public class FullTimeEmployee extends Employee implements Bonusable {
    double baseSalary;
    public FullTimeEmployee(String id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }
    public double monthlySalary() { return baseSalary; }
    public double bonus() { return baseSalary * 0.1; }
}
