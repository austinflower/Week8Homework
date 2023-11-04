import java.util.Scanner;

public class MWQuestion7w8 {
  /*  7. Take input of age of 3 people by user and determine oldest and youngest among
    them.*/

    public static void main(String []args){
        Scanner age = new Scanner(System.in);
        System.out.println("Enter first person's age: ");
        int firstperson = age.nextInt();
        System.out.println("Enter second person age : ");
        int secondperson = age.nextInt();
        System.out.println("Enter third person age: ");
        int thirdperson = age.nextInt();

        MWQuestion7w8.compairage(firstperson, secondperson, thirdperson);

    }
    public static void compairage (int x, int y, int z){
        int oldest;
        int youngest;
        if (x > y){
            if (x > z){
                oldest = x;
            }else {
                oldest = z;
            }
        }else {
            if (y > z){
                oldest = y;
            }else {
                oldest = z;
            }
        }

        if (x < y){
            if (x < z){
                youngest = x;
            }else {
                youngest = z;
            }
        }else {
            if (y < z){
                youngest = y;
            }else {
                youngest = z;
            }
        }
        System.out.println("Of the three age entered the oldest is: "+ oldest);
        System.out.println("Of the three age entered the youngest is: "+youngest);

    }


}
