import java.util.Scanner;

public class Character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String name1 = sc.nextLine();
        if(name1.length() < 2) {
            System.out.println("Please enter at least 2 characters.");
        }
        char ch1 = name1.charAt(0);
        char ch2 = name1.charAt(1);
        if(ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        }
        else{
            System.out.println(ch1 + "," + ch2);
        }
    }
}
