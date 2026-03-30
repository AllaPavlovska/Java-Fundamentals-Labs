package lab3;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMap {
    private Map<Integer, Student> studentMap;

    public StudentMap(Map<Integer, Student> map) {
        this.studentMap = map;
    }

    public Map<Integer, Student> filterDebtors() {
        return studentMap.entrySet().stream()
                .filter(e -> e.getValue() instanceof DebtorStudent)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void removeByAbsences(int limit) {
        studentMap.entrySet().removeIf(e -> e.getValue().getAbsences() > limit);
    }

    public int getTotalAbsences() {
        return studentMap.values().stream()
                .map(Student::getAbsences)
                .reduce(0, Integer::sum);
    }
}