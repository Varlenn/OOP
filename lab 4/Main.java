public class Main {
    public static void main(String[] args) {
        Dog bobs = new Dog();
        bobs.setHeight(20);
        bobs.setWeight(8);

        Fish nemo = new Fish();
        nemo.setHeight(3);

        Duck donald = new Duck();
        donald.setHeight(4);

        nemo.swim();
        donald.fly();
        bobs.run();
        letsSwim(nemo);
        letsSwim(bobs);
    }
    public static void letsSwim(Swimable obj) {
        obj.swim();
    }
}