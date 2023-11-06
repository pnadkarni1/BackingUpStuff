import java.util.Scanner;
public class Test {
        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);

            System.out.println("Is there anyone waiting to order from my cart?");
            String yes = userInput.nextLine();
            String userChallenge = "0";
            String userAnswer = "0";
            String userCorrect = "0";
            int userNum = 0;
            int cakeAmount = 0;
            int cakePrice2 = 0;
            int cakeBags2 = 0;
            int cakePrice = 0;
            int cakeBags = 0;
            int frogAmount = 0;
            int frogPrice = 0;
            int butterAmount = 0;
            int butterSmall = 0;
            int butterLarge = 0;
            int butterSize = 0;
            int butterPrice = 0;
            int userCur = 0;
            int userAmount = 0;
            int amountTotal = 0;
            int amountDiscount = 0;
            int userAmount2 = 0;
            int userGalleons = 0;
            int userSickles = 0;
            int userKnuts = 0;
            int over = 0;
            int butterLargePrice2 = 0;
            int butterSmallPrice2 = 0;
            int butterLargePrice = 0;
            int butterSmallPrice = 0;
            int frogPrice2 = 0;


            while (yes.equals("Yes") || yes.equals("yes")) {

                System.out.println("Welcome to Dumbledores Delicious Delicacies!");
                System.out.println();
                System.out.println("Here are the Regular Prices for Items:");
                System.out.println("Cauldron Cakes          Single: 10 Knuts      Bag of 6: 55 Knuts");
                System.out.println("Chocolate Frogs         20 Knuts Each");
                System.out.println("Butterbeer              Small: 50 Knuts       Large: 75 Knuts");
                System.out.println();
                System.out.println("Would you like to answer the challenge question to get a discount, if you get it right then you get discounted prices and 10% off the total order, if you get it wrong then 10% penalty of the total order.");
                userChallenge = userInput.nextLine();

                if (userChallenge.equals("Yes") || userChallenge.equals("yes")) {

                    System.out.println("Here is the challenge question:");
                    System.out.println();
                    System.out.println("How old was Harry Potter when he first went to Hogwarts? (Answer with ONLY the letter)");
                    System.out.println();
                    System.out.println("A. 12 years old");
                    System.out.println("B. 10 years old");
                    System.out.println("C. 11 years old");

                    userAnswer = userInput.nextLine();

                    if (userAnswer.equals("C")) {

                        System.out.println("That is Correct!");

                        userCorrect = "Correct";
                        butterLargePrice2 = 50;
                        butterSmallPrice2 = 50;
                        cakePrice2 = 10;
                        cakeBags2 = 50;
                        frogPrice2 = 15;


                    } else {

                        System.out.println();
                        System.out.println("That is incorrect.");
                        System.out.println("You will get a 10% penalty fee to the total price of your order");
                        userCorrect = "Wrong";

                        butterLargePrice2 = 75;
                        butterSmallPrice2 = 50;
                        cakePrice2 = 10;
                        cakeBags2 = 55;
                        frogPrice2 = 20;


                    }
                }else {

                    butterLargePrice2 = 75;
                    butterSmallPrice2 = 50;
                    cakePrice2 = 10;
                    cakeBags2 = 55;
                    frogPrice2 = 20;

                }

                    while (userNum < 4) {

                        System.out.println();
                        System.out.println("1. Cauldron Cakes          Single: " + cakePrice2 + " Knuts          Bag of 6: " + cakeBags2 + " Knuts");
                        System.out.println("2. Chocolate Frogs             " + frogPrice2 + " Knuts");
                        System.out.println("3. Butterbeer              Small: " + butterSmallPrice2 + " Knuts            Large: " + butterLargePrice2 + " Knuts");
                        System.out.println("4. Checkout");
                        System.out.println();
                        System.out.println("What would you like to order?");
                        userNum = userInput.nextInt();

                        if (userNum == 1) {
                            System.out.println("You currently have " + cakeBags + " bags of Cauldron Cakes and " + cakeAmount + " single cakes.");
                            System.out.println("How many Cakes would you like to have?");
                            cakeAmount = userInput.nextInt();
                            if (cakeAmount > 6) {

                                cakeBags = (int) cakeAmount / 6;
                                cakeAmount = (int) cakeAmount % 6;

                            }
                            System.out.println("You now have " + cakeBags + " bags of cakes and " + cakeAmount + " single cakes.");

                            cakePrice = cakeBags * cakeBags2;
                            cakePrice = cakePrice + cakeAmount * cakePrice2;


                        }
                        if (userNum == 2) {
                            System.out.println("You currently have " + frogAmount + " Chocalate Frogs.");
                            System.out.println("How many would you like to have?");
                            frogAmount = userInput.nextInt();

                            frogPrice = frogAmount * frogPrice2;


                        }
                        if (userNum == 3) {

                            System.out.println("You currently have " + butterAmount + " butterbeers of " + butterSmall + " smalls and " + butterLarge + " larges.");
                            System.out.println("What size? Large is 1, and 2 is small");
                            butterSize = userInput.nextInt();

                            if (butterSize == 1) {

                                System.out.println("How many would you like?");
                                butterLarge = userInput.nextInt();
                                butterLargePrice = butterLarge * butterLargePrice2;

                            } else {

                                System.out.println("How many would you like?");
                                butterSmall = userInput.nextInt();
                                butterSmallPrice = butterSmall * butterSmallPrice2;

                            }

                            butterAmount = butterLarge + butterSmall;
                            butterPrice = butterLargePrice + butterSmallPrice;

                        }

                    }//end of while

                    amountTotal = cakePrice + frogPrice + butterPrice;

                    System.out.println("Here is your bill:");
                    System.out.println();
                    System.out.println("------------------------");

                    if (cakeAmount != 0) {

                        System.out.println(cakeBags + " bags of Cauldron Cake and " + cakeAmount + " Single Cakes:       " + cakePrice + " Knuts");

                    }
                    if (frogAmount != 0) {

                        System.out.println(frogAmount + " Chocolate Frogs:        " + frogPrice + " Knuts");

                    }
                    if (butterAmount != 0) {

                        System.out.println(butterAmount + " butterbeers of " + butterSmall + " smalls and " + butterLarge + " larges:      " + butterPrice + " Knuts");

                    }
                    System.out.println("------------------------");
                    System.out.println();
                    System.out.println("total:           " + amountTotal + " Knuts");

                    if (userCorrect.equals ("Correct")) {

                        amountDiscount = (int) amountTotal / 10;

                        System.out.println("Question Correct:              -" + amountDiscount);
                        amountTotal = amountTotal - amountDiscount;

                        System.out.println("New Total:           " + amountTotal + " Knuts");

                    }

                if (userCorrect.equals ("Wrong")) {

                    amountDiscount = (int) amountTotal / 10;

                    System.out.println("Question Incorrect:              +" + amountDiscount);
                    amountTotal = amountTotal + amountDiscount;

                    System.out.println("New Total:           " + amountTotal + " Knuts");

                }

                    System.out.println("How will you be paying");
                    System.out.println("1. Knuts");
                    System.out.println("2. Sickles");
                    System.out.println("3. Galleons");
                    System.out.println("There is no more than 2 Galleons on the cart at a time.");
                    userCur = userInput.nextInt();
                    userInput.nextLine();

                    if (userCur == 1) {

                        System.out.println("How much will you be paying?");
                        userAmount = userInput.nextInt();
                        userInput.nextLine();

                        over = amountTotal - userAmount;

                        while (over > 986) {

                            System.out.println("We do not have enough for change. Please enter less");
                            userAmount = userInput.nextInt();
                            userInput.nextLine();
                            over = amountTotal - userAmount;

                        }

                        while (userAmount < amountTotal) {

                            System.out.println("That is not enough, please enter more.");
                            userAmount2 = userInput.nextInt();
                            userInput.nextLine();
                            over = amountTotal - userAmount;
                            userAmount = userAmount + userAmount2;

                        }

                        if (userAmount > amountTotal) {

                            over = userAmount - amountTotal;
                            userGalleons = (int) over / 493;
                            over = over % 493;
                            userSickles = (int) over / 29;
                            over = over % 29;

                            System.out.println("We will give you back " + userGalleons + " Galleons, " + userSickles + " Sickles, and " + over + " Knuts.");


                        } else {

                            System.out.println("Thank You for giving us Exact Change.");

                        }


                    }
                    if (userCur == 2) {

                        System.out.println("How much will you be paying?");
                        userAmount = userInput.nextInt();
                        userInput.nextLine();
                        userAmount = userAmount * 29;
                        over = amountTotal - userAmount;

                        while (over > 986) {

                            System.out.println("We do not have enough for change. Please enter less");
                            userAmount = userInput.nextInt();
                            userInput.nextLine();
                            userAmount = userAmount * 29;
                            over = amountTotal - userAmount;


                        }

                        while (userAmount < amountTotal) {

                            System.out.println("That is not enough, please enter more.");
                            userAmount2 = userInput.nextInt();
                            userInput.nextLine();

                            userAmount2 = userAmount2 * 29;

                            userAmount = userAmount + userAmount2;
                            over = amountTotal - userAmount;


                        }

                        if (userAmount > amountTotal) {

                            over = userAmount - amountTotal;
                            userGalleons = (int) over / 493;
                            over = over % 493;
                            userSickles = (int) over / 29;
                            over = over % 29;

                            System.out.println("We will give you back " + userGalleons + " Galleons, " + userSickles + " Sickles, and " + over + " Knuts.");


                        } else {

                            System.out.println("Thank You for giving us exact change.");

                        }


                    }
                    if (userCur == 3) {

                        System.out.println("How much will you be paying?");
                        userAmount = userInput.nextInt();
                        userInput.nextLine();
                        userAmount = userAmount * 493;
                        over = amountTotal - userAmount;


                        while (over > 986) {

                            System.out.println("We do not have enough for change. Please enter less");
                            userAmount = userInput.nextInt();
                            userInput.nextLine();
                            userAmount = userAmount * 493;
                            over = amountTotal - userAmount;

                        }

                        while (userAmount < amountTotal) {

                            System.out.println("That is not enough, please enter more.");
                            userAmount2 = userInput.nextInt();
                            userInput.nextLine();

                            userAmount2 = userAmount2 * 493;

                            userAmount = userAmount + userAmount2;
                            over = amountTotal - userAmount;

                        }

                        if (userAmount > amountTotal) {

                            over = userAmount - amountTotal;
                            userGalleons = (int) over / 493;
                            over = over % 493;
                            userSickles = (int) over / 29;
                            over = over % 29;

                            System.out.println("We will give you back " + userGalleons + " Galleons, " + userSickles + " Sickles, and " + over + " Knuts.");


                        } else {

                            System.out.println("Thank You for giving us exact change.");

                        }


                    }

                    System.out.println("Is there anyone else waiting to order?");
                    yes = userInput.nextLine ();

            }

        }
}