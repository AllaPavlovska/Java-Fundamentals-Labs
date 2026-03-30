package lab2;

public class Journal {
    private String groupName;
    private Student[] students;

    public static class Header {
        public void print(String name) {
            System.out.println("======= ЖУРНАЛ ГРУПИ " + name + " =======");
        }
    }

    public Journal(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public void showAbsentees(int limit) {
        Header header = new Header();
        header.print(groupName);

        System.out.println("Пошук студентів з пропусками > " + limit);
        for (Student s : students) {
            if (s.getAbsences() > limit) {
                s.displayInfo();
            }
        }
    }
}