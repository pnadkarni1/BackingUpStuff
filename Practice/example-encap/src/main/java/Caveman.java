public class Caveman {

    //encapsulation is hiding things that the rest of the world doesn't need to see

    //internal hidden information

    private String name;
    private int age;
    private boolean canMakeFire;

    //constructor match the same name as the class a constructor should provide values to ALL instance variables
    //those values come from either parameters or default literals

    public Caveman (String cName, int cAge) {

        //when setting instance value it is always instance_var = parameter

        name = cName;
        age = cAge;
        canMakeFire = false;

    }

    //implement relevant feature to outside

    public void lightFire () {
        if (!ableToMakeFire ()) {

            System.out.println("You are too young to start a fire.");

        }else {

            if (gatherWood () && findFireStone ()) {

                System.out.println("Fire Started");

            }else {

                System.out.println ("You Attempted to start a fire but it started to rain, better luck next time.");

            }

        }
    }//end of lightFire

    //getter return the same data type of the instance variable they are retreiving, no parameters
    public String getName () {

        return name;

    }

    public int getAge () {

        return age;

    }

    public boolean getCanMakeFire () {

        return canMakeFire;

    }

    //setters- void return, take parameter, parameter data type need to match
    //instance variable setting data type

    public void setName (String cName ) {

        name = cName;

    }

    public void increaseAge (int moonPassages) {

        if (moonPassages > 7) {

            System.out.println("Happy Birthday!");
            age++;

        }else {

            System.out.println("No Birthday :(");


        }

    }

    //internal hidden objects details we can change these method freely without imapcting anything outside
    //to us

    private boolean ableToMakeFire () {

        //TODO determine right age
        return age >= 4;

    }

    private boolean gatherWood () {

        //TODO figure out rules
        if ("A".equalsIgnoreCase (name.substring (0,1))) {

            System.out.println("Woah, you found wood");
            return true;

        }else {

            System.out.println("Poor Name choice, you get hit with branch");

            return false;

        }

    }

    private boolean findFireStone () {

        //TODO figure out rules
        if (age >= 6) {

            System.out.println("You notice a rock glowing with the fires of 1000 buring suns");
            return true;

        }else {

            System.out.println("You slipped on a wet rock RIP");
            return false;

        }

    }

}
