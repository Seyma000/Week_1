package week2;

public class Employee {
    // Define variables
    private String name;
    private double salary = 0;
    private int workHours, hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // tax calculation method
    public double tax() {
        if (salary < 1000) {
            return 0.0;
        }
        return salary * 0.03;
    }
    // bonus calculation method
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0.0;
    }

    // salary increase method
    public double raiseSalary() {
        int year = 2021 - this.hireYear;
        if (year < 10)
            return salary * 0.05;
        else if (year < 20)
            return salary * 0.1;

        return salary * 0.15;
    }
    public void toString(Employee emp1){
        System.out.println("Name: "+emp1.name);
        System.out.println("Salary: "+emp1.salary);
        System.out.println("Work Hours: "+emp1.workHours);
        System.out.println("Start Year: "+emp1.hireYear);
        System.out.println("Tax: " + emp1.tax());
        System.out.println("Bonus: " + emp1.bonus());
        System.out.println("Salary Increase: " + emp1.raiseSalary());
        double totalSalary= emp1.salary+ emp1.bonus()- emp1.tax();
        System.out.println("Total Salary with Tax and Bonuses: " + totalSalary);
        System.out.println("Total Salary: " + (emp1.salary+emp1.raiseSalary()));
    }


    public static void main(String[] args) {
        Employee emp1 = new Employee("Kemal", 2000.0, 45, 1985);
        emp1.toString(emp1);
    }
}
