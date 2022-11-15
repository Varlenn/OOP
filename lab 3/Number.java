public class Number implements Output {

    private int num;

    public int getNumber() {
        return num;
    }

    public void setNumber(int n) {
        this.num = n;
    }

    public void print() {
        System.out.println(" " + num);
    }
}
