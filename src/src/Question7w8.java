import java.util.Scanner;
/*Write a java program to input any number and find out if it’s odd or even.*/
public class Question7w8 {

    public static void main (String [] args){
        Scanner sc = new Scanner((System.in));
        System.out.println(("Please enter a number: "));
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is an even number.");}
        else {
            System.out.println(number + " is an odd number.");
        }

    }

}
