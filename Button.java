import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: R,G,O,Y AND W ");
        char ch = sc.nextLine().charAt(0);
        switch(ch){
            case 'R':
            case 'r':{
                System.out.println("Red");
                break;
            }
            case 'G':
            case 'g':{
                System.out.println("Green");
                break;
            }
            case 'O':
            case 'o':{
                System.out.println("Orange");
                break;
            }
            case 'Y':
            case 'y':{
                System.out.println("Yellow");
                break;
            }
            case 'W':
            case 'w':{
                System.out.println("White");
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }
    }
}
