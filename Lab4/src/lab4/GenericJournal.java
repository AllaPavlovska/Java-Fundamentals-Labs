package lab4;

import java.util.ArrayList;
import java.util.List;

public class GenericJournal<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }

    @Override
    public String toString() {
        return "Журнал містить: " + items.size() + " елементів.";
    }
}