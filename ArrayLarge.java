import java.util.Scanner;

public class ArrayLarge {
    public void sorting(int n, int[] a){
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Arry is ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public void large(int n, int m, int[] a){
        int z = n-m;
        System.out.println(a[z]);
    }
    public void small(int o, int[] a){
        int z = o-1;
        System.out.println(a[z]);
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
        ArrayLarge obj = new ArrayLarge();
        obj.sorting(n, a);
        System.out.println("enter which largest number you want");
        int m = sc.nextInt();
        obj.large(n, m, a);
        System.out.println("enter which smallest number you want");
        int o = sc.nextInt();
        obj.small(o,a);
    }
}
