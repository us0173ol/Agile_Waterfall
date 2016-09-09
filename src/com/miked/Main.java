package com.miked;

import java.util.Scanner;

public class Main {

    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Ask all of the necessary questions to determine
        the best method for the customer/client.  Following each question
        create a variable for the answer given to use in the method*/
        System.out.println("Lets figure out what development method works best for " +
                "your project.");
        System.out.println("How many programmers will be on the team?");
        int numProgrammers = numberScanner.nextInt();
        System.out.println("Will you require firm deadlines and a fixed schedule? (Y or N)");
        String strictEasy = stringScanner.nextLine();
        System.out.println("Do your programmers have experience in requirements," +
                "analysis, and testing as well as coding? (Y or N)");
        String experience = stringScanner.nextLine();
        System.out.println("Are there stringent quality control requirements? Y or N)");
        String qualityControl = stringScanner.nextLine();
        System.out.println("Is early integration desired? {Y or N)");
        String earlyIntegration = stringScanner.nextLine();
        System.out.println("Will your customer require working models early in the project? (Y or N)");
        String workingModels = stringScanner.nextLine();
        /*call the agileOrWaterfall method to return a string variable for the results of the questionaire*/
        String result = agileOrWaterfall(numProgrammers, strictEasy, experience, qualityControl,
                earlyIntegration, workingModels);
        //Display results
        System.out.println("Based on your answers the " + result + " development method is better suited for you.");

    }
    /*method for determining which development strategy to use, returns a string and uses each variable declared in
    * main to determine which option is best*/
    private static String agileOrWaterfall(int a1, String a2, String a3, String a4, String a5, String a6) {
        //created counters to determine weight added for each style, there are 6 questions so instead of having an
        //answer for a tie, the number of programmers is the determining factor to eliminate any chance of a tie
        int waterfall = 0;
        int agile = 0;
        //result variable declared to return
        String result;
            /*a bunch of if else statements to total up the weight of each answer to come to a result*/
            if (a1 >= 10) {//wasnt sure what a good low number would be so decided single digits seemed good
                waterfall=+2;
            }else{
                agile=+2;
            }
            if (a2.equalsIgnoreCase("Y")){
                waterfall++;
            }else{
                agile++;
            }
            if (a3.equalsIgnoreCase("N")){
                waterfall++;
            }else{
                agile++;
            }
            if (a4.equalsIgnoreCase("Y")){
                waterfall++;
            }else{
                agile++;
            }
            if (a5.equalsIgnoreCase("N")){
                waterfall++;
            }else{
                agile++;
            }
            if (a6.equalsIgnoreCase("N")){
                waterfall++;
            }else{
                agile++;
            }
            if (waterfall < agile) {
                result = "Agile";
            }else{
                result = "Waterfall";
            }
        return result ;//return result back to main and call it in the print statement
    }

}