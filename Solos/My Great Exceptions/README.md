# Solo Quest: My Great Exceptions
**`Quest giver: Elisabet Sobeck`**
>The logarithm calculation you created for us is going better than planned.  We have reached a couple of snags.  There are times when we need to determine the interest for multiple people under one account.  This information is all sent to us and we need to read it in.  Sometimes there is unrelated data in the files and this causes our whole system to be shutdown.  Can you help us one last time to perfect this process.

## Objectives Required to be Completed
This lab requires us to use try/catch statements to fix a broken piece of code.  Exceptions allow us to handle erroneous or unusual situations in our program execution.  We use try/catch statements when working with exceptions.  Code we place in the `try` block will be executed, if an exception occurs then the program will go look through the catch blocks for a match.  If we have a matching exception in a `catch` block that code will then execute.  This can prevent our entire program from stopping as the exception will be caught then we can move on with the rest of the code.

Remember we can have multiple `catch` blocks for a single `try` block.  In this program you will need to have multiple try/catch statements.  Some of these will be inside a loop.  Some of them will also have multiple catch statements for a single try.

The file we are working with it `MyGreatExceptions.java`.  This file will compile, but it has runtime errors because of unhandled exceptions.  We will need to make sure this program is able to run and complete without any runtime errors stopping it.

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

### Objective 3 - Branching from the main
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

### Objective 1 - MyGreatExceptions Class
- Open the `MyGreatExceptions.java` file

There are three types of exceptions this file needs to handle in order to run correctly. The exact exception names are below along with how they may occur within the program.

The input file you will be working with is called `exceptionsdata.txt`.  This is the file name that will need to eventually be entered in order to get the entire program to run.

**Note:** You are not permitted to change any of the lines of code inside this file.  However, the code in here might need to be wrapped inside other loops or more try/catch blocks.  You are not permitted to create any of methods to help you, you may create a `resize` method for the array but that is all.  This is not required as you could do all the resizing code within the main method, but you are allowed to create a method to do this as that is what we saw in the class example.  You are not allowed to call any extra pre-built Java methods to help you complete any of the requirements.


#### IOException
This exception could occur if the file name or file path to be reading from is incorrect.

- Our program should continually ask the user for a file name until a correct one is provided
    - the correct file name that needs to be entered is `exceptionsdata.txt`

#### NumberFormatException
Once we have the correct file name we can read in the numbers.  However, some text in the file will not be a number.  Therefore, this exception could occur if the number on a given line is not a valid integer.

- Do not add an invalid integers to the array
- Print out a simple message indicating a non-valid integer was found
- We can look in the sample-outputs folder to see the type of message we could print out


#### ArrayIndexOutOfBoundsException
- If we try to read in and store more than 5 values from the file
- We must resize the array when this occurs
    - double the previous size
- We then copy the data into the new array and add the new item
- We should print out a message that indicates resizing has occurred


You can see what output should be [here](/sample-outputs/exceptionsoutput.txt).  Important part of this file is the bottom half which is printing out the values in the array.  Make sure all the numbers are in your print out when running

### Objective 2 - Merging to main and Pushing to GitHub
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
|   Points     |   Requirement                                    |
| :----------: |:------------------------------------------------ |
| 2.5          | IOException handled correctly                    |
| 2.5          | NumberFormatException handled correctly          |
| 2.5          | ArrayIndexOutOfBoundsException handled correctly |
| 2.5          | Output matches sample                            |
