# JAVA 8 MASTER HANDBOOK

# Lecture 1 – Java 8 Introduction

# Part 2 – Homework Solutions

## Section 2

> **Covered Questions**
>
> * Question 3
> * Question 4

---

# Table of Contents

```text
Question 3
Pure Functional Language aur Java me kya difference hai?

Question 4
Imperative aur Declarative Programming ke 5 differences likho.
```

---

# Question 3

## Question

**Pure Functional Language aur Java me kya difference hai?**

---

# Answer

Is question ka answer dene se pehle hume ye samajhna hoga ki **Pure Functional Language** hoti kya hai.

## What is a Pure Functional Language?

Pure Functional Language wo language hoti hai jisme **programming ka primary focus functions par hota hai**, na ki objects par.

Aisi languages me:

* Functions ko **First-Class Citizens** maana jata hai.
* Immutable data ko prefer kiya jata hai.
* Side Effects ko avoid kiya jata hai.
* Pure Functions likhne par zor diya jata hai.

Examples

* Haskell
* Erlang
* Elm

Ye languages Functional Programming ke principles ko apni core philosophy banati hain.

---

# Java Kaisi Language Hai?

Java ek

> **Object-Oriented Programming Language**

hai.

Java ka foundation hamesha se raha hai:

* Classes
* Objects
* Inheritance
* Encapsulation
* Polymorphism
* Abstraction

Java 8 ke baad Java ne Functional Programming **support** add kiya.

Support add karna aur language ka pure functional hona dono alag baatein hain.

Isi liye Java ko

> **Multi-Paradigm Language**

kaha jata hai.

---

# Important Difference

Pure Functional Language

↓

Programming ka centre

Functions

Java

↓

Programming ka centre

Objects

*

Java 8 ke baad

Functional Programming Features

---

# Comparison Table

| Pure Functional Language                     | Java                                                                              |
| -------------------------------------------- | --------------------------------------------------------------------------------- |
| Functional Programming primary paradigm hai  | Object-Oriented Programming primary paradigm hai                                  |
| Functions First-Class Citizens hote hain     | Lambda Expressions Functional Interfaces ke through behavior represent karti hain |
| Immutable data strongly preferred            | Mutable aur Immutable dono possible hain                                          |
| Side Effects avoid kiye jate hain            | Side Effects allowed hain                                                         |
| Pure Functions encouraged                    | Pure Functions likh sakte hain, lekin mandatory nahi                              |
| Object-Oriented concepts optional ya limited | OOP Java ka core foundation hai                                                   |

---

# Real World Example

Suppose do companies hain.

## Company A

Sirf Java Developers hire karti hai.

Ye

Object-Oriented

company jaisi hai.

---

## Company B

Java Developers bhi.

Python Developers bhi.

JavaScript Developers bhi.

Ye

Multiple technologies

support karti hai.

Exactly

Java bhi

OOP

*

Functional Programming Features

support karti hai.

---

# Important Interview Point

Question

> Is Java a Pure Functional Language?

Answer

**No.**

Java

primarily

Object-Oriented Programming language hai.

Java 8 ke baad

Functional Programming features support karti hai.

---

# Why Isn't Java a Pure Functional Language?

Reason 1

Classes aur Objects abhi bhi mandatory design ka part hain.

---

Reason 2

Mutable Objects allowed hain.

Example

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
```

Yahan object ka state change ho raha hai.

Pure Functional Languages me immutable data prefer ki jati hai.

---

Reason 3

Java me side effects allowed hain.

Example

```java
System.out.println("Hello");
```

Ye bhi ek side effect hai.

Pure Functional Programming me side effects minimize ya isolate kiye jate hain.

---

# Interview Tip

Kabhi bhi ye mat bolna:

> Java is a Functional Programming Language.

Correct answer:

> Java is primarily an Object-Oriented language that supports Functional Programming features from Java 8 onwards.

---

# Common Mistake

❌

Lambda aa gayi

↓

Java Functional Language ban gayi.

Wrong.

Lambda support ka matlab

Pure Functional Language nahi hota.

---

# Memory Trick

```text
Pure Functional Language

↓

Functions First

--------------------

Java

↓

Objects First

↓

Functions Supported
```

---

# Expected Follow-up Interview Questions

### Q1

What are First-Class Functions?

---

### Q2

Why are Lambda Expressions not enough to make Java a Pure Functional Language?

---

### Q3

Why is Java called Multi-Paradigm?

---

### Q4

Can we write Functional Programming in Java?

---

# Summary

Java

Functional Programming ko support karti hai.

Java

Pure Functional Language nahi hai.

---

# Question 4

## Question

**Imperative aur Declarative Programming ke 5 differences likho.**

---

# Answer

Ye Java 8 ka sabse important conceptual question hai.

Sabse pehle definitions samajhte hain.

---

# Imperative Programming

Imperative Programming me developer machine ko batata hai

> **HOW**

kaam karna hai.

Har step manually define kiya jata hai.

Example

```java
int sum = 0;

for(int i = 1; i <= 10; i++){

    sum += i;

}

System.out.println(sum);
```

Developer ne machine ko bataya:

* Variable banao
* Loop chalao
* Increment karo
* Add karo
* Print karo

---

# Declarative Programming

Declarative Programming me developer sirf batata hai

> **WHAT**

result chahiye.

Execution kaise hoga

ye framework ya runtime decide karta hai.

Example

```java
IntStream.rangeClosed(1,10)
         .sum();
```

Developer ne sirf bola

"Mujhe sum chahiye."

Loop internally execute hota hai.

---

# Difference 1

## HOW vs WHAT

| Imperative     | Declarative     |
| -------------- | --------------- |
| HOW batata hai | WHAT batata hai |

---

# Difference 2

## Loop Handling

Imperative

Developer khud loop likhta hai.

Example

```java
for(int i=0;i<list.size();i++){

}
```

Declarative

Developer stream operations likhta hai.

Example

```java
list.stream()
    .filter(...)
    .collect(Collectors.toList());
```

Loop internally hota hai.

---

# Difference 3

## Control

Imperative

Execution control

Developer ke paas.

Declarative

Execution control

Framework ke paas.

---

# Difference 4

## Readability

Imperative

Long code.

More boilerplate.

Declarative

Short code.

Readable code.

---

# Difference 5

## Parallel Processing

Imperative

Parallel banana difficult.

Declarative

Framework easily parallel execution support kar sakta hai.

Example

```java
list.parallelStream();
```

---

# Complete Comparison Table

| Imperative Programming                | Declarative Programming              |
| ------------------------------------- | ------------------------------------ |
| HOW batata hai                        | WHAT batata hai                      |
| Manual loops                          | Internal iteration                   |
| More boilerplate                      | Less boilerplate                     |
| Developer execution control karta hai | Framework execution manage karta hai |
| Parallel processing difficult         | Parallel processing easier           |

---

# Real World Example

Suppose tum

Google Maps use karte ho.

### Imperative

Tum driver ko bolte ho

* Left lo.
* Seedha jao.
* Right lo.
* Flyover cross karo.
* U-turn lo.

Ye

Imperative Programming.

---

### Declarative

Tum sirf destination enter karte ho.

Google Maps

best route khud decide karta hai.

Ye

Declarative Programming.

---

# Java Example

Imperative

```java
for(Integer number : numbers){

    if(number % 2 == 0){

        System.out.println(number);

    }

}
```

Declarative

```java
numbers.stream()
       .filter(number -> number % 2 == 0)
       .forEach(System.out::println);
```

---

# Interview Tip

Question

> Does Declarative Programming eliminate loops?

Answer

**No.**

Developer explicit loops nahi likhta.

Framework internally iteration karta hai.

Ye answer interviews me bahut important hai.

---

# Common Mistake

❌

Declarative Programming me loops nahi hote.

Wrong.

Correct

Developer loops nahi likhta.

Internal iteration hoti hai.

---

# Memory Trick

```text
Imperative

↓

HOW

↓

Developer Controls

----------------------

Declarative

↓

WHAT

↓

Framework Controls
```

---

# Expected Follow-up Interview Questions

### Q1

Why is Stream API called Declarative?

---

### Q2

What is Internal Iteration?

---

### Q3

Does Declarative Programming improve performance?

---

### Q4

Can Declarative Programming exist without Streams?

---

# Quick Revision

```text
Imperative

↓

HOW

↓

Manual Loop

↓

Developer

------------------------

Declarative

↓

WHAT

↓

Internal Iteration

↓

Framework
```

---

# Section 2 Summary

Aaj humne do sabse important concepts cover kiye.

✅ Pure Functional Language vs Java

✅ Imperative vs Declarative Programming

Ye dono concepts Lambda Expressions aur Stream API samajhne ke liye foundation ka kaam karte hain.

---

# Self-Assessment Checklist

✅ Mujhe Pure Functional Language ki definition yaad hai.

✅ Mujhe Java ko Pure Functional Language kyun nahi bolte, ye samajh aa gaya.

✅ Main Imperative aur Declarative Programming ka difference explain kar sakta hoon.

✅ Main Google Maps example se Declarative Programming explain kar sakta hoon.

✅ Main interview me confidently bol sakta hoon ki Streams explicit loops ko hide karti hain, remove nahi karti.
