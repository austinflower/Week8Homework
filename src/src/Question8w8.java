import java.util.Scanner;

public class Question8w8 {
    /*8. Write a java program to get numbers from users and print whether it is positive or negative.*/
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int numm = sc.nextInt();
        if (numm > 0)
        System.out.println(numm + " is a positive number");
        else
            System.out.println(numm + " is a negative number");



    }
}
