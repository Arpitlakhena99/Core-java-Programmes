package sortings;
public class anagram2 {
public static void main(String[] args) {
	  String s = "HellozZ";
      char[] arr = s.toCharArray();

    for(int i=0;i<arr.length;i++){
    char c=arr[i];

	if((c>='A'&&c<'Z')||(c>='a'&&c<'z')) {
	    arr[i]++;
	       }
	 else if(c=='Z') {
	     arr[i]-=25;
	       }
	 else if(c=='z') {
	    arr[i]-=25;
	      }
	    }
	 String res = new String(arr);
	 System.out.println(res);
	  }
}