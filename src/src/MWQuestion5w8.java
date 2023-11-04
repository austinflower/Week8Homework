import java.util.Scanner;

public class MWQuestion5w8 {
    /*Take two int values from user and print greatest among them.*/

    public static void main(String []args){
        Scanner valuebig = new Scanner(System.in);
        System.out.println("enter first value");
        int first = valuebig.nextInt();
        System.out.println("enter second value");
        int second = valuebig.nextInt();

        MWQuestion5w8 bigger = new MWQuestion5w8();
        int answer = bigger.whichisbiggest(first,second);

        System.out.println("The greater of the input value is: " + answer);
    }

    public int whichisbiggest(int x, int y){
        if (x > y){
            return x;
        } else if ( y > x){
            return y;
        } else if (x == y ){
            return x;
        } return 0;
    }
}
