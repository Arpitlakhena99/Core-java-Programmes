//package strings;

//public class string22 {
//public static void main(String[] args) {
//     String s = "Darshan  sir   is   a  good   Faculty....!";
//     char[] arr = s.toCharArray();
//     String result = "";
//     boolean isSpace = false;
//     
//     
//     for (char c : arr) {
//     if (c == ' ') 
//     {
//     if (!isSpace) {
//     result += c;
//     isSpace = true;
//        }
//      }
//    else {
//    result += c;
//    isSpace = false;
//     }
//   }
//     System.out.println(result);
//    }
//
//    }
package strings;
public class string22
{
	public static void main(String[] args) {
		
		String s="PAPA    KI   PARI";
		String s1="";
		for (int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				continue;
			}
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}































