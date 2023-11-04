import java.util.Scanner;

public class MWQuestion9w8 {
    /*Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/


    public static void main(String []args){
        Scanner classesheld = new Scanner(System.in);
        System.out.println("Enter number of classes held");
        int number = classesheld.nextInt();
        System.out.println("Enter number of classes attended");
        int attended = classesheld.nextInt();
        System.out.println("Do you have medical cause or not ( Y or N): ");
        char medical = classesheld.next().charAt(0);
        MWQuestion9w8.exam(number, attended, medical );
    }

    public static void exam (int x, int y, char z){
        double classattended = (double) y / x * 100;

        System.out.println("The percentage of class attended: "+classattended+" %");
        if ( classattended > 75){
            System.out.println("You are allowed to sit in the exam");
        } else { if (z == 'Y') {
            System.out.println("you can allows to sit in the exam due to medical");
        }else { if (z == 'N') {
            System.out.println("You are not allowed to sit in the exam");
        }

        }

    }
}}
