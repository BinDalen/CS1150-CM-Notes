# Lecture 4-2

## Nesting If Statements

For more complex conditions you can nest an `if` statement inside of an `if` statement.

+ For example, if you wanted to see if someone was both blonde and tall you could write:

```Java
if (hair.equals("blonde")) {
  if (height > 190) {
    System.out.println("you are a tall blonde");
  } else {
    System.out.println("you are a short blonde");
  } else {
    if (height > 190) {
      System.out.println("you are tall and dark haired");
    } else {
      System.out.println("you are short and dark haired");
    }
  }
}
```

---

## Logical Operators

To create compound boolean expressions, use the following operators:

Java | Name | Description
---|---|---
! | NOT | logical negation
&& | AND | logical conjunction
\| \| | OR | logical disjunction
^ | XOR | logical exclusion

---

## Logical Negation

Logical negation `!` acts on a single `boolean` value.

+ Read `!` as "not"

Result of negation is the opposite of the input value.

+ `!false` becomes `true`

+ `!true` becomes `false`

```Java
int temp = -15;
!(temp <= 0); // this is false

boolean isRaining = false;
!isRaining; // this is true
```

---

## Logical Conjunction

Logical conjunction `&&` acts on two boolean values.

+ Read `&&` as "and"

Conjunction results to `true` when both operands are `true`

+ Otherwise, conjunction results to `false`

```Java
int temp = -15;
boolean isRaining = false;

(temp <= 0) && (!isRaining) // this is false
(temp == -15) && (!isRaining) // this is true
(temp > 0) && isRaining // this is false
```

---

## Logical Disjunction

Logical disjunction `||` acts on two boolean values.

+ Read `||` as "or"

Disjunction results to true when either ( or both ) operands are `true`

+ Otherwise, disjunction results to `false`

```Java
int temp = -15;
boolean isRaining = false;

(temp <= 0) || isRaining; // this is true
(temp == -15) || (!isRaining); // this is true
(temp > 0) || isRaining; // this is false
```

---

## Logical Exclusion

Logical exclusion `^` acts on two boolean values.

+ Read `^` as "exclusive or"

Exclusion results to true when **exactly one** operand is `true`

+ Otherwise, exclusion results to `false`

Think of as "either A or B but not both".

```Java
int temp = -15;
boolean isRaining = false;

(temp <= 0) ^ isRaining; // this is true
(temp == -15) ^ (!isRaining); // this is false
(temp > 0) ^ isRaining; // this is false
```

---

## Alternative to Nesting If Statements

You can use logical operators to combine conditions in your `if` statements.

```Java
if (hair.equals("blonde") && height >= 190) {
  System.out.println("you are a tall blonde");
} else if (hair.equals("blonde") && height < 190) {
  System.out.println("you are a short blonde");
} else {
  System.out.println("you are not blonde");
}
```

---

## Coding Style

+ As our programs become more complex, it is important that our use of braces and indentation is correct

+ With `if` statements we don't need curly braces if there is only one statement in an `if` or `else` block

+ However, indentation should always be used properly to help organize

+ By default, an `else` matches the most recent `if` statement

---

## Switch Statements

+ Like a condensed version of several `if`, `else if`, `else` statements

+ Work with `byte`, `short`, `char`, `int`, `String`, and a few other types

```Java
switch (${expression}) {
  case ${expression1}:
    // code block 1
    break;
  case ${expression2}:
    // code block 2
    break;
  default:
    // default block
    break;
}
```

---

## How Switch Works

Switch compares the expression in the `switch` statement with each of the case expressions.

+ The comparison starts from the top case and continues until it finds one that is equal

  + If a `true` case is not found then the default case will be executed

+ However, if no default is specified, and no true cases are found, then no code block is executed

The `default` case is optional. If present, program only enters the default case if none of the other cases match.

The `break` statements are **necessary**, because `switch` statements have fall through behavior ( i.e. without the `break`, consecutive blocks will execute after one another from top to bottom)

---

## Conditional Operator

`?`

+ The ternary operator

+ Acts on three expressions

+ Basically a short handed `if` `else` statement

Syntax:

```Java
(${condition}) ? /* do if true */ : /* do if false*/;
```

Example:

```Java
System.out.println("Are the lights on or off?");
String lights = scan.nextLine();

System.out.print((lights.equals("on")) ? "It's bright" : "It's dark");
```

---

## Purpose of Loops

If the same steps need to be repeated a known number of times, loops will save you from copy-pasting and creating long source-code files

+ If the same steps need to be repeated an unknown number of times, loops allow you to do this by repeating only while a certain condition is true

+ Useful for processing Strings and arrays

---

## While Loop

We use the `while` loop when we do not know how many times our loop will execute.

+ We must guarantee that our loop will stop executing at some point by providing a valid stopping condition.

+ Loops that don't stop are called infinite loops

```Java
while ( ${boolean expression} ) {
  //statements go here
  //more statements
}
```

+ A `while` loop repeats the statements inside the block

+ Before entering the block, checks whether the loop condition ( boolean expression ) is true

  + Only enter the block if the expression evaluates to true

  + First time expression is false, code execution continues after closing curly brace of the loop.

---

## Boolean Variable as Loop Condition

```Java
boolean myBool = age > 15;
while (myBool) {
  // statements
  // somewhere in here, myBool must become false
}
```

Trace your loop to make sure `myBool` eventually becomes false.

+ Otherwise, you will have an infinite loop and your program will never terminate

---

## Loop Counter

Sometimes you will want to know how many times your loop needs to run ( how many iterations )

+ You can create a variable to count the iterations
  + often called `i`, `j`, `k`, `l`

+ When you use counters, it is easier to avoid infinite loops, because you know how many times your loop should iterate

---

## More Complex Loop Conditions

A loop condition can be something more involved.

+ Let's say you want to check the weather every five minutes for the next two hours or until you notice it stops raining

```Java
int mins = 0;
boolean isRaining = true;
while (mins < 120 && isRaining) {
  // if stopped raining, set isRaining = false
  mins += 5;
}
```

> The more complex your code becomes, the harder it is to find bugs, so by guaranteeing your loops stop properly, you will save yourself a lot of trouble.

---

## The do-while Loop

We use a do-while loop when we don't know how many times we want the loop to run, but we do know we want the loop to run at least once.

+ As usual, we must guarantee that our loop has a valid stopping condition

```Java
do {
  // statements go here
  // more statements
} while ( ${boolean condition} );
```

A do-while loop performs the statements inside the block and then checks the condition.

+ do-while loop checks condition after the loop, while loop checks condition before

+ Because of this, do-while loops always execute at least once

First time the condition is false, code execution resumes after the semi-colon

---

## Converting Between Loops

Often times we have to convert between different types of loops, but it is not always possible.

Example:

```Java
int i = 1;
while (i <= N) {
  System.out.println(i++);
}
```

```Java
i = 1;
do {
  System.out.println(i++);
} while (i <= N);
```

+ These loops are equivalent only if the loop condition holds initially

+ If i > N to start, then `while` loop doesn't execute, but do-while loop executes once

---

## for Loops

We use `for` loops for solving problems which require an action to be repeated a known number of times.

+ A `for` loop repeats the statements inside the block ( like a `while` loop )

+ Unlike a `while` loop, the control statements for a `for` loop are all in the loop header, which has three parts:

  + Initialization action : Executed once, before entering the loop

  + Loop condition : A boolean expression that is checked before every iteration to ensure it is true before executing the code block

  + Action after iteration : Executed at the end of each iteration

```Java
for (initialization; condition; increment/decrement) {
  // statements go here
  // called the loop body
}
```

+ Note the two semicolons between the parts of the header

```Java
for (int i = 0; i < 100; i++) {
  System.out.println("GOLDFISH DON'T BOUNCE");
}
```

---

## Converting a for to a while

These loops are equivalent.

+ Can always transform a `for` loop into a `while` loop by:

  + Moving the initialization before the loop

  + Moving the increment/decrement to the end of the loop body

  + Replace `for` with `while`

> Converting in the other direction is trickier and sometimes impossible

---

## Which Loop is the Best Loop?

There is no wrong choice, as it's largely a matter of personal preference.

+ Sometimes one feels more natural for the particular application

+ If you can't decide:

  + If something must repeat a known number of times, or for a given list of values, a `for` loop is a good choice

  + If code must be executed at least once, no matter the condition, you may want to use a do-while loop

  + Otherwise, a `while` loop is generally a good choice

---

## Nested Loops

You can place loops inside of loops.

+ They are powerful, but difficult to trace correctly

+ You can draw an analogy between the way an analog clock operates and the way nested loops iterate

Example of nested `for` loop:

```Java
System.out.println("Enter the number of rows");
int max = scan.nextInt();
for (int row = 1; row <= max; row++) {
  for (int star = 1; star < row; star++) {
    System.out.print("*");
  }
  System.out.println();
}
```

---
