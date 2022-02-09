import java.util.Scanner;

public class Lcm {
    public static void gcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        System.out.printf("LCM of %d and %d is: %d", x, y, (x * y) / gcd);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the x-value: ");
        int x = sc.nextInt();
        System.out.printf("Enter the y-value: ");
        int y = sc.nextInt();
        gcd(x, y);
    }

}
