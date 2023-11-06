import java.util.Scanner;

public class ArrayingAbout {

    public static void main(String [] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("What size would you like the array to be?");
        double userNum = scan.nextDouble ();

        double userDec = userNum % 1;

        while (userDec != 0) {

            System.out.println("That is not a whole number. Please enter a whole number.");
            userNum = scan.nextDouble ();

            userDec = userNum % 1;

        }

        double [] userArray = new double[(int) userNum];

        for (int i = 0; i <= userArray.length-1; i++) {

            System.out.println("What number would you like to put in the array?");
            double userNum1 = scan.nextDouble ();

            userArray[i] = userNum1;

        }
        double maxNum = max(userArray);
        System.out.println("Your max number is " + maxNum);
        System.out.println("Your min number is " + min(userArray));
        System.out.println("The sum of your array is " + sum(userArray));
        System.out.println("The average of your array is " + ave(userArray));

    }


    public static double max(double [] arr) {

        double maxNum = arr[0];
        double currentNum;

        for (int i = 0; i <= arr.length-1; i++) {

            currentNum = arr[i];

            if (currentNum > maxNum) {

                maxNum = currentNum;

            }

        }

        return maxNum;

    }

    public static double min(double [] arr) {

        double minNum = arr[0];




        for (double currentNum : arr) {


            if (currentNum < minNum) {

                minNum = currentNum;

            }

        }

        return minNum;

    }

    public static double sum(double [] arr) {

        double sum = 0;
        double currentNum = 0;

        for (int i = 0; i < arr.length; i++) {

            //System.out.println(i);

            currentNum = arr[i];

            //System.out.println(currentNum);

            sum = sum + currentNum;

            //System.out.println(sum);
        }

        //System.out.println(sum);

        return sum;

    }

    public static double ave(double [] array) {

        double sum = sum(array);

        double ave = sum / array.length;

        return ave;

    }

}
