# Lecture 3-1

## Exponents in Java

Exponents use a special class called the `Math` class.

+ Java imports this class automatically

+ Use the `Math.pow(a,b)` method which returns a<sup>b</sup>

Example:

```\n
float z;
int x=5, y=3;
z = Math.pow(x,y);  // z gets the value 125.0
```

+ Can use floating-point arguments

---

## Integer Literals

A **literal** is a *constant* value that appears directly in code.

+ Integer literals are by default treated as `int`

+ To use `long` instead, append L to the literal

For readabililty of long literals, digits could be divided with an underscore in between ( not before or after ):

`long canadaBirths2015 = 388_729;`

---

## Floating-point literals

Floating-point literals are by default treated as doubles.

+ To use a float instead, append f or F to the literal

```\n
System.out.println(7.542035f);
float ratio = 1.618033f;
```

+ doubles are more *precise* than floats

  + A double can have at most 15-17 significant digits

  + A float can only have at most 7-8 significant digits

---

## Methods

A method is essentially a group of **statements** which perform a specific **task**

+ May be defined **locally** ( in the same class as main ), or in some other class

> Note that all methods **must** belong to some class

A method accepts some **arguments** ( inputs, parameters ) and returns an output

+ Methods may have no arguments and/or return nothing (void)

Example:

+ `println()`

+ `nextInt()`

> The two methods above do not take any input, but they give us output

Math | . | pow | (x | ,y)
---|---|---|---|---
Class the method is called from | Dot operator | Method name | First input | Second input

+ The dot operator allows us to **invoke** or call a method from a specific class

To invoke or call a method means to use the methods as a statement or in an expression in your code.

> You provide the required inputs as you invoke the method, which the method call evaluates to the output.

---

## Methods Belonging to Other Classes

To invoke a method that is defined in another class, you need the name of the class or object, followed by the dot operator `.` and the method identifier.

Sample method invocations:

+ `System,out.println("Hello!");`

+ `cubeVolume = Math.pow(4.5,3);`

+ `myInt = sc.nextInt()`

---

## Constants

Some classes have constants as well as methods.

+ Syntax for accessing a constant defined in another class:

  + `className.constantName`

The Math class has two constants, `PI` and `E`.

Example:

Area of a circle is PI*r<sup>2</sup>

```\n
double radius = 10.5;
doube area = Math.PI * Math.pow(radius, 2);
```

---

## Trig Methods

The `Math` class has methods for the common trig functions.

Java method | Name
---|---
`sin(theta)` | sine
`cos(theta)` | cosine
`tan(theta)` | tangent
---|---
`asin(x)` | arcsine
`acos(x)` | arccosine
`atan(x)` | arctangent
---|---
toRadians(gamma) | convert degrees to radians
toDegree(theta) | convert radians to degree

+ All variables in the table are **doubles**

+ theta is an angle in radians

+ x is real number between -1 nad 1

+ gamma is an angle in degrees

---

## Exponents

The `Math` class has methods relating to exponents.

Java method | Math | Name
---|---|---
`exp(x)` | e<sup>x</sup> | exponential
`log(x)` | ln(x) | natural logarithm
`log10(x)` | log<sub>10</sub>x | base 10 logarithm
`pow(a,b)` | a<sup>b</sup> | power
`sqrt(x)` | x<sup>1/2</sup> | square root
`cbrt(x)` | x<sup>1/3</sup> | cube root

Example:

The length of a vector (x,y) is given by the formula (x<sup>2</sup> + y<sup>2</sup>)<sup>1/2</sup>

```\n
\\ Equivalent Java statement

double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
```

---

## Rounding Methods

The `Math` class has methods useful for rounding.

Java method | Name
---|---
ceil(x) | ceiling
floor(x) | floor
rint(x) | nearest integer ( as a double )
round(x) | nearest integer ( as an int or long )

---

## Other Methods

The `Math` class provides methods for finding the minimum, maximum and absolute value.

Java method | Math | Name
---|---|---
`min(x,y)` | min{x,y} | minimum
`max(x,y)` | max{x,y} | maximum
`abs(x)` | \|x\| | absolute value

---

## Generating Random Numbers

`Math.random()` method generates a random decimal number between 0.0 ( inclusive ) and 1.0 ( exclusive )

+ Often useful in programs

+ We can algebraically manipulate the output to obtain a random number in another **range**

```\n
r1 = (int) (Math.random() * 10);
// random integer between 0 and 9

r2 = (int) (Math.random() * 10) +1;
// random integer between 1 and 10

r3 = Math.random() * 100 + 50;
// random double between 50 and 150
```

---

## The Random Class

Also generates random numbers, but a bit differently than `Math.random()`

+ First we must create the `Random` object
  + `Random generator = new Random();`

+ Then we can use the methods of the `Random` class

Example:

```\n
// Instantiating the class
Random generator = new Random();

// Using the methods of the class

float r1 = generator.nextFloat(); // random float between [0.0 and 1.0)

int r2 = generator.nextInt(); // random int between -2,147,483,648 and 2,147,483,647

int r3 = generator.nextInt(100);  // random int between 0 and 99 inclusive

int r4 = generator.nextInt(100) + 1;  // random int between 1 and 100 inclusive
```

---

## Java API

When you encounter a class you aren't familiar with, or if you forget what methods you have available to you in a class, the API can be a very helpful resource.

+ Lists variables and methods belonging to the class

+ Describes what methods do

+ Gives argument and return types of methods

---

## Algorithms and Pseudo-Code

An algorithm is a step-by-step set of instructions to follow to solve a problem

+ More formally:
  + A sequence of precise steps which may take inputs, terminates in finite time, and produces outputs that constitue the solution to a particular problem

Pseudo-code is an **informal** high-level description of the operating principle of a computer program or other algorithms

+ It uses the **structural conventions** of a normal programming language, but is intended for *human reading* rather than *machine reading*
  
  + Such as a cooking recipe

---

## Breaking Down the Problem

Things to think about:

+ Inputs, Outputs

+ Variables

+ Initial state, Final state

+ Repetition, Selections

---

### Inputs and Outputs

Inputs

+ What information is needed in order to look for a solution to the problem?

Outputs

+ What information would constitute a solution to the problem?

> ***Problem*** - Sum of multiples of 3 and 5 in the Range of N
>
> + Input : N - End of the range of numbers
>
> + Output : sum - the sum of the numbers between 1 and N that are multiples of 3 or 5

### Variables and States

Variables

+ What do we need to keep changing throughout our solution?

Initial state

+ What starting values should the variables have?

Final state

+ What will the values of the variables tell us when we are finished?

> ***Problem***
>
> + Variables:
>
>   + n - the number we are currently considering whether or not to add to the sum
>
>   + sum - the current sum of the numbers we have selected
>
> + Initial state:
>
>   + n = 0;
>
>   + sum = 0;
>
> + Final state:
>
>   + n = N

### Repetition

+ Any task that needs to be done multiple times

+ Repetition needs a well-defined **end condition**

> ***Problem***
>
> REPEAT the following steps:
>
> 1. Add 1 to n
>
> 2. Add n to sum if n is a multiple of 3 or 5
>
> STOP when the number n is equal to N

### Representing Repetition in Pseudo-code

Three ways to think of repetition:

+ REPEAT, STOP :  Do something, then stop when something specific happens

+ WHILE : Do something while a certain condition is true

+ FOR ALL : Do something to all elements in a set

Can always translate from one way of thinking to another

### Selection

A selection is present whenever a choice must be made.

+ Selection could be thought of as a test or a check

+ Uses the IF...OTHERWISE format

If the OTHERWISE section doesn't contain any tasks, we can just omit that part entirely.

> ***Problem***
>
> IF n is a multiple of 3 or 5:
>
> + Add n to sum
>
> OTHERWISE:
>
> + Do nothing

### Precise and Checkable Conditions

+ It is important to precisely state stopping conditions in loops, and conditions in conditional statements

+ A condition should be easily **checkable** ( by a computer )

---

## Putting All These Steps Together

General solution to - ***Problem*** : Sum of Multiples

> Input : A positive integer N
>
> Steps:
>
> + Set n = 0, sum = 0
>
> + Repeat:
>
>   + Add 1 to n
>
>   + If n mod 3 = 0 OR n mod 5 = 0:
>
>     + Add n to sum
>
>   + STOP when n = N
>
> + OUTPUT : sum

---
