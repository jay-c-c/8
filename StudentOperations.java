import java.util.*;

public class StudentOperations {

        private final ArrayList<Student> students;

    public StudentOperations() {
            this.students = new ArrayList<>();
        }

        public void addStudents(Student student)
                throws DuplicatePRNException, MaxCapacityReachedException {

            int MAX_CAPACITY = 100;
            if (students.size() >= MAX_CAPACITY) {
                throw new MaxCapacityReachedException("Maximum student capacity reached.");
            }

            for (Student s : students) {
                if (s.getPRN() == student.getPRN()) {
                    throw new DuplicatePRNException("A student with this PRN already exists.");
                }
            }
            students.add(student);
            System.out.println("Student added.");
        }

        public void displayStudent()
                throws NoStudentsFoundException, StudentDataCorruptedException {

            if (students.isEmpty()) {
                throw new NoStudentsFoundException("No students to display.");
            }

            for (Student s : students) {
                if (s.getName() == null || s.getBranch() == null) {
                    throw new StudentDataCorruptedException("Student record is corrupted.");
                }
                s.display();
            }
        }


}
