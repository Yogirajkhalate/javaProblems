import java.util.Scanner;

class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element : ");
        int a = sc.nextInt();
        int sum = 0;
        while (a > 0) {
            int b = a % 10;
            sum = sum + b;
            a = a / 10;

        }

        System.out.println("Sum of the NUmber is :" + sum);
        sc.close();
    }
}
