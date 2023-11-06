
[![GitHub Classroom Workflow](https://github.com/csa2122v1/epic-my-wordy-scramble-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/epic-my-wordy-scramble-pnadkarni1/actions/workflows/classroom.yml)



# Epic Quest: My Wordy Scramble
**`Quest giver: Councilman Daltry`**
>We are considering installing some game machines in different locations to bring in some new revenue.  As we start this initiative we will need a simple user to game interaction.  The game will be a word game where the user guesses words that be made from another word.  Points are earned, people get excited, they pay more money, we take the money, everybody is happy.

## Objectives required to complete
This is another large lab.  We must plan accordingly for the amount of time this will take to complete.

Smaller logic for this lab may have been complete in other quests up to this point.  It would benefit us to look back at some of those previous quests.  We may even be able to copy and paste some of that old code into this project.

### Objective 0 - Basic knowledge
We will simulate a word game experience.  We will retrieve a random (one at a time per round) from a large text-file.  Then the game begins.

For each word we have 1 minute to guess as many words as we can.  The words we guess must come from the letters of the displayed word.  Each letter from the original word can only be used once in the guessed word.  Each guessed word also must be a valid word (in the dictionary or at least the dictionary file used for this quest).

After this minute of guessing, we will receive a score for that round.  Score based on the word length of all the guessed words.  Each correct word will earn a point for each letter in that word.

At the end of the round (after the minute is up) we will display some stats from the round:
- All the words found that round
- How many words found
- How many points earned

At the end of the game (before the program exits but after the user has indicated they want to stop playing) we will display some simple overall statistics from the game:
- How many rounds played in total for the game
- How many total words found across all rounds
- How many total points earned across all rounds
- What were the average words found per round
- What were the average points earned per round

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

## Quest Requirements
The bullet points in this section are the bare minimum needed. There are often times when exact details are missing as it would give away the answer. Therefore, we should realize that some more work and logic is required with certain steps.

There are some prefilled classes that will be critical to the quest completion.  We also have some classes that we need to complete ourselves.

The files that need zero modification are `Dictionary`, `MyTimer`, `TimerTest`, and `WordFinderOutputTest`.

The files that are required to complete are `WordFinder`, `WordyScramble`.

We will break down the no modification files first.  It is a strong recommendation that we look through these files to can an understanding on what is happening.  We will also need to know which methods should be called from these classes.

The recommendation is to begin in the `WordFinder` class, then look through the `Dictionary` class to see if any methods in there would be helpful to complete requirements of `WordFinder`.  We also need to know how to make a `Dictionary` object because one if required inside `WordFinder`.

### Objective 1 - WordFinder Class
**Note: No array, ArrayList, or any other predefined Java collections of data allowed in this program.  If included points will be deducted**

We are **not** permitted to add any parameters to methods in this class.  This class needs to be filled out, we don't need to add any new methods but do need to complete the methods listed out.  We should take a moment to read the comments of the class as they can provide clues on implementation of certain methods.

- Begin in the `WordFinder` file
- Create two instance variables
    - A `Dictionary` object
    - `String` word
        - it is important that the `String` instance variable be called word
        - if you call it something else go read lines 41ish to 45ish in `WordFinder`
- Complete the constructor
    - we will need to examine the `Dictionary` class to get help initializing our `Dictionary` object correctly

```
The dictionary class has the following:
- Fully implemented (no changes needed)
- Allows words to be tested for validity
- Allows words to be retrieved
- Allows for duplicate word testing
- Allows for word storing
This class shows off abstraction as we do not need to worry about how every part of this class is implemented or how the data is being stored.  We only need to know what methods to call and what parameters are required for the methods.
```

- Complete the `nextWord` and `showWord` methods
    - we could think of these as a setter and getter in our implementation
- Complete the `goodWord` method
    - this is a bit tricky
    - think carefully about how this would work
    - planning out an algorithm before jumping into this method can be extremely helpful
    - read the comments provide for an explanation on how it should act

### Objective 2 - WordFinderOutputTest Class
- Once the `WordFinder` is built this class should run without issue
- We could also run the test file in the test folder to verify our `WordFinder` class works correctly

### Objective 3 - MyTimer and TimerTest Classes
- Examine these two classes
- Run the `TimerTest` class to see how it works
    - some of the code in this class is useful for our main method
    - it is important to be able to identify what code we would want from this class
    - read the main method objective first before you try to copy code from this class because it is not all useful only a few lines

### Objective 4 - WordyScramble - main method
This class will implement the game being played.  A brief outline of the game was described at the top.  It is also outlined slightly below.

- Create a main method in this class
- Create helper objects, at least one object (you may need more but remember don't make something before we actually need it) of each:
    - `WordFinder`
    - `Dictionary`
    - `MyTimer`

We should continue to loop through the code described below until the user says they no longer wish to play

- Ask the user if they wish to play the game
- Display one word obtained from `WordFinder` per round
    - it should be a different word, but if your logic is correct this will be handled automatically by calling the correct `WordFinder` method
- During each round valid new words should be noted and counted
    - remember points are equal to the guessed word's length
- Duplicate words should be noted but not counted
- Invalid words should be rejected
- You should display appropriate messages at each stage of the game
    - Greeting
    - Asking to play
    - Word selected
    - User guess
        - Valid
        - Invalid
        - Duplicate
    - End of round stats
        - Words found (listed out the full words)
        - Words found (count, how many words found)
        - Points earned
    - End of game stats
        - Total rounds
        - Total words
        - Total points
        - Average words
        - Average points

The above section is a perfect example of "needs more" to actually be completed to the requirements.  Certain requirements are not fully explained as that would give away the answer.  A solid design plan will make this section easy.

Some extra tips to consider:
- There are some parts of this that will need loops, choose a loop that is appropriate for the task at hand (there is more than one correct answer to which loop you use)
- Some variables will only be needed locally while others will be needed both within loops and outside of loops
    - Think about where these different types of variables can be declared
    - Think about how to reset the values and where values should be reset if they need to be
    - Some of the variables will need to be reset

### Objective 5 - Checking output
There is no correct way to display output for this lab. However, certain interactions should occur in your lab. These output file shows off those interactions.
- [sample output](sample-outputs/a2out.txt)

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

## Bonus (up to extra 10 points total):
Ask for the user's name or id at the beginning of the game and keep a file for each user with that user's cumulative statistics.  Update the file each time the user plays the game and show the cumulative results at the end of the game.

#### Grading
There is a rubric included as a file for this project.  It is the **a2score.docx** file.  If you have trouble opening it come and see me.

|   Points      |   Requirement                                           |
| :------------:|:------------------------------------------------------- |
| WordFinder    |                                                         |
| 10            |  Dictionary used correctly                              |
|  5            |  constructor                                            |
|  5            |  nextWord method                                        |
|  5            |  showWord method                                        |
| 20            |  goodWord method                                        |
|  5            |  WordFinderOutputTest runs as given                     |
| Main Method   |                                                         |
| 10            |  main program loops                                     |
|               |  single round:                                          |
|  5            |     - valid words found                                 |
|  5            |     - invalid words not found                           |
|  5            |     - duplicates detected                               |
|  7            |     - correct words shown at end                        |
|  8            |     - points calculated correctly                       |
| 15            |     - MyTimer used correctly                            |
|  5            |     - Dictionary used correctly                         |
| 10            |  Totals / averages shown at end                         |
| 10            |  Good, well-formatted I/O                               |
| 10            |  "Good" Objected Oriented Style                         |
|  5            |  Submission                                             |
|  5            |  Documentation                                          |