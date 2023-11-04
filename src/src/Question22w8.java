public class Question22w8 {
    /*Write a Java program to calculate the average value of array elements.
     */

    public static void main (String [] args){

        int[] number = {23, 43, 2, 3, 5, 44, 66, 12, 100};
        int sum = 0;
        for (int i = 0; i<number.length;i++){
            sum = sum + number[i];
        }
        double avg = sum / number.length;
        for (int i = 0; i<number.length;i++){
            System.out.println("Number in the array: " +number[i]);
        }
        System.out.println("The average of the array is: "+avg);

    }
}
