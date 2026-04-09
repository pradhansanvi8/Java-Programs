import java.util.*;

// Interface
interface Department {
    void printDept();
}

// Hostel class
class Hostel {
    String hostelName;

    void getHostel(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
    }

    void printHostel() {
        System.out.println("Hostel: " + hostelName);
    }
}

// Student class
class Student extends Hostel implements Department {
    String name;
    int regNo;

    void getData(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Reg No: ");
        regNo = sc.nextInt();
        sc.nextLine();

        getHostel(sc);
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        printHostel();
        printDept();
    }

    public void printDept() {
        System.out.println("Department: CSE");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice;

        do {
            System.out.println("\n1. Admit\n2. Display\n3. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    s.getData(sc);
                    break;
                case 2:
                    s.printData();
                    break;
            }
        } while (choice != 3);
    }
}