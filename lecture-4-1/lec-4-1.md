# Lecture 4-1

## Comparisons

In everyday life, we often use *numerical comparisons* to make decisions.

+ We compare:
  + Prices, to buy a cheaper product
  + The temperature to zero degrees, to decide whether to bike to work
  + Prescribed cooking time to elapsed time, to decide whether food is finished cooking

We want to write programs that can act differently based on these types of comparisons.

---

## Relational Operators

+ Also known as **Comparison Operators**

A comparison is an expressions comprised of two numerical values separated by a **relational operators**.

In Java | Operator name
---|---
< | less than
<= | less than or equal to
> | greater than
>= | greater than or equal to
== | equal to
!= | not equal to

---

## Boolean DataType

We want to store the *results* of comparisons.

+ Need a data type for this

The `boolean` data type can have one of two values : `true` of `false`

+ `true` and `false` are literal values, just like 15 or -3.7

+ treat these words as reserved in Java

```Java
boolean waitingListFull = true;
boolean doorOpen = false;
```

A comparison expression evaluates to a `boolean`

+ Can store the value of a comparison

+ Assigning the result of a comparison to a `boolean`:

```Java
float temp = -15.0;
boolean tempAboveZero = temp > 0;
System.out.println(tempAboveZero); // prints 'false'
```

---

## If Statements

`if` statements are used for **conditional execution**.

+ Up till now, we have run our Java top to bottom without skipping a line

  + `if` statements allow us to skip lines of code or to only execute certain lines of code **if** some condition has been met

```Java
if( ${boolean condition} ) {
  // Only executed when true
}
```

---

## If Else Statements

We can add an `else` statement.

+ The else code block will only execute when the `if` evaluates to `false`

```Java
if( ${boolean condition} ) {
  // Only executed when condition is true
} else {
  // Only executed when condition is false
}
```

`else` statements **do not** have conditions!

+ They are naturally the negation of its preceding `if`

```Java
if(hour < 18) {
  greeting = "Good day";
} else {
  greeting = "Good evening";
}
```

+ Do not forget that lines of Java end in a semi colon

---

## Code Blocks

`if` statements naturally only execute the **first** line following the `if` statement.

```Java
if(height > 180)
  System.out.println("you are above average height");
```

+ This is where code blocks come in handy

A code block is a **group** of Java statements surrounded by curly braces `{}`

+ If you follow an `if` statement with a code block, then all statements in the `{}` will execute

```Java
if(height > 180){
  System.out.println("you are tall");
  System.out.println("you are over 180cm")
}
```

---

## If, Else If, Else

You can add an `else if` statement to the traditional `if else` structure.

+ This is used when you have **more than two** possible cases to execute

```Java
if ( ${condition 1} ) {
  // executed if condition 1 is true
} else if( ${condition 2} ) {
  // executed if condition 2 is true
} else {
  // executed when all conditions are false
}
```

> In math, the following statement is correct:

`13 <= teenager <= 19`

+ However, this is **not** a valid comparison in Java

In Java, both operands need to be complete boolean expressions.

`13 <= teenager && teenager <= 19`

---
