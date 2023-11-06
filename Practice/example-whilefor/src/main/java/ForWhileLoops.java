import java.util.Scanner;
public class ForWhileLoops {
    public static void main(String[]args){
        Scanner userLanguage = new Scanner(System.in);

//looping allows parts of code to repeat
//repetition can be a predefined number of times or user choice amount
//two main kinds of loops while and for
//both are similar but vary in syntax setup
//while loops requite a counter ot be made outside of the loop
//counter checked in condition
//counter updated inside the loop
//leaves when counter check is false
//while loops are nicer when dealing with user choice
        System.out.println("Enter a language to see how to say \"hello\" enter \"finished\" to quit.");
        String language = userLanguage.nextLine();
//without updating the counter we will end up in an infinite loop
//condition check will never be changing
//we are looping the way below to leave the number of times to loop up to user choice
//we will continue to loop until they enter the word finished
//have a number or word the user must enter to stop a loop is known as a Sentinel value
        while(!"finished".equals(language)) {

            if ("french".equalsIgnoreCase(language)) {

                System.out.println("Bonjour");

            } else if ("spanish".equalsIgnoreCase(language)) {
                System.out.println("Hola");
            } else if ("chinese".equalsIgnoreCase(language)) {
                System.out.println("Ni Hoa");
            } else if ("Italian".equalsIgnoreCase(language)) {
                System.out.println("Ciao");
            } else{
                System.out.println("Sorry not recognized");
            }
            System.out.println("Enter a language to see how to say \"hello\" enter \"finished\" to quit.");
            language = userLanguage.nextLine ();

        }//end while user not finished

//sometimes we want to loop a predetermined amount of time
//this can be done while loop remember counter outside, check counter, update counter inside

        int counter = 0;
        while (counter < 5) {

            System.out.println("Counter: " + counter);
            counter++;

        }//end of while counter less than 5
//for loop is "cleaner" when we have a predetermine number times to loop
//the concept of, making counter, check counter, and update counter still happen but they all happen on one line

//syntax: for loops have 3 sections in header for (this is a keyword) parentheses (;;)
//the sections are separated by ;
//the first section: init (we make the counter)
//this is only run once
// second section: condition check (terminating clause)
// third section: update counter

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a language");
            if ("french".equalsIgnoreCase(language)) {

                System.out.println("Bonjour");

            } else if ("spanish".equalsIgnoreCase(language)) {
                System.out.println("Hola");
            }else {
                System.out.println("sorry");
            }


        }//end of for loop 3 times


    }//end of main
}//end of class