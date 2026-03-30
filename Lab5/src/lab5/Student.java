package lab5;

public class Student {
    private String name;
    private int absences;

    public Student(String name, int absences) {
        this.name = name;
        this.absences = absences;
    }

    public String getName() {
        return name;
    }

    public int getAbsences() {
        return absences;
    }

    public void addAbsence() {
        this.absences++;
    }

    public void displayInfo() {
        System.out.println("Студент: " + name + ", Пропуски: " + absences);
    }
}