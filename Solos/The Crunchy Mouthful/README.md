[![GitHub Classroom Workflow](https://github.com/csa2122v1/the-crunchy-mouthful-pnadkarni1/actions/workflows/classroom.yml/badge.svg?branch=main&event=push)](https://github.com/csa2122v1/the-crunchy-mouthful-pnadkarni1/actions/workflows/classroom.yml)

# Solo Quest: The Crunchy Mouthful
**`Quest giver: Chef Sven`**
>I want to open up a new food cart.  Expand the business, reach new customers, you know the
typical moves.  I have the location already picked out...  I mean its a cart so there is not a
set location. Picking out the location was not really difficult.  What I really need help with
is making the system for purchases.  I am scaling down my menu so I need some different requirements.  Help me and you can have free meals for a month.

## Objectives required to complete
This lab has us pretending we are running a simple food cart.  We will implement skills of looping continually as long as a customer is waiting. We ask for a response from the user to see if there is a customer.  It also has us practicing showing a menu to a user and then allowing a customer to make purchases.  Finally, we need to understand how to calculate change amounts and return the correct amount back to the user if needed.

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

## Objective 1 - CrunchyMouthful Class
We will need to create an appropriate class for this lab that will help us with our calculations and user interactions.

- Create a class called `CrunchyMouthful`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

If you are having a hard time finding the correct location to place the class you can come and ask me.  Our class must be called `CrunchyMouthful` exactly.  If it is not called this then the test class will fail and cause errors on your build.

## Objective 2 - Main Method
Remember that all of our labs require a main method to be made somewhere.   Eventually making the main method becomes second nature.  Until then you can either ask or refer to your previous labs to see the specifics needed when making the main method.

In this lab our main method we will do a majority of the work except calculating change for the user.  Calculating change will be handled by a different method.  However, our main method will do all other input capturing and displaying.

- Create a main method in the `CrunchyMouthful` class
- Check to see if somebody is waiting to order some food
    - Your program should continue to loop around and ask this question until the answer is no
- As long as a person is willing to place an order you will need to do the following
- Display to them the menu choices and prices
    ```
        1. Chipotle Seitan Breakfast Burrito ($9.15)
        2. Creole Grilled Tofu ($13.75)
        3. Beastmode Burger Deluxe ($19.50)
        4. Water ($7.00)
        5. Root Beer ($8.59)
        6. Display Menu
        7. Checkout
    ```
- Ask the customer what item(s) they would like to order
    - Customers are allowed to make a maximum of 2 selections to order
- Once the customer decides to or has made 2 selections they should checkout
- Upon checkout, you should display the items the customer ordered along with the total price for the order
- Ask the customer how much they are paying for their order
- Call the `calculateChange` method to see how much change you owe the customer
- If the number returned from this method indicates that the customer still owes money ask for more money
    - display a new updated amount they owe if they underpay
        - this should not impact the overall cart total
- Continue this process until they have either paid an exact amount or overpaid and need change
- Display to the customer the breakdown of their change in fewest coins and bills as possible

This section will require some looping.  There is no *"correct"* loop for this as long as your logic is correct.

While the class name must be `CrunchyMouthful`, variable names can be whatever you wish.  However, remember naming conventions when determining variable names.

Think about what the return value would be if the customer underpays (you need to ask them for more money), paid the exact amount, or overpaid (you owe them change).  You will need a loop and possibly some conditional checks to determine if you need to ask for more money or give change. There are several solutions for this with multiple correct implementations it comes down to your logic.

Giving back change in fewest coins and bills possible can be tricky.  This is where planning your algorithm with pseudocode becomes very beneficial.  One way (probably the easiest way) to determine all these amounts is using a mixture of the modulus % and division / operators on the change amount returned (you want to divide first and then use modulus to reduce the number).  Calculating out all the change values should be done in the main method here not your other method.

For instance if the cart total is $12.43 and somebody pays with $20.  The customer expects back $7.57.  The fewest coins and bills possible breaks down to the following:  7 dollars, 2 quarters, 1 nickle, and 2 pennies.

If you are struggling with this calculating change please come talk to me and we can discuss it out in detail instead of you trying to read it and understand it in writing.

## Objective 3 - calculateChange method
We want to build a method that calculates the changed owed to the customer.  This will allow us to practice method creation with parameters.  We can focus on making this single method correctly since we only have to focus on one thing.  Remember a method should do one thing and one thing only.  In this case, it will be calculating the changed a customer should be receiving.

- Create a public static method
    - it will need to return the amount of change a customer is to receive
    - call it `calculateChange`
    - have it takes two parameters
        - `double` the user payment amount
        - `double` the cart total amount
    - calculate the change the customer is to receive from these two values
    - this is to be a single value
    - **not** the breakdown of change
        - that specific breakdown is handled by the main method

Consider what type of value should be getting returned if the customer underpays.  This means that the customer would still owe us some money.  Understanding this type of value returned will allow you to correctly implement the "keep asking for payment" part of the main method.  The customer underpaying should return a negative value.  The customer overpaying should return a positive value.

Again this method only needs to be returning a single value (how much change to give out or how much money is still owed).  The specific change breakdown in fewest bills and coins does not happen in this method.  That is handled by the main method after you return this value back.

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

## Bonus
Instead of only showing the total order name and total price when a customer checkouts.  Show them individual items ordered with the individual prices for those items **AND** the total for their order.  Display this in a nice user-friendly fashion.

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 2            | design plan                                 |
| 2            | created appropriate dev branch              |
| 2            | menu items correctly displayed              |
| 3            | loop through until no customer              |
| 5            | correctly display order and total           |
| 5            | choice limit on user correct                |
| 5            | ask for more money if underpays             |
| 10           | correct change displayed to user            |
| **2**        | **BONUS done correctly**                    |
