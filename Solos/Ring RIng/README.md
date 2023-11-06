[![GitHub Classroom Workflow](https://github.com/csa2122v1/ring-ring-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/ring-ring-pnadkarni1/actions/workflows/classroom.yml)

# Solo Quest: Ring Ring
**`Quest giver: Tavernkeep Frazer`**
>I need an ability to start charging people who use the payphone.  You know that thing that wired to the large box with numbers.  I want people to continue using it, but not for free.  If you come up with a system for me, consider yourself welcome to stay without any charge.

## Objectives required to complete
This lab has us provide interaction between a user and a phone system.  The user can call select locations and based on the location and call time will be charged a certain amount.  We do not need to accept payment from the user in this lab simply calculate the cost of the call and display it to the user.

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

### Objective 1 - PayPhone Class
We will need to create an appropriate class for this lab that will help us with our game simulation.

- Create a class called `PayPhone`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

Our class must be called `PayPhone` exactly.  If it is not called this then the test class will fail and cause errors on your build.

### Objective 2 - Main Method
In this lab our main method we will do a majority of the work.  It will be capturing all the input from the user and then passing that input to a method that will return a result for us to finally display.

- Create a main method in the `PayPhone` class
- Capture user input to see if they are waiting to make a phone call
    - As long as the answer is some form of "yes" the program should continue to run
- Retrieve information from the user
  - Get the name of the person making the phone call
  - Get the name of the person they are calling
  - Get the number they are calling
  - Location they are trying to call out of the following list (prices are listed next to the location)
      - User should enter the number of the location they are wanting to call **not** the name
      - **1.** Basin City, Ohio ($1.47 for 2 minutes and 45 cents for each additional minute)
      - **2.** Ambridge, Maine ($1.23 for 2 minutes and 13 cents for each additional minute)
      - **3.** Middlemarch, Illinois ($1.73 for 2 minutes and 30 cents for each additional minute)
      - **4.** Bright Falls, California ($0.70 for 2 minutes and 94 cents for each additional minute)
  - Length of the phone call
      - Given as total minutes the person is on the phone for
      - Must be at least 2 minutes
          - If it is less than 2 minutes ask the user to enter a new length for the call
- Call the `callCost` method and retrieve the cost of the call
- Display information about the call
  - who they are calling
  - total cost of the call
  - if they received a discount on the call or not
  - the location of the call
  - length of the call in a user-friendly output

While the class name must be `PayPhone`, variable names can be whatever you wish.  However, remember naming conventions when determining variable names.

### Objective 3 - callCost method
We want to build a method that calculates the total cost of the phone call for the user.  We can focus on making this single method correctly since we only have to focus on one thing.  Remember a method should do one thing and one thing only.  In this case, it will be calculating the cost of the phone call based on the location and length.

- Create a public static method
    - it will need to return the total cost of the call
    - call it `callCost`
    - have it takes three parameters
        - `double` the length of the phone call
        - `double` the base rate for 2 minutes
        - `double` the additional rate for each minute over 2 minutes
        - `String` number they are calling
    - calculate the total cost of the call based on the two-minute rate and if needed the additional rate
    - if the number they are calling begins with a 6 or 7 or if it ends with a 0 or 1 they should receive a .13 discount on the total cost
      - this cannot be done using any method that we did not discuss in the String lectures

**Note:** The name of the method, data type of parameters, and order of parameter is important to match what is being asked.  The parameter names and variable names can be whatever you wish.

Remember the first 2 minutes for any phone call has a different price value than minutes after those first two.  Minutes after those first two should be calculated at the extra price amount.  The total will be made up of these two separate price amounts (first two minutes, X minutes after the first two).

### Objective 4 - Merging to main branch and Pushing
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

### Objective 5 - Pushing back to GitHub
- Push all your commits to GitHub on both the main, dev, and any other branches you make
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

The committing and pushing process does not change for different branches it is always the same.  If you are confused or struggling with this process please reach out and let me know.

**Note:** Only the code on the main branch will be graded.  It is important to make sure you are happy with your main branch.  You can check if you code is only GitHub by logging in, finding your repo based on the assignment and checking the commit messages on the page that loads.  This are in the middle column of the little box at the top.  You should see your most recent commit message next to whatever files/folder you pushed.

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 2            | design plan                                 |
| 2            | created appropriate dev branch and push it  |
| 3            | loop through until no customer              |
| 5            | callCost return correct                     |
| 3            | user-friendly output                        |
| 5            | naming conventions followed                 |
| 2            | more than a single commit made to the repo  |
