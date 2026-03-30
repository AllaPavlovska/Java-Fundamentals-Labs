package lab3;

import java.util.*;

public class StudentCollection {
    private List<Student> students;

    public StudentCollection(List<Student> students) {
        this.students = students;
    }

    public Optional<Student> findByName(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public Set<Student> getUniqueStudents() {
        return new HashSet<>(students);
    }

    public double getAverageAbsences() {
        return students.stream()
                .mapToInt(Student::getAbsences)
                .average()
                .orElse(0.0);
    }

    public void sortByName() {
        // 1. Анонімний клас
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        students.sort(Comparator.comparing(Student::getName));
    }
}