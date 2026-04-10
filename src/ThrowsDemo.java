import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo {
    static void check(int n) throws IOException {
        if (n < 0) {
            throw new IOException();
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            check(n);
        } catch (IOException e) {
            System.out.println("Caught: IO Exception");
        }
        sc.close();
    }
}
