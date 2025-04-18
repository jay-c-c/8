public class Student {

        private final String name;
        private final int prn;
        private final String branch;
        private final float cgpa;

        public Student(String name, int prn, float cgpa, String branch)
                throws InvalidPRNException, InvalidCGPAException, EmptyFieldException, NullFieldException {

            if (name == null || branch == null) {
                throw new NullFieldException("Name or Branch cannot be null.");
            }
            if (name.trim().isEmpty() || branch.trim().isEmpty()) {
                throw new EmptyFieldException("Name or Branch cannot be empty.");
            }
            if (prn <= 0) {
                throw new InvalidPRNException("PRN must be a positive number.");
            }
            if (cgpa < 0.0 || cgpa > 10.0) {
                throw new InvalidCGPAException("CGPA must be between 0.0 and 10.0.");
            }

            this.name = name;
            this.prn = prn;
            this.cgpa = cgpa;
            this.branch = branch;
        }



    public int getPRN() {
        return this.prn;
    }

    // ✅ Public getter for Name
    public String getName() {
        return this.name;
    }

    // You may already have these
    public String getBranch() {
        return branch;
    }

    public float getCGPA() {
        return cgpa;
    }

    public void display() {
        System.out.println("Name : " + name + "\nPRN : " + prn + "\nCGPA: " + cgpa + "\nBranch: " + branch);
    }

    // Getters and setters


}
