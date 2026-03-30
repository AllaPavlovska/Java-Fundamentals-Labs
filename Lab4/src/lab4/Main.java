package lab4;

public class Main {
    public static void main(String[] args) {
        GenericJournal<Student> studentJournal = new GenericJournal<>();
        studentJournal.add(new Student("Олексій", 5));
        studentJournal.add(new DebtorStudent("Марія", 15, 2));
        GenericJournal<String> noteJournal = new GenericJournal<>();
        noteJournal.add("Замітка: перевірити лаби");

        System.out.println(studentJournal);
        System.out.println(noteJournal);

        Utils.printHighAbsences(studentJournal.getAll(), 10);
        Utils.printListSize(studentJournal.getAll());
    }
}