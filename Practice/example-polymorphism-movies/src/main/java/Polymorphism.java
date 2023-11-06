class Movie {
    private String name;

    public Movie (String mName) {

        name = mName;

    }

    public String plot() {

        return "The plot is in another castle";

    }

    public String getName () {

        return name;

    }

}

class Jaws extends Movie {

    public Jaws () {

        super("Jaws");

    }

    @Override

    public String plot () {

        return "A shark ruins summer";

    }

}

class MenInBlack extends Movie {

    public MenInBlack () {

        super("Men In Black");

    }

    public String plot () {

        return "Will Smith, erases people's minds and lots of sugar";

    }

}

class ShawshankRedemption extends Movie {

    public ShawshankRedemption () {

        super("Shawshank redemption");

    }

    public String plot() {

        return "Tim Robbins and Morgan freeman bromance";
    }

}

class StarWars extends Movie {

    public StarWars () {

        super("Star Wars");

    }

    public String plot () {

        return "A boy reconnects with his thout to be dead father. Lightning fingers";

    }

}

class Forgettable extends Movie {

    public Forgettable () {

        super ("Forgettable");

    }

}

public class Polymorphism{

    public static void main(String[] args) {

        //calling movie.plot() shows how ploymorphism works.
        //what is happening is Java is looking at the object called Movie (variable)
        //and then getting the type returned from a random method
        //then it will go to the object type class, and see if there is a plot() method
        //in that class
        //If no plot() method exists then the one from the Movie is run

        for (int i = 1; i <= 10; i++) {

            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n Plot: " + movie.plot() + "\n");

        }

    }//end of main

    //return type is the object movie, its purpose is to return a random movie one of the 5 we made

    public static Movie randomMovie () {

        int randomNum = (int) (Math.random() * 5) + 1;

        System.out.println("Random num generated was: " + randomNum);

        switch (randomNum) {

            case 1:
                return new Jaws();
            case 2:
                return new MenInBlack();
            case 3:
                return new ShawshankRedemption();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable ();
            default:
                return null;
        }

    }

}//end of class