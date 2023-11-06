# Raid Quest (Solo): My New Additions
**`Quest giver: Governor Nighthill`**
>Zevius put some messages on this service for me and I have no idea how to retrieve them and respond. I am annoyed that he placed them here in the first place. I refuse to respond to such an inconsiderate action, respond to Zevius' questions for me.

## Objectives required to complete
This is a second introductory lab to verify that we can create classes when required and make branches in our git workflow.  We will also practice this updated workflow and the same submitting process as the first push.

If you have any issues with this process please refer to the GitHub Setup videos on YouTube (playlist linked below).

As always ask me for assistance or clarification on any steps, the videos are there as a secondary assistance tool if needed.

This quest can be decomposed into four parts for those who prefer chunking (it is recommended to use decomposition on assignments so practicing on a simple assignment can help you start to hone these skills).

We can start to realize that these "Parts" are large overview tasks of the entire quest.  Each part can be decomposed further as we see with the objectives.

| Part Number      | Description                                 |
| ---------------  | :----------------------------------------:  |
| Part 1           | Reading the requirements                    |
| Part 2           | Get repo into IntelliJ AND setup new branch |
| Part 3           | Completing raid tasks                       |
| Part 4           | Completing the raid                         |


## Part 1
### Objective 0 - How to use READMEs
We should have a small amount of comfort with Git and GitHub after our past couple lectures.  This is the first time working through GitHub and submitting for a grade.

Whenever we receive a new project we should read over the entire README first to get an idea of what requirements we must meet.

## Part 2 - Getting this repo into IntelliJ
### Objective 1 - Cloning
Once we have created our issue tracking on GitHub we want to get the repository into IntelliJ so we can begin to work.

This can be done from the main view page for the repository.  The button that reads `Clone or download` (should be green) must be clicked on to get the link needed.

- Clone this project into IntelliJ
    - remember to place it into a correct folder

If you are having difficulty doing the clone or are unsure about how to get it into a different folder please ask.

### Objective 2 - Branching from the main
Branches are pointers we have on our project.  We always start with a main branch called main.  This branch should be left alone for the most part and only have our final work code on it.

Therefore, we should create a second branch when starting a project.  Recommendation is to call this branch `dev`.  This new branch is where most of our work will be completed.  Once we are sure the code is working as intended we will merge this branch back to our main so that we can receive a grade.

We will create our branches from within IntelliJ.  Yes, you can create branches from within GitHub but most people forget to do it before the clone and there is no issue doing it within IntelliJ for our purposes.  Use the directions below to make a new branch:

- Click on the word "Git" in the bottom left corner of IntelliJ
  - Right-click on the word "main"
  - Choose "New branch from selected"
- On the popup name the branch `dev`
  - Leave the checkmark in "Checkout Branch"
  - Click "Create"

Now we have our `dev` branch, we double-check the bottom right corner it should say `dev`, not main.

We can now work on this `dev` branch.

## Part 3 - Completing the raiding tasks
### Objective 1 - MyNewAdditions Class
Often during quests we will not have a class created for us.  In these instances, we need to create the class ourselves.

A class is what holds all of our code including the main method.  It is important to create the class in the correct location.  In future quests, classes created in the wrong location can cause severe frustration.

- Create a class called `MyNewAdditions`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

If you are having a hard time finding the correct location to place the class you can come and ask me.

### Objective 2 - Main Method
Remember that all of our labs require a main method to be made somewhere.   These first labs, we only have a single class to work within, however, on larger labs the specific class for the main method will be listed in the objective.

- Create a main method in the `MyNewAdditions` class

The specifics for the main method can be seen in your `MyFirstPush` program.

### Objective 3 - Answering Zevius
This lab has the goal of enforcing more practice with the GitHub process.  However, it introduces some small, but crucial abilities we will need to have for other labs.

Respond appropriately to Zevius' questions, we will want to put some print statements within our main method.  Zevius has three questions this time:

```
What does Prof. Lupin offer Harry to make him feel better when the Dementors try to attack him?
What is Hermione’s patronus?
Who tells Harry he’s a wizard?
```

- Have print statements for each of the questions from Zevius
- Respond to Zevius' questions with three print statements
- You should have 6 print statements in total
    - this means BOTH question and answers need to be in print statements

The syntax for a print statement can be seen in the `MyFirstPush` lab you completed.

## Part 4 - Completing the quest
### Object 1 - Merging back to the main branch
We have been committing and pushing our code to the `dev` branch up to this point.  Once we are certain that our code is working without error or if the deadline is approaching we need to get our submission ready for grading.

We start by getting our code back over to the `main` branch, so we can make our final push and get a grade.

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

This will take what code and commits we have on the `dev` branch and put them on the `main` branch.  We can now push this branch to GitHub.

### Objective 2 - Pushing
Receiving a grade on any lab means our code needs to be on GitHub correctly.  This means in the same folder structure.  Do not worry if you push your code it will be in the same folder structure.

This submitting phase is a three-step process: **`add, commit, and push`**.

Without doing these three steps our code will not be on GitHub.  This can then cause delays or penalties on our overall grade for a lab.  The "submitting" process is important to do.  As you should have been adding and committing through the entire lab (as you completed prior objectives) all that is left to do down here is a final push.

- Push all your commits to GitHub
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

If you are struggling with these steps please ask.


#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 1            | created appropriate dev branch              |
| 1            | created the correct class                   |
| 1            | main method correct                         |
| 3            | answered Zevius' messages                   |
| 2            | merged and pushed the main branch           |
| 2            | more than a single commit made to the repo  |
