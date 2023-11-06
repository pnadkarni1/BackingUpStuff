# Epic Raid Quest (Solo): Adventuring Part VI
**`Quest giver: Loremaster Dibbs`**
>So this is it, your ending.  I only have the final chapter to write.  Look at where you have come from storing literal value into variables and printing them out to creating these recursively methods.  Your tale is remarkable one of a kind.  This story, your story is going to be one that transcends realms.  Good luck traveler.

## Objectives required to complete
**Complete any four of these you wish**


### Objective 1 - Looking at the problems
For these quests it is important to look over all the problems first.  Sometimes you may find a higher tier problem "easier" than a lower tier problem.  Sometimes you might not.

It is important to at least look over all the problems before picking your five.

### Objective 2 - The Problems
#### Bronze
- [x] **1.** Given a random number of a cartoon mouse figure.  Count and return how many total fingers there are between all the cartoon mouse creatures.  Each cartoon mouse has 8 fingers.  However, each odd numbered cartoon mouse is doing a hang loose gesture meaning they only have 4 fingers showing.  Calculate this solution recursively, in a method called `countingFings` that takes the random number of fingers as a parameter, without using any loops or multiplication.
- [x] **2.** Given a random string of characters.  Count and return how many times the word `raid` appears in the string.  Calculate this solution, in a method called `lastRaid` that takes a single String parameter, recursively without using any loops.
- [x] **3.** Given a number of rows that are needed to set up bowling pins.  Count and return the total number of pins needed to make a traditional bowling triangle (1 pin out front, 2 pins behind that, 3 behind that, etc.).  Calculate this solution, in a method called `pinLoading` that takes the number of rows as a parameter, recursively without using any loops or multiplication.
- [x] **4.** Given an array of ints and a starting index.  Calculate the numbers of times the value 19 appears in the array.  We should only use the part of the array that begins at the starting index to get our answer.  Do this recursively.

#### Gold
- [ ] **1.** Given a random String with the letter sequence `zoo` appearing throughout.  Return a new string where the sequence `zoo` is moved to the end of the string.  Do this recursively in a method called `zooEnder`.
- [ ] **2.** Given a random String.  Generate all the subsets of that string.  For example, the substring of "hold" are the sixteen strings: "hold", "hol", "hod", "hld", "hl", "ho", "hd", "h", "old", "ol", "od", "o", "ld", "l", "d", "".  Do this recursively in a method called `subsetGenHint`.
- [ ] **3.** Given an array of random ints.  Determine if it is possible to split the ints into two groups (they do not have to be equal size), which have the same sum when all the numbers in a group are added together.  However, all the multiples of 8 have to be in one group, and all the multiples of 3 (and not a multiple of 8) have to be in the other group.  Do this recursively (you do not need any loops) in a method called `3splits8`.
- [ ] **4.** Given an array of random ints.  Determine if it is possible to select some numbers at a starting index that sum to a target.  However, when a value is chosen to be in the selection, the value that comes directly after it in the array is not permitted to be chosen.  Do this recursively without any loops in a method called `notSoFastAdjs`.

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
| 8            | Four problems completed                            |
| 2            | README changed to include X's for problems solved  |
