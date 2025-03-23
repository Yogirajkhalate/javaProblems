import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class duplicateCharCount {
    public static void main(String[] args) {
        duplicateCharacterCount("Pushg the code on Github");

    }

    public static void duplicateCharacterCount(String str) {

        char[] c = str.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (char d : c) {
            if (m.containsKey(d)) {
                m.put(d, m.get(d) + 1);
            } else {
                m.put(d, 1);
            }
        }
        Set<Character> st = m.keySet();
        for (Character ch : st) {
            if (m.get(ch) > 1 && ch != ' ') {
                System.out.println(ch + " = " + m.get(ch));
            }
        }
    }
}
