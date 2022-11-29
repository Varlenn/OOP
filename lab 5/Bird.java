public class Bird{
    protected int age;
    public String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    Bird(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void fly() {
        System.out.println(this.name + " полетел(а)");
    }

}
