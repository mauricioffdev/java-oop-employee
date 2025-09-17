package aplicattion;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter employee name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter gross salary: ");
        employee.salary = sc.nextDouble();

        System.out.print("Enter tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(); // Pula uma linha para melhor formatação
        System.out.println("Employee data: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println(); // Pula uma linha
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}