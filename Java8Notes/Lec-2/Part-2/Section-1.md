# JAVA 8 MASTER HANDBOOK

# Module 2 – Lambda Expressions

# Lecture 2 – Lambda Expressions (Complete Deep Dive)

# Part 2 – README.md

## Section 1

> **Goal of this Section**
>
> Is section ka objective Lambda Expression ki syntax ko sirf yaad karna nahi, balki uske har component ko deeply samajhna hai. Is section ke baad tum kisi bhi Lambda Expression ko dekhkar uske Parameters, Arrow Operator aur Body ko identify kar paoge.

---

# Table of Contents

```text
1. Introduction to Lambda Syntax
2. General Syntax
3. Anatomy of Lambda Expression
4. Arrow Operator (->)
5. Expression Body
```

---

# Chapter 1 - Introduction to Lambda Syntax

Lecture 2 Part 1 me humne ye samjha tha ki Lambda Expressions introduce kyun hui.

Ab actual coding shuru karte hain.

Sabse pehle ek baat yaad rakho.

> **Lambda Expression ek Method nahi hai.**

Aur

> **Lambda Expression ek Function bhi nahi hai.**

Java me Lambda ek **Expression** hai jo **Functional Interface ke Single Abstract Method ki implementation represent karti hai.**

Ye interview me bahut important statement hai.

---

# Java 7 vs Java 8

Java 7

```java
Runnable runnable = new Runnable(){

    @Override
    public void run(){

        System.out.println("Running...");

    }

};
```

Java 8

```java
Runnable runnable = () -> System.out.println("Running...");
```

Observe.

Business Logic

```java
System.out.println("Running...");
```

same hai.

Sirf unnecessary syntax remove ho gaya.

Isi ko Java Team ne

> **Concise Representation of Behavior**

bola.

---

# Chapter 2 - General Syntax

Lambda Expression ki official syntax.

```java
(parameters) -> expression
```

Ya

```java
(parameters) -> {

    // Statements

}
```

Ye dono syntactically valid hain.

Difference sirf itna hai.

Single Expression

↓

Braces optional.

Multiple Statements

↓

Braces mandatory.

---

# Lambda Structure

Har Lambda me generally 3 major parts hote hain.

```text
Parameters

↓

Arrow Operator

↓

Body
```

Diagram

```text
(a,b)

↓

->

↓

a+b
```

Ye poori Lambda Expression hai.

---

# Chapter 3 - Anatomy of Lambda Expression

Example

```java
(a,b)->a+b
```

Ab isko todte hain.

---

## Part 1

Parameters

```java
(a,b)
```

Ye input values hain.

Exactly Method Parameters ki tarah.

Difference sirf syntax ka hai.

Method

```java
public int add(int a,int b)
```

Lambda

```java
(a,b)->a+b
```

Method me parameter types likhe ja sakte hain.

Lambda me aksar compiler unhe infer kar leta hai.

---

## Part 2

Arrow Operator

```java
->
```

Ye Lambda Expression ka sabse important symbol hai.

Arrow ka meaning hai.

```text
Input

↓

Processing

↓

Output
```

Arrow batata hai ki

jo input parameters diye gaye hain,

unpar ye logic apply karo.

---

## Part 3

Body

Body Lambda ka heart hai.

Example

```java
a+b
```

Ye actual business logic hai.

Ye wahi code hai

jiske liye poori Lambda likhi gayi hai.

---

# Complete Visualization

```text
Input

↓

(a,b)

↓

Arrow

↓

Processing

↓

a+b

↓

Output
```

Ye diagram hamesha yaad rakhna.

---

# Chapter 4 - Understanding the Arrow Operator

Question

Arrow (`->`) operator hi kyun use hua?

Java Team ne koi aur symbol kyun nahi choose kiya?

Reason.

Arrow naturally

Direction

show karta hai.

```text
Input

────────►

Output
```

Ye mathematically intuitive hai.

Aur Functional Programming languages jaise

Scala

Kotlin

C#

me bhi similar notation use hoti hai.

---

# Arrow Represents Transformation

Suppose.

Input

```text
10
```

Behavior

```text
Square
```

Output

```text
100
```

Lambda

```java
x -> x * x
```

Arrow ka matlab hai.

Input ko transform karo.

---

# Another Example

```java
name -> name.toUpperCase()
```

Diagram

```text
rohit

↓

toUpperCase()

↓

ROHIT
```

Arrow hamesha

Transformation

represent karta hai.

---

# Chapter 5 - Expression Body

Expression Body wo part hai

jahan actual business logic likha jata hai.

Example

```java
(a,b)->a+b
```

Yahan

```java
a+b
```

Body hai.

---

# Another Example

```java
name -> name.length()
```

Body

```java
name.length()
```

---

# Another Example

```java
number -> number % 2 == 0
```

Body

```java
number % 2 == 0
```

Ye boolean return karega.

---

# Important Rule

Agar body me sirf

ek expression

hai.

To

```java
return
```

likhne ki zarurat nahi.

Compiler automatically samajh leta hai.

Example

```java
(a,b)->a+b
```

Equivalent

```java
(a,b)->{

    return a+b;

}
```

---

# Real World Analogy

Suppose ek Juice Machine hai.

Tum Fruits daalte ho.

```text
Apple

↓

Machine

↓

Apple Juice
```

Yahan

Fruit

↓

Input

Machine

↓

Arrow + Body

Juice

↓

Output

Exactly Lambda bhi

Input ko

Process karke

Output banati hai.

---

# Common Beginner Mistakes

### Mistake 1

Lambda ko Method samajhna.

❌ Wrong

Lambda Expression hai.

---

### Mistake 2

Arrow ko assignment operator samajhna.

❌ Wrong

Arrow

Transformation Operator hai.

---

### Mistake 3

Business Logic aur Parameters ko confuse karna.

Parameters

↓

Input

Body

↓

Logic

---

# Interview Tip

Question

> What are the three parts of a Lambda Expression?

Best Answer

1. Parameters
2. Arrow Operator (`->`)
3. Lambda Body

---

# Memory Trick

```text
Lambda

↓

Parameters

↓

Arrow

↓

Body
```

Ya

```text
P

↓

A

↓

B
```

**PAB Rule**

* **P** → Parameters
* **A** → Arrow
* **B** → Body

Ye trick interview ke time instantly yaad aa jaayegi.

---

# Quick Revision

```text
Lambda

↓

Three Parts

↓

Parameters

↓

Arrow

↓

Body

--------------------

Arrow Means

↓

Transform Input

↓

Produce Output
```

---

# Section 1 Summary

Aaj humne seekha.

✅ Lambda Expression ka syntax.

✅ General Syntax.

✅ Anatomy of Lambda.

✅ Parameters.

✅ Arrow Operator.

✅ Expression Body.

Ye saare concepts Lambda coding ki foundation hain.

---

# Self-Assessment Checklist

✅ Main Lambda Expression ka general syntax likh sakta hoon.

✅ Main Parameters, Arrow aur Body identify kar sakta hoon.

✅ Main Arrow Operator ka purpose explain kar sakta hoon.

✅ Main bata sakta hoon ki Lambda Method nahi hai.

✅ Main kisi bhi simple Lambda Expression ko todkar explain kar sakta hoon.
