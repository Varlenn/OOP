public class Ostrich extends Bird implements Runable {

    Ostrich(int age, String name) {
        super(age, name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + " летать не умеет");
    }

    public void run() {
        System.out.println(this.name + " бежит");
    }
}
