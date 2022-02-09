import java.util.Scanner;

public class Quadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the point x: ");
        int x = sc.nextInt();
        System.out.printf("Enter the point y: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0)
            System.out.format("(%d,%d) point lies in Quadrant1", x, y);
        else if (x < 0 && y > 0)
            System.out.format("(%d,%d) point lies in Quadrant2", x, y);
        else if (x < 0 && y < 0)
            System.out.format("(%d,%d) point lies in Quadrant3", x, y);
        else
            System.out.format("(%d,%d) point lies in Quadrant4", x, y);

    }

}
