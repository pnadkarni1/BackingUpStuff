


//Design plan:
//Main Method:
//1. Import the scanner
//a) Initalize the scanner
//2. Ask if they would like to make a call
//a) If user says "yes" move to if statement, else end
//3. Make variables for holding question Answers
//4. If statement
//a) Ask for basic questions like the users name, the person they are calling, the number they are calling, the number for the locations they are caling, and the length of the call
//b) If the users length is shorter than 2 minutes then ask for new legnth longer than 2 minutes
//c) find out what place they are calling based on the number of the location they are calling
//d) call back methed for total and print out the users name, the total call cost, the location of the call, the length of the call
//Method callCost:
//1. Make variable for the Total Cost of the call
//2. Find out the first and last number of the number the user is calling
//3. If the call length is more than 2 minutes then
//a) Subtract the extra minutes and seconds of the call from the total length
//b) Multiple the extended minutes by the extended cost
//c) Add back the base cost of the call
//4. Find out if the users number they are calling gets a discount
//a) If the first number in the calling number is 6 or 7 move to if statement or if the last number they are calling is 0 or 1 move to if statement
//5. If Statement
//a) Tell user they have recived a discount and subtract 0.13 from the total cost
//6. Return total cost


import java.util.Scanner;

public class PayPhone {
    public static void main(String [] args) {


        Scanner userInput = new Scanner (System.in);
        System.out.println("Would you like to make a phone call?");
        String userYes = userInput.nextLine ();
        String userName = "0";
        String userCallName = "0";
        int userLocNum = 0;
        String userLoc = "0";
        double userLen = 0;
        double userBase = 0;
        double userExt = 0;
        String userNum = "0";

        while (userYes.equals ("Yes") || userYes.equals ("yes")) {
            System.out.println("What is your name?");
            userName = userInput.nextLine ();
            System.out.println("What is the person you are trying to call?");
            userCallName = userInput.nextLine ();
            System.out.println("What is the number you are trying to call?");
            userNum = userInput.nextLine ();
            System.out.println("What is the number of the location you are trying to call?");
            userLocNum = userInput.nextInt ();
            System.out.println("How long will the call last for? (integer only)");
            userLen = userInput.nextInt();
            if (userLen < 2) {

                System.out.println("That is too short, please entry a new length");
                userLen = userInput.nextInt ();

            }


            if (userLocNum == 1) {

                userLoc = "Basin City, Ohio";
                userBase = 1.47;
                userExt = 0.45;

            }else if (userLocNum == 2) {

                userLoc = "Ambridge, Maine";
                userBase = 1.23;
                userExt = 0.13;

            }else if (userLocNum == 3) {

                userLoc = "Middlemarch, Illinois";
                userBase = 1.73;
                userExt = 0.30;

            }else if (userLocNum == 4) {

                userLoc = "Bright Falls, California";
                userBase = 0.7;
                userExt = 0.94;

            }



            double userTotal = callCost(userLen, userBase, userExt, userNum);

            System.out.println("You are " + userName);
            System.out.println("The total cost of the call is " + userTotal);
            System.out.println("You are calling " + userLoc);
            System.out.println("The total length of the call is " + userLen + " minutes.");

            System.out.println("Would you like to make another call?");
            userYes = userInput.nextLine ();
        }

    }//end of main

    public static double callCost (double userLen, double userBase, double userExt, String userNum ) {

        double userTot = 0;
        char endNum = userNum.charAt(userNum.length() -1);
        String newEndNum = Character.toString (endNum);
        String newBegNum = userNum.substring (0, 1);


        if (userBase == 2) {

            userTot = userBase;

        }else {

            userTot = userLen - 2;
            userTot = userTot * userExt;
            userTot = userBase + userTot;

        }
        if (newBegNum.equals ("1") || newBegNum.equals ("0") || newEndNum.equals ("6") || newEndNum.equals ("7")) {

            userTot = userTot - 0.13;
            System.out.println("You received a discount.");

        }





        return userTot;
    }




}// end of class
