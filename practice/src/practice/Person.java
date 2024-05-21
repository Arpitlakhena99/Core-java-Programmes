package practice;

public class Person {
String name,dob,email,gender;
int age;
Person(String name,String dob,String email,String gender,int age){
	this.name=name;
	this.dob=dob;
	this.email=email;
	this.gender=gender;
	this.age=age;
}
Person(String name,String dob,String email,String gender){
	this.name=name;
	this.dob=dob;
	this.email=email;
	this.gender=gender;
}
Person(String name,String email,String gender){
	this.name=name;
	this.email=email;
	this.gender=gender;

}
void details() {
System.out.println("name="+this.name);
System.out.println("dob="+this.dob);
System.out.println("email="+this.email);
System.out.println("gender="+this.gender);
}
public static void main(String[] args) {
	Person P1 = new Person("RAM","12may","abc@123","M",22);
	P1.details();
	Person P2 = new Person("RIA","11may","abc@123","F",22);
	P1.details();
	Person P3 = new Person("RAJ","10may","abc@123","M",22);
	P1.details();
	P2.details();
	P3.details();

}}
