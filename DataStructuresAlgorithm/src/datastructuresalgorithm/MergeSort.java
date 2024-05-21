package datastructuresalgorithm;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int a[]={3,6,9,2};
        int b[]={1,5,5,7,10,13,14};
        merge(a,b);
    }
    static void merge(int[]a,int[]b){
        int i=0,j=0,c=0;
        int arr[]=new int[a.length+b.length];
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j])
            arr[c++]=a[i++];
            else{
            arr[c++]=b[j++];
            }
        }
        // Add remaining elements
        while(i<a.length)
        arr[c++]=a[i++];
        while(j<b.length)
        arr[c++]=b[j++];
        System.out.println("Merge sorted Array");
        System.out.println(Arrays.toString(arr));
    }
}
