package LearningArray;
import java.util.HashMap;
import java.util.Map;
public class demo5 {
    public static void main(String[] args) {
        int[] arr= {20, 12, 23, 12, 20, 1, 12, 34};
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int value:arr) {
            occurrenceMap.put(value,occurrenceMap.getOrDefault(value,0)+1);
        }
        System.out.println("Occurrence of array values:");
        for (Map.Entry<Integer,Integer>entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
