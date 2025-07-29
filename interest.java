import java.util.Scanner;

public class interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Female is 1 or Male is 2");
        int num = sc.nextInt();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(num == 1){
            if(age>=1 && age<=58){
                System.out.println("The percentage of interest is 8.2% ");
            }
            if(age>=59 && age<=100){
                System.out.println("The percentage of interest is 9.2% ");
            }
        }
        else if(num == 2){
            if(age>=1 && age<=58){
                System.out.println("The percentage of interest is 8.4% ");
            }
            if(age>=59 && age<=100){
                System.out.println("The percentage of interest is 10.5% ");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
