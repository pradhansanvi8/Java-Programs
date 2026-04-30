import java.util.*;

class Point {

    int x, y;

    void set(int a, int b) { x = a; y = b; }

    void show() { System.out.print("(" + x + "," + y + ")"); }

}

class Circle {

    float r;

    Point c = new Point();

    void input(Scanner sc) {

        c.set(sc.nextInt(), sc.nextInt());

        r = sc.nextFloat();

    }

    void display() {

        System.out.print("Center: ");

        c.show();

        System.out.println("\nRadius: " + r + "\nArea: " + (3.14 * r * r));

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle obj = new Circle();

        obj.input(sc);

        obj.display();

    }

}