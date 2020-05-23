# Lecture 3-2

## ASCII Evolution

The ASCII character set originally used **seven bits** to represent each character, allowing for 128 **unique characters**.

+ Later ASCII evolved so that all eight bits were used which allows for 256 unique characters

---

## Unicode Character Set

Unicode uses 16 bits per character. Therefore, the Unicode character set can represent 2<sup>16</sup>, or 65536 characters.

+ This is the **character encoding** used by Java

---

## The char data type

+ Data type to hold a **single character**

+ `char` literals are enclosed in single quotes

Syntax:

```\n
char middleInitial = 'L';
char favouriteDigit = '4';
char hashtag = '#';
```

---

## Casting numeric types to chars

Any positive integer in the hex range 0x0000 to 0xFFFF can be implicitly cast to a `char`

```\n
char myChar = 0x0041;
// casts an int into char 'A'
```

Larger integers require explicit casting

+ Only last two bytes are used

```\n
char myChar = (char) 0xD40041;
// also casts into 'A'
```

Floating-point types can also be explicitly cast into chars
  
+ Java first casts these into ints

```\n
char myChar = (char) 65.143;
// also casts into 'A'
```

---

## Using Numeric Operators with chars

+ Can use all the comparison operators with `char` operands

  + Java compares their integer values

+ Can also use mathematical operators ( `+`, `-`, `*`, `/` ) with `char` operands

  + Operands will be cast into ints

```\n
char ch = 'm';
boolean bigger = ch >= 'a';
boolean smaller = ch <= 'z';
boolean isLowercase = bigger && smaller;

System.out.printf(ch + " is a lowercase letter: " + isLowercase);
```

---

## Java Character Class

Assuming ch is a char:

Java method | Description
---|---
isDigit(ch) | Returns true if ch is a digit
isLetter(ch) | Returns true if ch is a letter
isLetterOrDigit(ch) | Returns true if ch is a digit or a letter
isLowercase(ch) | Returns true if ch is a lowercase letter
isUppercase(ch) | Returns true if ch is an uppercase letter
---|---
toLowercase(ch) | Returns the lowercase version of ch
toUppercase(ch) | Returns the uppercase version of ch

> Remember that to invoke these methods, you need to type `Character.methodName(ch)`

---

## The String type

Data type to hold a sequence of characters ( text )

+ String literals are enclosed in double quotes

+ Unlike `char` and numeric data types, String is **not** a **primitive type**

String is known as a **reference type**.

Example:

`String courseName = "CPSC 1150";`

+ courseName is called a reference variable

+ courseName reference a `String` object

+ The content of the `String` object is CPSC 1150

Java method | Returns...
---|---
length() | the number of characters in the `String`
charAt(index) | the `char` at the specified index
concat(s1) | a new `String` that concatenates this `String` with s1
toUpperCase() | a new `String` with all letters in uppercase
toLowerCase() | a new `String` with all letters in lowercase
trim() | a new `String` with leading and trailing whitespace removed

---

## Invoking Methods

Some methods get invoked using the name of the class.

+ i.e. `Math.round(7.634)`

+ These are called static methods

+ These methods do not need to have an object

Some methods get invoked using the reference variable for a specific instance of the class.

+ ```\n
  Scanner scan = new Scanner(System.in);
  scan.nextInt();
  ```

+ These are called instance methods

+ Use a particular object that you have created

---

## String Class Methods

The `String` methods previously mentioned are all **instance methods**.

+ They all depend on a particular String

Example:

`"Happy Birthday".toUpperCase();` returns the String "HAPPY BIRTHDAY"

Java Method | Returns
---|---
compareTo(string1) | An integer indicating if this string is lexically before (-1), equal to (0), or lexically after (1) string1
equals(string1) | True if this string contains the same characters as string1 (case sensitive)
equalsIgnoreCase(string1) | True if this string contains the same characters as string1 (case insensitive), and false otherwise
replace(char1, char2) | A new string identical to the old, except every `char` identical to char1 will be replaced with char2
substring(i, j) | A new string that is a subset of the old, starting at index I and extending through index j-1
indexOf(string1) | Returns the index of the first occurence of the specified string/character within the string
lastIndexOf(string1) | Returns the index of the last occurence of the specified string/character within the string

> Do not use `==` to compare strings, it does not behave the way we think it should.

Examples:

```\n
String fullName = "Chinmaya Mahapatra";
String fName = fullName.substring(0, 5);
String lName = fullName.substring(12);
String letters = fullName.replace(' ', '-');
int isBefore = fName.compareTo(lName);
boolean sameName = fName.equals(lName);
int numChars = fullName.length();
char last = fullName.charAt(numChars-1);
```

---

## Converting Between Strings and Numbers

To convert a number to a `String`, you could concatenate it with an empty String

`String s = 1353.4 + "";`

To convert a String to an int or double, use the following syntax:

```\n
String numString = "183";
int myInt = Integer.parseInt(numString);

String fpString = "183.23052";
double myDouble = Double.parseDouble(fpString);
```

---

## Formatting Output

It is often necessary to format output values in certain ways so that they can be presented properly.

+ The Java standard class library contains classes that provide formatting capabilities

+ The `NumberFormat` class allows you to format values as currency or percentages

+ The `DecimalFormat` class allows you to format values based on a pattern

Both are part of the `java.text` package.

The `NumberFormat` class has static methods that return a formatter object.

+ `getCurrencyInstance()`

+ `getPercentInstance()`

Each formatter object has a method called `format` that returns a string with the specified information in the appropriate format

```\n
NumberFormat percentFormat;
percentFormat = NumberFormat.getPercentInstance();
percentFormat.setMaximumFractionDigits(2);
String result = percentFormat.format(0.0506);
```

The `DecimalFormat` class can be used to format a floating point value in various ways

+ For example, you can specify that the number should be truncated to three decimal places

+ The constructor of the `DecimalFormat` class takes a string that represents a pattern for the formatted number

---

## The printf() Method

```\n
int id = 100111222;
String name = "Langara Student";
System.out.printf("ID: %9d\tName: %s", id, name);
```

+ `"ID: %9d\tName: %s"` specifies the format of the output

+ Has literal characters describing output values

  + %9d indicates that the corresponding number (id) should be printed in a field of 5 characters

  + \t is the tab escape sequence

  + %s indicates that the corresponding string (name) should be inserted

> The output would be:
>
> ID: 100111222 Name: Langara Student

Example:

```\n
double radius = 24.036;
String label = "Radius of the circle";
System.out.printf("%s:\t%.2f", label, radius);
```

> The output would be:
>
> Radius of the circle: 24.04

---
