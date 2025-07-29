import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num+" Positive number");
        }
        else if(num==0){
            System.out.println(num+" Zero");
        }
        else{
            System.out.println(num+" Negative number");
        }
    }
}
