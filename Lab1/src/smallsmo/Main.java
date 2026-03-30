package smallsmo;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Анна", 2, 95.0);
        students[1] = new Student("Максим", 1, 82.5);
        students[2] = new Student();

        students[2].setName("Олена");
        students[2].setAverageScore(88.0);

        System.out.println("--- Список студентів ---");
        for (Student s : students) {
            s.displayInfo();
        }

        System.out.println("\nЗагальна кількість студентів: " + Student.getStudentCount());
    }
}