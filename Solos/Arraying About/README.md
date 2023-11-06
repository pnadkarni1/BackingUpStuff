[![GitHub Classroom Workflow](https://github.com/csa2122v1/arraying-about-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/arraying-about-pnadkarni1/actions/workflows/classroom.yml)


# Solo Quest: Arraying About
**`Quest giver: A Dusty Unsent Letter`**
>To the Honorable Governor Nighthill.  My former leader, I write to you so that you may know what your protege has been doing of late.  I sought to build my knowledge, but alas I have stumbled and need help.  Several ruins require specific numbers to be obtained from a series of inputs.  The number series is far too large for me alone.  I hope that you will be able to send some of the bright minds to my location to assist me or send me a solution.  I eagerly await your response so that I may share my discoveries with you.

## Objectives required to complete
This lab requires us to display our abilities to use arrays.  We will need to initialize an array to a certain size specified by the user.  We will also be filling the array with numbers provided by the user.  Finally, we will be displaying some information about the array to the user.  This information comes returned from methods we wrote.

Remember arrays are a fundamental and useful data structure.  We can hold multiple values within one variable, however, the values must be of the same type.  We can search through this collection for a specific value.  Doing this requires us to traverse over the collection with a loop.  Accessing different elements is done via an index number within [], index numbers begin with 0.

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

### Objective 1 - ArrayingAbout Class
We will need to create an appropriate class for this lab that will help us with our game simulation.

- Create a class called `ArrayingAbout`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

### Objective 2 - Main Method
In this lab our main method we will do the setup work.  The rest of the code occurs in various methods.

- Create a main method in the `ArrayingAbout` class
- Ask the user what size they want the array to be
    - verify to make sure they have given you a whole number
- Make a `double[]` with the size the user asked for
- Create a loop that will go through this empty array
    - Ask the user for a number to store into the array
    - Keep doing this until the array is full with numbers the user has said
- Call the methods described in Objective 3 using the `double[]` as the argument
- Display the returned results from these methods calls to the user in a nice way

### Objective 3 - Various methods
We want to have various methods to help us get some useful information back to the user about the array they entered.  Since we are inside the same class with a main method all these methods will be static.  Our general rule of thumb is if we have a main method in the class we are making methods in we should make our methods static.  If there is not a main method in the class we are making the methods in we should **not** user the word static.

Method return type and names should be exactly as they appear here.  The parameter name can be anything you want as it is a normal variable.  The other things are required to work with the test file.

**Note:** You must use one enhanced for loop in one of these methods.  All the other methods should be normal for loops or while loops.

```Java
public static double max (double[] arr)
```
This method should go through the parameter array looking for the largest value in that array.  It should return this value.

```Java
public static double min (double[] arr)
```
This method should go through the parameter array looking for the smallest value in that array.  It should return this value.

```Java
public static double sum (double[] arr)
```
This method should go through the array adding every element it finds to a grand sum.  It should return this sum once done.

```Java
public static double ave (double[] arr)
```
This method should call the sum method and get the sum of the array.  It should use this returned sum to then calculate the average of the array and return that average.

When trying to determine the maximum or minimum value in the entire array you are going to need to keep track of that value until you reach the end of the array.

Think about what the maximum or minimum value of the array is when you first enter the method (there are multiple ways to do this).  One way is to think like a computer, it cannot see all the numbers at once it only will see one at a time.  Make sure you are making correct comparisons for each of those methods and be careful to not return too early.

When calculating the sum think about how you can retrieve each value from the array and add that value to a running total

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
|   Points     |   Requirement                                       |
| :----------: |:--------------------------------------------------- |
| 2.5          | max method displays correct result from main method |
| 2.5          | min method displays correct result from main method |
| 2.5          | sum method displays correct result from main method |
| 2.5          | ave method displays correct result from main method |
