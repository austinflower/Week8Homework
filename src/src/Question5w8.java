import java.util.Scanner;

public class Question5w8 {
    /*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Student name");
        String studentname = sc.next();
        System.out.println("enter roll no");
        int rollno = sc.nextInt();

        System.out.println("Math marks");
        int mathmarks = sc.nextInt();

        System.out.println("Science marks");
        int Sciencemarks = sc.nextInt();

        System.out.println("English marks");
        int Englishmarks = sc.nextInt();

        if (mathmarks < 0 || mathmarks > 100 || Sciencemarks < 0 || Sciencemarks > 100 || Englishmarks < 0 || Englishmarks > 100) {
            System.out.println("InvalidInput, Marks should between 0 to 100");
        } else {
            int totalavg = mathmarks + Sciencemarks + Englishmarks;
            double avg = (totalavg / 3.0);
        }
    }
}