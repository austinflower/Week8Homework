import java.util.Scanner;

public class MWQuestion6w8 {
    /*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/
    public static void main(String []args){
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter marks");
        int answer = marks.nextInt();
        MWQuestion6w8.getgrade(answer);
    }
    public static void getgrade (int x){
        if (x > 80){
            System.out.println("Based on your marks your letter grade is: A");
        }else if (x > 60 && x <= 80){
            System.out.println("Based on your marks your letter grade is: B");
        }else if (x > 50 && x <= 60){
            System.out.println("Based on your marks your letter grade is: C");
        }else if (x > 45 && x <= 50){
            System.out.println("Based on your marks your letter grade is: D");
        }else if (x > 25 && x <= 45){
            System.out.println("Based on your marks your letter grade is: E");
        }else {
            System.out.println("Based on your marks your letter grade is: F");
        }


    }

}
