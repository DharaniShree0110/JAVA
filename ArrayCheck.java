import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int count = 0;
        int[] a = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter finding element : ");
        int find = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            if(find == a[i]){
                System.out.println("The value "+find+" is occured in index " + i);
                count++;
            }
        }
        if(count == 0){
            System.out.println("-1");
        }
    }
}
