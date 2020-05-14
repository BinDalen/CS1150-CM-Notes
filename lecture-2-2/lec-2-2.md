# Lecture 2-2

## Data Representation - Number Systems

### Postional Notation

642 is calculated in **base 10** as:

+ 6 * 10<sup>2</sup> = 600

+ 4 * 10<sup>1</sup> = 40

+ 2 * 10<sup>0</sup> = 2

which is why 642 in base 10 positional notation is:

> **6** * 10<sup>2</sup> + **4** * 10<sup>1</sup> + **2** * 10<sup>0</sup>

The **exponent** of base number 10 corresponds to the **position** of the number:

6 | 4 | 2
--|---|--
10<sup>2</sup> | 10<sup>1</sup> | 10<sup>0</sup>

---

## Calculating Base R to Decimal

To calculate the decimal value of a number in some base R:

( AB...YZ )<sub>R</sub> =

- | A | B | ... | Y | Z
--|---|---|-----|---|--
digit position | n | n-1 | ... | 2 | 1
degree | n-1 | n-2 | ... | 1 | 0
value | A * 10<sup>n-1</sup> | B * 10<sup>n-2</sup> | ... | Y * 10<sup>1</sup> | Z * 10<sup>0</sup>

---

## Number Systems

**Binary** [0,1]

+ Base 2

**Octal** [0,1,2,3,4,5,6,7]

+ Base 8

**Decimal** [0,1,2,3,4,5,6,7,8,9]

+ Base 10

**Hexadecimal** [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

+ Base 16

Example of binary to decimal:

> (100101111)<sub>2</sub> =

- | 1 | 0 | 0 | 1 | 0 | 1 | 1 | 1 | 1
--|---|---|---|---|---|---|---|---|--
digit position | 9 | 8 | 7 | 6 | 5 | 4 | 3 | 2 | 1
degree | 8 | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0
value | 1 * 2<sup>8</sup> | 0 * 2<sup>7</sup> | 0 * 2<sup>6</sup> | 1 * 2<sup>5</sup> | 0 * 2<sup>4</sup> |  1 * 2<sup>3</sup> | 1 * 2<sup>2</sup> | 1 * 2<sup>1</sup> | 1 * 2<sup>0</sup> |

> = 256 + 0 + 0 + 32 + 0 + 8 + 4 + 2 + 1 = (303)<sub>10</sub>

---

## Decimal to Base R

To convert base 10 to other bases follow the following steps:

1. Divide the *decimal number* by the *new base*

2. Set the *remainder* as the next digit in the new number

3. Replace the dividend with the *quotient*

4. When the quotient to replace the dividend is 0, stop

5. Read the remainders from bottom to top, which should provide the desired output in Base R

To convert 25 from base 10 to binary:

Dividend | Quotient | Remainder
---------|----------|----------
25 | 25 / 2 = 12 | 1
12 | 12 / 2 = 6 | 0
6 | 6 / 2 = 3 | 0
3 | 3 / 2 = 1 | 1
1 | 1 / 2 = 0 | 1
0 |

Reading the remainders from bottom up, we get (11001)<sub>2</sub>, which is (25)<sub>10</sub>

---

## Binary Number System

A binary digit is a **bit**.

A bit can be either 0 or 1. Therefore, one bit can only represent **two** things ( True/False, Yes/No etc. )

+ Two bits can represent four things because there are four combinations of 0 and 1 that can be made from two bits:
  + 00
  + 01
  + 10
  + 11

Number of bits | Maximum storage of values
---------------|--------------------------
1 | 2
2 | 4
3 | 8
... | ...
n | 2<sup>n</sup>

One **byte** is 8 bits, which means that it can store 256 different values, such as being interpreted as (0)<sub>10</sub> to (255)<sub>10</sub>, or (-128)<sub>10</sub> to (127)<sub>10</sub> with two's complement.

---

## Hexadecimal Number System

Each hex digit has 16 possible values, therefore it takes 4 binary digits to represent one hexadecimal digit.

Example:

Convert (458)<sub>10</sub> to binary

Hexadecimal | 4 | 5 | 8 | -
------------|---|---|---|--
Binary | 0100 | 0101 | 1000 | = (10001011000)<sub>2</sub>

Storing hexadecimal numbers in Java programs is done as follows:

+ Declare an integer, then precede the hexadecimal number with 0x or 0X

Example:

```\n
int hex = 0X2E;
System.out.println(hex);
```

---

## Octal Number System

Each octal digit has 8 possible different values, so we require 3 binary digits to represent one octal digit.

Example:

Convert the octal number 457 to binary:

Octal | 4 | 5 | 7 | -
------|---|---|---|--
Binary | 100 | 101 | 111 | = (100101111)<sub>2</sub>

---

## The ASCII Character Set

Java uses the **Unicode character set** for representing text.

The 128 Unicode character set ( first 128 Unicode characters ) corresponds to the common **ASCII character set**.

+ ASCII stands for the America Standard Code for Information Interchange

+ Some languages still use the ASCII character set

---
