//Scanner is not a standard built-in Java
//feature
//not all programs need a Scanner
//we need a to specifically go get the Java library that has a Scanner class in it, so we can use Scanner methods

import java.util.Scanner;

public class UserInputPractice {
    public static void main(String [] args) {
        //to take input from the user there are a number of options we have
        //one option is from the keyboard and another is from the files
        //we will focus on keyboard option
        //getting input from the keyboard is done with a special kind of object called Scanner

        //syntax for making an object
        //ClassName (in this case Scanner)
        //variable_name ( we will make this up)
        // assignment operator ( = )
        //  this ClassName should match the first one we used (Scanner)
        //parenthesis could empty or not ()
        Scanner userInput = new Scanner (System.in);

        //now we can use various scanner methods to get user inputs
        //the method we use depends on the data we are hoping to capture
        //in order to use the methods we have to follow the syntax
        //variable_name (This is whatever you called it)
        //.methodName (we need th . before the name)
        //parenthesis () we could be empty or not
        System.out.println("Enter a number");
        userInput.nextInt ();

        //whenever a Scanner method is reached the program will wait for input without a prompt to the user
        //they way have no idea that te program is waiting on them,
        //we should always prompt them, letting them know that we are waiting
        //we should also STORE their data into an appropriate/matching data type variable
        int userNum = userInput.nextInt ();

        //whenever we use .next(), .nextInt(), .nextDouble(), .nextFloat(),
        //we must follow it up with the following code on the next line of code
        //variable_name.nextLine
        //once we have user input
        //we can manipulate their data


        int sum = userNum + 7;

        // we can print out the user input and any other variables
        //words go in between ""
        //variable don't
        //words and variables are separated
        // by +
        System.out.println("You entered " + userNum + " We added 7 to it and got " + sum);

        //when using certain scanner methods
        // a newline character is left in the buffer unless we clear that buffer
        // we will not be able to enter strings

        System.out.println("What is your name?");
        String name = userInput.nextLine();
        System.out.println("Welcome " + name);

        System.out.println(" to our program! ");












    }// end of main method
}// end of class
