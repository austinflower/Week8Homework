import java.util.Scanner;

public class Rectangle {
    /*4. Take values of length and width of a rectangle from user and check if it is square or not.*/
    double width;
    double length;

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter length");
        double length = sc.nextInt();
        System.out.println(("please enter width"));
        double width = sc.nextInt();
        Rectangle rectangle = new Rectangle(length, width);
        if (length == width){
            System.out.println("This is a square");
        }else {System.out.println("This is NOT a square.");

    }}
    public Rectangle(double length, double width){
        if (length > 0 ){
            this.length = length;
        }else {  length = 0;}
        if (width > 0){
            this.width = width;
        }else {width = 0;}
    }
}
