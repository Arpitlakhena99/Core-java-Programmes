package LearningArray;
import java.util.ArrayList;
public class MainClass3 {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Student st1=new Student(123,"Bheem",68.67);
		Student st2=new Student(342,"Chutki",68.67);
		Student st3=new Student(232,"Kalia",68.67);
		Student st4=new Student(111,"Dolu",68.67);
		Student st5=new Student(343,"Bolu",68.67);
		
		ArrayList<Student> stList=new ArrayList<Student>();
		
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		stList.add(st4);
		stList.add(st5);
		System.out.println("total students :"+stList.size());
		System.out.println(stList);
		
		System.out.println("Student list");
		System.out.println("--------------------------------");
		System.out.println("RollNo\tName\t,Marks");
		System.out.println("--------------------------------");
//		for(Student st:stList) {
//			System.out.println(st.getRollno()+"\t"+st.getName()+"\t"+st.getMarks());
//		}
		for(int i=0;i<stList.size();i++)
		{
			Student st=stList.get(i);
			System.out.println(st.getRollno()+"\t"+st.getName()+"\t"+st.getMarks());
		}
		System.out.println("upate marks of kalia ?");
		for(Student st:stList)
		{
			if(st.getName().equalsIgnoreCase("kalia"))
{
	st.setMarks(70.00);
}
		}
		System.out.println("--------------------------------");
		System.out.println("RollNo\tName\tMarks");
		System.out.println("--------------------------------");
		
		System.out.println("main method ended");
		for(Student st:stList) {
			System.out.println(st.getRollno()+"\t"+st.getName()+"\t"+st.getMarks());
		} 

	}

}