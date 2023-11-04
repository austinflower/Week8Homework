import java.util.Scanner;

public class Question13w8 {
    /*13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        System.out.println("enter a symbol (+, -, *, /): ");
        char symbol = sc.next().charAt(0);

        if (symbol == '+'){
            System.out.println("sum of "+ num1 + " + " + num2 +" = " +(num1+num2));
        } else if (symbol == '-'){
            System.out.println("Subtraction of "+ num1 + " - " + num2 +" is: " +(num1-num2));
        } else if (symbol == '*'){
            System.out.println("multiplication of "+ num1 + " * " + num2 +" is: " +(num1*num2));
        } else if (symbol == '/'){
            System.out.println("division of "+ num1 + " / " + num2 +" is: " +(num1/num2));
        }else {
            System.out.println("invalid symbol");
        }

    }
}
