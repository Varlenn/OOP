public class Recursion {
    public static void recursion(int a, int b) {
        System.out.println(a);
        a = a - 1;
        if (a >= b) {
            recursion(a, b);
        }
    }
}