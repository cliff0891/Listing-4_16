# Listing-4_16 : How to generate a random upper case letter.

## Introduction

This document details the generation of a Java program that writes an uppercase letter to the console. This code is managed inside Github.com and uses the Math.random() method as well as a custom method call.

## Outline
``` java
// Generate a random uppercase letter (using a custom method call)
// 'A' is 65
				
/* 'Z' is 90, and we wanted to cover the range, so we added 1 more to ensure	
we would cover A through Z.*/

// From page 122 a + Math.random()*b gives us a random number between a and a+b excluding a+b.

/* Make a new variable and then fill it with a random number that is between our starting value
and ending value. Then print it out.*/ 

// Generate a random number

// recast the number to a letter.

// Print the random letter to the console.
```

## References and Literature
// From page 122 a + Math.random()*b gives us a random
  number between a and a+b excluding a+b.*/

// Liang Java 10th edition. Pg 87, Listing 3.3
// This is an example of how to make a random number.
// int number1 = (int)(Math.random()*10);

// Liang Java 10th edition. Pg 125, Table 4.4
// We can map from integers to Capital letters
// Characters �A� to �Z� have a Value in Decimal of 65 to 90.

// Liang Java 10th edition. Pg 122, 4.2.5 the random method.
// a + Math.random() * b
// returns a random number between a and a+b, excluding a+b.

// Liang Java 10th edition. Pg 209, 6.4, void Method Example.
// This shows how we can set up a method call.

## Code
```java
public class listing4_16 {
	public static void main(String[] args) {
		
		// 'A' is 65
		int startingValue = 65;
		
		/* 'Z' is 90,
		and we wanted to cover the range, so we added 1 more to ensure
		we would cover A through Z.*/
		int endingValue = 90-startingValue+1;
	   
		/* From page 122 a + Math.random()*b gives us a random
		 * number between a and a+b excluding a+b.*/
		
		/* Make a new variable and then 
		fill it with a random number that is between our starting value
		and ending value. Then print it out. */
		int randomNumber;
		System.out.println("The random uppercase letter is:");
		 // Generate a random number
		randomNumber = (int)(startingValue + Math.random()*endingValue);
	    // recast the number to a letter.
		char letter = (char)randomNumber; 	
		// print it out.
		System.out.println(letter); 		

	}

}
```

## Console
*The random uppercase letter is:*
# V
*The random uppercase letter is:*
# T
*The random uppercase letter is:*
# F
*The random uppercase letter is:*
# B
*The random uppercase letter is:*
# W



## Command Prompt

1. Open Eclipse and start new project
	a. may need to change to your workspace
2. Go to Github and start a new repository.

3. Use the command prompt to make the connections.


a. Navigate to the correct location. Looking for src and bin folders.

Move to the E: drive:
```
C:\Users\LAB>E:
```
*dir* shows what is in the directory.
```
E:\>dir
 Volume in drive E has no label.
 Volume Serial Number is CF21-6DC3

 Directory of E:\

10/09/2015  08:03 AM    <DIR>          COMSC_1033_Workspace
10/13/2015  11:53 AM    <DIR>          COMSC_3603
10/18/2015  04:09 PM    <DIR>          Github_Workspace
10/29/2015  10:25 AM    <DIR>          COMSC_3603_Workspace
               3 File(s)     16,394,783 bytes
              14 Dir(s)   8,059,305,984 bytes free
```
*cd COMSC_1033_Workspace* Changes to the correct eclipse workspace.
```
E:\>cd COMSC_1033_Workspace

E:\COMSC_1033_Workspace>cd Listing-4_16 
```
Use *dir* again to make sure we can see the src and bin files.
```
E:\COMSC_1033_Workspace\Listing-4_16 >dir
 Volume in drive E has no label.
 Volume Serial Number is CF21-6DC3

 Directory of E:\COMSC_1033_Workspace\Listing-4_16 

11/02/2015  09:14 AM    <DIR>          .
11/02/2015  09:14 AM    <DIR>          ..
11/02/2015  09:14 AM               401 .project
11/02/2015  09:14 AM    <DIR>          src
11/02/2015  09:14 AM    <DIR>          bin
11/02/2015  09:14 AM               232 .classpath
               2 File(s)            633 bytes
               4 Dir(s)   8,059,305,984 bytes free

E:\COMSC_1033_Workspace\Listing-4_16 >
```
And now we add the readme file. This is the start of directions from Github.
```
E:\COMSC_1033_Workspace\Listing-4_16 >echo # Listing_4_16_1411_Proje
ct >> README.md
```
Continue to work through the instructions online.

Initialize our repository.
```
E:\COMSC_1033_Workspace\Listing-4_16 >git init
Initialized empty Git repository in E:/COMSC_1033_Workspace/Listing_4_16_1411_Pr
oject/.git/
```
Add our files to the staging area.
```
E:\COMSC_1033_Workspace\Listing-4_16 >git add .
```
Configure our user name and password.
```
E:\COMSC_1033_Workspace\Listing-4_16 >git config user.name "clif0891"

E:\COMSC_1033_Workspace\Listing-4_16 >git config user.email "yuyunc@student.swosu.edu”
```
Commit our changes.
```
E:\COMSC_1033_Workspace\Listing-4_16 >git commit -m "first commit"
[master (root-commit) ba507c7] first commit
 5 files changed, 29 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/Listing-4_16.class
 create mode 100644 src/Listing-4_16.java
```
Make the connections between our repository and Github.
```
E:\COMSC_1033_Workspace\Listing-4_16 >git remote add origin https://
github.com/cliff0891/Listing-4_16 .git

E:\COMSC_1033_Workspace\Listing-4_16 >git push -u origin master
Username for 'https://github.com': yuyunc@student.swosu.edu
Password for 'https://yuyunc@student.swosu.edu@github.com':
Counting objects: 9, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (9/9), 1.27 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/cliff0891/Listing-4_16 .git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
```

E:\COMSC_1033_Workspace\Listing-4_16 >
