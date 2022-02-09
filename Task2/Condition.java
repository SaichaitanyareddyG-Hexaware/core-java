public class Condition {
    public static void number(int n) {
        if (n % 2 == 0)
            System.out.format("%d is Even number", n);
        else
            System.out.format("%d is Odd number", n);
    }

    public static void main(String[] args) {
        number(56);
    }

}
