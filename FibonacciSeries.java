import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int first = 0;
        int secound = 1;
        System.out.println("first " + n + " Fibonacci Series number is ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + secound;
            first = secound;
            secound = next;
        }

    }
}
