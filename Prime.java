import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting number");
        int num1 = sc.nextInt();
        System.out.println("Enter a starting number");
        int num2 = sc.nextInt();
        System.out.println("Prime Number");
        for(int i=num1;i<num2;i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i+"\t");
            }
        }
    }
}