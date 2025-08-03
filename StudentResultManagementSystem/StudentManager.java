import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            System.out.println("\n--- Student Result Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Results");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayAllResults();
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 3);
    }

    private void addStudent() {
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        students.add(new Student(name, roll, marks));
        System.out.println("Student added successfully.");
    }

    private void displayAllResults() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            for (Student s : students) {
                System.out.println("------------------------");
                s.displayResult();
            }
        }
    }
}
