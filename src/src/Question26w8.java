import java.util.Scanner;

public class Question26w8 {
    /*26. Write a Java program to reverse a word.*/


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String answer = sc.next();
        String result = "";
        char [] ch = answer.toCharArray();

        for (int i =ch.length - 1; i>=0; i--){
            result = result + ch[i];
        }
        System.out.println("Reverse word: " + result);

    }
}
