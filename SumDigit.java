import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        int sum = 0;
        for(;num!=0;){
            temp = num%10;
            num = num/10;
            sum += temp;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
