import java.util.Scanner;

public class MWQuestion8w8 {
    /*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

    public static void main(String []args){
        Scanner classesheld = new Scanner(System.in);
        System.out.println("Enter number of classes held");
        int number = classesheld.nextInt();
        System.out.println("Enter number of classes attended");
        int attended = classesheld.nextInt();
        MWQuestion8w8.exam(number, attended);
    }

    public static void exam (int x, int y){
        double classattended = (double) y / x * 100;
        System.out.println("The percentage of class attended: "+classattended+" %");
        if ( classattended > 75){
            System.out.println("You are allowed to sit in the exam");
        } else {
            System.out.println("You are NOT allowed to sit in the exam");
        }

    }

}
