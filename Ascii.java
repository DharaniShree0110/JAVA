import java.util.Scanner;
                            // input 72 101 108 108 111 32 87 111 114 108 100  output Hello World
public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            char abc = (char) a[i];
            System.out.print( abc );
        }
    }
}
