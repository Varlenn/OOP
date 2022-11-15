public class Dog extends Animal implements Swimable, Runable {
    Dog(){}

    public void swim() {
        System.out.println("Собака поплыла");
    }

    public void run() {
        System.out.println("Собака пошла");
    }
}
