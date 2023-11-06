# Epic Quest: My Magical Store
**`Quest giver: Aela Flume`**
>Wow, you made it!  You passed all your OWLs and NEWTs (of course you got "Outstanding" in "Defense Against the Dark Arts", thanks to a little help from some well-placed spells).  While you wait for an opening in the office for Aurors, your dream job, I would like to offer you another opportunity.   There is an opening for running a small food cart in Hogsmeade called "Dumbledore's Delicious Delicacies" (DDD for short, named after your great cousin [twice remove] Albus).  I will pay up front you would only need to run the day to day operations.  Since the cart is small you will have a limited menu, consisting only of:Cauldron Cakes, Chocolate Frogs, and Butterbeer.  These are popular enough items that you have the hope of being able to earn enough Galleons while you wait for an position to become available (at this point you would even acept a position with the "Accidental Magical Reversal Squad").

## Objectives required to complete
This is a significantly larger lab than what we have accomplished so far.  We must plan accordingly for the amount of time this will take to complete.

Smaller pieces of this lab have been completed in other assignments so look back at that code, and you may even be able to copy and paste some of that old code into this project.

### Objective 0 - Basic Knowledge
There is a lot of basic knowledge that takes up a significant amount of space.

There will be two different pricing structures for this quest.  Look over the different pricing requirements for members and non-members.  If you have any questions on the pricing ask me for clarification.

You will have some tiered pricing, normal and then special challenge club members.  Located at the front of the store floating in the air is a sign with your normal prices for customers to easily see.

#### Normal Pricing

| Item Name             | Price                    |
| --------------------- |:-------------            |
| Cauldron Cakes        | Single: 10 Knuts... Bag of 6: 55 Knuts  |
| Chocolate Frogs       | 20 Knuts each     |
| Butterbeer            | Small: 50 Knuts... Large: 75 Knuts  |

#### Challenge Members Pricing
You like to challenge aspiring witches and wizards.  Therefore, when a customer enters your store they are offered the following choice:

- Purchase all items at regular prices
- Answer a challenge question
    - if they answer correctly, they receive special discounts on the items (table below shows discounts)
    - if they answer incorrectly, they have to pay a 10% pentalty fee on all purchases
        - the fee will be assess at check-out

Customers who answer the challenge question correctly will have the following prices:

| Item Name             | Price                    |
| --------------------- |:-------------            |
| Cauldron Cakes        | Single: No discount... Bag of 6: 50 Knuts  |
| Chocolate Frogs       | 15 Knuts each     |
| Butterbeer            | Either size: 50 Knuts  |
| Overall               | 10% off over and above any other discounts if the overall order (after other discounts) is 10 Sickles or more, rounded to the nearest Knut  |


You recognize that not everybody may be familiar with wizarding money (muggles) or the absent-minded 3rd years.   You do your best to accommodate with the following signs above the register.

#### Clarification Signs

| Note Number           | Description                    |
| --------------------- |:-------------            |
| 1      | We prefer exact change (but will make change is necessary) |
| 2      | Operator does not have more than 20 Galleons on the cart at any time! |
| 3      | Recall currency rates: |
|        | 29 Knuts == 1 Sickle   |
|        | 17 Sickles == 1 Galleon == 493 Knuts   |


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
- Select the "main" under the "Local"
    - right-click on main and select "+ New Branch"
- On the pop up name the branch `dev`
    - Leave the checkmark in "Checkout Branch"
    - Click "Create"

## Quest Requirements
The bullet points in this section are the bare minimum needed.  There are often times when exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic is required with certain steps.

### Objective 1 - DumbledoresDeliciousDelicacies Class
- Create a class called `DumbledoresDeliciousDelicacies`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

If you are having a hard time finding the correct location to place the class you can come and ask me.

## Objective 2 - Main Method
In this lab, our main method will do all the work.  There is no requirement to have separate methods, however, you can build some if you find it helpful.

I will describe the main method in terms of no additional methods being created since there is no requirement to make extra methods.

If you would like to talk about the potential of making additional methods come to see me and we can plan methods for you.  Creating extra methods can be very beneficial for this lab.

- Create a main method
- Capture user input to see if they are waiting to make a purchase
    - if a customer is there continue on
    - if no customer quit the program
- Welcome the customer to your store and show them your regular prices
- Ask if the customer would like to answer the challenge question to get the discount
    - make sure you inform them of the risk and reward
- Capture if the customer wants to accept the challenge
    - if they accept the challenge
        - show them the question and ask for the answer
            - question could be multiple-choice or fill in the blank (make it about Harry Potter books or movies)
        - Check the answer and respond accordingly
            - if the answer is correct congratulate them and show them the updated prices
            - if the answer is incorrect sadly inform them and note the 10% pentalty will be added to the final bill

**Note: since the challenge question is a single, unchanging question, a clever witch or wizard could clearly try it, buy nothing and then try again, knowing the correct answer the second or third time.  You don't have to try to prevent this**

- Once the prices are set for the customer, they can start placing an order
- The ordering process should be iterative in design
    - allow the customer to change their mind as often as needed until it is all finalized at checkout
    - no updating only fully changing

To make the line move along so nobody is waiting too long, purchasing will be restricted in the following ways:

- Purchase of Cauldron Cakes will always be made by number of cakes
    - if a customer wishes to buy a bag they will need to enter 6 as the number of Cauldron Cakes, meaning your program should automatically detect that as a bag of 6 being purchased
    - for any number of Cauldron Cakes, X, you should always count as many whole bags that could be purchased before charging for individual Cauldron Cakes
        - if a customer wishes to purchase 20 Cauldron Cakes, your program should consider this as being 3 bags and 2 single Cauldron Cakes

- A customer is allowed to update the amount of a given item they are purchasing
    - before updating to a new amount the previous amount should be displayed
    - update means overridding

- Once the customer decides to checkout then you should tabulate and itemize the bill
    - itemizing the bill means that each amount of a given item should be shown along with the unit price for the specific item.  Next to this should be the subtotal for that item amount being purchased
    - only show items that are being purchased on the bill

- If the 10% pentalty applies show that on a separate line (**the pentalty should be rounded to the nearest Knut**)
    - don't overthink this

- Capture payment from the customer
    - take the amount and then calculate and display the change given to the customer
    - this should be an iterative process
        - customer will give an amount of Knuts, Sickles, or Galleons (only 1 currency type at a time)
        - the amount the customer is paying should continue to happen until they have given you an amount that either equals or exceeds the total bill
    - If you need to give change you must adhere to the following rules
        - always give back the fewest amount of coins (this means that you will be giving back larger currency first and work your way to smaller currency)
        - for example, if a customer has a total bill of 600 Knuts
            - they wish to pay with 2 Galleons (=986 Knuts)
            - the customer should be given change in the amount of 13 Sickles and 9 Knuts, which adds up to 386 Knuts

- Remember you need to keep helping customers until there is nobody left in line

Remember naming conventions when determining variable names.  This is a large number of objectives that can be intimidating.  My recommendation is to break this up into smaller parts.  For example `ask if a customer is waiting in line, get a response, create a while loop that will continually ask if there is another customer to help until the answer is no`.  Write all that out in code and then test, run your program and make sure it loops and continually asks until you say no.

Once that is working do an add and commit and then move on to the next small piece.  This type of lab is why we have been working in a dev branch for other labs.  Once you have a piece of code working merge it to the main branch so it is safe then start working on the next piece in the dev branch.

Ask if they want to take the challenge.  Get the response and either move on or show them the question and test their correct or not.  Show update prices or not.  After you believe you have this correct, test again.  Run your program to make sure you see the prices correctly for question right or wrong.  Your program should also still be asking if a customer is waiting in line after showing the prices until the answer is no.

Make sure this all works correctly, do an add and commit.  Then move on to the next part.  Continue this small feature building process and you will be amazed at how quickly you can move through the lab without getting frustrated.

The math for total and conversions of currency is usually easier than you think.  Do not overcomplicate the process, which is easy to do.  This is why planning is so important.

Think about how to handle special cases of user input.  If the user gives you an invalid value then your program is expected to handle it appropriately, don't take negatives. However, you may assume that if you are asking for a number then the user will not try to enter a String.

Format your code nicely, things should be indented and have an order to them.  The IDE has quick format options, but things should be formatted automatically if you go in small steps.

### Objective 3 - Additional methods (Optional)
There are parts of the main method that could be broken into separate methods.  Doing this could clean up your code, make it easier to read, and easier to debug if you have problems.

This lab does not have any requirement to make additional methods outside of the main.  Therefore, if you would be interested in doing this objective, please schedule a time to talk to me.

## Objective 4 - Checking Output
There is no correct way to display output for this lab.  However, certain interactions should occur in your lab.  These output files show off those interactions.
- The output files and video will be on a Schoology update

Your output does not need to look exactly like either one of these.  These are for you to get a visual understanding of some of the requirements and functionality that should be provided through your program.  I encourage you to come up with your own output, get creative and have some fun with it.

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

## Bonus (10 points, not stackable)
If adding an extra Cauldron Cake would either be the same or a lower price for the customer, recommend that he or she add another cake.  Think about when / if this could occur.

OR

If the challenge question is answered correctly, show after the itemized bill the overall savings.  In other words a correct challenge chalenge answer should calculate the bill both with and without the discounts, and the difference is the amount the customer saved.  Show this total but alos the indiviudal savings for each different item.

OR

Add some graphical output to your program using JOptionPane.  You should NOT use this for input, however, since a Scanner class is required.

#### Grading
There is a rubric included as a file for this project.  It is the **a1score.docx** file.  If you have trouble opening it come and see me.

|   Points      |   Requirement                                           |
| :------------:|:------------------------------------------------------- |
| 15            |  main outer loop correct                                |
| 10            |  challenge question options handled                     |
| 10            |  regular/discounted prices shown/used                   |
| 10            |  items quantities / choices done correctly              |
| 10            |  quantities can be updated (iterative process)          |
|  5            |  Cauldron Cakes (bags vs. singles) handled              |
|  5            |  10% bonus discount handled correctly                   |
| 15            |  prices / subtotal shown / itemized correctly           |
|  5            |  only purchases items shown in bill                     |
| 10            |  penalty (10%) added correctly (rounded)                |
| 15            |  payment handled correctly (single currency, iterative) |
| 10            |  change has minimum number of coins                     |
| 10            |  range errors handled appropriately                     |
| 10            |  good user interface (both I and O)                     |
|  5            |  submission                                             |
|  5            |  documentation                                          |
