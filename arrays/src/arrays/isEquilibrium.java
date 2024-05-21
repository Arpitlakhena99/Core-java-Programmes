package arrays;
public class isEquilibrium {
    public static void main(String[] args) {
     int []arr= {1,2,3,4,5,6};
     int m=(arr.length)/2;
     int left=0;
     int right=0;
     for(int i=0;i<arr.length;i++)
     {
		if(i<=m)
		{
			left =left+arr[i];
		}
		else
    	 {
    		right=right+arr[i];
    	 }
		
     }
     System.out.println(left+" "+right);
    }
}
