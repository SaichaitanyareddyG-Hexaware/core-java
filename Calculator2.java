import java.util.Scanner;

public class Calculator2 {
    static int n1, n2;

    public static void main(String[] args) {
        System.out.println("1.Add\n2.Subtract\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
        int ch;
        do {
            Scanner s = new Scanner(System.in);

            System.out.printf("\nEnter your choice:");
            ch = s.nextInt();

            switch (ch) {

                case 1:
                    System.out.printf("\nEnter first number:");
                    n1 = s.nextInt();
                    System.out.printf("Enter second number:");
                    n2 = s.nextInt();
                    System.out.format("Addition of %d and %d = %d", n1, n2, n1 + n2);
                    break;
                case 2:
                    System.out.printf("\nEnter first number:");
                    n1 = s.nextInt();
                    System.out.printf("Enter second number:");
                    n2 = s.nextInt();
                    System.out.format("Subtraction of %d and %d = %d", n1, n2, n1 - n2);
                    break;
                case 3:
                    System.out.printf("\nEnter first number:");
                    n1 = s.nextInt();
                    System.out.printf("Enter second number:");
                    n2 = s.nextInt();
                    System.out.format("Multiplication of %d and %d = %d", n1, n2, n1 * n2);
                    break;
                case 4:
                    System.out.printf("\nEnter first number:");
                    n1 = s.nextInt();
                    System.out.printf("Enter second number:");
                    n2 = s.nextInt();
                    System.out.format("Division of %d and %d = %d", n1, n2, n1 / n2);
                    break;
                case 5:
                    System.out.printf("\nEnter first number:");
                    n1 = s.nextInt();
                    System.out.printf("Enter second number:");
                    n2 = s.nextInt();
                    System.out.format("Modulus of %d and %d = %d", n1, n2, n1 % n2);
                    break;
                case 6:
                    System.out.println("Exiting.......");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        } while (ch != 6);

    }
}
