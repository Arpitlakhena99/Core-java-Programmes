package splitsplit;
public class OnlyDuplicate {
public static void main(String[] args) {
	 String s="helllo";
	 Dc(s);
	    }
    public static void Dc(String s) {
	    int[] c=new int[256];
	   for(int i=0;i<s.length();i++) {
	   c[s.charAt(i)]++;
	       }
	    for(int i=0;i<c.length;i++) {
	    if(c[i]>1){
	    System.out.println((char)i+"-"+c[i]);
	       }
	     }
	  }
  }
