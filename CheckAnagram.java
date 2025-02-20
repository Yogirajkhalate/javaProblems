import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

    public static boolean CheckIsAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if (Arrays.equals(s1, s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String1 : ");
        String str1 = sc.next();
        System.out.println("Enter an String2 : ");
        String str2 = sc.next();
        System.out.println(" IsAnagram : " + CheckIsAnagram(str1, str2));

        sc.close();
    }
}
