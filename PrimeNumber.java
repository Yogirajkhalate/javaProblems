import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int Num = sc.nextInt();

        if (Num <= 1) {
            System.out.println(Num + " is Not a prime Number..");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Num; i++) {
                if (Num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(Num + " is prime Number..");
            } else {
                System.out.println(Num + " is Not a prime Number..");
            }

        }

        sc.close();
    }

}