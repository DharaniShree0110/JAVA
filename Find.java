import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.nextLine().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("Alphabets");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
