package collagemanagementsystem;
/**
 * Handles the creation of student objects.
 */
public class StudentCreation {
    /**
     * Creates a new student object with auto-generated ID.
     *
     * @param name         Name of the student.
     * @param age          Age of the student.
     * @param course       Course enrolled by the student.
     * @param pa          Grade Point Average of the student.
     * @param department   Department of the student.
     * @param collegeName  Name of the college.
     * @return Newly created student object.
     */
    public Student createStudent(String name, int age, String course, double gpa, String department, String collegeName) {
        return new Student(name, age, course, gpa, department, collegeName);
    }
  }