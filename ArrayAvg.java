import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.println("Enter a value of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int avg = sum/n;
        System.out.println("The sum of values : " + sum + "\n" + "The avg of the value is : " +avg);
    }
}
