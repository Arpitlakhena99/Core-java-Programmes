package sortings;
import java.util.Arrays;
public class Mergesrot{
public static void main(String[] args) {
        int a[]={3,6,9};
        int b[]={1,5,7};
        int c[]={2,10,14};
        mergeThreeSortedArrays(a, b, c);
    }
    static void mergeThreeSortedArrays(int[]a, int[]b, int[]c){
        int aLen=a.length,bLen=b.length,cLen=c.length;
        int i=0,j=0,k=0;
   
        int mergedArray[]=new int[aLen+bLen+cLen];
        while (i<aLen&&j<bLen&&k<cLen){
        if(a[i]<=b[j]&&a[i]<=c[k])
        mergedArray[k+j+i]=a[i++];
        
        else if(b[j]<=a[i]&&b[j]<=c[k])
        mergedArray[k+j+i]=b[j++];
        else
        mergedArray[k+j+i]=c[k++];
        }
        //Add remaining elements in array 'a'
        while(i<aLen)
        mergedArray[k+j+i]=a[i++];
        
        //Add remaining elements in array 'b'
        while (j<bLen)
        mergedArray[k+j+i]=b[j++];

        //Add remaining elements in array 'c'
        while (k<cLen)
        mergedArray[k+j+i]=c[k++];

        System.out.println("Merge sorted Array");
        System.out.println(Arrays.toString(mergedArray));
    }
}