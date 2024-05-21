/**
* "hello hi"
*count the characters in given string and give output like
*space-' '  
*e- 1
*h- 2 
*h- 1
*i- 1
*l- 2
*o- 1
 */
package strings;
public class string23 {
	public static void main(String[] args) {
		String s="BACARDI";
		int  arr[] =new int[128];
		for (int i=0;i<s.length();i++)
		{
		arr[s.charAt(i)]++; 	
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			System.out.println((char)(i)+"-"+arr[i]);
		}
	}
	
	
}

	
