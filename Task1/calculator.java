import java.util.Scanner;

class calculator {
    static int n2;

    public static void read(Scanner s) {
        n2 = s.nextInt();
    }

    public static void main(String[] args) {
        char ch;

        do {
            Scanner s = new Scanner(System.in);
            int n1 = s.nextInt();
            ch = s.next().charAt(0);

            switch (ch) {
                case '+':
                    read(s);
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    read(s);
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    read(s);
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    read(s);
                    System.out.println(n1 / n2);
                    break;
                case '%':
                    read(s);
                    System.out.println(n1 % n2);
                    break;

                default:
                    System.out.println("Enter valid input");
            }
        } while (ch != 'e');

    }

}
