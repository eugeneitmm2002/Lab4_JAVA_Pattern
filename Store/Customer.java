import java.util.Scanner;

public class Customer {
    public String chooseProductName() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public int inputCard() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public String inputAddress() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
