# Solo Quest: My Fancy Account
**`Quest giver: Collin Rustfizzle`**
>Have you heard the rumors?  Well, have you?  Everybody has heard about the new bank that came to the kingdom.  They are actually giving out extra money.  Well, you first have to have an account with them.  Well, then you need to put some money into that account.  Well then you need to opt into getting the extra money but that is it then you get money.  Well, it is actually each month you get a little more money.  They call it interest.  I know one this is certain they have my interest.  I wish I understood how it works so that I could know how much money I will gain.  Can you help me determine how much money I will have using this "interest" thing?

## Objectives required to complete
Now we have started to find comfort with GitHub, it is time for our first quest that has some interaction outside of only printing statements to the console.

As always ask me for assistance or clarification on any steps, the videos are there as a secondary assistance tool if needed.

This quest can be decomposed into four parts (it is recommended to use decomposition on assignments so practicing on a simple assignment can help you start to hone these skills).

This will be the last quest for a while that has the decomposition outlined for you.  The next time you see decomposition on a repo it will be for a much larger project and have more specific parts outlined.  Also, this lab has the setup objectives significantly shortened.

However, I encourage you to continue to do decomposition on each of these labs because by the end of the year it will be easier when working on the larger labs if you are somewhat comfortable with decomposition.

| Part Number      | Description                                 |
| ---------------  | :----------------------------------------:  |
| Part 1           | Gather user inputs                          |
| Part 2           | Calculate the future value                  |
| Part 3           | Display the results                         |
| Part 4           | Completing the quest                        |

## Part 0 - Setup

### Objective 1 - Cloning
- Clone this project into IntelliJ
    - remember to place it into a correct folder

### Objective 2 - Branching from the main
- Click on the word "Git" in the bottom left corner of IntelliJ
    - Right-click on the word "main"
    - Choose "New branch from selected"
- On the popup name the branch `dev`
    - Leave the checkmark in "Checkout Branch"
    - Click "Create"

Now we have our `dev` branch, we double-check the bottom right corner it should say `dev`, not main.

We can now work on this `dev` branch.

## Part 1 - Gather User Inputs
### Objective 1 - MyFancyAccount Class
- Create a class called `MyFancyAccount`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

### Objective 2 - Main Method
- Create a main method in the `MyFancyAccount` class

### Objective 3 - Gathering User Input
This lab has the goal of capture some input from the user.  We will need a Scanner object to capture the input from the keyboard.  Remember that there are three steps when working with Scanner: import library, creating Scanner object, System.in.  It is important that we also remember when a Scanner method is hit the program will wait for user input; therefore, we should prompt the user beforehand letting them know we are expecting input.

- Create a `Scanner` object
- Get the start deposit amount from the user
    - whole number only
- Get the interest rate for the account from the user
    - floating number only

## Part 2 - Calculating the future value
### Object 1 - Calculate result based on user input
The future value of money (FV) can be calculated with the formula `FV = PV(1 + r)*t` (this is not the actual formula but based on our current knowledge it is what we are able to do with whole numbers).  Do not use the actual formula use this formula, there will be opportunities later to use the actually future value fo money formula.

PV = present value (starting amount)

r = interest rate

t = 10

- Given the user input calculate the total amount in the saving account after 10 years have passed
    - you may need extra variable to hold the result
    - create them with appropriate data types needed

## Part 3 - Display the result
### Objective 1 - Show the answer
- Display an appropriate message to the user with the correct result
    - this means have a print statement that includes words and a variable value within the same print statement

## Part 4 - Completing the quest
### Objective 1 - Merging to main branch and Pushing
- Click on the word "Git" in the bottom left corner of IntelliJ
- Select "main" (it should only say main)
    - Right-click and select "Checkout"
- It should now say "main" in the bottom right corner
- main should also have the checkout tag on it in this "Git" window
- Select the "dev" branch in this Git window
    - Right-click and select "Merge Selected into Current"
- Put a checkmark in the `dev` option
    - Only select the `dev` branch with no other words as this is our local version
- Click the merge button

### Objective 2 - Pushing back to GitHub
- Push all your commits to GitHub on both the main, dev, and any other branches you make
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

The committing and pushing process does not change for different branches it is always the same.  If you are confused or struggling with this process please reach out and let me know.

**Note:** Only the code on the main branch will be graded.  It is important to make sure you are happy with your main branch.  You can check if you code is only GitHub by logging in, finding your repo based on the assignment and checking the commit messages on the page that loads.  This are in the middle column of the little box at the top.  You should see your most recent commit message next to whatever files/folder you pushed.

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 2            | created appropriate dev branch              |
| 1            | created class and main method               |
| 4            | Scanner created correctly                   |
| 3            | user input gathered correctly               |
| 3            | result calculated and displayed is correct  |
| 2            | more than a single commit made to the repo  |
