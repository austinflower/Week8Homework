import java.util.Scanner;

public class MWQuestion10w8 {
    /*Write a program to print the sum of two numbers entered by user by defining your
own method.*/


    public static void main(String []args){
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sum.nextInt();
        System.out.println("Enter second number");
        int second = sum.nextInt();
        MWQuestion10w8 add = new MWQuestion10w8();
       int superanswer = add.addition(first, second);
        System.out.println("The sum is : " + superanswer);

    }
    public int addition (int x, int y){
        int answer = x + y;
        return answer;


    }


}
