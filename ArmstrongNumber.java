import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();
        int temp = num;
        int arm = 0;
        while (temp > 0) {
            int a = temp % 10;
            arm = arm + a * a * a;
            temp = temp / 10;
        }
        if (num == arm) {
            System.out.println("Number " + num + "  is Armstrong Number");
        } else {
            System.out.println("Number " + num + "  is Not  Armstrong Number");
        }

        scanner.close();
    }

}
