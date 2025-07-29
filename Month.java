import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month number");
        int months = sc.nextInt();
        switch (months) {
            case 1: {
                System.out.println("JANUARY");
                System.out.println("31");
                break;
            }
            case 2: {
                System.out.println("FEBURARY");
                System.out.println("28 OR 29");
                break;
            }
            case 3: {
                System.out.println("MARCH");
                System.out.println("31");
                break;
            }
            case 4: {
                System.out.println("APRIL");
                System.out.println("30");
                break;
            }
            case 5: {
                System.out.println("MAY");
                System.out.println("31");
                break;
            }
            case 6: {
                System.out.println("JUNE");
                System.out.println("30");
                break;
            }
            case 7: {
                System.out.println("JULY");
                System.out.println("31");
                break;
            }
            case 8: {
                System.out.println("AUGUST");
                System.out.println("31");
                break;
            }
            case 9: {
                System.out.println("SEPTEMBER");
                System.out.println("30");
                break;
            }
            case 10: {
                System.out.println("OCTOBER");
                System.out.println("31");
                break;
            }
            case 11: {
                System.out.println("NOVEMBER");
                System.out.println("30");
                break;
            }
            case 12: {
                System.out.println("DECEMBER");
                System.out.println("31");
                break;
            }
            default: {
                System.out.println("INVALID");
            }
        }
    }
}

