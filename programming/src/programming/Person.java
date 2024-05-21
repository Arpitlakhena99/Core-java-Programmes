package programming;

//properties of person should be name,dob,email,gender,height
//person 1-name,dob,email,gender,float
//person 2-name,dob,email,gender
//person 3-name,dob,gender,height
//person 4-name,dob,gender
//create a method detail to print the details of the person
public class Person {
	String name;
	String dob;
	String email;
	String gender;
	double height;
	
	Person(String n,String dob,String e,String g, double h){
	this.name=n;
	this.dob=dob;
	this.email=e;
	this.gender=g;
	this.height=h;
	}
	Person(String n,String dob,String e,String g)
	{
		this.name=n;
		this.dob=dob;
		this.email=e;
		this.gender=g;
	}
	Person(String n,String dob,String g, double h)
	{
		this.name=n;
		this.dob=dob;
	
		this.gender=g;
		this.height=h;
	}
	Person(String n,String dob,String g)
	{
		this.name=n;
		this.dob=dob;
		this.gender=g;
	}
	
void details() {
	System.out.println("name= "+this.name);
	System.out.println("dob= "+this.dob);
	System.out.println("email= "+this.email);
	System.out.println("gender= "+this.gender);
	System.out.println("height= "+this.height);
	System.out.println(" ");
}
public static void main(String[] args) {
		
Person p1=new Person("ABC","1-JAN-2000","aas@gmail","F",5.7);
Person p2=new Person("A","1-feb-2001","ssa@gamil","f");
Person p3=new Person("A","1-feb-2001","f",4.5);
Person p4=new Person("A","1-feb-2001","f");
	p1.details();
	p2.details();
	p3.details();
	p4.details();
}
}