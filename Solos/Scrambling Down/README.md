[![GitHub Classroom Workflow](https://github.com/csa2122v1/scrambling-down-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/scrambling-down-pnadkarni1/actions/workflows/classroom.yml)

# Solo Quest: Scrambling Down
**`Quest giver: Prospector Yorgen`**
>... then go three miles "Weast"?  Who unscrambled this map?  This is horribly wrong.  We cannot keep working off of this, I need a change.  I need to be able to unscramble this map... correctly.  At this point, I would take the ability to determine if the scrambled words match any of my unscrambled words.  If you help me determine this scrambled versus unscrambled mess I will share some of the mineral findings with you.

## Objectives required to complete
This lab has us checking words against each other.  One of the words will be scrambled up nonsense.  The second word will be unscrambled.  We need to determine if the two words are the same word or if they are not the same how many letters make them different.

We will be using composition in this lab as we have access to a file that will "randomly" pick a scrambled and unscrambled word for us if we use it correctly.

Remember composition boils down to make objects of one class inside another class as instance variables.

```Java
public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;
}
```

These three instance variables are object of three other classes that we need to make and create in order to use them inside the PC class.  Once we have created and initialized these objects we can use them throughout this PC class.

```Java
public class PC {
    public void bootUp () {
        theMonitor.turnOn();
        theMotherboard.sendElectricity();
    }

    public Case getCase () {
        return theCase;
    }
}
```

We can access public methods in these other classes and execute those methods from within methods in our own class like bootUp.  The bootUp method in the PC class executes the code from the Monitor class' turnOn method as well as theMotherboard's sendElectricity method.

We also can return the objects directly to another class so that class can access methods from within.  We are doing this with getCase() we are returning theCase object, therefore, any class that uses this method will suddenly have access to all Case class public methods without needing to be a case object potentially.

```Java
public class PCRunner {
    public static void main(String[] args) {
        PC ourPC = new PC();

        ourPC.bootUp();

        ourPC.getCase().changeLEDLights();
    }
}
```

Within a Runner class we can create a PC object and suddenly have access to more than just the PC class.  This is because the PC class uses composition, so we are able to access methods from within the Case, Monitor, Motherboard class without needing to make objects of those classes.  Our bootUp method does this.  We also have the ability to call a method directly from Case class without needed a Case object, we do this through the getCase() method as it returns a Case object we can then append on another method call that comes directly from the Case class.

### Objective 1 - Designing a Plan
Our design plan should outline the steps being accomplished in each method of our program.  The following sections will be examples of what is expected from us when it comes to the design plan.

```
main method:
    Step 1: List the major tasks (limit to no more than four or five tasks)
        if you have more than four or five tasks that is a good indicator that you should break out into another method
    Step 2: Decompose the design of each major step in the Step 1 design
    Step 3: Decompose remaining sections of the design in Step 2 to small enough section so they can be easily coded
        this might not be possible for ALL sections of part 2, but most math things or boolean expressions could be written
    Step 4: Combine design components from Steps 1, 2, 3, and 4
method X: (this would be an actual method name in the code)
    repeat the 4 steps from above
method Y: (this again would be an actual method name in the code)
    repeat the 4 steps from above
```

All the steps above are combined into one plan.  Step 4 means that you are combining all the other steps into a single plan.

### Objective 2 - Cloning
- Clone this project into IntelliJ
    - remember to place it into a correct folder

### Objective 3 - Getting a Build Badge
It is possible to check the passing of your code from within IntelliJ.  We can discuss how to do that at office hours if needed.

To get this badge you will need to go to GitHub and then get some code and paste that code into your README inside IntelliJ.

**On GitHub**
- Click on the "Actions" tab in the top section under your repo name
- Select the "GitHub Classroom Workflow" on the left-hand side
- Click on the "..." button that is next to the search bar on the page
    - Select "Create status badge" from the dropdown menu
- On the window the pops open
    - Branch choose "main" from the options
    - Event choose "push" from the options
    - Click the green "Copy" button at the bottom of this page

**In IntelliJ**
- Open the README.md file by double-clicking on it from the "Project Panel"
- Paste your badge code at the very top
    - Make a new space at the top and paste it above everything else

Each time we make a push to GitHub the badge will update to show "Error", "failing", "success" to let us know the status of our code against the unit tests written.

### Objective 4 - Branching from the main
- Click on the word "Git" in the bottom left corner of IntelliJ
    - Right-click on the word "main"
    - Choose "New branch from selected"
- On the popup name the branch `dev`
    - Leave the checkmark in "Checkout Branch"
    - Click "Create"

Now we have our `dev` branch, we double-check the bottom right corner it should say `dev`, not main.

We can now work on this `dev` branch.

## Quest Requirements
The bullet points in this section are the bare minimum needed.  There are often times where exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic is required with certain steps.

### Objective 1 - ShufflerCheck Class
We will need to create an appropriate class for this lab that will be used to work with our composition and tell use word differences.

Create a class called `ShufflerCheck`
- make the class in the following location (-> denotes going to a sub-folder)
- `src` -> `main` -> `java`
- This class should have one instance variable
    - A `PickWord` object
- Create a constructor for this class
    - with no parameters
        - initialize the `PickWord` object correctly based on its constructor

This requires us to open the `PickWord` file and look at the constructor of that class.  Are there required parameters for that constructor?  If so what does that mean we need to do when creating the object?

- Create a getter for the instance field
    - `getPickWordObj`
        - think about what the return type here should be, remember getters return type should match the instance variable they are returning
- Create a `howDifferent` method
    - take in two parameters
        - `String` unscrambled word
        - `String` scrambled word
    - return an integer representing how many letters are different between the two parameters
    - you may use `String` or `StringBuilder` only to accomplish this task, no collections, no turning yourself into a collection and then converting yourself back to a String or StringBuilder.  This means no chars too.

When working with the `howDifferent` method think about how you could compare two words , you cannot simply go letter-by-letter as one of the words is mixed up.  However, there are methods that can tell you if a certain letter exists inside a String or not.  How could you use this to your advantage.  Thinking about this out on paper will be helpful.

- Create a `isSameWord` method
    - take in two parameters
        - `String` unscrambled word
        - `String` scrambled word
    - return a boolean representing if the two passed words are the same or not
    - this method should **not implement any new code or move through either of the words** it should use the `howDifferent` method to get an answer

### Objective 2 - ShufflerRunner Class
This class will be where our main method runs from.  It will also be used to create ShufflerCheck objects and call the methods.

- Create a class called `ShufflerRunner`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

### Objective 3 - Main method
We want to build a method that cycles through a few words to test our code.

- Create a main method in the ShufflerRunner
- Create a `ShufflerCheck` object
- Create a `PickWord` object
- Ask the user how many words they wish to compare
    - You must compare this many words
    - This should happen in a loop
- Each time in the loop you should get a new unscrambled and scrambled word
    - Look through both the `ShufflerCheck` and `PickWord` classes to determine which class has the methods you want to user to achieve this
- You will be displaying some information to the user each time in the loop
    - display them the two words that were chosen
    - display to them how many letters are different between the two words
    - display to them if the words are the same or not `true` or `false`
        - think about a method you have that could return this result to you
- After you have compared however many words the user requested you will need to display the following information to the user
    - how many words compared were the same
    - what was the total letter difference between all the words compared
    - what was the average letter difference per comparison made

### Objective 4 - Merging to main and Pushing to GitHub
- Click on the word "Git" in the bottom left corner of IntelliJ
    - Select and right-click on "main"
        - this option should be under a heading of "Local" NOT "Remote"
- Select "Checkout" on the pop-out after clicking on main under Local Branches
    - This should switch IntelliJ back to the main branch
    - You should see the word "main" in the bottom right corner of the screen now
    - main should also have a little price tag icon next to it in the list on the "Git" window
- Now with `main` selected
    - Highlight and right-click on `dev`
    - Select Merge into Current
- Right click on `main`
    - Select Push
    - Make sure in the window that pops up you see your commits on the left panel and the file you want to push on the right panel
    - Click the `push` button at the bottom
- Right click on `dev`
    - Select `push`
    - On the window that appears click on the `push` button

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 5            | documentation                               |
| 2            | instance variables correct                  |
| 3            | constructor correct                         |
| 2            | getter correct                              |
| 4            | main method class made correctly            |
| 4            | ShufflerCheck object made correctly         |
|10            | information displayed to the user correct   |
