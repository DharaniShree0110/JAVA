import java.util.Scanner;

public class StarPattern {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = temp; k < num; k++) {
                System.out.print("*");
            }
            System.out.println();
            temp--;
        }
    }
}
