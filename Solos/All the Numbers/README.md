# Solo Quest: All the Numbers
**`Quest giver: Yebb Phizzlethorpe`**
>Oh no no no... This is not good.  If there was a level rating for how not good this was it would be the highest level of not good.  Okay, okay, ok, o, k, I accidentally deleted the code repository that was housing our basic method functionality for working with data sets.  I don't know why I was left in charge here I don't know what I am doing.  Can you help me build back the functionality?  You know the stuff that has gone away.  It shouldn't take somebody of your caliber too long.

## Objectives required to complete
Methods have several advantages. In this lab we will practice writing some static methods.  These methods will exist in the same file as our main method.

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

## Quest Requirements
The bullet points in this section are the bare minimum needed.  There are often times when exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic is required with certain steps.

### Objective 1 - AllTheNumber Class
- Create a class called `AllTheNumbers`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

### Objective 2 - Main Method
- Create a main method in the `AllTheNumbers` class

### Objective 3 - Gathering User Input
We interacted with a Scanner in our last quest.  Recall there are three parts when using a Scanner.

- Create a `Scanner` object
- Begin collecting user input
    - Accept numbers until the user gives a negative
    - Determine th maximum and minimum numbers the user entered

### Object 4 - Methods
We will need three methods to calculate various values: average, variance, and standard deviation

- Create a static method `average`
    - it should not have a return
    - it should take two parameters
        - the sum of the user inputs
        - the number of inputs the user gave
    - calculate the average of the parameters
    - print a message displaying the average and a message to the user

- Create a static method `variance`
    - it should return a double
    - it should take three parameters
        - the sum of the user inputs
        - the number of inputs the user gave
        - the sumOfSquares from the user input
    - calculate the variance
        - formula for variance is (amountOfNums * sumOfSquares - total * total) / (amountOfNums * (amountOfNums - 1))
    - return the variance

- Create a method `standarddev`
    - it should return a double
    - it should take three parameters
      - the sum of the user inputs
      - the number of inputs the user gave
      - the sumOfSquares from the user input
    - calculate the standard deviation of the user inputs
        - formula for standard deviation is the square root of the variance
        - do not recode the variance formula

### Objective 5 - Display the answers
This should occur back inside the main method.  Some of these displays may require the methods we created to be called.  Remember when using methods sometimes the results will need to be stored into a variable.

- Display an appropriate message to the user with the following information
    - minimum number entered
    - maximum number entered
    - the sum of the numbers
    - the average of the numbers
    - the variance
    - the standard deviation

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

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 1            | created appropriate dev branch              |
| 1            | created class and main method               |
| 2            | Scanner created correctly                   |
| 2            | average method correct                      |
| 2            | variance method correct                     |
| 2            | standarddev method correct                  |
| 3            | all print outs provided                     |
| 2            | more than a single commit made to the repo  |
