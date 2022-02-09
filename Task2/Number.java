import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int m = s.nextInt();
        if (m > 0)
            System.out.println("1");
        else if (m == 0)
            System.out.println("0");
        else
            System.out.println("-1");

    }

}
