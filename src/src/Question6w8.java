import java.util.Scanner;

public class Question6w8 {
    /*6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int empid = sc.nextInt();
        System.out.println("Enter employee name: ");
        String name = sc.next();
        System.out.println("Enter basic salary: ");
        double salary = sc.nextDouble();

        double HRA = salary * 0.10;
        double DA = salary * 0.08;
        double TA = salary * 0.09;
        double PF = salary * 0.20;
        double gross = salary + HRA + DA + TA - PF;

        System.out.println("|           Salary Slip         |");
        System.out.println("|                               |");
        System.out.println("_________________________________");
        System.out.println("|                               |");
        System.out.println("| Employee ID         :"+empid+"|");
        System.out.println("| Employee Name         :"+name+"|");
        System.out.println("|                               |");
        System.out.println("________________________________");
        System.out.println("|                               |");
        System.out.println("Basic Salary        :"+salary+" |");
        System.out.println("HRA 10%             :"+HRA+"    |");
        System.out.println("TA 8%               :"+TA+"     |");
        System.out.println("DA 9%               :"+DA+"     |");
        System.out.println("PF - 20%            :"+PF+"     |");
        System.out.println("|                               |");
        System.out.println("________________________________");
        System.out.println("|                               |");
        System.out.println("Gross Salary        :"+gross+"  |");
        System.out.println("|===============================|");


    }
}
