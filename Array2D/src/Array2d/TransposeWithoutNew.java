package Array2d;

public class TransposeWithoutNew {
 public static void main(String args[]){  
	int arr[][]={{1,2,3},{4,5,6},{7,8,9}};    
			    
    for(int i=0;i<arr.length;i++){    
	for(int j=0;j<arr[i].length;j++){  
	  System.out.print(arr[i][j]+" ");
	    }  
	  System.out.println();
		  }      
	  System.out.println("=====================================");  
		for(int i=0;i<arr.length;i++){    
		for(int j=0;j<arr[i].length;j++){    
		 int temp=i;
		 int a=i;
		 int b=j;
		 a=b;
		 b=temp;
		 System.out.print(arr[a][b]+" ");
		   }    
		 System.out.println();	
			}    
		}
	 } 
