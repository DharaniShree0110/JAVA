import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.nextLine().charAt(0);
        char a;
        if(ch>='a' && ch<='z'){
            a = (char)(ch-32);
            System.out.println(a);
        }
        else if(ch>='A' && ch<='Z'){
            a = (char)(ch+32);
            System.out.println(a);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
