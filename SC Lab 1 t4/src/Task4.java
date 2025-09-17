import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numerical score (0-100): ");
        int score = input.nextInt();

        char letterGrade;

        if (score >= 90)
        {
            letterGrade = 'A';
        }
        else if (score >= 70)
        {
            letterGrade = 'B';
        }
        else if (score >= 50)
        {
            letterGrade = 'C';
        }
        else
        {
            letterGrade = 'F';
        }

        System.out.println("Score: " + score);
        System.out.println("Letter Grade: " + letterGrade);

        input.close();
    }
}
