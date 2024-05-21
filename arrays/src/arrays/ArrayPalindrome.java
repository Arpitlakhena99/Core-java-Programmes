//package arrays;
//public class ArrayPalindrome {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 2, 1};
//        boolean isPalindrome = true;
//        int i = 0;
//        int j = arr.length - 1;
//        while (i < j) {
//            if (arr[i] != arr[j]) {
//                isPalindrome = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        System.out.println("The array is " + (isPalindrome ? "" : "not ") + "a palindrome.");
//    }
//}

package arrays;
public class ArrayPalindrome {
    public static void main(String[] args) {
        int[]arr={1,2,3,2,1};
        boolean isPalindrome=true;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
            i++;
            j--;
        }
            else {
          	isPalindrome=false;
           	break;
            }
            if(isPalindrome=true)
            {
           	System.out.println("palindrome");
            }
            else
            {
           	System.out.println("not palindrome");
            }     
}
    }
}






























