public class StringsInMemory {

    public static void main(String [] args) {

        //primitive data types overwrite memory locations when values need to change
        int x = 8;
        x = 12;
        int y = x;
        System.out.println();
        //Strings are not primitive the value does not exist at the same memory location
        //instead a reference to another location is what we find in the sane location

        //Strings are also immutable which means once they are created they cannot be changed
        //if they are changed they actually create a new memory location instead of overwriting
        String firstString = "you sit on a throne of lies";
        System.out.println();
        firstString = "You sit on a throne of lies";
        System.out.println();

        //assigning a String variable to another String variable they end up pointing to the same memory location
        //Java does not make two separate memory locations like it does for primitives

        String secondString = "You're a wizard, 'arry";
        String thirdString = secondString;
        System.out.println("Second String: " + System.identityHashCode(secondString));
        System.out.println("Third String: " + System.identityHashCode(thirdString));
        secondString = "Orges are like onions";
        System.out.println();

        //when using the keyword "new String" to make a String
        //you force Java to make a String in a new memory location this happens even if the value of the String is
        //identical to on that already exists

        String fourthString = "I'm gonna steal the Declaration of Independence";
        String fifthString = new String ("I'm gonna steal the Declaration of Independence");
        System.out.println("Fourth String: " + System.identityHashCode(fourthString));
        System.out.println("Fifth String: " + System.identityHashCode(fifthString));
        boolean noMatch = fourthString == fifthString;
        System.out.println(noMatch);

        boolean match = fourthString.equals(fifthString);
        System.out.println(match);

    }//end of main

}//end of class
