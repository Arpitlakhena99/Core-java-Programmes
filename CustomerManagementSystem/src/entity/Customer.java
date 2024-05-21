package entity;
public class Customer {
     String name;
     long phoneNumber;
     int age;
     String email;
     address a;
    public Customer(String name, long phoneNumber, int age, String email, address a) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
        this.a= a;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address=" + a+
                '}';
    }
}