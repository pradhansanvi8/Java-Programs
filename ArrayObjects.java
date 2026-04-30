import java.util.*;

class Item {

    int code;

    float price;

    void input(Scanner sc) {

        code = sc.nextInt();

        price = sc.nextFloat();

    }

    void display() {

        System.out.printf("%10d%10.2f\n", code, price);

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] a = new Item[5];

        float total = 0;

        for (int i = 0; i < 5; i++) {

            a[i] = new Item();

            a[i].input(sc);

        }

        System.out.printf("%10s%10s\n", "Code", "Price");

        for (int i = 0; i < 5; i++) {

            a[i].display();

            total += a[i].price;

        }

        System.out.printf("%10s%10.2f", "Total", total);
}
}