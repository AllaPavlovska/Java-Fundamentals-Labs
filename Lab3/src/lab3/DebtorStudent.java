package lab3;

public class DebtorStudent extends Student {
    private int debts;

    public DebtorStudent(String name, int absences, int debts) {
        super(name, absences);
        this.debts = debts;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Статус: БОРЖНИК (Боргів: " + debts + ")");
    }
}