package collagemanagementsystem;

public class MainCollage {
    public static void main(String[] args) {
        // Creating instances of classes
        StudentCreation studentCreation = new StudentCreation();
        StudentDb studentDB = new StudentDb(10);

        // Adding students to the database
        Student student1 = studentCreation.createStudent("Arpit", 20, "Computer Science", 3.5, "CS Department", "XYZ College");
        Student student2 = studentCreation.createStudent("Mouneesh", 21, "Physics", 3.2, "Physics Department", "XYZ College");

        studentDB.addStudent(student1);
        studentDB.addStudent(student2);

        // Viewing the student database
        System.out.println("Total students: " + studentDB.getStudentCount());
        studentDB.viewFullDatabase();

        // Searching for a student
        Student foundStudent = studentDB.searchStudent(student1.getId());
        if (foundStudent != null) {
            System.out.println("Found Student: " + foundStudent.getName());
        }

        // Updating student information
        studentDB.updateStudentGPA(student2.getId(), 3.8);
        studentDB.viewFullDatabase();

        // Deleting a student
        studentDB.deleteStudent(student1.getId());
        studentDB.viewFullDatabase();
        System.out.println("Total students: " + studentDB.getStudentCount());
    }
}
