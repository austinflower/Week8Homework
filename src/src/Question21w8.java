public class Question21w8 {
    /*Write a Java program to sum values of an array.
    */


    public static void main (String [] args){

        int[] number = {23, 43, 2, 3, 5, 44, 66, 12, 100};
        int sum = 0;
        for (int i = 0; i<number.length;i++){
            sum = sum + number[i];
        }
        for (int i = 0; i<number.length;i++){
            System.out.println("Number in the array: " +number[i]);
        }
        System.out.println("The sum of the array is: "+sum);

    }
}
