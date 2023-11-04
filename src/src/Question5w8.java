import java.util.Scanner;

public class Question5w8 {
    /*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Student name");
        String studentname = sc.next();
        System.out.println("enter roll no");
        int rollno = sc.nextInt();

        System.out.println("Math marks");
        int mathmarks = sc.nextInt();

        System.out.println("Science marks");
        int Sciencemarks = sc.nextInt();

        System.out.println("English marks");
        int Englishmarks = sc.nextInt();

        if (mathmarks < 0 || mathmarks > 100 || Sciencemarks < 0 || Sciencemarks > 100 || Englishmarks < 0 || Englishmarks > 100) {
            System.out.println("InvalidInput, Marks should between 0 to 100");
        }
        System.out.println("______________________________________");
        System.out.println("|       Mark Sheet                      ");
        System.out.println("|--                                     -");
        System.out.println("|   Name                :"+ studentname);
        System.out.println("|   Roll No             :"+ rollno);
        System.out.println("|                                       |");
        System.out.println("|________________________________________|");
        System.out.println("|   Subjects            :   Marks       |");
        System.out.println("|_________________________________________|");
        System.out.println("|   Math                :   "+mathmarks);
        System.out.println("|   Science:            :   "+Sciencemarks);
        System.out.println("|   English:            :   "+Englishmarks);
        System.out.println("|_________________________________________");
        System.out.println("|   Total               :   "+total(mathmarks, Sciencemarks, Englishmarks));
        System.out.println("|______________________________________________");
        System.out.println("|   Percentage          :   "+ avg(mathmarks,Sciencemarks,Englishmarks));
        String passfail = (avg(mathmarks,Sciencemarks,Englishmarks) >= 35) ? "Pass" : "Fail";

        System.out.println("|   Result              :   "+passfail );
        double superavg = avg(mathmarks,Sciencemarks,Englishmarks);
        String gradevalue = "";
        if (superavg >= 80) {
            gradevalue = "A+";
        } else if (superavg >= 60 ){
            gradevalue = "A";
        }else if (superavg >= 50){
            gradevalue = "B";
        }else if (superavg >= 35){
            gradevalue = "C";
        }else {gradevalue = "";}
        System.out.println("|          Grade         :       "+ gradevalue);








    }

    public static int total (int x, int y, int z){
        int addedmarks = x + y + z;
        return addedmarks;
    }
    public static double avg (int x, int y, int z){
        double avgg = ((x+y+z)/3);
        return  avgg;
    }

}