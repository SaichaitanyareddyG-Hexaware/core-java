import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the length of a : ");
        int a = sc.nextInt();
        System.out.printf("Enter the length of b : ");
        int b = sc.nextInt();
        System.out.printf("Enter the length of c : ");
        int c = sc.nextInt();
        if (a == b && b == c)
            System.out.printf("Equilateral Triangle");
        else if (a == b || a == c || b == c)
            System.out.printf("Isosceles Triangle");
        else
            System.out.printf("Scalene Triangle");

    }
}
