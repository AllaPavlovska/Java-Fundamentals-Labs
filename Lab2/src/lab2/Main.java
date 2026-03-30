package lab2;

public class Main {
    public static void main(String[] args) {
        Student[] list = new Student[3];
        list[0] = new Student("Олексій", 5);
        list[1] = new DebtorStudent("Марія", 15, 2);
        list[2] = new Student("Іван", 20);

        Journal myJournal = new Journal("ІСТ-21", list);

        myJournal.showAbsentees(10);
    }
}