package sortings;

public class bubblesort1 {
	public static void main(String[] args) {
		int [] arr= {1,3,4,2,5,4};
		for(int i=0;i<arr.length;i++)
		 {
	    for(int j=i+1;j<arr.length;j++)
	      {
		if(arr[i]>arr[j])
				{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		 }
	   }
     }
  for(int ele:arr)
	{
   System.out.println(ele+ " ");
	}
   }
 }
 /**
  * hello this program is basically for sorting of the array which is used to find the sortest
  element in the array....!
  */