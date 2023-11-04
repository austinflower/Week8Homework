import java.util.Scanner;

public class Question15w8 {
    /*15. Write a program that tells us input value is number or an alphabet or symbol.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value: ");
        char answer = sc.next().charAt(0);
        if (answer >= 'a' && answer <= 'z') {
            System.out.println("You entered a character.");
        } else if (answer >= '0' && answer <= '9') {
            System.out.println("You entered a number");
        } else {
            System.out.println("You entered a symbol");
        }
    }
}

