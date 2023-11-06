import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedListMovie {
    private Node head;

    public LinkedListMovie() {

        head = null;

    }

    public boolean isEmpty() {

        return head == null;

    }

    public Object getHeadNode() {

        return head;

    }

    public void setHeadNode(Node node) {

        if (isEmpty()) {

            Movie temp = (Movie) node.getData();

            newHeadNode(temp);
            return;

        }

        Movie highest = (Movie) head.getData();
        Movie lowest = (Movie) head.getData();
        Movie current = (Movie) node.getData();

        if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

            highest = current;

        }else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

            lowest = current;

        }

        node.setNext(head.getNext());
        head = node;

        head.setHighestRuntime(highest);
        head.setLowestRuntime(lowest);

    }

    public void newHeadNode(Object obj) {

         Node node = new Node((Movie) obj, null);

         Movie test = (Movie) node.getData();

        if (isEmpty()) {

            Node n = new Node((Movie) obj, null);
            head = n;
            head.setLowestRuntime((Movie) n.getData());
            head.setHighestRuntime((Movie) n.getData());

        } else {

            Node n = new Node((Movie) obj, head);

            Movie highest = (Movie) head.getHighestRuntime();
            Movie lowest = (Movie) head.getLowestRuntime();
            Movie current = (Movie) n.getData();

            head = n;

            if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

                head.setHighestRuntime(current);
                head.setLowestRuntime(lowest);

            }else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

                head.setLowestRuntime(current);
                head.setHighestRuntime(highest);

            }else {

                head.setHighestRuntime(highest);
                head.setLowestRuntime(lowest);

            }

        }

    }

    public void addNewTail(Object obj) {

        Node currentNode = head;
        Node previousNode = null;

        while (currentNode != null) {

            previousNode = currentNode;
            currentNode = currentNode.getNext();

        }

        if (previousNode == null) {

            newHeadNode((Movie) obj);

        } else {

            Node n = new Node((Movie) obj, null);

            Movie highest = (Movie) head.getData();
            Movie lowest = (Movie) head.getData();
            Movie current = (Movie) n.getData();

            if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

                head.setHighestRuntime(current);
                head.setLowestRuntime(lowest);

            }else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

                head.setLowestRuntime((current));
                head.setHighestRuntime(highest);

            }else {

                head.setLowestRuntime(lowest);
                head.setHighestRuntime(highest);

            }

            previousNode.setNext(n);

        }

    }

    public void addNewNode(Object object, int nodeLocation) {

        if (isEmpty()) {

            newHeadNode((Movie) object);
            return;

        }

        int counter = 0;

        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.getNext() != null && counter < nodeLocation) {

            previousNode = currentNode;
            currentNode = currentNode.getNext();
            counter++;

        }

        Node n = new Node((Movie) object, currentNode);

        Movie highest = (Movie) head.getHighestRuntime();
        Movie lowest = (Movie) head.getLowestRuntime();
        Movie current = (Movie) n.getData();

        if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

            head.setHighestRuntime(current);
            head.setLowestRuntime(lowest);

        }else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

            head.setLowestRuntime((current));
            head.setHighestRuntime(highest);

        }else {

            head.setLowestRuntime(lowest);
            head.setHighestRuntime(highest);

        }

        previousNode.setNext(n);
        currentNode.setNext(currentNode.getNext());

    }

    public Object removeHead() {

        Node temp = head;

        Movie highest = (Movie) head.getHighestRuntime();
        Movie lowest = (Movie) head.getLowestRuntime();
        Movie current = (Movie) head.getData();
        Node currentNode = head;

        if (current.getRuntimeInMinutes() == highest.getRuntimeInMinutes() || current.getRuntimeInMinutes() == lowest.getRuntimeInMinutes()) {

            currentNode = head.getNext();
            highest = (Movie) currentNode.getData();
            lowest = (Movie) currentNode.getData();

            while (currentNode != null) {

                current = (Movie) currentNode.getData();

                if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

                    highest = current;

                }else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

                    lowest = current;

                }

                currentNode = currentNode.getNext();

            }

        }

        head = head.getNext();

        head.setHighestRuntime(highest);
        head.setLowestRuntime(lowest);

        return temp.getData();

    }

    public Object removeFromTail() {

        if (isEmpty()) {

            throw new NoSuchElementException("Cannot remove item from empty list");

        }

        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.getNext() != null) {

            previousNode = currentNode;
            currentNode = currentNode.getNext();

        }

        Object removed = currentNode.getData();

        if (previousNode == null) {

            head = null;

        } else {

            Movie highest = (Movie) head.getHighestRuntime();
            Movie lowest = (Movie) head.getLowestRuntime();
            Movie current = (Movie) head.getData();
            Node tempCurrentNode = head;

            if (current.getRuntimeInMinutes() == highest.getRuntimeInMinutes() || current.getRuntimeInMinutes() == lowest.getRuntimeInMinutes()) {

                highest = (Movie) head.getData();
                lowest = (Movie) head.getData();

                while (tempCurrentNode.getNext() != null) {

                    current = (Movie) tempCurrentNode.getData();

                    if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

                        highest = current;

                    }else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

                        lowest = current;

                    }

                    tempCurrentNode = tempCurrentNode.getNext();

                }

            }

            previousNode.setNext(null);

            head.setLowestRuntime(lowest);
            head.setHighestRuntime(highest);

        }

        return removed;

    }

    public String sortMovies(int sortType) {

        LinkedListMovie sorted = new LinkedListMovie();

        LinkedListMovie original = new LinkedListMovie();

        Node current = head;

        int movieAmount = 0;

        while (current != null) {

            Movie temp = (Movie) current.getData();

            original.addNewTail(temp);

            current = current.getNext();

            movieAmount++;

        }

        if (sortType == 1) {

            for (int i = 0; i < movieAmount; i++) {

                Node currentNode = (Node) original.getHeadNode();
                Movie highestMovie = (Movie) currentNode.getData();

                int counter = 0;
                int deleteIndex = 0;

                Node insideLoop = (Node) original.getHeadNode();

                while (insideLoop != null) {

                    Movie currentMovie = (Movie) insideLoop.getData();

                    if (highestMovie.getTitle().compareToIgnoreCase(currentMovie.getTitle()) > 0) {

                        highestMovie = currentMovie;
                        deleteIndex = counter;


                    }

                    counter++;

                    insideLoop = insideLoop.getNext();

                }

                sorted.addNewTail(highestMovie);
                original.deleteNode(deleteIndex);

                currentNode = currentNode.getNext();

            }

        } else if (sortType == 2) {


            for (int i = 0; i < movieAmount; i++) {

                Node currentNode = (Node) original.getHeadNode();
                Movie highestMovie = (Movie) currentNode.getData();

                int counter = 0;
                int deleteIndex = 0;

                Node insideLoop = (Node) original.getHeadNode();

                while (insideLoop != null) {

                    Movie currentMovie = (Movie) insideLoop.getData();

                    if (highestMovie.getDirector().compareToIgnoreCase(currentMovie.getDirector()) > 0) {

                        highestMovie = currentMovie;
                        deleteIndex = counter;


                    }

                    counter++;

                    insideLoop = insideLoop.getNext();

                }

                sorted.addNewTail(highestMovie);
                original.deleteNode(deleteIndex);

                currentNode = currentNode.getNext();

            }


        } else if (sortType == 3) {

            for (int i = 0; i < movieAmount; i++) {

                Node currentNode = (Node) original.getHeadNode();
                Movie lowestMovie = (Movie) currentNode.getData();

                int counter = 0;
                int deleteIndex = 0;

                Node insideLoop = (Node) original.getHeadNode();

                while (insideLoop != null) {

                    Movie currentMovie = (Movie) insideLoop.getData();

                    if (lowestMovie.getReleaseYear() > currentMovie.getReleaseYear()) {

                        lowestMovie = currentMovie;
                        deleteIndex = counter;


                    }

                    counter++;

                    insideLoop = insideLoop.getNext();

                }

                sorted.addNewTail(lowestMovie);
                original.deleteNode(deleteIndex);

                currentNode = currentNode.getNext();

            }

        }

        return sorted.toString();

    }

    private void deleteNode(int index) {

        Node currentNode = head;
        Node previousNode = null;
        int counter = 0;

        if (index == 0) {

            Movie highest = (Movie) head.getHighestRuntime();
            Movie lowest = (Movie) head.getLowestRuntime();
            Movie current = (Movie) head.getData();
            Node tempCurrentNode = head.getNext();

            if (highest != null && lowest != null) {

                while (tempCurrentNode != null) {

                    current = (Movie) tempCurrentNode.getData();

                    if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

                        highest = current;

                    } else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

                        lowest = current;

                    }

                    tempCurrentNode = tempCurrentNode.getNext();

                }


                head.setHighestRuntime(highest);
                head.setLowestRuntime(lowest);

            }

            head = currentNode.getNext();
            return;

        }

        while (counter < index) {

            previousNode = currentNode;
            currentNode = currentNode.getNext();
            counter++;

        }

        previousNode.setNext(currentNode.getNext());

        Movie highest = (Movie) head.getHighestRuntime();
        Movie lowest = (Movie) head.getLowestRuntime();
        Movie current = (Movie) head.getData();
        Node tempCurrentNode = head;

        if (highest != null && lowest != null) {

            while (tempCurrentNode != null) {

                current = (Movie) tempCurrentNode.getData();

                if (highest.getRuntimeInMinutes() < current.getRuntimeInMinutes()) {

                    highest = current;

                } else if (lowest.getRuntimeInMinutes() > current.getRuntimeInMinutes()) {

                    lowest = current;

                }

                tempCurrentNode = tempCurrentNode.getNext();

            }


            head.setHighestRuntime(highest);
            head.setLowestRuntime(lowest);

        }

    }

    public String totalRuntime() {

        Node current = head;
        int timeInMin = 0;

        while (current != null) {

            Movie currentMovie = (Movie) current.getData();

            timeInMin += currentMovie.getRuntimeInMinutes();

            current = current.getNext();

        }

        int hrs = timeInMin / 60;
        int min = timeInMin % 60;

        return hrs + ":" + min + ":00";

    }

    public String moviesOfRating(int rating) {

        StringBuilder movies = new StringBuilder();

        if (rating == 1) {

            Node current = head;

            while (current != null) {

                Movie currentMovie = (Movie) current.getData();

                if (currentMovie.getRating().equalsIgnoreCase("G")) {

                    movies.append(currentMovie.toString() + "\n\n");

                }

                current = current.getNext();

            }

        }
        if (rating == 2) {

            Node current = head;

            while (current != null) {

                Movie currentMovie = (Movie) current.getData();

                if (currentMovie.getRating().equalsIgnoreCase("PG")) {

                    movies.append(currentMovie.toString() + "\n\n");

                }
                current = current.getNext();
            }

        }
        if (rating == 3) {

            Node current = head;

            while (current != null) {

                Movie currentMovie = (Movie) current.getData();

                if (currentMovie.getRating().equalsIgnoreCase("PG-13")) {

                    movies.append(currentMovie.toString() + "\n\n");

                }
                current = current.getNext();
            }

        }
        if (rating == 4) {

            Node current = head;

            while (current != null) {

                Movie currentMovie = (Movie) current.getData();

                if (currentMovie.getRating().equalsIgnoreCase("R")) {

                    movies.append(currentMovie.toString() + "\n\n");

                }
                current = current.getNext();
            }

        }


        if (movies.toString().equalsIgnoreCase("")) {
            return "No movies with that rating.";
        }

        return movies.toString();

    }

    public String findPlot(String movie) {

        Node current = head;
        Movie movie1 = null;

        while (current != null) {

            Movie currentMovie = (Movie) current.getData();

            if (currentMovie.getTitle().equalsIgnoreCase(movie)) {

                movie1 = currentMovie;
                break;

            }

            current = current.getNext();

        }

        if (movie1 != null) {
            return movie1.getPlot();
        }
        return null;

    }

    public String getMaxAndMinRuntime () {

        return "\nHighest:\n\n" + head.getHighestRuntime().toString() + "\n\nLowest:\n\n" + head.getLowestRuntime().toString() + "\n\n";

    }

    public String toString() {

        StringBuilder output = new StringBuilder();

        Node currentNode = head;

        while (currentNode != null) {

            output.append(currentNode.getData());
            output.append("\n\n");
            currentNode = currentNode.getNext();

        }

        return output.toString();

    }


}
