public class Aspirant extends Student {
    private String work;

    Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public int getScholarship() {
        if (this.averageMark == 5) {
            return 2000;
        }
        else {
            return 1800;
        }
    }
}
