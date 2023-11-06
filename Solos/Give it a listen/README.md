[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/utbVmvd2)
# Solo Quest: Give it a Listen
**`Quest giver: Limm Forkbeard`**
>Hello moppet.  I like music.  You know it sounds.  There is a lot of music you might say too much music.  But that wouldn't be true.  I do need help organizing and collecting my music.  I can't be bothered to do that because I am too busy listening to it.  So you'll do that for me and you know I'll listen and make sure you don't mess anything up.

## Objectives required to complete
In this quest we examine how to capture some user input, store the input into a data structure, and write that input into a text-file.

Once we have written our code we should write various unit tests that can check to make sure our code works for different inputs.

## Objectives Required to complete
### Objective 1 - Designing a Plan
Our design plan should outline the steps being accomplished in each method of our program.  The [design example](designexample.txt) displays a design plan to base the one needed for this project.

When creating a design plan for this project place it in the `Design Plan` folder there is an empty text-file in there for us to type out our plan in.  Remember design plans should be pushed and requested for approval before coding.

### Objective 2 - Cloning
#### Tasks to Complete for this Objective
- Clone this project into IntelliJ
    - remember to place it into a correct folder

## Quest Requirements
The bullet points in this section are the bare minimum needed.  There are often times when exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic are required with certain steps.

### Objective 0 - Setup Work
- Add to the existing `musiclibrary.txt` file at least 3-5 other albums

Each new album added needs to have the following information (each item should be on a new line):
```
Artist
Album Title
Studio/Label
Peak Position on Billboards
   - information on the billboard data can be found by googling artist name and "chart history"
   - going to the official billboard website will provide the most accurate data  
   - not all data may be here especially for older or more obscure artists
   - after really attempting to search if you cannot find information you may make it up
Peak date
Weeks on chart
One line review
blank line to separate entries
```
It is important the data entered into the text-file is in this specific format for the searching aspect required below.  You will be entering this information directly into the text-file yourself.

You should have the line title followed by the information for example
```
Artist: The Shins
Album Title: Port of Morrow
Label: Aural Apothecary, Columbia Records
Peak Position: 3
Peak Date: April 7, 2012
Weeks on Chart: 15
Review: low-key loveliness with excitable beauty
```

### Objective 1 - MusicOrganizer Class
We will need to create an appropriate class for this lab that will help us with our calculations and user interactions.

- Create a class called `MusicOrganizer`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

### Object 2 - Class Requirements
Here is an overview of what interaction inside the class should be like.  I am not going to specify the exact methods that are required you will have that design decision to make.

- Present a menu system that provides the following options
```
    0: Quit
    1: Print all to Console
    2: Print all to Different File
    3: Add new album
        - Make sure you collect all the correct information to add an album to the text-file eventually
    4: Find specific artist
        - They should then receive the option to find either all albums or a specific album
        - They should be given the option to either print that information to the console or to a different text file.
    5: Update a review for a particular album
```

### Objective 3 - Unit Test
#### Tasks to Complete for this Objective
- Create a Test class and unit tests for your code.
    - you should test your, 1, 2, 3, 4, and 5 methods from the menu choices above
        - make sure the correct info is returned by your method think about having your method either return a boolean or a String of the info needed.

### Objective 4 - Pushing back to GitHub
#### Tasks to Complete for this Objective
- Push all your commits to GitHub
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

The committing and pushing process does not change it is always the same.  If you are confused or struggling with this process please reach out and let me know.

**Note:** Only the code on the main branch will be graded.  It is important to make sure you are happy with your main branch.  You can check if your code is only GitHub by logging in, finding your repo based on the assignment, and checking the commit messages on the page that loads.  These are in the middle column of the little box at the top.  You should see your most recent commit message next to whatever files/folder you pushed.

### Bonus (2 points)
- Give the user the option to sort the list of albums by the number of weeks on the chart then by if they want greatest to least or least to greatest

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 5            | setup text-file work                        |
| 3            | menu displaying correct options             |
| 3            | printing to the console correct             |
| 3            | printing to a different text-file           |
| 10           | finding a particular artists implemented    |
| 7            | appropriate unit test written correctly     |
| 5            | updating a review for a song                |
| 5            | user-friendly output                        |
| 2            | naming conventions followed                 |
| 2            | more than a single commit made to the repo  |
