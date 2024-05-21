package strings;
public class string14 {
public static void main(String[] args) {
	String s = "abghabrtaba";
	int count=0;
	for(int i=0;i<s.length()-1;i++)
	{
	if(s.charAt(i)=='a' && s.charAt(i+1)=='b')
	{
		count++;
	}
	}
	System.out.println(count);
}
}

//public class string14 {
//public static void main(String[] args) {
//	String s = "abghabrtaba";
//    String Count = "ab";
//	  int count = 0;
//	    
//	  for (int i = 0; i < s.length() - 1; i++) 
//	  {
//	  if (s.substring(i, i + 2).equals(Count)) {
//	     count++;
//	      }
//	   }
//	  
// System.out.println(count );
//	     }
//	   }
