import java.util.Scanner;

public class Question12w8 {
    /*12. Same as above program-8 using switch statement.*/
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character between A to C : ");
        String city = sc.next();
        switch (city){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Boston");
                break;
            case "C":
                System.out.println("California");
                break;
            case "D":
                System.out.println("Dallas");
                break;
            case "E":
                System.out.println("El paso");
                break;
            case "F":
                System.out.println("Florida");



        }
    }

}
