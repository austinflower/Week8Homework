import java.util.Arrays;

public class Question20w8 {
    /*Write a Java program to sort a numeric array and a string array.*/
    public static void main(String[] args) {
        int[] number = {23, 43, 2, 3, 5, 44, 66, 12, 100};
        Arrays.sort(number);

        for (int num : number) {
            System.out.println(num);
        }
        String[] names = {"Shiv", "Shreeya", "Chetan", "Preksha"};
        Arrays.sort(names);
        for (String str : names){
            System.out.println(str);
        }
    }
}