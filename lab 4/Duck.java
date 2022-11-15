public class Duck extends Animal implements Swimable, Flyable, Runable{
    Duck(){}

    public void swim() {
        System.out.println("Утка поплыла");
    }

    public void fly() {
        System.out.println("Утка полетела");
    }

    public void run() {
        System.out.println("Утка пошла");
    }
}
