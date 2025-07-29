import java.util.Scanner;
class TwoString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String name1 = sc.nextLine();
        System.out.println("Enter string 2");
        String name2 = sc.nextLine();
        System.out.println(name1+" technologies "+name2);
    }
}