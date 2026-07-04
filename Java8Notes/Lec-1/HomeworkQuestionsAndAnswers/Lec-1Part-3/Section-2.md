# JAVA 8 MASTER HANDBOOK

# Lecture 1 – Java 8 Introduction

# Part 3 – Homework Solutions

## Section 2

> **Covered Questions**
>
> * Question 4
> * Question 5
> * Question 6

---

# Table of Contents

```text
Question 4
Stream API data process karti hai ya data store? Explain.

Question 5
Optional kis problem ko solve karta hai?

Question 6
Default Methods ka primary objective kya tha?
```

---

# Question 4

## Question

**Stream API data process karti hai ya data store? Explain.**

---

# Answer

Ye Java 8 ka sabse frequently asked interview question hai.

Bahut students iska galat answer dete hain.

Sabse pehle ek line yaad kar lo.

> **Stream API data ko store nahi karti, sirf process karti hai.**

Ye sentence interview me directly bol sakte ho.

---

# Stream Kya Hai?

Stream ek processing pipeline hai.

Ye Collection ke elements ko ek sequence ke roop me process karti hai.

Diagram

```text
Collection

↓

Stream

↓

Intermediate Operations

↓

Terminal Operation

↓

Result
```

Observe.

Collection

↓

Data Store karti hai.

Stream

↓

Data Process karti hai.

---

# Example

```java
List<Integer> numbers =
Arrays.asList(10,20,30,40,50);
```

Ye List

data ko memory me store kar rahi hai.

Ab

```java
numbers.stream()
       .filter(number -> number > 20)
       .collect(Collectors.toList());
```

Yahan

Stream

numbers ko permanently store nahi kar rahi.

Ye sirf

* Read karti hai.
* Process karti hai.
* Result return karti hai.

---

# Internal Working

Diagram

```text
Collection

↓

Read Elements

↓

Stream

↓

Processing

↓

Result

↓

End
```

Processing complete hone ke baad

Stream khatam ho jati hai.

Isi liye

ek Stream ko dobara use nahi kar sakte.

---

# Proof

```java
Stream<String> stream =
list.stream();

stream.forEach(System.out::println);

stream.forEach(System.out::println);
```

Output

```text
IllegalStateException
stream has already been operated upon or closed
```

Reason

Ek Stream

ek hi baar consume hoti hai.

Agar Stream data store karti,

to reuse possible hota.

---

# Why Doesn't Stream Store Data?

Java developers ka objective tha

Memory efficient processing.

Agar Stream bhi Collection ki tarah

data copy karke store karti,

to

Memory Usage

double ho jata.

Isliye Stream

Collection se data read karti hai.

Copy nahi banati.

---

# Real World Example

Suppose

Water Tank

↓

Pipeline

↓

Tap

Tank

↓

Water Store karti hai.

Pipeline

↓

Water Transport karti hai.

Pipeline

water ko permanently store nahi karti.

Exactly

Collection

↓

Store

Stream

↓

Process

---

# Interview Tip

Question

Does Stream store data?

Best Answer

No.

Stream does not store data.

It processes data from a source like Collection, Array or I/O channel and produces a result.

---

# Common Mistake

❌

Stream ek Collection hai.

Wrong.

Collection

Data Store karti hai.

Stream

Data Process karti hai.

---

# Memory Trick

```text
Collection

↓

Store

----------------

Stream

↓

Process
```

---

# Expected Follow-up Interview Questions

### Q1

Can Stream be reused?

Answer

No.

---

### Q2

Why is Stream consumed only once?

Answer

Because it represents a processing pipeline.

---

### Q3

Can Stream modify Collection?

Answer

Generally No.

Streams source collection ko modify nahi karti.

---

# Summary

Collection stores data.

Stream processes data.

Stream ek processing abstraction hai.

---

# Interview Rating

⭐⭐⭐⭐⭐

Very Frequently Asked

---

# Question 5

## Question

**Optional kis problem ko solve karta hai?**

---

# Answer

Java applications me

sabse common Runtime Exception

kaunsa hai?

Answer

```text
NullPointerException (NPE)
```

Java developers ne observe kiya

ki bahut saare bugs

null values ki wajah se aate hain.

Isi problem ko solve karne ke liye

Java 8 me

Optional introduce hua.

---

# What is Optional?

Optional

ek container object hai.

Ye represent karta hai

ki value

Present bhi ho sakti hai

ya

Absent bhi ho sakti hai.

Diagram

```text
Optional

│

├── Value Present

└── Value Absent
```

---

# Example Without Optional

```java
Employee employee =
findEmployee();

System.out.println(employee.getName());
```

Agar

employee

null hua

↓

```text
NullPointerException
```

---

# Example With Optional

```java
Optional<Employee> employee =
findEmployee();
```

Ab API clearly bata rahi hai

ki

value present bhi ho sakti hai

aur absent bhi.

---

# Important Purpose

Optional ka objective hai

Developer ko

null possibility

explicitly batana.

Ye code ko readable banata hai.

---

# What Optional Does NOT Do

Interview me bahut log bolte hain

Optional

NullPointerException ko completely remove kar deta hai.

Ye answer galat hai.

Correct answer

Optional

Null handling ko improve karta hai.

Ye har NPE ko automatically remove nahi karta.

---

# Real World Example

Suppose

Courier Company

parcel deliver kar rahi hai.

Status

```text
Delivered

OR

Not Delivered
```

Ye uncertainty

Optional jaisi hai.

System clearly bata raha hai

ki value ho bhi sakti hai

aur nahi bhi.

---

# Interview Tip

Question

Why Optional was introduced?

Best Answer

To represent the absence of a value explicitly and improve null handling in APIs.

---

# Common Mistake

❌

Optional har variable ke liye use karna chahiye.

Wrong.

Optional ka primary use

Method Return Types

me hota hai.

---

# Memory Trick

```text
Optional

↓

Maybe Value

↓

Maybe No Value
```

---

# Expected Follow-up Interview Questions

### Q1

Can Optional contain null?

---

### Q2

Should Optional be used for fields?

---

### Q3

Why Optional is mostly used as Return Type?

---

# Summary

Optional

Null Handling improve karta hai.

Readable APIs provide karta hai.

---

# Interview Rating

⭐⭐⭐⭐⭐

Very Frequently Asked

---

# Question 6

## Question

**Default Methods ka primary objective kya tha?**

---

# Answer

Default Methods ka primary objective tha

> **Existing Interfaces ko break kiye bina unhe evolve karna.**

Ye concept samajhna bahut important hai.

---

# Problem Before Java 8

Suppose

```java
interface Animal{

    void sound();

}
```

100 classes

Animal implement kar rahi hain.

Ab company ne decide kiya

ki

interface me

ek aur method add karna hai.

```java
void eat();
```

Ab kya hoga?

Saari 100 classes

Compile Error dengi.

Kyunki

sabko

eat()

implement karna padega.

Ye Java 7 ki sabse badi limitation thi.

---

# Java 8 Solution

```java
interface Animal{

    void sound();

    default void eat(){

        System.out.println("Eating");

    }

}
```

Ab

Existing classes

break nahi hongi.

Compiler

default implementation use karega.

---

# Why Was It Needed?

Java me bahut saare public APIs hain.

Example

* Collection
* List
* Set
* Map

Agar future me

interface me

naya method add karna ho

to

lakhon existing implementations

break ho jati.

Default Methods ne

ye problem solve kar di.

---

# Real World Example

Suppose

School ne

uniform me

ek naya badge compulsory kar diya.

Purani uniforms ko

phenkne ki zarurat nahi.

Badge add kar diya.

Exactly

Default Method

purane interface ko break kiye bina

nayi functionality add karti hai.

---

# Interview Tip

Question

Why were Default Methods introduced?

Best Answer

To provide backward compatibility by allowing new methods to be added to interfaces without breaking existing implementations.

---

# Common Mistake

❌

Default Methods

Multiple Inheritance ke liye introduce hui thi.

Wrong.

Primary objective

Backward Compatibility tha.

---

# Memory Trick

```text
Interface

↓

New Method

↓

Default Method

↓

No Compile Error
```

---

# Expected Follow-up Interview Questions

### Q1

Can Default Methods be overridden?

Answer

Yes.

---

### Q2

Can an Interface have multiple Default Methods?

Answer

Yes.

---

### Q3

Can Default Methods access instance variables?

Answer

No.

Interfaces instance variables nahi rakhte.

---

# Summary

Default Methods

Interface Evolution

*

Backward Compatibility

provide karti hain.

---

# Interview Rating

⭐⭐⭐⭐⭐

Very Frequently Asked

---

# Section 2 Summary

Aaj humne teen bahut important interview topics complete kiye.

✅ Stream API stores data ya process?

✅ Optional kis problem ko solve karta hai?

✅ Default Methods kyun introduce hue?

Ye tino concepts Java 8 interviews me baar-baar puche jaate hain.

---

# Self-Assessment Checklist

✅ Main confidently bata sakta hoon ki Stream data process karti hai, store nahi.

✅ Mujhe pata hai Stream ko reuse kyun nahi kar sakte.

✅ Main Optional ka actual purpose explain kar sakta hoon.

✅ Mujhe pata hai Optional NPE ko magically eliminate nahi karta.

✅ Main Default Methods ka primary objective "Backward Compatibility" explain kar sakta hoon.

✅ Main Java 7 aur Java 8 ke interface evolution ka difference bata sakta hoon.
