public class Sparrow extends Bird implements Runable, Swimable {

    Sparrow(int age, String name) {
        super(age, name);
    }

    public void run() {
        System.out.println(this.name + " бежит");
    }

    public void swim() {
        System.out.println(this.name + " плывет");
    }
}
