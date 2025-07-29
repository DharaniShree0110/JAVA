import java.util.Scanner;

public class ArrayDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter values:");
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int unique = 0;
        for(int i=0;i<n;i++){
            boolean abc = true;
            for(int j=0;j<unique;j++){
                if(a[i] == b[j]){
                    abc = false;
                    break;
                }
            }
            if(abc == true){
                b[unique] = a[i];
                unique++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < unique; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
