package sortings;

public class palindromicstring {
public static void main(String[] args) {
     String s1="abba";
	      
	 for (int i=0;i<s1.length();i++) {
		 String temp=""+s1.charAt(i);
	 for(int j=i+1; j<s1.length();j++)
	 {
		temp=temp+s1.charAt(j);
		System.out.println(temp);
	   }
     }
   }
  }
