public class Question2w8 {
    /*2. Declare array and store any 5 countries and print them in console.*/
    public static void main(String []args){
        String [] countries = { "USA", "INDIA", "UK", "CANADA", "MAXICO"};
        /*System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);
        System.out.println(countries[3]);
        System.out.println(countries[4]);*/

        int i = countries.length;
        for (i = 0; i < countries.length; i++){
            //System.out.println("I'm in the for loop");
            System.out.println(countries[i]);

        }
        /*
        int y = countries.length;
        while (y < countries.length){
            System.out.println("I'm in the while loop");
            System.out.println(countries[y]);
            y++;
        }*/
    }
}
