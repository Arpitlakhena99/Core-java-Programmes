package sortings;
public class bubblesort2{
public static void main(String[] args) {
    String input= "wehvsbaahjk";
    char[] arr=input.toCharArray();
	 for(int i=0;i<arr.length-1;i++) {
	 for(int j=0;j<arr.length-i-1;j++) {
	   if(arr[j]>arr[j+1]) 
	     {
	     char temp=arr[j];
	     arr[j]=arr[j+1];
	     arr[j+1]=temp;
	        }
	      }
	    }
   System.out.print("Sorted Output: ");
   for (char c:arr){
   System.out.print(c);
	     }
	 }
  }
	