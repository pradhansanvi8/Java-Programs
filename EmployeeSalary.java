import java.util.*;

interface Gross {
    void calculateGross();
}

class Employee {
    String name;
    double basic;

    void getData(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }
}

class Salary extends Employee implements Gross {
    double gross;

    public void calculateGross() {
        gross = basic + (0.2 * basic) + (0.1 * basic);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gross Salary: " + gross);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();

        s.getData(sc);
        s.calculateGross();
        s.display();
    }
}