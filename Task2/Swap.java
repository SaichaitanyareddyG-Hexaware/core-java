public class Swap {
    public static void swa(int a, int b) {
        System.out.format("Before Swapping of two number a=%d,b=%d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.format("After Swapping of two number a=%d,b=%d", a, b);

    }

    public static void main(String[] args) {
        swa(12, 10);
    }

}
