package chapter2;
import java.util.*;
public class SumofFirstnnaturalnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("The sum is: " + sum);
    }
}
