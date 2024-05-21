package Array2d;
public class Rotate90Degree {
public static void main(String[] args) {
	 int[][] arr={{1, 2, 3},{4, 5, 6},{7,8,9}};
	 int n=arr.length;
	 //Transpose the matrix
	for(int i = 0;i<n;i++){
	for(int j = i+1;j<n;j++){
	int temp  = arr[i][j];
	arr[i][j] = arr[j][i];
	arr[j][i] = temp;
	   }
     }
	//Reverse each row
	for(int i=0;i<n;i++){
	for(int j=0;j<n/2;j++){
	 int temp=arr[i][j];
	 arr[i][j]=arr[i][n-1-j];
	 arr[i][n-1-j]=temp;
	     }
	   }
	 //Print the rotated matrix
	 for(int i=0;i<n;i++){
	 for(int j=0;j<n;j++){
	 System.out.print(arr[i][j]+" ");
	     }
	 System.out.println();
	   }
	 }
  }
