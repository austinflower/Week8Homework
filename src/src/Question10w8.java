import java.util.Scanner;

public class Question10w8 {
    /*Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
    * */

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales id: ");
        int empid = sc.nextInt();
        System.out.println("Enter Seller's name: ");
        String name = sc.next();
        System.out.println("Enter sales amount: ");
        double salesamount = sc.nextDouble();
        System.out.println("Enter base salary: ");
        double basesalary = sc.nextDouble();

        double commission = 0.0;
        if (salesamount >= 50000){
            commission = salesamount * 0.35;
        } else if (salesamount >= 30000) {
            commission = salesamount * 0.20;
        } else if (salesamount >= 20000){
            commission =salesamount * 0.10;
        } else if (salesamount >= 10000) {
            commission = salesamount * 0.05;
        } else if (salesamount < 10000) {
            commission = salesamount * 0.02;

        }else if (salesamount < 0){
            commission = salesamount;
        }
        System.out.println("Your commission is: "+ commission);
        System.out.println("Your total pay is: "+(basesalary+commission));

    }

}
