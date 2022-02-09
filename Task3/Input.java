import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        while (true) {
            char str = s.next().charAt(0);
            if (str == 'q')
                break;
            else
                count++;

        }
        System.out.println(count);

    }
}
