public class MathOrder {
    public static void main(String[] args){
//java has the same order of operations as math class
        int result = 6 * 7 -9 - 8 * 9; //-39
        System.out.println("result is " + result);
//we can mix variables and literals in one expression
        double number = 7.3;
        double doubleAnswer = 8 * number - 7 + 14 * 3 - number;
        System.out.println("Answer is " + doubleAnswer);
//remember human readability is important when writing code
//it is useful to give help whenever possible
        doubleAnswer = (8 * number) - 7 + (14 * 3) - number;
        System.out.println(doubleAnswer);
//in programming we have a new operator for math calculator
//it is called modulus, and it is symbolized with the %
//modulus can be thought of a clock operations
//you create a clock with z numbers
//you go around that clock a certain amount of hours
//whatever number you end on is the answer
//in short modulus returns the remainder of division
//we have a clock with 7 digits
//we will still go around the clock 11 hours
//if we drew this out we would end up on 4
        int modResult = 11 % 7;
        System.out.println("Mod result is " + modResult);

        //the computer requires very specific directions
        //if we give te computer two integers to divide we will get back an integer no matter what data type we're storing in

        double intDivision = 2/3;
        System.out.println("Int division stored " + "in double variable" + intDivision);

        //in order to get a decimal value one of the two numbers need to be a floating point number

        double normalDiv= 2.0/3;
        System.out.println("Normal division " + "correct result " + normalDiv);

        //sometimes we are given a double answer, but we only care about the integer part we only want the integer part
        //we want to store it into an int  we cannot store a double into an int
        //we temporarily covert our double value into an int value for storing this done "typecasting"
        //syntax for typecasting
        //we place the (Type) before the variable
        //we want converted

        //Math.random() returns a double answer we want a number between 1 and 10 (Math.random() * 10) this part gets typecast
        // we then add 1 to the final answer

        int randomNum = (int) (Math.random () * 10) + 1;
        System.out.println("Random num is " + randomNum);

        //sometimes we only want to add or subtract 1 from a number
        //instead of constantly typing variable_name= variable_name + 1;
        //we can say variable_name++
        //however, the ++ or -- can go before or after the variable name results of this will cause answers to be different

        int firstNum =  4;
        System.out.println("First number before is "")
        result = firstNum++ * 3;


        //shorthand operations
        //+=
        //-=
        //*=
        //%=

        int num = 7;
        num += 5; //same as num = num + 5;






    }
}