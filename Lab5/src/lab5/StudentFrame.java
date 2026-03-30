package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentFrame extends JFrame {
    private JTextArea displayArea;
    private JTextField nameInput;
    private ArrayList<Student> students = new ArrayList<>();

    public StudentFrame() {
        setTitle("Система управління студентами — Lab 5");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        nameInput = new JTextField(10);
        JButton addButton = new JButton("Додати студента");
        JButton absenceButton = new JButton("Додати пропуск");

        inputPanel.add(new JLabel("Ім'я:"));
        inputPanel.add(nameInput);
        inputPanel.add(addButton);
        inputPanel.add(absenceButton);
        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameInput.getText();
                if (!name.isEmpty()) {
                    students.add(new Student(name, 0));
                    updateUI();
                    nameInput.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Будь ласка, введіть ім'я!");
                }
            }
        });

        absenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!students.isEmpty()) {
                    students.get(students.size() - 1).addAbsence();
                    updateUI();
                }
            }
        });

        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.append("\n>>> СИСТЕМА: Перевірка стану журналів...\n");
                Toolkit.getDefaultToolkit().beep();
            }
        });
        timer.start();
    }

    private void updateUI() {
        displayArea.setText("--- Поточний список студентів ---\n");
        for (Student s : students) {
            displayArea.append(s.getName() + " | Пропуски: " + s.getAbsences() + "\n");
        }
    }
}