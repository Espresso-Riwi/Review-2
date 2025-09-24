public class FullTimeEmployee extends Employee implements Bonusable{
    double salary = 1400000;

    @Override
    double monthlySalary() {
        return salary*=bonus();
    }

    @Override
    public double bonus() {
        return 1.10;
    }
}
