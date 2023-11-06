[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/L2y7pnbQ)
# Solo Quest: Play It Again
**`Quest Giver: Courier Nightsong`**
>I am leaving on an airship tomorrow that is going to take 17 hours to reach its destination.  It will be the easiest delivery I have ever made.  However, I need some media to help me get through it.  I would like or organize the ultimate playlist of movies.  Can you help me?

## Quest Overview
This quest has us pretending we are traveling on a long flight.  We want to put into practice the concepts of a LinkedList.  We will be researching and creating a small list of movies to watch on the flight but they will be structured inside a LinkedList that we built ourselves.

**No prebuilt LinkedList or Node class can be used from Java or another outside source.  This also means no prebuilt LinkedList or Node methods can be used.  Everything you use has to be built yourself.  We have our custom Node and LinkedList classes which are a good starting point**

## Objectives Required to complete
### Objective 1 - Designing a Plan
Our design plan should outline the steps being accomplished in each method of our program.  The [design example](designexample.txt) displays a design plan to base the one needed for this project.

When creating a design plan for this project place it in the `Design Plan` folder there is an empty text-file in there for us to type out our plan in.  Remember design plans should be pushed and requested for approval before coding.

### Objective 2 - Cloning
#### Tasks to Complete for this Objective
- Clone this project into IntelliJ
    - remember to place it into a correct folder
 
## Quest Requirements
The bullet points in this section are the bare minimum needed.  There are often when exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic are required with certain steps.

### Objective 1 - Movie Research and Movie Class
Creating the ultimate movie playlist will require some research and thought.  There are several things to consider.  I need 7 movies that will cover my 17 hours of flight.  I do not want to be left guessing what happens in a movie so I do not want the total runtimes to exceed 17 hours.  I am okay if it is a little shorter about 30 minutes short will be acceptable.

#### Tasks to Complete for this Objective
- Research movie choices
    - For each movie found you will need the following:
        - Title
        - Director
        - Plot
        - Runtime
        - Year released
    - You cannot have more than 3 movies from the same year of release
- Complete the `Movie` class
    - A simple `Movie` class will be provided
        - Modification of this class is acceptable
            - Nothing should be deleted from it
            - Only additions allowed
        - It should have appropriate constructors, getters, setters, and other methods
        - Other methods should include a plot, runtime, and year released

### Objective 2 - LinkedListMovie Class and Node Class
We want to traverse through this playlist.  However, there needs to be the ability to grow and shrink the playlist as needed dynamically, with no arrays.  We will do this using a LinkedList, but not the built-in class provided by Java.  We will create our LinkedList class and our Node class.  These will be simplified versions of the full data structures provided by Java.

#### Tasks to Complete for this Objective
- Create a class called `Node`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
- Create instance variables of
    - Object type, the information inside the node
    - Node type, the reference to the next Node object
- Create a constructor that takes both instance variables as parameters
- Create the following methods
```Java
public Object getData () {

}
``` 
```Java
public Node getNext () {
    
}
``` 
```Java
public void setData (Object valueToSet) {
    
}
``` 
```Java
public void setNext (Node nextNode) {
    
}
```  

All these methods should be single lines of code and do not have to be complex.  You may use the Node class we built as an example.  It will not need any modification.  You may build it as an inner class to the LinkedListMovie or as an extra standalone class the preference is yours.

- Create a class called `LinkedListMovie`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
- Create instance variable(s)
    - Node, the first/head node in the list
- Create a default constructor (no parameters)
    - Set the head node correctly when this is created
- Create the following methods

```Java
public boolean isEmpty () {

}
```
- Return if the list is empty or not

```Java
public Node getHeadNode () {

}
```
- Returns the head node
- This will allow us to traverse the list

```Java
public void setHeadNode (Node node) {

}
```
- Should change the first node of the list

```Java
public void addNewHead (Object obj) {

}
```
- Insert this object at the front of the list
- There is a test you should run here to know how to add

```Java
public void addNewTail (Object obj) {

}
```
- Insert this object at the end of the list
- You will have a similar test here that you did have in the `addNewHead` method
- You will also need a loop in here as you need to reach the end of the list

```Java
public void addNewNode (Object obj, int nodeLocation) {

}
```
- Insert this object at the node location number
- You will also need a loop in here as you need to reach the correct location spot
- You should recall how we insert and readjust the pointer order which is important for this method

```Java
public Object removeHead () {

}
```
- Remove and return the first element in the list
- Make sure you capture the `Object` being removed before you readjust references

```Java
public Object removeTail () {

}
```
- Remove and return the last element in the list
- Make sure you capture the `Object` being removed before you readjust references
- You will need a loop traversing through the list

```Java
public String toString () {

}
```
- Return a String that displays all elements from the list
- You will need a test for different states on the list
- You will need a loop for traversing

You may use some of the code that we wrote in our example LinkedList class.  The methods we wrote will not need much modification.  However, we did not complete all the required methods so you will have to write some of them on your own.

### Objective 3 - AirShipPlaylist Class
Once you have the foundation built you can start writing the functionality of this lab.  We will need to have the user interact with our list.

#### Tasks to Complete for this Objective
- Create 7 `Movie` objects
- Add the 7 `Movie` objects to the LinkedList
- Give the user options to:
    ```
    1: Print the Movie list
    2: Print a plot for a specific movie
        - Get the name of the Movie you want the plot for
    3: Print the total times for all movies
        - Time should be displayed in HH:MM:SS format
    4: Print out the list of movies with options
        - Give the option to print the LinkedList in one of the following two alphabetical ways:
            - title
            - director
            - release date, ascending by year
        - You will need a second list to do this, the original and then a sorted one in the various orders
    ```
- This information should be received by moving through the LinkedList to find the appropriate information not using the `Movie` objects directly

### Objective 4 - Unit Testing
- Write tests for the `LinkedListMovie` class
- You will need to test the void methods of this class
    - these void methods will be called but then you should use the `toString` method to ensure the output you are getting back after calling a void method is correct
    - for example, call the `void addNewHead` and then when asserting the output do it using the `toString` which would print out everything so you could test if the new head was created

When building these unit tests you can create movie objects to fill up the LinkedList.

### Objective 5 - Pushing back to GitHub
#### Tasks to Complete for this Objective
- Push all your commits to GitHub on both the main, dev, and any other branches you make
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

The committing and pushing process does not change it is always the same.  If you are confused or struggling with this process please reach out and let me know.

**Note:** Only the code on the main branch will be graded.  It is important to make sure you are happy with your main branch.  You can check if your code is only GitHub by logging in, finding your repo based on the assignment, and checking the commit messages on the page that loads.  These are in the middle column of the little box at the top.  You should see your most recent commit message next to whatever files/folder you pushed.

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 5            | documentation                               |
| 5            | runtime requirement met                     |
| 6            | display by title or director                |
| 3            | display by release year                     |
| 3            | display plot                                |
| 3            | display total runtime                       |
| 10           | LinkedListMovie methods                     |

