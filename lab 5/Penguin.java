public class Penguin extends Bird implements Runable, Swimable {
    Penguin(int age, String name) {
        super(age, name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + " летать не умеет");
    }

    public void run() {
        System.out.println(this.name + " бежит");
    }

    public void swim() {
        System.out.println(this.name + " плывет");
    }
}
