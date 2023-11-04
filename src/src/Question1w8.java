import java.util.Scanner;

public class Question1w8 {
    /*1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = sc.nextInt();

        String answer = (number % 2 == 0) ? "even" : "odd";

        System.out.println("The number you entered is "+ answer);

    }

}
