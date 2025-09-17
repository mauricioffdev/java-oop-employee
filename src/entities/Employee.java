package entities;

public class Employee {

    public String name;
    public double salary;
    public double tax;

    public double netSalary(){
        return salary - tax;
    }

    public void increaseSalary(double percentage){
        this.salary += this.salary * (percentage / 100);
    }

    public String toString(){
        return "Employee: "
                + name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}