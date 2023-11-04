public class Question3w8 {
    /*3. Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
    public static void main(String []args){
        String [][] countriesAndCapitals = {{"USA", "WASHINGTON DC"},
                                 {"INDIA", "DELHI"},
                                 {"UK", "LONDON"},
                                 {"CANADA","TORONTO"},
                                 {"MAXICO","MAXICO CITY"}};
        int i = countriesAndCapitals.length;
        for (i = 0; i < countriesAndCapitals.length; i++){
            System.out.println("Country: "+ countriesAndCapitals[i][0]+ " Capital: "+countriesAndCapitals[i][1]);
        }
/*
        System.out.println("Country: "+ countriesAndCapitals[0][0]+ " Capital: "+countriesAndCapitals[0][1]);
        System.out.println("Country: "+ countriesAndCapitals[1][0]+ " Capital: "+countriesAndCapitals[1][1]);
        System.out.println("Country: "+ countriesAndCapitals[2][0]+ " Capital: "+countriesAndCapitals[2][1]);
        System.out.println("Country: "+ countriesAndCapitals[3][0]+ " Capital: "+countriesAndCapitals[3][1]);
        System.out.println("Country: "+ countriesAndCapitals[4][0]+ " Capital: "+countriesAndCapitals[4][1]);
*/

    }







}
