# Lecture 5-1

## Performing Repetitive Tasks

Computers are good at repetitive tasks, but humans are not.

+ Some types of repetition don't work well with loops

  + For example, using the same code:

    + In different programs

    + In distributed locations in one program

    + With unrelated inputs

---

## What is a method

+ A named group of statements that takes an input from a program, performs some actions, and returns an output

+ Called fucntions or procedures in other programming languages

---

## Other Methods

+ `System.out.println("Hello");`

  + Input is a String to print

  + Action performed is to print the String to the console

  + Output is void - this means nothing is returned

+ `scan.nextInt();`

  + Input is void (empty)

  + Action performed is to read the next int typed by the user

  + Output is the int that the user typed

---

## Method Calls ( Invocation )

Both `.nextInt()` and  `.println()` are examples of calls to methods

+ Neither example contains the actual method declaration they simply refer to the method which contains the code

+ The code that makes up the body of the method doesn't actually run until the method is invoked

---

## What Happens When a Method is Called

The program passes arguments ( data in the form of constants or vairables ) to the method, and passes control to the method.

+ The method executes a block of statements, using the arguments that were passed in. Methods can call other methods, and can even call themselves!

The method returns a value to the program ( or not, if it is a `void` method ) and then terminates, returning control to the program.

+ The program resumes where it left off, and can now use the value returned by the method

---

## Methods Are Useful

+ Reusable across different pieces of software

+ Help us see a problem as a collection of sub-problems

+ Not too many local variabels ( method code is isolated from main program )

+ Don't need to know how a method works to use it:

  + Just need to know input / output type(s) and range, and what the function is used for

+ Easier to test each method in isolation than the whole program at once

+ Convenience of method overloading

---

## Anatomy of a Method

```Java
public static int myFirstMethod (int k) {
  // statements go here
}
```

+ Modifiers: keywords added to variable or method declarations to change their meanings

  + e.g. public, private, static, abstract

+ Return type: data type of the value that will be returned

  + e.g. int, double, String, void

+ Method name: usually a verb, start with lower case, make it descriptive but concise

  + e.g. getMax, calcVolume, setColour

+ Parameter list in parantheses: each formal parameter is preceded by its data type, and separated by commas ( can be empty );

  + e.g. `(int ageInDays, float weightInPounds)`

+ Method body: enclosed by curly braces, statements that the method will execute

+ Return statement: Optional

  + e.g.

  ```Java
  {
    return -1;
  }
  ```

  + Gives the output of the method back to the main program

  + Value returned must match the type declared in the method signature

Example:

```Java
public static void main (String[] args) {
  Scanner scan = new Scanner(System.in);
  int height = scan.nextInt();
  for (int row = 0; row <= height; row++) {
    printStars(row);
  }
  scan.close();
}
public static void PrintStars (int n) {
  for (int i = 0; i < n; i++) {
    System.out.print("*");
  }
}
```

---

## Void Methods

+ void methods are methods that do not return any information.

  + They could perform some task, such as printing output

They do not return a value, so in the method header, put `void` in place of a return type.

```Java
public static void printNum (int n) {
  System.out.print("n = " + n + ".");
}
```

---

## When Invoking Methods

+ Type the name of the method

+ Next type the argument list in parantheses

  + Must match the parameter list from the method header

+ When invoking a method with a return value, the method should (usually) be invoked in a way that uses the return value, like:

  + `double cost = input.nextDouble();`

  + `System.out.println(Math.round(4.3));`

When invoking a void method, the method must be invoked as a standalone statement:

```Java
System.out.println("Inconceivable");
```

---

## Summary: Header vs. Signature vs. Invocation

Method header

```Java
public static int max (int num1, int num2)
```

+ Part of method definition

+ Inside a class, but not insde another method

+ Contains all information about a method ( except what it does )

Method signature

```Java
max (int num1, int num2)
```

+ Part of method header

+ Demonstrates what types of variables to pass into a method

Method invocation

```Java
int z = max (x, y);
```

+ This goes inside main or some other method

---

## Pass by value

Variables themselves cannot be altered by methods when they are used as arguments.

+ Instead, the arguments' values get passed to the method's parameters

If you alter a parameter inside a method:

+ The parameter will be affected

+ The associated argument (variable) will not

In this sense, variables are **local** to their methods.

---
