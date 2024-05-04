package tcs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Fruit
 */
class Fruit {
    String name;
    double price;
    int quantity;

    Fruit(String n, double p, int q) {
        this.name = n;
        this.price = p;
        this.quantity = q;
    }
}

public class Shift22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Fruit> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Fruit f = new Fruit(sc.next(), sc.nextDouble(), sc.nextInt());
            arr.add(f);
        }
        double numerator = 0;
        double denominator = 0;
        for (int i = 0; i < n; i++) {
            numerator += arr.get(i).price*arr.get(i).quantity;
            denominator += arr.get(i).quantity;
        }
        System.out.println(numerator/denominator);
    }
}
