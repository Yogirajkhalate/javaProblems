
import java.util.*;

public class RemoveVovels {
    public static void main(String[] args) {
        String input = "abcdfs";
        String modified = input.replaceAll("[aeiouAEIOU]", ""); // Remove vowels

        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < modified.length(); i++) {
            for (int j = i + 1; j <= modified.length(); j++) {
                substrings.add(modified.substring(i, j));
            }
        }

        System.out.println(substrings);
    }
}
