import java.util.Scanner;

public class Question19w8 {
    /*19.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int answer = sc.nextInt();
        if (answer < 0){
            System.out.println("Number entered is a negative number");
        }else if (answer > 0){
            System.out.println("Number entered is a positive number");
        }else if (answer == 0){
            System.out.println("Number entered is a zero");
        }else {System.out.println("You did not enter a number");

    }

}}
