import java.util.Scanner;

class reverseStrCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String x = sc.nextLine();
        String rev = "";
        char ch;
        for (int i = x.length() - 1; i >= 0; i--) {
            ch = x.charAt(i);
            rev = rev + ch;
        }
        System.out.println("revese of the string is : " + rev);
    }
}
