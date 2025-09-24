package Activity11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("1","Alice",2000));
        employees.add(new HourlyEmployee("2","Bob",160,10));
        employees.add(new FullTimeEmployee("3","Charlie",2500));

        double total = 0;
        for (Employee e : employees) {
            double salary = e.monthlySalary();
            if (e instanceof Bonusable) {
                salary += ((Bonusable)e).bonus();
            }
            total += salary;
            System.out.println(e.name+" earns "+salary);
        }
        System.out.println("Total payroll: "+total);
    }
}
