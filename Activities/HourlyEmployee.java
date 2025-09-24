public class HourlyEmployee extends Employee{
    int hours;
    double rate = 10000;

    public HourlyEmployee(int hours){
        this.hours = hours;
    }

    @Override
    double monthlySalary() {
        return (hours*rate);
    }
}
