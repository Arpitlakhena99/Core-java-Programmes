package collagemanagementsystem;
/**
 * Represents a student entity in the College Management System.
 */
public class Student {
    private final int id;
    private String name;
    private int age;
    private String course;
    private double gpa;
    private String department;
    private String collegeName;

    /**
     * Constructor to initialize a student object with auto-generated ID.
     *
     * @param name         Name of the student.
     * @param age          Age of the student.
     * @param course       Course enrolled by the student.
     * @param gpa          Grade Point Average of the student.
     * @param department   Department of the student.
     * @param collegeName  Name of the college.
     */
    public Student(String name, int age, String course, double gpa, String department, String collegeName) {
        this.id = generateStudentId();
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
        this.department = department;
        this.collegeName = collegeName;
    }



    
    public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}




	public double getGpa() {
		return gpa;
	}




	public void setGpa(double gpa) {
		this.gpa = gpa;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public String getCollegeName() {
		return collegeName;
	}




	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}




	public int getId() {
		return id;
	}




	/**
     * Generates an auto-incremented student ID.
     *
     * @return Auto-generated student ID.
     */
    private static int generateStudentId() {
        return (int) (Math.random() * 9000) + 1000; // Simple random number generation for demo purposes.
    }
}
