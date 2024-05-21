package arrays;
//example for linear search
public class arrayindex {
    public static void main(String[] args) {
      int[] array = {43, 4, 5, 1, 2, 8,25};
      int key = 1;
      int index = -1; 
        for (int i = 0; i < array.length; i++) {
           if (array[i] == key) {
              index = i;
               break;
            }
        }
     if (index !=-1) {
         System.out.println("The index position of " + key + " is: " + index);
        } else
        {
           System.out.println(key + " is not present in the array.");
        }
    }
}