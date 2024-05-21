package arrays;
public class happygroup {

	    public static void main(String[] args) {
	      
	        int [] arr= {4,3,2,1,15,2,3};
	        int max = arr[0];
	        int sum = 0;

	        for (int i = 0; i <arr.length; i++) {
	            if (max<arr[i]) {
	            	max=arr[i];
	            }
	            }
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(arr[i]!=max)
	        	{
	        		sum=sum+arr[i];
	        		
	        	}
	        	
	        }
	        System.out.println(sum==max?"happy group":"unhappy group"); 
	    }
}
