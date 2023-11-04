import java.util.Scanner;

public class Question11w8 {
    /*11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("enter alphabet from A to F : "));
        char city = sc.next().charAt(0);
        if (city == 'A') {
            System.out.println("city is A for Ahmedabad");
        } else if (city == 'B') {
            System.out.println("city B for Boston");
        } else if (city == 'C') {
            System.out.println("city C is for California");
        } else if (city == 'D') {
            System.out.println("city D is for Dallas");
        } else if (city == 'E') {
            System.out.println("city E is for El paso");
        } else if (city == 'F') {
            System.out.println("city F is for Florida");
        } else {System.out.println("invalid entry");}

    }
}