
[![GitHub Classroom Workflow](https://github.com/csa2122v1/guess-my-number-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/guess-my-number-pnadkarni1/actions/workflows/classroom.yml)

# Solo Quest: Guess My Number
**`Quest giver: Clerk Haggard`**
>There is no better game than *"Guesur"* the entire kitchen staff will spend hours after their shifts playing.  It involves guessing the sum of two random numbers.  It is getting difficult to keep track of everything with so many people playing these days.  I need a way to automate the process.

## Objectives required to complete
This lab has us simulating a game of chance.  It involves the use of random number generation from the JVM.  We will generate random numbers using two different methods.  There is also practice for checking a password-based on String comparisons.  The program behaves differently if the password is guessed correctly.

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
The bullet points in this section are the bare minimum needed.  There are often times when exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic is required with certain steps.

### Objective 1 - GuessingNumber Class
We will need to create an appropriate class for this lab that will help us with our game simulation.

- Create a class called `GuessingNumber`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

Our class must be called `GuessingNumber` exactly.  If it is not called this then the test class will fail and cause errors on your build.

### Objective 2 - Main Method
Again, in this lab our main method we will do a majority of the work.  We capture some user input of different data types. We should remember what happens when we accept user input of different data types and the buffer.

- Create a main method in the `GuessingNumber` class
- Capture user input to see if they are waiting to play the game
    - As long as the answer is some form of "yes" the program should continue to run
- Create data for use
    - Generate two random numbers
        - one using a Random object between 1 and 5
        - one using Math.random() between 1 and 7
- Capture secret phrase from the user
    - Ask the user for the secret password
- Call the `verifyPassword` method and retrieve if the password is correct or not
- If the password is verified
    - show the user the two randomly generated numbers
- If the is not verified
    - have the user guess the password again and verify it
- If the user fails to guess the correct password after two attempts
    - do **not** show the user the two randomly generated numbers
- Capture number sum from user
    - Ask the user to guess the total sum of the two generated numbers
- Called the `correctGuess` method and retrieve if the sum guessed is correct
- If the guess is correct
    - print out that the user won
- If the guess is incorrect
    - print out that the computer won

While the class name must be `GuessingNumber`, variable names can be whatever you wish.

The `verifyPassword` method may have to get called a couple of times depending on the return.  This will require some kind of loop. There are several loop solutions to this any of them will work as long as your logic is correct.

### Objective 3 - verifyPassword method
We want to build a method that determines if the password the user guessed was correct.  As our game will interact with the user differently depending on this result we must get it right.

- Create a public static method
    - return if the user guess was correct or not
        - there are only two options correct or not think about the return type needed for this
    - call it `verifyPassword`
    - have it takes a single parameter
        - `String` the user guess for the password
    - hardcode the password to the literal value `floo powder`
    - test to see if there is a match
    - return the result of the test

**Note:** The name of the method, data type of parameters, and order of parameter is important to match what is being asked.  The parameter names and variable names can be whatever you wish.

### Objective 4 - correctGuess method
We need a second method that determines who won the outcome of the game, either the computer or the user.  This winner comes from testing the user guess against the calculated value.

- Create a public static method
    - it will need to return if the user guess was correct or not
    - call it `correctGuess`
    - have it takes two parameters
        - `int` sum guess from the user
        - `int` sum from the two randomly generated numbers
    - return if the user guess and calculated sum are equal or not

**Note:** The name of the method, data type of parameters, and order of parameter is important to match what is being asked.  The parameter names and variable names can be whatever you wish.

### Objective 5 - Merging to main branch and Pushing
- Click on the word "Git" in the bottom left corner of IntelliJ
- Select "main" (it should only say main)
    - Right-click and select "Checkout"
- It should now say "main" in the bottom right corner
- main should also have the checkout tag on it in this "Git" window
- Select the "dev" branch in this Git window
    - Right-click and select "Merge Selected into Current"
- Put a checkmark in the `dev` option
    - The checkmark might not be an option, if it is not that is acceptable
    - Only select the `dev` branch with no other words as this is our local version
- Click the merge button

### Objective 6 - Pushing back to GitHub
- Push all your commits to GitHub on both the main, dev, and any other branches you make
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

The committing and pushing process does not change for different branches it is always the same.  If you are confused or struggling with this process please reach out and let me know.

**Note:** Only the code on the main branch will be graded.  It is important to make sure you are happy with your main branch.  You can check if you code is only GitHub by logging in, finding your repo based on the assignment and checking the commit messages on the page that loads.  This are in the middle column of the little box at the top.  You should see your most recent commit message next to whatever files/folder you pushed.

### Objective 7 - Video Walkthrough
Walk me through your code.  Explain to the best of your ability what is happening each line of code you have.  Being able to explain your code is a helpful tool that re-enforces your learning of the material.

There are easy ways to do this:

- Screencast-O-Matic is installed on Chrome for Windows
- Mac's have built-in Quicktime Player, which has a menu option for screen recording
- Desktops around the room have Windows Key + G to bring up Game DVR

Whatever selection you choose make sure you are also capturing your microphone.

- Quicktime Player, drop-down next to the record button and select internal microphone
- Screencast-O-Matic again there is a menu option for microphone recording

You may need to grant access or permission to use the microphone.

If none of these options are easy for you to accomplish you can record via your cell phone.  However, you need to make sure I can clearly see the screen and the lines you are talking about along with hearing your explanations for the lines if using this method.

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 2            | design plan                                 |
| 2            | created appropriate dev branch              |
| 3            | loop through until no player                |
| 5            | random numbers calculated correctly         |
| 3            | verifyPassword return correct               |
| 3            | correctGuess return correct                 |
| 2            | more than a single commit made to the repo  |
| 2            | naming conventions followed                 |
| 8            | video walking through your code             |
