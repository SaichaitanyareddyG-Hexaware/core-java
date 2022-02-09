import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Marks in Physics: ");
        int p = sc.nextInt();
        System.out.printf("Enter the Marks in Chemistry: ");
        int c = sc.nextInt();
        System.out.printf("Enter the Marks in Maths: ");
        int m = sc.nextInt();
        int total = p + c + m;
        System.out.printf("Total Marks : %d", total);
        int per = total / 3;
        if (per >= 90)
            System.out.printf("Grade A");
        else if (per >= 80 && per < 90)
            System.out.printf("Grade B");
        else if (per >= 70 && per < 80)
            System.out.printf("Grade C");
        else
            System.out.printf("Grade D");

    }

}
