package lab4;

import java.util.List;

public class Utils {

    public static <T extends Student> void printHighAbsences(List<T> items, int limit) {
        System.out.println("--- Аналіз через дженерик-метод ---");
        for (T item : items) {
            if (item.getAbsences() > limit) {
                item.displayInfo();
            }
        }
    }

    public static void printListSize(List<?> list) {
        System.out.println("Кількість елементів у списку: " + list.size());
    }
}