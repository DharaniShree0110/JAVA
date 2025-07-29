import java.util.Scanner;

public class SimpleForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting number");
        int num1 = sc.nextInt();
        System.out.println("Enter a ending number");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
