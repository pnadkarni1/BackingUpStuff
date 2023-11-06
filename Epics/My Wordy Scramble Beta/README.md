[![GitHub Classroom Workflow](https://github.com/csa2122v1/epic-my-wordy-scramble-beta-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/epic-my-wordy-scramble-beta-pnadkarni1/actions/workflows/classroom.yml)

# Epic Quest: My Wordy Scramble Beta
**`Quest giver: Councilman Daltry`**
>The popularity of the game is better than we could have anticipated.  Some of our players are wanting more competition.  We figured this would be the perfect opportunity to announce our beta installation on all the machines.  We will have leaderboards and game statistics being saved on each machine.  I can see all the dollars now.

## Objectives required to complete
This is another large lab.  We must plan accordingly for the amount of time this will take to complete.

Smaller logic for this lab may have been complete in other quests up to this point.  It would benefit us to look back at some of those previous quests.  We may even be able to copy and paste some of that old code into this project.

### Objective 0 - Basic knowledge
We will be enhancing our already playable wordy game.

- The main portion of the game remains unchanged
    - Retrieved random word
    - User gets 1 minute to guess words
    - Receive points and a score
- Each person will have an account when playing
    - id and password
- Each person will have stats for their account
    - rounds, points, and words found
- All data will be stored in a textfile

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
- Select the "main" under the "Local"
    - right-click on main and select "+ New Branch"
- On the pop up name the branch `dev`
    - Leave the checkmark in "Checkout Branch"
    - Click "Create"

## Key Classes
Some of these classes are provided for you and do not need to be modified at all.  However, other classes you will need to bring over yourself from the first `My Wordy Scramble`.  Reading through them can be helpful and provide insight into how the classes work.  You can also use one of the files to test your code before you start building your main program.  These files are provided by Pitt with little to no modifications by me.  I only make changes if something is broken or needs to be changed because of a requirement change that I am making.

### Dictionary Class
From the first `My Wordy Scramble` nothing has changed in how this file runs and interacts with the game.

### MyTimer Class
From the first `My Wordy Scramble` has the same functionality and purpose nothing new and nothing needs to be changed.

### WordFinder Class
You will need to copy this file from the original `My Wordy Scramble` assignment.  You should ensure that this file works are intended from the first assignment.  If it is not working correctly ask me for assistance with it.  Nothing from this file needs to change or be modified.  There are a couple of different ways you can copy this code.
- Copy your `WordFinder` class from the `My Wordy Scramble` lab
    - You should copy the entire .java file
    - If copying the file make sure to place it in the `src` -> `main` -> `java` folder of this project
- You could also do the following
    - Create a class call `WordFinder`
        - class should be made in the following location (-> denotes going to a sub-folder)
            - `src` -> `main` -> `java`
    - Copy all the code in your **old** `WordFinder` class and paste it into this class

### PlayerListOutputTest Class
- A small program that ensures your PlayerList class is built correctly with some sample output
  This class will allow you to test your implementation of the `PlayerList` class.  You will get to see sample output, which will tell you that your `PlayerList` class does not have any compilation errors.  Logic errors could still exist as you will have to closely check the output to see if it is working correctly.  You should use this file to check method names and parameter requirements for methods you are building in `PlayerList`.  You should also use this file to check the return needed from certain methods in `PLayerList`.

Alternatively, you could run the test file that I have written and provided.  As with the other labs that have included unit tests you will not see any output, but it will tell you if you have built a working `PlayerList` class or not.  I have built method names and expected return types based on the requirements outlined in the `PlayerListOutputTest.java`.  It is important that you understand some methods in the `PLayerListOutputTest` class are not implemented in the best way or even the most logical.  However, you should look at this file to see the parameters needed for the various methods.

## Quest Requirements
The bullet points in this section are the bare minimum needed. There are often times when exact details are missing as it would give away the answer. Therefore, we should realize that some more work and logic is required with certain steps.

### Player class
This will need to be created from scratch as no skeleton is provided to you.  This class is an individual's history with the game.  It is used to encapsulate all the information about a person who plays the game and wants their information saved.  Provides methods for accessing and mutating a person's information in the game.
- Create a class called `Player`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
- Create instance variables
    - `uniqueID`
    - `password`
    - `rounds`
    - `points`
    - `wordsFound`
- Create constructors
    - You will need at least two
        - reading in information from a textfile will need to be able to create a complete Player
        - Examine the `PlayerListOutputTest.java` to see how a `Player` object is made in there
- Create setters and getters for the various instance fields
    - Look at `PlayerListOutputTest.java` to see names for these methods
    - Some of the setters will be implemented differently than normal setters
    - While a person is playing the game their individual stats (those being encapsulated here) should be updated accurately after each round.  This means these fields are **overall** stats not individual game stats
        - Think about how implementation of the various setters might handle this notion
- Override the `toString` method
    - should return the user information in a friendly display
    - should be used for displaying at the end of rounds information
    ```
    Id: ZZZ
    Total Rounds Played: ZZZ
    Total Words Found: ZZZ
    Total Points Earned: ZZZ
    Average Words Found: ZZZ
    Average Points Earned: ZZZ
    ```
    - ZZZ should be information about this particular player object
    - Keep everything aligned do not tab here so it can be run against the test case methods

This class should not have any Scanner objects at all.

### PlayerList class
This will need to be created from scratch as no skeleton is provided to you.  This class will provide the main functionality for this version of the game.  It will handle all interactions with the game and be directly interacting with the textfile.  This class with be similar to the `My Movie List` and `My Winning Team` labs as it will be a database of information in a textfile that needs to be read from and manipulated through a collection, array or ArrayList.
- Create a class called `PlayerList`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
- Create instance fields
    - A collection, array or ArrayList, of `Player` type
- Create a constructor take a single parameter
    - `String` filename where all the player's data is "players.txt"
        - this file is formatted with one player per line ordered by
            - **id,password,rounds,wordsFound,points**
            - no spaces only commas
            - rounds, wordsFound, and points are all totals for that player id
    - The purpose of the constructor is to read all the data in from the text file
    - Create player objects and add the player object to the collection of `Player`
    - The collection should be filled with everybody from the textfile

You will need to create a number of methods for interaction between the collection and the game.  The methods will be described below.  To understand the return type of each method you should examine the `PlayerListOutputTest.java` file and see where and how the method is getting called.  Is it result being stored anywhere meaning is it called after an = sign.  If it is what is the type of the variable holding the result.  Is it being called in a loop or conditional statement?  What return type would be required if it were being called from these types of statements.  The same is true for the parameter(s) that these methods take look at what arguments are used when calling them.  This does take a little research on your part to piece everything together.  I recommend you do this file, read these method names and go find them in the `PlayerListOutputTest.java` write down their return type and parameter types needed.  It will save you frustration in the long run.

```Java
addPlayer
```
- Adds unique players (unique ids) to the collection

```Java
containsId
```
- Determines if the id the player is trying to register is unique or not
- Every player in the collection must have a unique id

```Java
authenticate
```
- Matches a a hopeful player to somebody already in the collection
- Think about when you login to a website what information do you give that should match what exists on that website's database
- While there could be better implementation of this method it is important you match it to what is being done in the `PlayerListOutputTest.java` file check there to see parameters and return

```Java
saveList
```
- Once nobody else wishes to play the game all data in the collection should be written back to the textfile "players.txt"
- It can overwrite the information already in that file
- Everything must be written back with the correct formatting
    - one player per line
    - all information separated by commas only
    - no spaces between sections
    - if you are writing `Player` information back to this file it might be easier to call a method from that class that formats its information separated by a single comma for each object in the collection
        - not required, but can save you some work

```Java
toString
```
- Displays information about the entire collection of `Player` objects in something like the following format
    ```
    Total Players: ZZZ
        AAA
        BBB
        CCC
    Overall Stats for All Players:
        Total Rounds: ZZZ
        Total Words Found: ZZZ
        Total Points Earned: ZZZ
        Average Words Found: ZZZ
        Average Points Earned: ZZZ
    ```
- ZZZ should be replaced by data retrieved from the collection
- AAA, BBB, CCC, are individual Player objects getting printed out from the `Player` class `toString` method

I considered writing a test case for this method, however, it would require me to force you to all have similar output with alignments and wording.  I did not want to do that as I enjoy seeing how you can creatively display out the information.  As long as you have all this information being displayed once the user is ready to quit I will be happy.

This class should have a single Scanner object that helps read in from the textfile.  Now Scanner should be used for keyboard input inside this class.

### MyWordyGameBeta (Main Program) class
This will need to be created from scratch as no skeleton is provided to us.  This class should play the game as outlined below.  A single round of the game works exactly the same as `MyWordyGame`, but there are multiple changes that are needed before we have that single round play.  We should remember that you could copy and paste the code from that original lab into this one.  Understand that we will need to move it around of only use parts of it, etc.  It will not be a perfect 1:1 copy and paste.  We do not have to redo the entire single round part of this lab though.
- Create a class called `MyWordyGameBeta`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
- Create a main method in this class
- Utilize the following five classes throughout this main method.  This means you will need at least one object of each other these classes
    - `WordFinder`
    - `Dictionary`
    - `MyTimer`
    - `Player`
    - `PlayerList`
- Ask a player what they would like to do
    - enter id to player
    - enter "SOMETHING" to register a new account
        - you should determine what this "SOMETHING" is and note it to the player
    - enter a "Quit" indicator
        - again you should determine this and note it to the player

This should happen as repetition until the user decides to quit

If the player entered their id you should do the following
- Make sure the id they entered exists in the collection
    - a match means you can ask for their password
    - authenticate the player
        - password authenticates they are good to play a single round
        - password does not authenticate give them 2 more tries to get the password
            - after this force them to register as a new player
    - no match on the id means you should have them register as a new player

If the player indicated they wish to register as a new account
- Make sure you get appropriate information from the player for their account
    - an id should be unique (it cannot already be in the collection)
        - they will need to keep giving an id until they give one that is unique
    - a password
        - they should confirm this password
        - if they do not confirm the password correctly they should have to give the password and confirmation over again
            - this should repeat until they do it correctly
- Once you have appropriate information from the user you should add them to the collection
    - think about the methods you have in the PlayerList class that can help you with this think about their parameters and return types when trying to utilize the method calls

Once you have a new player or old player authenticated you can play a round of the game
- This is the same way the user played a round in `My Wordy Scramble` lab
- Show them their stats for the round once it ends
- Ask them if they wish to play another round
    - if they say yes repeat this process
    - if they say no you should show them two things
        - session stats, this is the same as `My Wordy Scramble`
            - how many rounds did they play this session, how many words found, points, averages
        - overall stats for this user, this is the information being stored in the text file
            - how many total rounds, words found, point
            - you should also display averages on the words and points even though they are not in the text file
- Once they do not want to play another round see if another player wants to play
- Once nobody else wants to play you should
    - save the collection back to the textfile
        - you have a method for this in `PlayerList`
    - display the overall information about the textfile
        - you have a different method for this in `PlayerList`

### Objective 5 - Checking output
There is no correct way to display output for this lab. However, certain interactions should occur in your lab. These output file shows off those interactions.
- [sample output](sample-outputs/a3out.txt)

The output does not need to look exactly like this. These are meant to give a visual understanding of some of the requirements and functionality that should be provided through the program. It is encouraged to come up with unique output, get creative and have some fun with it.

### Objective 6 - Merging and Pushing
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

### Extra Credit Option (up to extra 10 points total):
Add some extra non-trivial functionality to your game.  If you have any good ideas run them past me and I will let you know if they will count.  This means you need to run any extra credit ideas by me and I need to approve before you will receive any credit for them.

#### Grading
|   Points              |   Requirement                                           |
| :--------------------:|:------------------------------------------------------- |
| Player Class          |                                                         |
| 10                    |  Instance variables                                     |
| 15                    |  accessors / mutators                                   |
| 10                    |  toString()                                             |
| PlayerList Class:     |                                                         |
|  5                    |  Array / ArrayList used to store Players                |
| 15                    |  PlayerList constructor (init from file)                |
|  5                    |  addPlayer method                                       |
| 10                    |  containsId() method                                    |
| 10                    |  authenticate() method                                  |
| 10                    |  toString() method                                      |
| 10                    |  saveList() method                                      |
| 10                    |  PlayerListTest works as written                        |
| Main Program / Class: |                                                         |
| 10                    |  Initialization of Dictionary / PlayerList              |
| 10                    |  Main program loop                                      |
| 15                    |  Returning Player login                                 |
| 15                    |  New Player handled                                     |
| 10                    |  Current game stats saved / shown                       |
| 10                    |  Cumulative Player stats maintained                     |
| 10                    |  "Good" Objected Oriented Style                         |
|  5                    |  Submission                                             |
|  5                    |  Documentation                                          |
