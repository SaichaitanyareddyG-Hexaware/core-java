import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.printf("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.format("%d is a leap year", year);

        } else {
            System.out.format("%d is not a leap year", year);
        }
    }

}
