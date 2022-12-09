public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", "11", 4.1);

        Aspirant aspirant = new Aspirant("Петр", "Петров", "22", 5, "Опять");

        Student student2 = new Aspirant("Олег", "Олегов", "33", 4.49, "Работа");

        Student studArr[] = new Student[] {student, aspirant, student2};

        for (Student s : studArr) {
            System.out.println(s.getScholarship());
        }
    }
}