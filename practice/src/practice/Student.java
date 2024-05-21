package practice;

public class Student {
String name;
int physics;
int chemistry;
int maths;
int optional;
Student(String n,int p,int c,int m,int o)
{
	this.name=n;
	this.physics=p;
	this.chemistry=c;
	this.maths=m;
	this.optional=o;
}
int total()
{
	return (this.physics+this.chemistry+this.maths+this.optional);
	
}
void percentage()
{
	int x=this.total();
	float perc=x/400f*100f;
	System.out.println("percentage="+perc);
}
void marks()
{
	System.out.println("physics="+this.physics);
	System.out.println("chemistry="+this.chemistry);
	System.out.println("maths="+this.maths);
	System.out.println("optional="+this.optional);
}
void details()
{
	System.out.println("name="+this.name);
	this.marks();
	int total=this.total();
	System.out.println("total="+total);
	this.percentage();
}
public static void main(String []args)
{
	Student S1=new Student("Aayu",87,67,98,67);
	S1.details();
}
}
