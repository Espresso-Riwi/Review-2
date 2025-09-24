package Activity11;

public class HourlyEmployee extends Employee {
    int hours;
    double rate;
    public HourlyEmployee(String id, String name, int hours, double rate) {
        super(id, name);
        this.hours = hours; this.rate = rate;
    }
    public double monthlySalary() { return hours * rate; }
}
