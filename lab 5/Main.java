public class Main {
    public static void main(String[] args) {
        Sparrow birb = new Sparrow(1, "бёрб");
        birb.fly();
        birb.run();
        birb.name = "берб";
        birb.setAge(4);

        Penguin peg = new Penguin(2, "пег");
        peg.fly();
        peg.swim();

        Ostrich pepega = new Ostrich(3, "пепега");
        pepega.run();
    }
}
