# Lecture 1-2

## Writing Source Code

+ Java source code can be written in any text editor

+ Need to save the file as `ClassName.java` where ClassName is the name of the class that contains the main method

+ Some text editors have built in features making them a good choice for writing and editing code
  + ( i.e. Notepad++, Sublime)

---

## Compiling via Command Line

+ Open Command Prompt
  1. Type `cmd` into your Windows search bar or in the Run dialog

+ Navigate to the directory where your file is saved
  1. Type `cd ..` to move up a directory, and cd dirName to move down into a directory called dirName
  2. Alternatively, just type the entire path `cd C:\Users\YourName\dirName`

+ Type `javac ClassName.java`

+ Source code will then compile into a `.class` file called `ClassName.class`
  + This class file will be stored in same directory

---

## Executing via Command Line

+ Open Command Prompt

+ Navigate to the directory where your .class file is saved
  + If you just compiled the program, you will already be in the correct directory

+ Type `java ClassName`
  + Even though what you are running is the .class file, make sure not to include the file extension here

+ Program executes

---

## Java Program Structure

```\n
// comments about the class
public class MyProgram
{
    // comments about the method
    public static void main (String[] args) // method header
    {
        // method body
    }
}
```

---

## Identifiers (naming things)

+ Sometimes we choose identifiers ourselves when writing a program

+ Sometimes we are using another programmer's code, so we use the identifiers that he or she chose

+ Often we use special identifiers called **reserved words** that already have a predefined meaning in the language
  + Remember that a reserved word cannot be used in any other way

---

## Naming Conventions

+ Begin with a *lower case* letter

+ Be descriptive, but **concise**

+ If an identifier has multiple words, capitalize the first letter of all but the first word ( **camel case** )

+ Some good variable names:
  + studentNum, netWeight
  + ageInDays, tempInCelsius

---

## Bad Variable Names

+ Don't make the names too long, or too hard to remember

+ Avoid using two very similar identifiers in the same program

+ Some bad variable names:
  + fma03jga, Length, aGelnDaYs
  + nineDigitStudentNumberOfProgramUser

---

## Variables

A variable is a name for a location in memory

+ A variable must be declared by specifying the variable's name and the type of information that it will hold

`int total;`

> In the code above, int is the data type and total is the variable name

`int count, temp, result;`

> Multiple variables can be created in one declaration

---

## Variable Initialization

+ AKA storing information in variables

+ A variable can be given an initial value in the declaration

+ When a variable is used/references in a program, the current value stored in the variable is what gets used

Variable examples:

```\n
int sum = 0;
int base = 32, max = 149;
```

---

## Assignment

An assignment statement changes the value of a variable.

+ The assignment operator is the = sign

+ `int total = 55;`

+ The expression on the right is evaluated and then the result is stored into the variable on the left

+ Whatever value that used to be in `total` is overwritten

+ **Do not re-declare the variable when re-assigning it**

+ You can only assign a value to a variable that is consistent with the variable's declared type

---

## Character Strings

A string of characters can be represented as a string literal by putting double quotes around the text.

Examples:

> "This is a string literal."
>
> "123 Main Street"
>
> "X"

+ Every character string is an object in Java, defined by the String class

+ Every string literal represents a String object

+ Creating a String variable : `String str = "A variable containing a string of text";

---

## The println() method

The `System.out` object represents a destination ( the monitor screen ) to which we can send output.

| System.out | .println () | "Whatever you are, be a good one." |
|------------|-------------|------------------------------------|
| object | method name | parameters ( information provided to method ) |

> `System.out.println("Whatever you are, be a good one.")`

---

## The print() Method

The `System.out` object provides another service as well.

+ The `print` method is similar to the `println` method, except that it does not advance to the next line

+ Therefore anything printed after a `print` statement will appear on the same line

---

## String Concatenation

The **string concatenation operator** ( + ) is used to append one string to the end of another.

> "Peanut butter " + "and jelly"

+ It can also be used to *append* a number to a string

+ Strings cannot be broken across multiple lines in a program

You **cannot** write the following:

> System.out.println ("I keep on hoping
>
> we'll eat cake by the ocean");

+ To write this properly you **must** use concatenation

---

## More Concatenaion

The `+` operator is also used for **arithmetic addition**.

+ The function that it performs depends on the **type** of the information on which it operates

  + If both operands are strings, or if one is a string and one is a number, it performs string concatenation

  + If both operands are numeric, it adds them

+ The `+` operator is evaluated left to right, but *parantheses* can be used to force the order

Examples:

> `System.out.println ("Hello" + 007);`
>
> `System.out.println ("You are" + "crazy");`
>
> `System.out.println (22+33);`

---

## Escape Sequences

+ Some characters will not be printed in strings

+ To force a string to contain these special characters we must use escape sequences

Escape Sequence | Meaning
----------------|---------
\b | bakcspace
\t | tab
\n | newline
\r | carriage return
\" | double quote
\' | single quote
\\ | backslash

---

## Constants

A constant is an identifier that is similar to a variable except that it holds the **same value** during its entire existence.

+ As the name implies, it is *constant*, not *variable*

The compiler will issue an error if you try to change the value of a constant.

In Java, we use the `final` modifier to declare a constant:

> `final int MIN_HEIGHT = 69;`

Constants are useful for three important reasons

+ First, they give meaning to otherwise *unclear literal values*

+ Second, they facilitate *program maintenance*
  + If a constant is used in multiple places, its value need only be updated in one place

+ Third, they formally establish that a value should not change, *avoiding inadvertent errors* by other programmers

---

## Types of Data in Java

There are eight **primitive data types** in Java.

Four of them represent integers:


+ byte
+ short
+ int
+ long

Two of them represent floating point numbers:

+ float
+ double

One of them represent characters:

+ char

And one of them represents boolean values:

+ boolean

---

## Numeric Primitive Data

The difference between the various numeric primitive types is their size, and therfore the values they can store.

Type | Storage | Min Value | Max Value
-----|---------|-----------|-----------
byte | 8 bits | -128 | 127
short | 16 bits | -32,768 | 32,767
int | 32 bits | -2,147,483,648 | 2,147,483,647
long | 64 bits | < -9 x 10^18 | > 9 x 10^18 |
---|---|---|---
float | 32 bits | -3.4 x 10^38 with 7 significant digits | 3.4 x 10^38 with 7 significant digits
double | 64 bits | -1.7 x 10^308 with 15 significant digits | 1.7 x 10^308 with 15 significant digits

---

## Characters

A `char` variable stores a single character.

Character literals are delimited by single quotes:

> 'a'
>
> 'X'
>
> '7'
>
> '$'
>
> ','
>
> '\n"

Example declarations:

> `char topGrade = 'A';`
>
> `char terminator = ';', separator = ' ';`

+ Note the distinction between a primitive character variable, which holds only one character, and a `String` object, which can hold multiple characters

---

## Boolean

A `boolean` value represents a true or false condition.

The reserved words `true` and `false` are the **only valid values** for a boolean type.

+ `boolean done = false;`

> A boolean variable can also be used to represent any two states, such as a light bulb being on or off.

---

## Expressions

An *expression* is a combination of one or more **operators** and **operands**.

Arithmetic expressions compute numeric results and make use of the **arithmetic operators**:

Operator | char
---------|------
Addition | +
Subtraction | -
Multiplication | *
Division | /
Remainder | %

+ Note if either or both of the numbers being operated upon are floating point numbers, **the result will be a floating point number also**

---

## Division and Remainder

+ If both operands to the division operator ( / ) are integers, the result is an integer ( the fractional part is **discarded** )

The Remainder operator ( % ) returns the remainder after dividing the first number by the second.

Example:

> 14 % 3 equals 2
>
> 8 % 12 equals 0

---

## Operator Precedence

+ AKA *Order of Operations*

Operators can be combined into complex expressions.

+ `result = total + count / max - offset;`

Operators have a well defined **precedence** which determines the order in which they are **evaluated**.

+ Multiplication, division, and remainder are evaluated prior to addition, subtraction, and string concatenation

+ Arithmetic operators with the same precedence are evaluated from left to right, but parentheses can be used to force the evaluation order

Operators | Precedence
----------|------------
postfix | expr++ expr--
unary | ++expr --expr +expr -expr ~ !
multiplicative | * / %
additive | + -
shift | << >> >>>
relational |< > <= >= instaceof
equality | == !=
bitwise AND | &
bitwise exclusive OR | ^
bitwise inclusive OR | \||
logical AND | &&
logical OR | ||
ternary | ? :
assignment | = += -= *= /= %= &= ^= \|= <<= >>= >>>=

---

## Variable assignment revisited

The right and left hand sides of an assignment statement can contain the **same** variable.

> `count = count + 1`
>
> 1 is added to the original value of count, then the result is stored back into count
>
> + The original value will be **overwritten**

---

## Unary Operators

+ The operators we've seen so far have been binary (they've acted upon **two** values)

Java has some unary operators (they act upon only **one** value)

+ The **increment operator** ( ++ ) adds one to its operand

+ The **decrement operator** ( -- ) subtracts one from its operand

The statement `count++;` is functionally equivalent to `count = count + 1;`

---

## Assignment Operators

+ Often we perform an operation on a variable, and then store the result back into that variable

Java provides assignment operators to simplify that process.

For example, the statement `num += count;` is equivalent to `num = num + count;`

Operator | Example | Equivalent To
---------|---------|---------------
+= | x += y | x = x + y
-= | x -= y | x = x - y
\*= | x \*= y | x = x * y
/= | x /= y | x = x / y
%= | x %= y | x = x % y

+ The right hand side of an assignment operator can be a complex expression

+ The entire right-hand expression is evaluated first, then the result is combined with the original variable

Therefore `result /= (total - MIN) % num;` is equivalent to `result = result / ((total - MIN) % num);`

---

## More on Assignment Operators

+ The behavior of some assignment operators depends on the types of the operands

+ If the operands to the `+=` operator are strings, the assignment operator performs **string concatenation**

> The behavior of an assignment operator ( += ) is always consistent with the behavior of the corresponding operator ( + )

---

## Converting Between Types

+ Sometimes it is convenient to convert data from one type to another - called **data conversion**
  + For example, in a particular situation we may want to treat an integer as a floating point value

+ These conversions do not change the **type** of a variable or the **value** that's stored in it - they only convert a value as part of a computation

> Conversions must be handled carefully to *avoid losing information*.

+ **Widening conversions** are safest because they tend to go from a small data type to a larger one ( such as an `short` to an `int` )

+ **Narrowing conversions** can lose information because they tend to go from a large data type to a smaller one ( such as an `int` to a `short` )

In Java, data conversions can occur in three ways:

+ assignment conversion
+ promotion
+ casting

---

## Assignment Conversion

Assignment conversion occurs when a value of one type is assigned to a variable of another.

```\n
float money;
int dollars = 3;
money = dollars;
```

+ This above assignment converts the integer value in `dollars` to a floating point value in `money`

+ **Only widening conversions can happen via assignment**

+ Note that the value or type of `dollars` did not change

---

## Promotion

Promotion happens *automatically* when operators in expressions convert their operands.

For example, if `sum` is a `float` and `count` is an `int`, the value of `count` is converted to a floating point value to perform the following calculation:

```\n
float sum = 4;
int count = 2;

result = sum / count;
```

---

## Casting

Casting is the most powerful, and dangerous, technique for conversion.

+ **Both** widening and narrowing conversions can be accomplished by *explicitly* casting a value

To cast, the type is put in parantheses in front of the value being converted.

For example, if `total` and `count` are integers, but we want a floating point result when dividing them, we can cast `total`:

`result = (float) total / count;`

---

## Interactive Programs

+ Programs generally need input on which to operate

The `Scanner` class provides convenient methods for reading *input values* of various types.

+ A `Scanner` object can be set up to read input from various sources, including the user typing values on the keyboard

+ Keyboard input is represented by the `System.in` object

---

## Reading Input

The following line creates a Scanner object that reads from the keyboard:

> `Scanner scan = new Scanner (System.in);`

+ The `new` operator creates the `Scanner` object

+ Once created, the `Scanner` object can be used to invoke various input methods, such as:
  + `String answer = scan.nextLine();`

The `Scanner` class is part of the `java.util` class library, and must be imported into a program to be used.

+ The `nextLine ()` method reads all of the input ( as a String ) until the end of the line is found

+ The `nextInt ()` method reads all of the input ( as an int ) until the end of the line is found

+ The `nextDouble ()` method reads all of the input ( as a Double ) until the end of the line is found

---
