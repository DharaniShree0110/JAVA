import java.util.Scanner;

public class ArrayMaxMin {
    public void Max(int n, int[] a) {
        int temp = a[0];
        for(int i=1;i<n;i++){
            if(temp<a[i]){
                temp = a[i];
            }
        }
        System.out.println("the max value of array is  "+ temp);
    }
    public void Min(int n, int[] a) {
        int temp = a[0];
        for(int i=1;i<n;i++){
            if(temp>a[i]){
                temp = a[i];
            }
        }
        System.out.println("the min value of array is  "+ temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayMaxMin m = new ArrayMaxMin();
        m.Max(n, a);
        m.Min(n, a);
    }
}

