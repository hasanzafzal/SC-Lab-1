import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month Number = ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("\nJanuary");
                break;
            case 2:
                System.out.println("\nFebruary");
                break;
            case 3:
                System.out.println("\nMarch");
                break;
            case 4:
                System.out.println("\nApril");
                break;
            case 5:
                System.out.println("\nMay");
                break;
            case 6:
                System.out.println("\nJune");
                break;
            case 7:
                System.out.println("\nJuly");
                break;
            case 8:
                System.out.println("\nAugust");
                break;
            case 9:
                System.out.println("\nSeptember");
                break;
            case 10:
                System.out.println("\nOctober");
                break;
            case 11:
                System.out.println("\nNovember");
                break;
            case 12:
                System.out.println("\nDecember");
                break;
            default:
                System.out.println("\nInvalid number / month");
        }
        System.out.println("\nProcess completed.");
        sc.close();
    }
}