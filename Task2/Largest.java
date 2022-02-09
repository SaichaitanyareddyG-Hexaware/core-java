import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the number1: ");
        int a = s.nextInt();
        System.out.printf("Enter the number2: ");
        int b = s.nextInt();
        System.out.printf("Enter the number3: ");
        int c = s.nextInt();
        if (a < b && a < c) {

            System.out.printf("\n%d is the smallest number", a);
        } else if (b < c) {

            System.out.printf("\n%d is the smallest number", b);
        } else {
            System.out.printf("\n%d is the smallest number", c);
        }
        if (a > b && a > c) {

            System.out.printf("\n%d is largest number", a);
        } else if (b > c) {

            System.out.printf("\n%d is largest number", b);
        } else {
            System.out.printf("\n%d is largest number", c);
        }

    }

}
