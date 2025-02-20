import java.util.Scanner;

public class reverseString {
    public static String reverse(String st) {
        if (st == null) {
            return null;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = st.length() - 1; i >= 0; i--) {
            sb.append(st.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String : ");
        String str = sc.next();

        String newStr = reverse(str);
        System.out.println("Reverse string of " + str + "  is  : " + newStr);
        sc.close();
    }
}
