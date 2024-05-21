package programming;

public class bean {
    private int id;
    private String name;
    private double salary;
    // Constructor with parameters
     bean(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // Getter methods
    public int getid() {
        return id;
    }
    public String getname() {
        return name;
    }
    public double getsalary() {
        return salary;
    }
    // Setter methods
    public void setid(int id) {
        this.id = id;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setsalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        // Creating an instance of the bean class
        bean e1 = new bean(1, "John Doe", 50000);
        // Accessing and printing initial details
        System.out.println(e1.getid());
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());
        // Setting and printing updated salary
        e1.setsalary(95000);
        System.out.println(e1.getsalary());
    }
}

