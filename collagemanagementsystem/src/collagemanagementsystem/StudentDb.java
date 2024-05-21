package collagemanagementsystem;

/**
 * Represents the database for managing student records.
 */
public class StudentDb{
    private Student[] students;
    private int index;

    /**
     * Constructor to initialize the student database with a specified size.
     *
     * @param size Size of the student database.
     */
    public StudentDb(int size) {
        students = new Student[size];
        index = 0;
    }

    /**
     * Adds a student to the database.
     *
     * @param student Student object to be added.
     * @return True if the student is added successfully, false otherwise.
     */
    public boolean addStudent(Student student) {
        if (index < students.length) {
            students[index++] = student;
            System.out.println("Student details added to the database.");
            return true;
        } else {
            System.out.println("Database is full. Cannot add more students.");
            return false;
        }
    }

    /**
     * Displays details of all students in the database.
     */
    public void viewFullDatabase() {
        System.out.println("------------------------------------------------------");
        System.out.println("ID\tName\tAge\tCourse\tGPA\tDepartment\tCollege");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getId() + "\t" + student.getName() + "\t" +
                        student.getAge() + "\t" + student.getCourse() + "\t" +
                        student.getGpa() + "\t" + student.getDepartment() + "\t" +
                        student.getCollegeName());
            }
        }
    }

    /**
     * Returns the total number of students in the database.
     *
     * @return Total number of students.
     */
    public int getStudentCount() {
        return index;
    }

    /**
     * Searches for a student in the database based on the provided ID.
     *
     * @param id ID of the student to be searched.
     * @return Found student object or null if not found.
     */
    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                System.out.println("Student found in the database.");
                return student;
            }
        }
        System.out.println("Student not found in the database.");
        return null;
    }

    /**
     * Updates the GPA of a student in the database.
     *
     * @param id     ID of the student whose GPA is to be updated.
     * @param amount Amount to be added to the current GPA.
     * @return True if GPA is updated successfully, false otherwise.
     */
    public boolean updateStudentGPA(int id, double amount) {
        Student student = searchStudent(id);
        if (student != null) {
            student.setGpa(student.getGpa() + amount);
            System.out.println("GPA updated successfully.");
            return true;
        } else {
            System.out.println("Unable to update GPA. Check the student ID.");
            return false;
        }
    }

    /**
     * Deletes a student from the database based on the provided ID.
     *
     * @param id ID of the student to be deleted.
     * @return True if the student is deleted successfully, false otherwise.
     */
    public boolean deleteStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                System.out.println("Student found in the database and deleted.");
                students[i] = null;
                return true;
            }
        }
        System.out.println("Student not found in the database. Deletion failed.");
        return false;
    }
}
