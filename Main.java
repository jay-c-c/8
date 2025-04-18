import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        StudentOperations operations = new StudentOperations();

        while (check) {
            try {
                System.out.println("Enter name: ");
                String name = scan.nextLine();

                System.out.println("Enter PRN: ");
                int prn = scan.nextInt();
                scan.nextLine();

                System.out.println("Enter Branch: ");
                String branch = scan.nextLine();

                System.out.println("Enter CGPA: ");
                float cgpa = scan.nextFloat();
                scan.nextLine();

                Student student = new Student(name, prn, cgpa, branch);
                operations.addStudents(student);

            } catch (InvalidPRNException | InvalidCGPAException |
                     EmptyFieldException | NullFieldException |
                     DuplicatePRNException | MaxCapacityReachedException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input type.");
                scan.nextLine(); // clear buffer
                continue;
            }

            System.out.println("Do you want to add another student (true/false)? ");
            if (scan.hasNextBoolean()) {
                check = scan.nextBoolean();
                scan.nextLine();
            } else {
                System.out.println("Invalid input. Exiting.");
                break;
            }
        }

        try {
            System.out.println("\n--- Student Records ---");
            operations.displayStudent();
        } catch (NoStudentsFoundException | StudentDataCorruptedException e) {
            System.out.println("Display Error: " + e.getMessage());
        }
    }
}
