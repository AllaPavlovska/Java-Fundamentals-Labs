package lab3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Олексій", 5));
        list.add(new DebtorStudent("Марія", 15, 2));
        list.add(new Student("Іван", 20));

        // Тест Collection
        StudentCollection col = new StudentCollection(list);
        System.out.println("Середня к-сть пропусків: " + col.getAverageAbsences());

        // Тест Map
        Map<Integer, Student> mapData = new HashMap<>();
        mapData.put(101, list.get(0));
        mapData.put(102, list.get(1));

        StudentMap smap = new StudentMap(mapData);
        System.out.println("Загальна сума пропусків (Map): " + smap.getTotalAbsences());
    }
}