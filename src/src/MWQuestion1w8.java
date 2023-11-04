import java.util.Scanner;

public class MWQuestion1w8 {
    /*Take 10 integers from keyboard using loop and print their average value on the
screen.
    **/
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Enter number "+ i + ": ");
            int number = sc.nextInt();
            sum = sum + number;
        }
        double avg = sum / 10;
        System.out.println("The average of the input of number is: "+ avg);


    }
}
