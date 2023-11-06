public class SimpleCalculator {

    //each method we make has a signature/header
    //the header is the first line of the method before the opening {
    //each header requires 4 things
    //access level
    //return type
    //name
    //(parameter)

    //access level is who can invoke the method
    //for our purposes we will use public or private (mostly public as we are learning)
    //public means that anybody can see or call the method
    //private means that only the class we are in can see and call this method


    //return type is what data we are sending back from this method (as an answer?)
    //specific what is the type we are sending back: int, String, double, boolean
    //sometimes we have a method in which we do not want to send back anything
    //we still need a return type in these cases that type is "void"

    //name is similar to a variable name, it is what we use when we want to call the method

    //parameters are the list of data between the () that we can sk for
    //these are the value that will need to help us complete our calculation or goal for the method
    //when listing the parameters' data type and give the parameter a variable name that can be used within the method if we do not need or want any parameters
    //we still include the parentheses but leave them blank

    //parameters get separated by commas

    public static int add(int numOne, int numTwo) {
        //if we give a return type for the method, SOMEWHERE inside that method is required to be a keyword "return" followed by a variable or literal
        // that is the correct data type we are expected to return

        int sum = numOne + numTwo;
        return sum;



    }//end of add method

    public static double subtract (int numOne, double numTwo) {
        //we can return all in one line

        return numOne - numTwo;
    }//end of subtract

    public static int division (int divisor, int dividend) {
        //want to make sure the divisor is not 0 before we try to divide

        boolean isPossible = canDivide (divisor);

        if (isPossible) {

            return dividend / divisor;

        }

        return -1;

    }//end of division

    //we will make canDivide private because nobody outside this class need to know it exists

    private static boolean canDivide (int num) {

        return num != 0;


    }//end of canDivide

    public static void greeting() {

        System.out.println("Welcome to Calc");


    }//end of greeting method

    public static String goodbye() {
        //could use a String as Parameter
        //get name from user in the main method
        //pass in name to this Method and say goodbye to the user name
        return "Goodbye and Thank You";
    }

    public static void main(String [] args) {

        //void methods never get stored into a variable we simply call them by name only
        greeting ();

        //if a method Returns a value we should store that value into the variable so we may use it throughout our program

        int sum = add(5, 10);
        System.out.println(sum);

        System.out.println(division(5, 3));



    }//end of main
}//end of class
