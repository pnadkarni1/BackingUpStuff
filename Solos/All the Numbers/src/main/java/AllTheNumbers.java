
import java.util.Scanner;
public class AllTheNumbers {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number");
        int userNum = userInput.nextInt();
        int userList = 0;
        int userSum = userNum;
        int userNumb = userNum;
        int greatNum = userNum;
        int leastNum = userNum;
        double sumOfSquares = 0;
        double square = Math.pow(userNumb, 2);


        while (userNumb > -1) {
            if (userNumb > greatNum) {

                greatNum = userNumb;

            }
            if (userNumb < leastNum) {

                leastNum = userNumb;

            }

            userList++;
            square = Math.pow(userNumb, 2);
            userSum = userNumb + userSum;
            sumOfSquares = sumOfSquares + square;
            System.out.println("Enter another Number and enter -1 to exit");
            userNumb = userInput.nextInt();



        }//end of loop

        userSum = userSum - userNum;


        double userVar = variance(userSum, userList,sumOfSquares);
        System.out.println("Your greatest value is " + greatNum + " your least value is " + leastNum);
        System.out.println("The variance is " + userVar);
        userAverage (userSum, userList);
        variance (userSum, userList, sumOfSquares);
        standarddev (userSum, userList, sumOfSquares);

    }//end of main

    public static void userAverage(int userSum, int userList) {
        System.out.println("Your average is " + userSum/userList);

    }
    public static double variance(int userSum, int userList, double sumOfSquares) {

        double userVar = (userList * sumOfSquares - userSum * userSum) / (userList * (userList - 1));

        return userVar;

    }
    public static double standarddev(int userSum, int userList, double sumOfSquares) {


        double userDev = Math.sqrt(variance(userSum, userList, sumOfSquares));
        System.out.println("The Standard Deviation is " + userDev);
        return userDev;
    }


    }//end of class

