package workspace;                                  

public class demo8 {
	private String name;
	private int Age;
	public demo8(String name, int Age) {
	
		this.name = name;
		this.Age = Age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public static void main(String[] args) {
		demo8 d1 =new demo8("suraj",48);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
	} 

}
