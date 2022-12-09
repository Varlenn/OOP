public class Main {
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        int a, b;
        a = 7;
        b = 20;
        if (a > b) {
            rec.recursion(a, b);
        }
        else {
            rec.recursion(b, a);
        }
    }
}