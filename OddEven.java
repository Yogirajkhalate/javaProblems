import java.util.*;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println(" This is Zero");
        } else if (a % 2 == 0) {
            System.out.println(a + " is an even number ");
        } else {
            System.out.println(a + " is  an odd number.");
        }
        sc.close();
    }
}
