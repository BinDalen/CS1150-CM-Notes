# Lecture 6-1

## Variable Scope

The call stack ( or stack ) stores the values of variables from different methods when control is passed between the methods.

+ When a method terminates, all variables from that method are deleted from the stack.

+ The stack operates in a last-in, first-out manner.

Definitions:

+ Call stack: Memory that is used to save return address and local variables.

+ Stack frame: The storage on the call stack that is used by one method.

> Eclipse has the ability to let us see what the current method's stack frame is.

---

## Pass by value

Variables themselves cannot be altered by methods when they are used as arguments.

+ Instead, the arguments' values get passed to the method's parameters.

+ If you alter a parameter inside a method:

  + The parameter will be affected.

  + The associated argument (variable) will not be affected.

In this sense, variables are local to their methods.

---

## Modular Programming

+ Is a software design technique that emphasizes separating the functionality of a program into many independent peices.

We can use methods to split code up into small chunks ( modularize our programs ).

+ This is one of the biggest benefits of methods.

+ Modularized code is easier to maintain, debug and reuse.

---

## Method Overloading

Method overloading is when there are several method definitions with the same name but with different parameter lists.

+ Parameter lists are considered different when they have:

  + Different types

  + Different number of parameters

> Just having different parameter names or a different return type is not enough for overloading.
>
> + The compiler will think you are trying to define the same method twice.

---

## When to Overload

+ Overloading should be used when:

  + You want to have an optional argument

  + You want to define similar methods with different input types

> Overloading should not be used for methods that solve noticeably different problems.

---

## Invoking an Overloaded Method

How does the compiler pick which method definition to use when a method is overloaded?

+ If there is only one parameter list that matches, it picks that one. If there is more than one, it picks the best match.

---
