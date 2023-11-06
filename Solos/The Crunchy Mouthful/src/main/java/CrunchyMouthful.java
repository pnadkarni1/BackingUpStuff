
//Design Plan:
//        Main Method:
//        1.Ask the user if they would like to order something.
//        2. If they say yes, then move to while statement, else end
//        3. While loop
//        4. While the user says yes
//        5. Show them the menu with all 7 numbers
//        6. Let the user input a number
//        7. If they input 7 Make them re input a number between 1-5
//        8. If they input 6 show the menu and re input a number between 1-5
//        9. Find out what they want to order by using storing the variable the user inputed
//        10.Make if statements for each number 1-5 and make another variable holding the item they are ordering and the price
//        11.Ask them if they would like to order another item, if yes, use step 7-10, then move on, if they do not say yes
//        12.Print out what they are ordering and the total price
//        13.Ask them the amount they are paying
//        14.Call the calculateChange method and see if they are underpaying if they return a negative
//        15.If the return is a negative number tell the user how much they have paid and add an extra amount to it
//        16.Add the extra amount the original user paying and loop until they have payed exact or over
//        17.If they pay over then us steps 18- 20, else
//        18.Find the dollar of the users change, and find the amount in cents that are change
//        19.Use modulus and division to find quarter, dimes, nickels, and pennies
//        20.Then print out to the user the amount of change we owe them in dollars, quarters,
//        dimes, nickels, pennies
//        21.Ask user if they would like to order again, if yes repeat steps 1-20, else end
//        calculateChange Method:
//        1.Make a variable that holds the number of change
//        2.Subtract the amount the user has paid by the total amount
//        3.Hold it into the variable
//        4.Return the variable





import java.util.Scanner;

public class CrunchyMouthful {
    public static void main(String [] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Would you like to order some food?");
        String userYes = userInput.nextLine ();
        int userChoice = 0;
        double userChoiceCost = 0;
        double userTotal = 0;
        int userChoiceTwo = 0;
        double userTotalOne = 0;
        String userOrderOne = "0";
        String userOrderTwo = "0";
        double userPay = 0;
        double userExtAmount = 0;
        double userChange = 0;
        int userDollars = 0;
        int userQ = 0;
        int userD = 0;
        int userN = 0;
        int userP = 0;

        while (userYes.equals ("Yes") || userYes.equals ("yes")) {



                System.out.println("You can only choose two maximum, choose the following with the one number only:");
                System.out.println("1. Chipotle Seitan Breakfast Burrito ($9.15)");
                System.out.println("2. Creole Grilled Tofu ($13.75)");
                System.out.println("3. Beastmode Burger Deluxe ($19.50)");
                System.out.println("4. Water ($7.00)");
                System.out.println("5. Root Beer ($8.59)");
                System.out.println("6. Display Menu");
                System.out.println("7. Checkout");


                userChoice = userInput.nextInt();
                userInput.nextLine();

                if (userChoice == 1) {

                    userChoiceCost = 9.15;
                    userOrderOne = "Chipotle Seitan Breakfast Burrito";

                }
                if (userChoice == 2) {

                    userChoiceCost = 13.75;
                    userOrderOne = "Creole Grilled Tofu";

                }
                if (userChoice == 3) {

                    userChoiceCost = 19.50;
                    userOrderOne = "Beastmode Burger Deluxe";

                }
                if (userChoice == 4) {

                    userChoiceCost = 7;
                    userOrderOne = "Water";

                }
                if (userChoice == 5) {

                    userChoiceCost = 8.59;
                    userOrderOne = "Root Beer";

                }
                if (userChoice == 6) {

                    System.out.println("You can only choose two maximum, choose the following with the one number only:");
                    System.out.println("1. Chipotle Seitan Breakfast Burrito ($9.15)");
                    System.out.println("2. Creole Grilled Tofu ($13.75)");
                    System.out.println("3. Beastmode Burger Deluxe ($19.50)");
                    System.out.println("4. Water ($7.00)");
                    System.out.println("5. Root Beer ($8.59)");
                    System.out.println("6. Display Menu");
                    System.out.println("7. Checkout");
                    userChoice = userInput.nextInt();
                    userInput.nextLine();
                    if (userChoice == 1) {

                        userChoiceCost = 9.15;
                        userOrderOne = "Chipotle Seitan Breakfast Burrito";

                    }
                    if (userChoice == 2) {

                        userChoiceCost = 13.75;
                        userOrderOne = "Creole Grilled Tofu";

                    }
                    if (userChoice == 3) {

                        userChoiceCost = 19.50;
                        userOrderOne = "Beastmode Burger Deluxe";

                    }
                    if (userChoice == 4) {

                        userChoiceCost = 7;
                        userOrderOne = "Water";

                    }
                    if (userChoice == 5) {

                        userChoiceCost = 8.59;
                        userOrderOne = "Root Beer";

                    }

                }
                if (userChoice == 7) {

                    System.out.println("You do not have anything in checkout. Please order something to head to checkout.");
                    System.out.println("You can only choose two maximum, choose the following with the one number only:");
                    System.out.println("1. Chipotle Seitan Breakfast Burrito ($9.15)");
                    System.out.println("2. Creole Grilled Tofu ($13.75)");
                    System.out.println("3. Beastmode Burger Deluxe ($19.50)");
                    System.out.println("4. Water ($7.00)");
                    System.out.println("5. Root Beer ($8.59)");
                    System.out.println("6. Display Menu");
                    System.out.println("7. Checkout");
                    userChoice = userInput.nextInt();
                    userInput.nextLine();
                    if (userChoice == 1) {

                        userChoiceCost = 9.15;
                        userOrderOne = "Chipotle Seitan Breakfast Burrito";

                    }
                    if (userChoice == 2) {

                        userChoiceCost = 13.75;
                        userOrderOne = "Creole Grilled Tofu";

                    }
                    if (userChoice == 3) {

                        userChoiceCost = 19.50;
                        userOrderOne = "Beastmode Burger Deluxe";

                    }
                    if (userChoice == 4) {

                        userChoiceCost = 7;
                        userOrderOne = "Water";

                    }
                    if (userChoice == 5) {

                        userChoiceCost = 8.59;
                        userOrderOne = "Root Beer";

                    }

                }
                userTotal = userChoiceCost;

            System.out.println("Would you like to get another one? If so enter a number, if not please say 7");
            userChoiceTwo = userInput.nextInt();
            userInput.nextLine();


            if (userChoiceTwo == 1) {

                userTotalOne = 9.15;
                userOrderTwo = "Chipotle Seitan Breakfast Burrito";

            }
            if (userChoiceTwo == 2) {

                userTotalOne = 13.75;
                userOrderTwo = "Creole Grilled Tofu";

            }
            if (userChoiceTwo == 3) {

                userTotalOne = 19.50;
                userOrderTwo = "Beastmode Burger Deluxe";

            }
            if (userChoiceTwo == 4) {

                userTotalOne = 7;
                userOrderTwo = "Water";

            }
            if (userChoiceTwo == 5) {

                userTotalOne = 8.59;
                userOrderTwo = "Root Beer";

            }
        if (userChoiceTwo == 6){

                System.out.println("1. Chipotle Seitan Breakfast Burrito ($9.15)");
                System.out.println("2. Creole Grilled Tofu ($13.75)");
                System.out.println("3. Beastmode Burger Deluxe ($19.50)");
                System.out.println("4. Water ($7.00)");
                System.out.println("5. Root Beer ($8.59)");
                System.out.println("6. Display Menu");
                System.out.println("7. Checkout");
                userChoice = userInput.nextInt();
                userInput.nextLine();

            if (userChoice == 1) {

                userTotalOne = 9.15;
                userOrderTwo = "Chipotle Seitan Breakfast Burrito";

            }
            if (userChoice == 2) {

                userTotalOne = 13.75;
                userOrderTwo = "Creole Grilled Tofu";

            }
            if (userChoice == 3) {

                userTotalOne = 19.50;
                userOrderTwo = "Beastmode Burger Deluxe";

            }
            if (userChoice == 4) {

                userTotalOne = 7;
                userOrderTwo = "Water";

            }
            if (userChoice == 5) {

                userTotalOne = 8.59;
                userOrderTwo = "Root Beer";

            }

            }
        if (userChoiceTwo == 7) {

            userTotalOne = 0;
            userOrderTwo = "Nothing";

        }

                userTotal = userTotalOne + userChoiceCost;

        System.out.println("You are purchasing " + userOrderOne + " and " + userOrderTwo + " with a total of " + userTotal + ".");
        System.out.println("How much will you be paying?");
        userPay = userInput.nextDouble ();

        if (calculateChange (userTotal, userPay) < -1 ) {

            System.out.println("You have not payed enough. Please add an extract amount");
            userExtAmount = userInput.nextDouble ();
            userPay = userPay + userExtAmount;

            while (userPay < userTotal) {


                System.out.println("You have paid " + userPay);
                System.out.println("That is still not enough, please enter more.");
                userExtAmount = userInput.nextDouble ();
                userPay = userPay + userExtAmount;

            }

        }if (userPay > userTotal || calculateChange (userTotal, userPay) > userTotal) {

            userChange = (userPay - userTotal);

            userDollars = (int) userChange;
            userChange = userChange - userDollars;
            userChange = userChange * 100;
            userQ = (int) userChange / 25;
            userChange = userChange % 25;
            userD = (int) userChange / 10;
            userChange = userChange % 10;
            userN = (int) userChange / 5;
            userChange = userChange % 5;
            userP = (int) userChange / 1;

            System.out.println("We give you back " + userDollars + " Dollars " + userQ + " quaters " + userD + " dimes " + userN + " nickels and " + userP + " pennies.");


            }





            System.out.println("Would you like to order again?");
            userYes = userInput.nextLine();


        }//end of while

        System.out.println("Have a good day.");

    }//end of main

    public static double calculateChange (double userTotal, double userPay) {

        double userChange = userPay - userTotal;
        return userChange;

    }


}//end of class
