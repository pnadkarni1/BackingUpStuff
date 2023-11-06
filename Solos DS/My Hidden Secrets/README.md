[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/SLwwZdrn)
# Solo Quest: My Hidden Secrets
**`Quest giver: A Random Letter Pinned to Your Door`**
>In our technologically advanced realm, a society thrives on the exchange of knowledge through encrypted texts. A brilliant cryptographer, revered for their expertise, has devised a seemingly rudimentary encryption algorithm that has been mistakenly dismissed as too simple to crack. As a promising initiate in the realm's order of cipher masters, you are tasked with unraveling the cryptographer's intentions by encrypting and then deciphering the encrypted texts. Little do you know, this seemingly trivial exercise holds the key to understanding the dire consequences of inadequate encryption, unveiling a lesson that will forever shape the realm's approach to safeguarding its secrets.

## Quest Overview
Encryption is very important as a means to keep data secure.  Encryption is used for transactions, messages, mostly everything we do online.  One of the simplest uses of encryption is to keep the contents of files private/hidden in case they accidentally fall into the "wrong hands".

In this quest we will implement a trivially simple encryption algorithm on text files.  The algorithm and the way we are implementing it would never actually be used, however, it will provide us some ideas of how encryption is done and more importantly why encryption needs to be done well when implemented.

## Objectives Required to complete
This quest can be broken down into two main parts (Part 1 and 3) and an extra third part (Part 2):

| Part Number |              Description              |
|-------------|:-------------------------------------:|
| Part 1      |         Idea and Crypto Class         |
| Part 2      |      Decrypting something else        |
| Part 3      | Using the Crypto Class to help a user |


### Objective 1 - Designing a Plan
Our design plan should outline the steps being accomplished in each method of our program.  The [design example](designexample.txt) displays a design plan to base the one you may want to create for this quest.

### Objective 2 - Cloning
#### Tasks to Complete for this Objective
- Clone this project into IntelliJ
    - remember to place it into a correct folder

## Quest Requirements
The bullet points in this section are the bare minimum needed.  There are often times when exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic are required with certain steps.

## Part 1
### Objective 1 - Crypto Class
We will need to create an appropriate class.

This class will enable to user to encrypt or decrypt a text file utilizing a simple Caesar cipher.  This method of encryption considers 1-byte characters by their integer values, from 0-255.  In a Caesar cipher, the `key` is a value from 1 to 255, which represents how far to "shift" a character's value from its original position.

For example, the character `A` has the numeric value of 65 (the rest of the uppercase letters follow in order).  If the key was 4, then each `A` in the original file would encrypt from a 65 to a 69, which is the letter `E`.  Each `B` would encrypt to `F`, and so on.

**Note: this process must be circular, so the character with the value of 255 would encrypt to the character with the value of (255 + 4) % 256, which is 3.  I will provide you a very simple demo of this working in code**

The `key` for the Crypto class will be generated from a `password phrase (String)` that is entered when the object is created.  This will require us to somehow convert this String into an integer between 1 and 255.

In this class since we are encrypting file, we will need a way to decrypt them correctly, but only if the correct password is used for the decryption.  This is where interesting problems come into play that can be relevant to modern encryption/decryption.  We must somehow include a clue as to how to decrypt the file within the file itself, to enable its decryption, without giving away the entire process to those who should not be allowed to decrypt the file.

Obviously we cannot store the password that was used to generate the key within the file, as that way anyone who gets that file could decrypt it.  We can solve this problem (again, this is super simplified down) by storing a `hash` of the password used to encrypt the file at the beginning of the encrypted file.  A hash is a mapping of the password into a number.

Here is a very brief explanation of hashing in this specific situation:
Encryption:
- Password `p` is used to generate key `k`, which in turn is used to encrypt regular file `f` into encrypted file `e`
- Value H(p) is the hash of password `p`
- H(p) is placed at the beginning of encrypted file `e`, followed by th encrypted file data

Decryption:
- Assume password `q` is entered in an attempt to decrypt file `e`
- Value H(q) is the hash of password `q`
- Value H(p) is read from the beginning of file `e`
- If (H(q) == H(p)) it is assumed that `q` == `p` and the password matches.  The file is decrypted
- If (H(q) != H(p)) it is assumed that `q` != `p` and the password does not match.  The file does not get decrypted.

Now even with this simplified approach there are issues that should be resolved.  The most important one is the given hash H(p) it should be very difficult for anybody to reverse map that value `p` and obtain the password.  This is a problem because anybody can see the has value at the front of the encrypted file.  This problem can be solved by special cryptographic hash functions to generate the hashes.  **However, since our quest is simple we will not use them.  Instead, we will use a simple has function hashCode(), that is predefined in the String class of Java.  I will also provide a demo of this working in a simple manner.**

#### Tasks to Complete for this Objective
- Create a class called `Crypto`
    - make the class in the following location (-> denotes going to a sub-folder)
        - `src` -> `main` -> `java`

### Objective 2 - Instance Variables
#### Tasks to Complete for this Objective
- Create appropriate instance variables

Each object of type Crypto will need to store the password, key, and hash value for the object.  Some other data may be beneficial or necessary.

### Objective 3 - Constructor 
#### Tasks to Complete for this Objective
- Create a single constructor for the object
```Java
public Crypto (String password)
```

Besides taking the password phrase in as a parameter.  The constructor should also generate and store the key and hash for the Crypto object.  As described in the `Crypto class` objective.

### Objective 4 - Public Methods
#### Tasks to Complete for this Objective
- Create various methods needed

```Java 
public boolean encryptFile (String filename)
```
- Takes the name of the file to get encrypted
- Produced an encrypted version of the file using the Caesar cipher and key 

For more simplicity this method should process the file line by line.  It should then iterate through the line producing a new String containing the shifted characters.  Finally, it should output this shifted encrypted String to the file.  If everything goes correct it should return true.  There are some cases you will need to handle for a false return, such as, the file does not exist, the file appears to already be encrypted, etc.

The encrypted version of the file should be saved in a new file, which has the same name as the original, but with the extension `.cyp` added to the end (after the original file extension).

```Java
public boolean decryptFile (String fileName)
```
- Takes the name of the file to get decrypted
- Might produce a decrypted version of the file using the reverse shift of the key used to encrypt the file

Similar to above this method should read the file line by line and process the characters of the line one at a time.  The decrypted file will be stored in a new file with the same name as the original (unencrypted file), but with the extension of `.cpoy` at the end (after the original file extension).

It is important before we start decrypting the file though that we check to see if the hash in the file matches the hash for the current Crypto object.  If they do not match, the file is not decrypted and false is returned.  Other special cases, no file exists, wrong file extension, and others, also should return false.

```Java
public String toString()
```
- returns all the information stored in the Crypto object
  - password
  - key
  - hash

### Objective 5 - Other methods
There might be other methods that could help us simplify the code.  Any additional methods we create should be declared as private as they are only helpful to other methods in this class and should not be known about by any class or user outside of this class.

### Objective 6 - Test Crypto Class
#### Tasks to Complete for this Objective
- Test your Crypto class with the following two files
  - `CryptoDemo.java`
  - `DecryptDemo.java`

## Final thoughts on Part 1
There are some clear known issues with this simple encryption approach.  **WE DO NOT** have to solve these issues here.
- Shifting characters within the 256 character extended ASCII values means that some characters are not recognizable on Windows OS machines, this leads to incorrect decryption of some characters when the file is decrypted
- If a shifted character happens to be the newline character, when decrypting the character will not be read in and instead an extra line will be added to the output file.  This can be fixed if the data is read as bytes rather than Strings but you do not have to read in that way.

## Part 3
### Objective 1 - Decrypter Class
#### Tasks to Complete for this Objective
- Create a class called `Decrypter`
  - make the class in the following location (-> denotes going to a sub-folder)
    - `src` -> `main` -> `java`

This class needs to decrypt the message inside the `hidden.txt.cyp` file.  It needs to also crack the passcode used to encrypt the file.

Provide to us is the `commonpasses.txt` file.  This file contains 212 of the most common passwords people use.  The encrypted file was encrypted using one of these passwords.  It was encrypted using the `encryptFile()` method from the `Crypto` class.

Therefore, we can decrypt it using the `decryptFile()` method.  Once you have the file decrypted you are going to need the password as well as the message as they are to be stored in instance variables in this class.

Have `getters` for these two instance variables as well.

## Part 3
### Objective 1 - Main Method
Once you have verified your Crypto class working create a simple program that allows a user to encrypt and decrypt files.

#### Tasks to Complete for this Objective
- Create a class to for the user to interact with
- Create a main method
- Call the two getters from the Decrypter class to print out the hidden message and password used to encrypt that message
- Allow the user to enter a password
- Display a menu to the user that
  - allows the user to enter a file name to encrypt
  - allows the user to enter a file name to decrypt

### Objective 2 - Unit Test
#### Tasks to Complete for this Objective
- Create a unit test class for `Crypto`
- Write one test method for each public method in the `Crypto` class

### Objective 3 - Pushing back to GitHub
#### Tasks to Complete for this Objective
- Push all your commits to GitHub on both the main, dev, and any other branches you make
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

The committing and pushing process does not change it is always the same.  If you are confused or struggling with this process please reach out and let me know.

**Note:** Only the code on the main branch will be graded.  It is important to make sure you are happy with your main branch.  You can check if your code is only GitHub by logging in, finding your repo based on the assignment, and checking the commit messages on the page that loads.  These are in the middle column of the little box at the top.  You should see your most recent commit message next to whatever files/folder you pushed.
