import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapTwoNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter First Number : ");
        int Num1 = Integer.parseInt(br.readLine());
        System.out.println(" Enter Secound Number : ");
        int Num2 = Integer.parseInt(br.readLine());

        System.out.println("Number withot Swppinig is " + Num1 + " and " + Num2);
        Num2 = Num1 + Num2;
        Num1 = Num2 - Num1;
        Num2 = Num2 - Num1;
        System.out.println("Number After Swppinig is " + Num1 + " and " + Num2);

        br.close();
    }

}
