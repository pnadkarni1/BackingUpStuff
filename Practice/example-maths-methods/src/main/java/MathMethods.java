public class MathMethods {
    public static void main(String [] args) {

        //there are a number of useful methods available in the Math Class
        //All these methods and static and therfore need to be called on the Math Class itself

        //the API is helpful in seeing methods we may want to use
        //today we will look at
        //Max
        //min
        //random

        //Math.max returns the maxium number for the two given arguements
        //This is great when searching through a collection looking for a max value without having to write a bunch of if statements

        int numberOne = 45;
        int numberTwo = 47;

        int maxValue = Math.max(51, Math.max (47, Math.max (63, 77)));
        System.out.println(maxValue);

        //opposite of Math.max, Math.min, returns the minimum of the given arguments max and min will match their return type to whatever data type the arguement are

        double minValue = Math.min(9.7, 7.6);

        //the Math.random method will return a random number between 0.0 and 1.0
        //however, it will never return 1.0
        //the 1.0 is exclusive it also returns a double type
        //this can be used to get random numbers in Java

        //Most random number we want will need to be int and they will usually be a range starting at larger or equal to 1
        //therefore we must multiply and typecast to get a valid number for Math.random()
        //whatever number we multipy by will give us a random number between 0 and that number exclusive

        for (int i = 0; i < 35; i++) {

            int randomNum = (int) (Math.random () * 15) + 1;
            System.out.println(randomNum);

        }


    }//end of Main
}//end of Class
