import java.util.Scanner;

public class AirShipPlaylist {

    public static void main(String[] args) {

        LinkedListMovie nightList = new LinkedListMovie();
        LinkedListMovie nieceList = new LinkedListMovie();

        Movie mi7 = new Movie("Mission Impossible 7", "Christopher McQuarrie");
        mi7.setRating("PG-13");
        mi7.setPlot("A submarine AI has gone wrong and is planning to end the world. Spies from other nations attempt to stop it. Part 1 of 2 Part Movie");
        mi7.setReleaseYear(2023);
        mi7.setRuntimeInMinutes(162);

        Movie bond = new Movie("No Time to Die", "Cary Joji Fukunaga");
        bond.setRating("PG-13");
        bond.setPlot("Former villain has a plan to kill everyone on the planet with a virus. James Bond attempts to stop him, but sacrifices himself.");
        bond.setReleaseYear(2022);
        bond.setRuntimeInMinutes(163);

        Movie ff = new Movie("Fast and Furious: Tokyo Drift", "Justin Lin");
        ff.setRating("PG-13");
        ff.setPlot("Fast Cars go brrrrr in Tokyo and people die. Main characters street race in Tokyo, but someone dies.");
        ff.setReleaseYear(2006);
        ff.setRuntimeInMinutes(102);

        Movie hitman = new Movie("Hitman: Agent 47", "Aleksander Bach");
        hitman.setRating("R");
        hitman.setPlot("A hitman attempts to kill his target, but faces some challenges.");
        hitman.setReleaseYear(2015);
        hitman.setRuntimeInMinutes(96);

        Movie uncharted = new Movie("Uncharted", "Ruben Fleischer");
        uncharted.setRating("PG-13");
        uncharted.setPlot("Younger brother attempts to find older brother, but gets caught up in a treasure hunt.");
        uncharted.setReleaseYear(2022);
        uncharted.setRuntimeInMinutes(116);

        Movie bb1 = new Movie("Bahubali: The Beginning", "S. S. Rajamouli");
        bb1.setRating("PG");
        bb1.setPlot("Man climbs over a mountain and tries to save a princess, who is his mom, and learns about his past");
        bb1.setReleaseYear(2015);
        bb1.setRuntimeInMinutes(159);

        Movie bb2 = new Movie("Bahubali: The Conclusion", "S. S. Rajamouli");
        bb2.setRating("PG");
        bb2.setPlot("Man that climbed over a mountain past is happening, and then back in the present tries to help defeat the bad guys from his past.");
        bb2.setReleaseYear(2017);
        bb2.setRuntimeInMinutes(197);

        nightList.newHeadNode(bb2);
        nightList.newHeadNode(bb1);
        nightList.newHeadNode(uncharted);
        nightList.newHeadNode(hitman);
        nightList.newHeadNode(ff);
        nightList.newHeadNode(bond);
        nightList.newHeadNode(mi7);

        Movie oz = new Movie("Oz the Great and the Powerful", "Sam Raimi");
        oz.setRating("PG");
        oz.setPlot("A man from the circus goes away from Kansas, and figures out that he is the Wizard of Oz. He must figure out the good from the bad.");
        oz.setReleaseYear(2013);
        oz.setRuntimeInMinutes(130);

        Movie kkid = new Movie("The Karate Kid", "John G. Avildsen");
        kkid.setRating("PG");
        kkid.setPlot("Kid gets bullied and enters a karate competition. He finds a sensei to win the competition.");
        kkid.setReleaseYear(1983);
        kkid.setRuntimeInMinutes(122);

        Movie fox = new Movie("Fantastic Mr Fox", "Wes Anderson");
        fox.setRating("PG");
        fox.setPlot("A human fox breaks a promise and raids his neighbor. He starts going back to primal instincts and goes underground. Mr. Fox has to face opposition.");
        fox.setReleaseYear(2009);
        fox.setRuntimeInMinutes(87);

        nieceList.addNewTail(oz);
        nieceList.addNewTail(kkid);
        nieceList.addNewTail(fox);

        boolean stay = true;

        Scanner scanner = new Scanner(System.in);

        while (stay) {

            System.out.println("What would you like to do?:");

            System.out.println(Color.BLACK_BRIGHT_BOLD +"0: Quit\n" + Color.CYAN +
                    "1: Print the Movie list\n" + Color.YELLOW +
                    "2: Print a plot for a specific movie\n" + Color.BLUE +
                    "3: Print the total times for movies\n" + Color.MAGENTA +
                    "4: Print out the list of movies with options\n" + Color.GREEN +
                    "5: Print out all movies of particular rating\n" + Color.WHITE +
                    "6: Print out Max Runtime Movie and Min Runtime Movie\n" + Color.BLACK_BRIGHT_BOLD +
                    "Number only!" + Color.RESET);

            String ans = scanner.nextLine();

            if (ans.equals("0")) {

                stay = false;

            }
            if (ans.equals("1")) {

                System.out.println(Color.CYAN + "Which movie list would you like to print?\n" + Color.CYAN_BRIGHT + "1: Nightsong List\n" + Color.CYAN_BRIGHT_BOLD + "2: Niece List" + Color.RESET);
                String user = scanner.nextLine();

                if (user.equals("1")) {

                    System.out.println(Color.CYAN_BRIGHT + nightList.toString() + Color.RESET);

                } else if (user.equals("2")) {

                    System.out.println(Color.CYAN_BRIGHT_BOLD + nieceList.toString() + Color.RESET);

                }

            }
            if (ans.equals("2")) {

                System.out.println(Color.YELLOW + "What movie you would like to find the plot to?" + Color.RESET);
                String user = scanner.nextLine();

                if (nightList.findPlot(user) != null) {

                    System.out.println(Color.YELLOW + "Here is " + user + " plot:\n" + nightList.findPlot(user) + Color.RESET);

                } else if (nieceList.findPlot(user) != null) {

                    System.out.println(Color.YELLOW + "Here is " + user + " plot:\n" + nieceList.findPlot(user) + Color.RESET);

                } else {

                    System.out.println(Color.RED_UNDERLINE+"Could not find that movie" + Color.RESET);

                }

            }
            if (ans.equals("3")) {

                System.out.println(Color.BLUE + "Which list would you like the runtime for?\n" + Color.BLUE_BRIGHT+ "1: Nightsong\n" + Color.BLUE_BRIGHT_BOLD+"2: Niece" + Color.RESET);
                String user = scanner.nextLine();

                if (user.equals("1")) {

                    System.out.println(Color.BLUE_BRIGHT+ "The runtime for Nightsong is " + nightList.totalRuntime() + Color.RESET);

                } else if (user.equals("2")) {

                    System.out.println(Color.BLUE_BRIGHT_BOLD+ "The runtime for the Niece is " + nieceList.totalRuntime() + Color.RESET);

                }

            }
            if (ans.equals("4")) {

                System.out.println(Color.MAGENTA+"How would you like to print it out?\n" + Color.MAGENTA_UNDERLINE+"1: By Title\n" + Color.MAGENTA_BRIGHT+"2: By Director\n" + Color.MAGENTA_BRIGHT_BOLD+"3: By year, ascending" + Color.RESET);

                String user = scanner.nextLine();

                if (user.equals("1")) {

                    System.out.println( Color.MAGENTA_UNDERLINE+"Which lists would you like to print out?\n" + "1: Nightsong\n" + "2: Niece\n" + "3: Both lists" + Color.RESET);
                    String user1 = scanner.nextLine();

                    if (user1.equals("1")) {

                        System.out.println();
                        System.out.println(Color.MAGENTA_UNDERLINE+nightList.sortMovies(1) + Color.RESET);

                    }
                    if (user1.equals("2")) {

                        System.out.println();
                        System.out.println(Color.MAGENTA_UNDERLINE+nieceList.sortMovies(1) + Color.RESET);

                    }
                    if (user1.equals("3")) {

                        nightList.newHeadNode(oz);
                        nightList.newHeadNode(kkid);
                        nightList.newHeadNode(fox);

                        System.out.println();
                        System.out.println(Color.MAGENTA_UNDERLINE+nightList.sortMovies(1) + Color.RESET);

                        nightList.removeHead();
                        nightList.removeHead();
                        nightList.removeHead();

                    }

                }
                if (user.equals("2")) {

                    System.out.println(Color.MAGENTA_BRIGHT+"Which lists would you like to print out?\n" + "1: Nightsong\n" + "2: Niece\n" + "3: Both lists" + Color.RESET);
                    String user1 = scanner.nextLine();

                    if (user1.equals("1")) {

                        System.out.println();
                        System.out.println(Color.MAGENTA_BRIGHT+nightList.sortMovies(2) + Color.RESET);

                    }
                    if (user1.equals("2")) {

                        System.out.println();
                        System.out.println(Color.MAGENTA_BRIGHT+nieceList.sortMovies(2) + Color.RESET);

                    }
                    if (user1.equals("3")) {

                        nightList.newHeadNode(oz);
                        nightList.newHeadNode(kkid);
                        nightList.newHeadNode(fox);

                        System.out.println();
                        System.out.println(Color.MAGENTA_BRIGHT+nightList.sortMovies(2) + Color.RESET);

                        nightList.removeHead();
                        nightList.removeHead();
                        nightList.removeHead();

                    }
                }
                if (user.equals("3")) {

                    System.out.println( Color.MAGENTA_BRIGHT_BOLD+"Which lists would you like to print out?\n" + "1: Nightsong\n" + "2: Niece\n" + "3: Both lists" + Color.RESET);
                    String user1 = scanner.nextLine();

                    if (user1.equals("1")) {

                        System.out.println();
                        System.out.println( Color.MAGENTA_BRIGHT_BOLD+nightList.sortMovies(3) + Color.RESET);

                    }
                    if (user1.equals("2")) {

                        System.out.println();
                        System.out.println( Color.MAGENTA_BRIGHT_BOLD+nieceList.sortMovies(3) + Color.RESET);

                    }
                    if (user1.equals("3")) {

                        nightList.newHeadNode(oz);
                        nightList.newHeadNode(kkid);
                        nightList.newHeadNode(fox);

                        System.out.println();
                        System.out.println( Color.MAGENTA_BRIGHT_BOLD+nightList.sortMovies(3) + Color.RESET);

                        nightList.removeHead();
                        nightList.removeHead();
                        nightList.removeHead();

                    }
                }

            }
            if (ans.equals("5")) {

                System.out.println(Color.GREEN+"What rating would you like to find?\n" + Color.GREEN_BRIGHT+
                        "1: G\n" +Color.GREEN_UNDERLINE+
                        "2: PG\n" +Color.GREEN_BRIGHT_BOLD +
                        "3: PG-13\n" +Color.GREEN_BOLD +
                        "4: R" + Color.RESET);

                String user = scanner.nextLine();

                if (user.equals("1")) {

                    nightList.newHeadNode(oz);
                    nightList.newHeadNode(kkid);
                    nightList.newHeadNode(fox);

                    System.out.println();
                    System.out.println(Color.GREEN_BRIGHT+nightList.moviesOfRating(1) + Color.RESET);

                    nightList.removeHead();
                    nightList.removeHead();
                    nightList.removeHead();

                }else if (user.equals("2")) {

                    nightList.newHeadNode(oz);
                    nightList.newHeadNode(kkid);
                    nightList.newHeadNode(fox);

                    System.out.println();
                    System.out.println(Color.GREEN_UNDERLINE+nightList.moviesOfRating(2) + Color.RESET);

                    nightList.removeHead();
                    nightList.removeHead();
                    nightList.removeHead();

                }else if (user.equals("3")) {

                    nightList.newHeadNode(oz);
                    nightList.newHeadNode(kkid);
                    nightList.newHeadNode(fox);

                    System.out.println();
                    System.out.println(Color.GREEN_BRIGHT_BOLD +nightList.moviesOfRating(3) + Color.RESET);

                    nightList.removeHead();
                    nightList.removeHead();
                    nightList.removeHead();

                }else if (user.equals("4")) {

                    nightList.newHeadNode(oz);
                    nightList.newHeadNode(kkid);
                    nightList.newHeadNode(fox);

                    System.out.println();
                    System.out.println(Color.GREEN_BOLD +nightList.moviesOfRating(4) + Color.RESET);

                    nightList.removeHead();
                    nightList.removeHead();
                    nightList.removeHead();

                }


            }else if (ans.equals("6")) {

                nightList.newHeadNode(oz);
                nightList.newHeadNode(kkid);
                nightList.newHeadNode(fox);

                System.out.println(Color.YELLOW_BRIGHT_BOLD+nightList.getMaxAndMinRuntime()+"\n" + Color.RESET);

                nightList.removeHead();
                nightList.removeHead();
                nightList.removeHead();

            }

        }

    }

}
