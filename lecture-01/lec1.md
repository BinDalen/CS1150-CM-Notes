# Lecture 1-1

Programming is creating software, or programs

+ A program is a set of *instructions* telling a computer what to do

Computers have two types of components:

+ Software : Invisible collection of programs

+ Hardware : Physical and tangible parts

---

## The Java Programming Language

+ Java is a general purpose high-level programming language

Mini-history:

+ Developed at Sun Microsystems in 1991 for programming embedded chips
+ Redesigned in 1995 for developing Web applications
+ Bought by Oracle in 2010

Properties of Java, according to its designer:

+ "Simple, object-oriented, distributed, interpreted, robust, secure, architecture neutral, portable, high performance, multi-threaded, dynamic"

---

## Java's Evolution

+ Java evolved with the Internet

+ Became popular because Java programs can be run from a browser - these are called **applets**, and they made the Web much more *interactive*

+ Java is now commonly used for *server applications*

+ Android phone software is developed in Java as well

---

## Java and the JDK

+ Editions:
  + Java SE: Standard edition, to run standalone or as applets
  + Java EE: Enterprise edition, for server-side applications
  + Java ME: Micro edition, for mobile apps

+ Current version is Java SE 12

+ The **Java Development Toolkit ( JDK )** is a set of programs used to develop and test Java programs
  + These can be used from the command line

---

## HelloWorld.java

``` public class HelloWorld {
  public static void main (String[] args) {
    // Display Hello world! on the console
    System.out.println("Hello world!");
  }
}
```

+ This is a complete Java program

`public class HelloWorld {}`

+ **Every program must reside inside a class**

+ This first line defines a class called HelloWorld

+ By convention, class names must be *capitalized*

+ By convention, Java uses *camel case*

`public static void main (String[] args) {}`

+ A program always begins executing at the **main** method

+ The main method must always be defined the same way

+ Inside this main method is a collection of statements

`// Display Hello world! on the console`

+ A single line comments begins with double slash //

+ A **multi-line comment** is enclosed between `/*` and `*/`

+ Comments are ignored by the computer

+ Comments are used to make code easier to read and understand
  + Use comments to explain complex pieces of code and to document your code

+ Indentation is also important
  + Well indented code is easier to read, comprehend and debug

`System.out.println("Hello world!");`

+ A **statement** is a line of code that ends in a semi-colon

+ Statement inside the main method get executed **in order**, one after the other

+ This statement prints the message "Hello world!" to the console

`System.out.println()` is defined in the **Java API**, which is why it knows to print the enclosed message to the console

The **Java API ( Application Program Interface )** is a library of predefined classes and interfaces that can be used to develop Java programs

The API saves users from rewriting the same commonly used bits of code

---

## Java Reserved Words

+ Also called *keywords*

+ These words mean something specific to the compiler

+ These words cannot be used as variable or class names

+ These words will appear coloured or bolded when you type them in most Java IDEs

+ Example:
  + The word `class` is a reserved word
  + The compiler knows the word after class is the name of the class

---

## Modifiers

`public`

`public static void`

+ Modifiers are a type of reserved word that specify certain properties of data, classes or methods

+ public, static and void are modifiers

+ For non, just use public before class, and public static void before the main method

---

## Block statements

```\n
{

}
```

+ Block statements or code blocks are programming statements that are enclosed by curly braces

+ The outer pair of curly braces enclose everything in the HelloWorld class

+ The inner pair of curly braces enclose all the statements in the main method

---

## Special Characters

+ The characters we have seen in the Hello World program are:

| Char | Name | Meaning |
|------|------|---------|
| {} | Curly braces | Denotes block of statements |
| [] | Brackets | Denotes an array |
| () | Parantheses | Used with methods |
| // | Double slashes | Single line comment |
| "" | Quotation marks | Enclose a "sentence" or sequence of chars |
| ; | Semi-colon | Marks the end of a programming statement |

---

## Write, Compile, then Run a Java Program

1. Create / modify source code

2. Compile source code
  
3. Run bytecode

4. Output / Result

---

## There are 3 Types of Programming Errors

+ Syntax errors
  + Detected by the compiler
  + Cause compiling to fail

+ Runtime errors
  + Cause the program to terminate abnormally

+ Logic errors
  + Cause the program to produce the wrong output

---

## Syntax Errors

+ Cause compile to fail

+ Also referred to as compile errors or compile time errors

+ Some usual causes:
  + Misspelled keywords
  + Missing punctuation
  + Unmatched braces, parantheses, quotes...

+ Source code *will not compile* until these are fixed

+ Many IDEs will indicate possible syntax errors as you type ( before compiling )

---

## Runtime Errors

+ Cause te program to terminate abnormally

+ Some usual causes:
  + Attempting to access memory that is out of bounds
  + Dividing by zero

+ Source code *will compile*

+ Program will not fully execute until these are fixed

---

## Logic Errors

+ Also called programmer errors

+ Cause the program to have unintended behaviour
  + Produce the wrong output

+ Code with a logic error isn't "wrong"
  + Source code *will compile*
  + Program will execute
