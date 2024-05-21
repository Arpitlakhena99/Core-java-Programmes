package Array2d;
public class TransposeMatrix {
   public static void main(String args[]){  
    
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};    
		//creating another matrix to store transpose of a matrix  
		int NewMatrix[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//Code to transpose a matrix  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		NewMatrix[i][j]=arr[j][i];  
		}    
		}    
		  
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(arr[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		System.out.println("=====================================");
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(NewMatrix[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}
   } 
