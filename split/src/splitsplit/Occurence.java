package splitsplit;
public class Occurence {
public static void main(String[] args) {
	int[] arr1={1,7,4,3,4,8,7};
	int k1=2;
	int result1=-1;
	        for (int i=0;i<arr1.length;i++) {
	            int count=0;
	            for (int j=0;j<=i;j++) {
	            if(arr1[i]==arr1[j]) {
	             count++;
	                }
	            }
	            if (count==k1) {
	                result1=arr1[i];
	                break;
	            }
	        }
	    System.out.println(result1);
	    }
	}