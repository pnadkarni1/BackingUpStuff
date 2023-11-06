# Solo Quest: My New Best Shape
**`Quest giver: Grimand Talen`**
>Look at this marvelous table.  It is the center of attention for all visitors.  I do have another request though.  You see because of its popularity I have multiple requests for similar pieces of furniture.  Some of them are in different shapes.  Can you help me extend the program you originally wrote for me to work with some different shapes.  You can have this new wardrobe design that I have been working on for your help.

## Objectives required to be complete
This lab requires us to display our abilities for using inheritance.

Inheritance allows us to have subclasses that obtain certain properties from a superclass (parent class).  It helps to generalize certain states and behaviors for similar objects.

When using inheritance public or protected accessors in a superclass can be directly manipulated or invoked in a subclass.  However, constructors are never inherited from a superclass.

```Java
public class Animal {
    private int numLegs;
    private int numEyes;
    private int size;

    public Animal (int numL, int numE, int size) {
        numLegs = numL;
        numEyes = numE;
        this.size = size;
    }

    public void setSize (int newSize) {
        size = newSize;
    }

    public int getSize () {
        return size;
    }

    public String sound (String sound) {
        return sound;
    }
}
```

To access states or behaviors from the superclass we must use the keyword `super`
```Java
public class Tiger extends Animal {
    private String name;
    private int age;

    public void growUp () {
        if (age >= 4) {
            super.setSize(4);
        }
    }

    public String growl () {
        return super.sound("roar");
    }
}
```
If we have no default (no parameters) constructor in our superclass than we need to invoke the super constructor before we do our own constructor.  To access a super constructor you only use the keyword `super` followed by the parameters on the parent class constructor.  This must be the very **fist line** of code in the subclass constructor.

```Java
public class Tiger extends Animal {
    private String name;
    private int age;

    public Tiger (String name, int age, int size) {
        super (4, 2, size);
        this.name = name;
        this.age = age;
    }
}
```
In this instance, the superclass constructor requires an three integer arguments that it will set to the instance variables in its own class.  We take in a parameter of size to pass to the super constructor.  The other 2 values we pass in literals.

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

### Objective 1 - MySquare Class
- Create a class called `MySquare`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`
    - class should `extends MyRectangle`
```Java
    public class MySquare extends MyRectangle {

    }
```
- Do not create any new instance fields inside the `MySquare` class

You will need to create new methods and constructors inside this class.  They are outlined below:
```Java
public MySquare ()
```
- default constructor for the class
- set the instance fields to default values

```Java
public MySquare (int x, int y, int size)
```
- `x` and `y` are the starting coordinates
- `size` is the length of the side

```Java
@Override
public boolean setSize (int w, int h) {

}
```
We must override this method because the inherited version allows the width and height to be different sizes as it is a rectangle.
- we might need to change the return type in the super class method for this, depending on its implementation
- set the width and height if they are the same
- if they are different do not set anything
- return appropriately depending upon if you set or not

```Java
public void setSide (int side) {

}
```
A new method that updates the size of the square
- Update the size of the square
- Only use inherited instance variables

```Java
public String toString () {

}
```
Define a `toString` method that works with this object.  It has different needs than a rectangle so we are defining a different `toString` version.
- return a user-friendly display for how this object is printed out
```Java
"Side: ZZZ X: ZZZ Y: ZZZ"
```
- ZZZ should be the necessary values that belong to this object

### Objective 2 - Run the Main method
- Run the main program (found in `MyNewBestShape.java`)
    - The main method should build and produce an output
    - You can check your output against the [sample](/sample-output/mynewbestshapeout.txt)
        - If all your test cases pass then your output will match

### Objective 3 - Merging to main and Pushing to GitHub
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
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 2.5          | constructors work correctly                 |
| 2.5          | toString() method correct                   |
| 2.5          | setSide method is correct                   |
| 2.5          | setSize method is correct                   |
