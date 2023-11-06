[![GitHub Classroom Workflow](https://github.com/csa2122v1/my-winning-team-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/my-winning-team-pnadkarni1/actions/workflows/classroom.yml)

# Epic Quest: My Winning Team
**`Quest giver: Marshal Fordragon`**
>It has been a good run for the Turtle Lake Spotters.  There were ups and now there are downs.  We need a complete change.  I need some fresh eyes and a fresh system on this change.  We let everyone go besides a couple defensemen.  I mean everyone... everyone.  You are going to be the new general manager.  I heard you have worked some magic on some other projects.  Let the rebuild begin.

## Objectives required to complete

This scenario is going to be built in 3 parts.  You do not need to follow these parts in order, but they are described this way as it should lead to the least frustrating solution for the quest.  Tabled below, detailed further down.

| Part Number      | Description                    |
| ---------------  | :----------------------------: |
| Part 1           | Create two classes: one parent, one child that will hold general information about a hockey player           |
| Part 2           | Create a collection to hold objects of one of the classes from a textfile            |
| Part 3           | Create a new collection to hold objects a class.  Fill this collection with appropriate data, from the part 2 collection, based on different restrictions            |

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

### Part 1 - Fundamentals

To create a hockey team we need some `HockeyPlayer`s, each player is a `Person`.  Certain traits extend over from a `Person` to a `HockeyPlayer`, but there are definitely specifics attributes that only hockey players have.

#### Person Class
- Create a class called `Person`
    - make this class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
- Create 2 instance variables for this class
    - `name`
    - `age`
- Create an appropriate constructor
- Create setters and getters we will need

#### HockeyPlayer Class
- Create a class called `HockeyPlayer`
    - make this class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
    - make this class a subclass of `Person`
- Create instance variables for this class
    - `position`
    - `salary`
- Create an appropriate constructor
    - we should call the superclass constructor passing in the appropriate values to it
    - we should set the instance fields for this class
- Create all setters or getters we will need
- Override the `toString` method
    - display information about the player
    - our format should match below
```Java
        "Player:  + PLAYER_NAME_HERE"
        "Position: " + PLAYER_POSITION_HERE
        "Salary: " + SALARY_HERE
```
The info in ALL_CAPS should be the data about the current player being printed out.

When creating the constructor in `HockeyPlayer` think about the parameters needed.  This constructor will need to call the super constructor in the `Person` class.  What does this `Person` class constructor take?  Do we need parameters for those values or can we use literals?

When doing the toString() method, the return needs 3 lines.  Make sure we have each line getting printed on a new line or else it will not pass the test cases.

### Part 2 - Scouting
#### SpottersTeam Class

Now that we can create a `HockeyPlayer` object we can start to think about how we would create a team.  Before we create a team we need to get an idea of the players available to us.  This information is stored in the league's free-agent textfile.

- Open the `SpottersTeam` class
- Create instance variables for this class
    - `team`
        - this should be an ArrayList of `HockeyPlayer` objects
        - this is going to be our starting roster
    - `freeAgentList`
        - this should be a collection of `HockeyPlayer` objects (array or ArrayList)
            - my suggestion is to use whichever collection we want to practice with more to try and learn at a deeper level
    - `totalTeamSalary`
- Create a constructor
    - we need to fill the team ArrayList with 6 fake players
        - use a loop to add the same "fake" player 6 times
        - the below line can be the fake player added
```Java
team.add(new HockeyPlayer("fake", 1, "fake", 2000000));
```
Note the order of the constructor parameters this should give us a hint about what our constructor needs to pass all unit tests.

Why would we be doing this?  Think about the rules for an ArrayList when trying to place values into specific index positions.  We will need to have an answer and explain this when doing our video walkthrough of the code.

- Still in the constructor
    - read in the data from the "freeagentshockey.txt" file
        - players are stored in this file one per line
        - information about the player is separated by a "-" (name-age-position-salary)
    - separate out the information about each player when reading in from the file
        -  create a `HockeyPlayer` object using the line of data read in
        - use the split method or use Scanner delimiter
    - add the newly created `HockeyPlayer` to the correct collection
        - we have two options `team` or `freeAgentList`, which one makes more sense to add in the newly created `HockeyPlayer`

- Create a getter for `freeAgentsList`
    - we do not need one for team as one is given to us
    - this method should return whatever collection type the `freeAgentsList` is

- Override the `toString` method
    - return the entire `team` in a user-friendly manner
    - each position should display on its own line followed by the player name in that position
    - the order of positions can be seen in Part 3's `signPlayer` method description
```Java
"Center: " + PLAYER_NAME
"Left wing: " + PLAYER_NAME
"Right wing: " + PLAYER_NAME
etc
```
- Create a method called `displayPlayer` that takes a single `String` parameter `name`
    - return the player's name, position, and salary using the `toString` method from the `HockeyPlayer` class
    - if no player is found return a `String` saying "No player on team with name NAME"
        - NAME is the parameter being passed in

We will need to loop over the collection here searching for the name being passing in as a parameter.

### Part 3 - Our Starting Lineup
#### SpottersTeam Class

We have a free agent file that we have read from and stored information in a collection.  The owner of the team is holding us to a total team salary of $935,000.  We owe the defensemen who remained on the team $630,000 in total.  Meaning we need to fill the 6 spots with $305,000 maximum.  In order to avoid any penalty league taxes, we also need to spend a minimum of $275,000 on the team.  We also want a young team.  That is the goal now, build a starting team.

- Create a method called `createTeam`
    - this method should go through the `freeAgentList`
        - each `HockeyPlayer` we retrieve should get sent to the `signPlayer` method to determine if the player should be added to the team or not
            - `signPlayer` will do a majority of the testing based on information of the player
        - if the return from the `signPlayer` method indicates they should be added to the team we should place them into the correct location based on their position
            - the number is the index location for that position.  The spelling is how the positions should printed from the `.toString()` method
                - 0 - Center
                - 1 - Left wing
                - 2 - Right wing
                - 3 - Left defense
                - 4 - Right defense
                - 5 - Goalie

- Create a method called `signPlayer`
    - take a `HockeyPlayer` as a parameter
        - return if the passed player should be added to the team
        - the adding should be done based on the following rules
            - remember the total salary of the team cannot exceed $305,000 but needs to be over $275,000
            - no player with an age of 30 or older should be added to the team
            - if the player can be added we need to return a value that lets the `createTeam` method know this
            - otherwise, we should return a value that says do not add the player to the team

Think about when we get a `HockeyPlayer` what data that involves.  We might have complex if statements for the determination of signing a player or not, think about the methods that we can chain together to test the appropriate data from the `HockeyPlayer` object

- Create a method called `sendTeam`
    - this method should write the entire current team to a text-file called `startinglineup.txt`
    - players are stored in this file one per line
    - players should be stored in the format of
        - Position: Name Salary
        - Salary should only be the number
        - `Center: Jack Parkman 54000`

You will need to think about how you can retrieve an individual element one at a time from your team collection.  Once you have the individual element, think about what type of object is that element?  Depending on this answer do you have any methods (perhaps in another class) that you could call to retrieve the necessary data for writing into the textfile.

- Create a method called `totalSalary`
    - return the total salary of the entire team collection
- Create a method called `highestSalary`
    - return the highest salary player on the team
    - you should return the entire `HockeyPlayer` object who has the highest salary
- Create a method called `lowestSalary`
    - return the lowest salary player on the team
    - you should return the entire `HockeyPlayer` object who has the lowest salary
- Create a method called `averageSalary`
    - return the average salary per player on the team
    - this should be returning an int not a double

You can create a runner file to put object creation and such into this will allow you to test out small things if you wish. The methods are tested in the unit case tests so if you pass all of those you do not need to build out this `SpottersTeamRunner.java` file, however, it can be helpful to you to do little testing as you go and it can be easier to see the results instead of reading the test results

### Objective 4 - Video Walkthrough
Walk me through your code.  Explain to the best of your ability what is happening each line of code you have.  Being able to explain out your code is a helpful tool that re-enforces your learning of the material.

There are easy ways to do this:

- Screencast-O-Matic is installed on Chrome for Windows
- Mac's have built-in Quicktime Player, which has a menu option for screen recording
- Desktops around the room have Windows Key + G to bring up Game DVR

Whatever selection you choose make sure you are also capturing your microphone.

- Quicktime Player, drop-down next to the record button and select internal microphone
- Screencast-O-Matic again there is a menu option for microphone recording

You may need to grant access or permission to use the microphone.

If none of these options are easy for you to accomplish you can record via your cell phone.  However, you need to make sure I can clearly see the screen and the lines you are talking about along with hearing your explanations for the lines if using this method.

### Objective 5 - Merging to main and Pushing to GitHub
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
|   Points     |   Requirement                                       |
| :----------: |:--------------------------------------------------- |
|              | **HockeyPlayer class**                              |
| 3            | Instance variables                                  |
| 10           | Constructor using super class                       |
| 3            | Setters and Getters                                 |
| 5            | toString() method                                   |
|              | **SpottersTeam class**                              |
| 10           | Instance variables                                  |
| 15           | Constructor reads from textfile correctly           |
| 5            | fillTeamFake method                                 |
| 15           | signPlayer                                          |
| 10           | createTeam                                          |
| 15           | sendTeam write to textfile correctly                |
| 5            | Other methods                                       |
| 5            | toString() method                                   |
|              | **Other**                                           |
| 4            | "Good" Object Oriented Style                        |
| 15           | Video Submission Walkthrough                        |
