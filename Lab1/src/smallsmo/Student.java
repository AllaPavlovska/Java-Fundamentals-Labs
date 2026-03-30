package smallsmo;

public class Student {
    private String name;
    private int course;
    private double averageScore;

    private static int studentCount = 0;

    public Student() {
        this.name = "Невідомо";
        this.course = 1;
        this.averageScore = 0.0;
        studentCount++;
    }

    public Student(String name, int course, double score) {
        this.name = name;
        this.course = course;
        this.averageScore = score;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double score) {
        this.averageScore = score;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void displayInfo() {
        System.out.println("Студент: " + name + ", Курс: " + course + ", Сер. бал: " + averageScore);
    }
}