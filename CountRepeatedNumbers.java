
import java.util.HashMap;

public class CountRepeatedNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 3, 2, 1 };
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int repeatCount = 0;

        // Count frequency of each number
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Count how many numbers appear more than once
        for (int freq : freqMap.values()) {
            if (freq > 1) {
                repeatCount++;
            }
        }

        System.out.println("Count of numbers that appear more than once: " + repeatCount);
    }
}
