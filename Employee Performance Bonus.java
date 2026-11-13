import java.util.Scanner;

class Employee {
    String employeeName;

    Employee(String name) {
        employeeName = name;
    }

    double calculateBonus() {
        return 0;
    }

    double calculateBonus(double amount) {
        return 0;
    }
}

class TechnicalEmployee extends Employee {
    double basicSalary;
    int rating;

    TechnicalEmployee(String name, double salary, int rating) {
        super(name);
        basicSalary = salary;
        this.rating = rating;
    }

    double calculateBonus() {
        return basicSalary * rating * 2 / 100;
    }

    double calculateBonus(double salary, int rating) {
        return salary * rating * 2 / 100;
    }
}

class SalesEmployee extends Employee {
    double salesAmount;

    SalesEmployee(String name, double amount) {
        super(name);
        salesAmount = amount;
    }

    double calculateBonus() {
        return salesAmount * 3 / 100;
    }

    double calculateBonus(double amount) {
        return amount * 3 / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        Employee emp;
        double total;

        if (type == 1) {
            String name = sc.next();
            double salary = sc.nextDouble();
            int rating = sc.nextInt();

            emp = new TechnicalEmployee(name, salary, rating);
            total = salary + emp.calculateBonus();
        } else {
            String name = sc.next();
            double amount = sc.nextDouble();

            emp = new SalesEmployee(name, amount);
            total = amount + emp.calculateBonus();
        }

        System.out.println("Employee Name: " + emp.employeeName);
        System.out.printf("Bonus: %.2f%n", emp.calculateBonus());
        System.out.printf("Total Earnings: %.2f%n", total);

        sc.close();
    }
}
