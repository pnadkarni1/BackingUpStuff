# Raid Quest (Solo): Adventuring Part II
**`Quest giver: Loremain Dibbs`**
>Why hello again! You have made some great impressions so far. Helping a chef start a new food cart. Designing a game for the clerk's office. Building the payphone system for the tavernkeeper. I have a great start to your tale, but it feels too easy as of now. Let us try to give you some difficulty to overcome. Here are a series of tasks for you to complete that will be your next chapters. Overcome them and you will be well on your way to becoming a legend. Good luck traveler.

## Objectives required to complete
**Complete any three of these you wish.  Only three in total need to be completed.**

When it comes to Heroic Quests throughout the year knowledge from Bronze Tier and Gold Tier are used for a majority of the questions that are created.  Correctly completing all three `Bronze Tier` problems or for every two problems correctly completed in `Gold Tier` or higher an extra point will be awarded to the final grade.

### Objective 1 - Looking at the problems
For these quests it is important to look over all the problems first.  Sometimes you may find a higher tier problem "easier" than a lower tier problem.  Sometimes you might not.

It is important to at least look over all the problems before picking your five.

### Objective 2 - The Problems
#### Iron Tier Problems
If you do not understand what a problem is requiring please ask for clarification instead of skipping it completely as it could be easier than it reads.

When solving any of these problems place comments in the code to indicate the problem being solved.  The comment should look something like `Iron - 2`.

- [x] **1.** Create a method that takes a String from the user of `even` or `odds` as a parameter.  Have the computer generate a random number between 1 or 2.  Take in an int from the user, it must be a 1 or 2.  Calculate the sum of the two numbers.  Check to see if the user won or lost.  If the user passed in even then the sum must be even to win and vice versa.
- [x] **2.** Create a method that takes a Scanner object `scan` and a Random object `rand` as parameters.  Inside the method have the computer generate a random int between 11 and 50.  Take in an int from the user.  Whoever has the larger number, you or the computer, is declared winner via prints.  Do the same thing again, but this time whoever has the smaller number wins.  Display a message to the user on what the computer number was and who won.  You may only use Math methods to determine the winner, no if statements allowed to determine the winner.

#### Bronze Tier Problems
If you do not understand what a problem is requiring please ask for clarification instead of skipping it completely as it could be easier than it reads.

When solving any of these problems place comments in the code to indicate the problem being solved.  The comment should look something like `Bronze - 1`.

- [x] **1.** Create a method that gets a String from the user and see if the String they entered begins with a capital letter or not.  Print out a message to the user that lets them know if the word starts with a capital or not.  You may only use the compareTo() method when checking the letters.
- [ ] **2.** Create a method that counts the amount of times a certain letter in a given string appears.  It should return the count.  You should take the String `word` and the `letterToCount` as parameters.  You may only use `substring()` when getting single letters.
- [ ] **3.** Create a method that takes a String as a parameter and prints the same String backwards on a single line.  You may only use String methods, however, you may not use any method that returns to you an array.

#### Gold Tier Problems
If you do not understand what a problem is requiring please ask for clarification instead of skipping it completely as it could be easier than it reads.

When solving any of these problems place comments in the code to indicate the problem being solved.  The comment should look something like `Gold - 1`.

- [ ] **1.** Create a method that takes a Scanner `scan` as a parameter.  Inside the method you should use the Scanner parameter to capture a word from the user and then convert it to a Pig Latin version of the word. Print out the original String and the Pig Latin version of the word.  You may only use `substring()` to pull off letters and test them.
  a. Pig Latin rules are the following:
    - If the word starts with a consonant then move it to the end of the word and add `ay` to the end.
    - If the word starts with two consonants then move them both to the end of the word and add `ay` to the end.
    - If the word starts with a vowel then add `way` to the end of the word, leaving the vowel in place.
- [ ] **2.** Create a method that will return true or false if a given String is an "abecedarian".  Words are said to be "abecedarian" if the letters in the word appear in alphabetical order.  Think about how you would get the String to be all the same, case wise, so that you can make a check to see if the letters are in alphabetical order.  You can only use String methods to do this, but cannot use `charAt()`.
- [ ] **3.** Create a method that takes a String and returns true or false if the given String is a palindrome.  A palindrome is a word that is spelled the same forwards and backwards.  You should only use String methods, no array returns, to solve this problem.  Plan out how you would check to see if a word is a palindrome on paper and implement that strategy.  You may create other helper methods if needed.  You are required to check letters with your solution you cannot check the entire word against another word.

#### Onyx Tier Problems
If you do not understand what a problem is requiring please ask for clarification instead of skipping it completely as it could be easier than it reads.

When solving any of these problems place comments in the code to indicate the problem being solved.  The comment should look something like `Onyx - 1`.

- [ ] **1.** Create a method that takes in a String.  The method should return true or false depending on if the String is symmetrical or not.  A symmetrical String is one that if there are an opening `(` or `[` that there be a close to match it.  If there is a match for every opening `(` or `[`.  Otherwise, it is not symmetrical. You can only use String methods to do this, but cannot use `charAt()`.

### Objective 3 - Pushing
As we complete these problems we need edit this README file.  This is easiest to do within IntelliJ and then to "add, commit, and push" the changes to the README back to GitHub.

The edit should involve the following:
- Place X's in between the [ ] next to the problems solved
- No spaces between the [ ] once the X is in there

This will mark that problem with a checkmark.

Receiving a grade on any lab means our code needs to be on GitHub correctly.  This means in the same folder structure.  Do not worry if you push your code it will be in the same folder structure.

- Push all your commits to GitHub
- Ensure that your main branch has the latest code
  - Only code graded on the main branch will count

#### Grading
|   Points     |   Requirement                                      |
| :----------: |:-------------------------------------------------- |
| 8            | Five problems completed                            |
| 2            | README changed to include X's for problems solved  |
