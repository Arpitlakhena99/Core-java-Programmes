package strings;

public class string3 {
	public static void main(String[] args) {
	 String s = "Hello, World!";
	  int vowelCount = 0;
	 for (int i = 0; i < s.length(); i++) {
	  char c = Character.toLowerCase(s.charAt(i));
  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
	    {
    vowelCount++;
        }
	    }
  System.out.println("Number of vowels in the given string: " + vowelCount);
	   }
}
