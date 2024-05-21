package splitsplit;
public class DuplicateChar {
public static void main(String[] args) {
    System.out.print("Enter a string: ");
    String a ="AAARRRPPPIIITTT";
    String b ="";
    for (int i=0;i<a.length();i++) {
    char c=a.charAt(i);
       boolean found=false;
        for(int j=0;j<b.length();j++){
        if(b.charAt(j)==c){
          found=true;
             break;
             }
          }
     if(!found){
       b=b+c;
         }
       } 
  System.out.println("Output: "+b);
    }
}




















//public class DuplicateChar{
//public static void main(String[] args) {
//	String a = "helloe";
//	String b = "";
//	for(char c:a.toCharArray()) {
//	if (!b.contains(String.valueOf(c))) {
//	       b=b+c;
//	       }
//	      }
//	System.out.println("Output: " + b);
//	  }
//    }