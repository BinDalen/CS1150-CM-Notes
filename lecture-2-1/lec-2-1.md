# Lecture 2-1

## Unary Operators

+ The operators we've seen so far have been **binary** ( they've acted upon *two* values )

Java has some **unary** operators ( they act upon only *one* value )

+ The **increment operator** ( `++` ) *adds one* to its operand

+ The **decrement operator** ( `--` ) *subtracts one* from its operand

The statement `count++;` is functionally equivalent to `count = count + 1;`

+ Additional notes on `++` and `--`:

Operator | Sample | Explanation
---------|--------|------------
++ | ++x | Increment x by 1, then use the new value of x
++ | x++ | Use current value of x then increment it by 1
-- | --y | Decrement y by 1, then use the new value of y
-- | y-- | Use current value of y then decrement it by 1

### Example

``` int i = 3, j = 3;
System.out.println("i++ produces " + i++);
System.out.println("++j produces " + ++j);
```

> The output for `i++` should be 3, since the variable's value was taken and printed before being incremented.
>
> The output for `++j` should be 4, because the variable's value was taken and printed after it has been incremented.

+ This means that after the code fragment has been executed, both i and j have the value 4

+ In essense, what you need to remember is that:

  + A **prefix** expression performs its increment or decrement **before** producing a value

  + A **postfix** expression performs its increment or decrement **after** producing a value

---

## User Input

Instead of having to *hard-code* input directly into our programs, we could ask for inputs to use it **many times** for **different inputs**

+ We want any user to be able to *interact* with java programs

+ Non-programmers shouldn't have to deal with code to change inputs

+ Asking for inputs also helps us as programmers

## Prompting for Input

The first task, when user input is desired, is to **ask** for input by printing to the console.

+ Be very **specific** and **know your users**

  + Describe the **format** their input must take

  + Describe the **meaning** the input should have

  + It may help to remind the user to hit the Enter key

> Sample prompt:
>
> `"Please type your height in centimeters, round to the nearest whole number, and then press enter."`

## Interactive Programs

Programs generally need **input** on which to operate.

The `Scanner` class provides convenient methods for **reading input values** of various types.

+ A `Scanner` object can be instatiated to read input from *various sources*, including the user typing values on the keyboard

> Keyboard input is represented by the `System.in` object

## Reading  Input

The following line creates a Scanner **object** that reads from the keyboard:

`Scanner scan = new Scanner(System.in);`

+ The `new` operator creates the Scanner object

Once created, the Scanner object can be used to **invoke** various input methods, such as:

`String answer = scan.nextLine();`

## Importing the Scanner Object

Before creating a `Scanner` object, you must include the following statement at the beginning of your file.

`import java.util.Scanner;`

You could also choose to import everything in `java.util` library by using the all inclusive symbol `*`:

`import java.util.*;`

+ Don't use a new Scanner each time you get console input, one is enough, **reuse it**

## Reading Input

The `Scanner` class is part of the `java.util` **class library**, and **must be imported** into a program to be used.

+ The `nextLine()` **method** reads all of the input ( as a String ) until the end of the line is found

+ The `nextInt()` method reads all of the input ( as an int ) until the end of the line is found

+ The `nextDouble()` method reads all of the input ( as a Double ) until the end of the line is found

## Closing the Scanner

There is also a `Scanner` method which **closes the input stream** when the program is done with it.

+ Nothing too bad will happen if you forget to do this

+ Main reason to close a Scanner is to **prevent unintended access** to it

> Other objects, such as files, are very important to close, even if you are just coding a self-contained program

To close the previously created `scan` object, we could use:

`scan.close();`
