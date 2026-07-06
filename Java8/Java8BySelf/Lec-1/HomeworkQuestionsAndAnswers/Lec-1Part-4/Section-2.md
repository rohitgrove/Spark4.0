# JAVA 8 MASTER HANDBOOK

# Lecture 1 – Java 8 Introduction

# Part 4 – Homework Solutions

## Section 2

> **Covered Questions**
>
> * Question 3
> * Question 4

---

# Table of Contents

```text id="hqs1p8"
Question 3
Java 8 ke Top 5 Features explain karo.

Question 4
"Behavior should be passed, not duplicated" ko real-world example ke saath explain karo.
```

---

# Question 3

## Question

**Java 8 ke Top 5 Features explain karo.**

---

# Answer

Java 8 me bahut saare naye features introduce hue the.

Lekin interview perspective se sab features equally important nahi hain.

Kuch features aise hain jo lagbhag har company puchti hai.

Ye hain Java 8 ke Top 5 Features.

---

# 1. Lambda Expressions ⭐⭐⭐⭐⭐

## Purpose

Java me Boilerplate Code ko reduce karna aur behavior ko reusable banana.

Java 7

```java id="g8g0tb"
Collections.sort(list,
new Comparator<Employee>(){

    @Override

    public int compare(Employee a,Employee b){

        return a.getSalary()-b.getSalary();

    }

});
```

Java 8

```java id="bch6uh"
list.sort((a,b)->a.getSalary()-b.getSalary());
```

Difference

* Less Code
* Better Readability
* Easy Maintenance

---

## Why Important?

Lambda Java 8 ka foundation hai.

Without Lambda

Stream API properly use nahi kar sakte.

---

# 2. Functional Interfaces ⭐⭐⭐⭐⭐

## Purpose

Lambda Expressions ko target type provide karna.

Example

```java id="4djlwm"
@FunctionalInterface

interface Calculator{

    int add(int a,int b);

}
```

Lambda

```java id="uwlswj"
Calculator c=(a,b)->a+b;
```

Relationship

```text id="j95bpo"
Lambda

↓

Functional Interface

↓

Execution
```

---

## Why Important?

Lambda bina Functional Interface ke exist nahi kar sakti.

Ye Java 8 ka backbone hai.

---

# 3. Stream API ⭐⭐⭐⭐⭐

## Purpose

Collections ko Declarative Programming style me process karna.

Example

```java id="6s7m9r"
employees.stream()
         .filter(e->e.getSalary()>50000)
         .collect(Collectors.toList());
```

Pipeline

```text id="k4fhnn"
Collection

↓

Stream

↓

Filter

↓

Map

↓

Collect

↓

Result
```

---

## Benefits

* Less Code

* Better Readability

* Internal Iteration

* Parallel Processing

---

# 4. Optional ⭐⭐⭐⭐⭐

## Purpose

Better Null Handling.

Readable APIs.

Example

Without Optional

```java id="6gxh6g"
Employee employee =
findEmployee();

employee.getName();
```

Risk

```text id="50d61t"
NullPointerException
```

With Optional

```java id="eow7iy"
Optional<Employee> employee =
findEmployee();
```

---

## Benefits

* Better API Design

* Null Handling

* Readable Code

---

# 5. Date-Time API ⭐⭐⭐⭐⭐

## Purpose

Old Date API ka replacement.

Old Classes

```text id="sry8k5"
Date

Calendar

SimpleDateFormat
```

New Classes

```text id="jlwm84"
LocalDate

LocalTime

LocalDateTime

Instant

Duration

Period
```

---

## Benefits

* Immutable

* Thread Safe

* Modern API

* Easy to Use

---

# Complete Priority Table

| Feature               | Interview Importance |
| --------------------- | -------------------- |
| Lambda Expressions    | ⭐⭐⭐⭐⭐                |
| Functional Interfaces | ⭐⭐⭐⭐⭐                |
| Stream API            | ⭐⭐⭐⭐⭐                |
| Optional              | ⭐⭐⭐⭐⭐                |
| Date-Time API         | ⭐⭐⭐⭐⭐                |

---

# Why These Five?

Kyuki

Modern Spring Boot applications me

ye paanch features almost daily use hote hain.

Aur interviews me bhi sabse zyada yehi puche jaate hain.

---

# Real World Example

Suppose ek Car hai.

Top Components

```text id="gw1mav"
Engine

Gear Box

Brake

Steering

Clutch
```

Car me aur bhi components hote hain.

Lekin ye top components hain.

Exactly

Java 8 me bhi

bahut features hain.

Lekin interviews me

ye Top 5 sabse important hain.

---

# Interview Tip

Question

> Which Java 8 feature is the most important?

Best Answer

Lambda Expressions.

Because most other Functional Programming features depend on Lambda.

---

# Common Mistake

❌

Students Nashorn ya Default Methods ko Top Feature bol dete hain.

Wrong.

Interview me

Lambda

Functional Interface

Streams

Optional

Date-Time

sabse important hain.

---

# Memory Trick

```text id="q7a83j"
L

↓

F

↓

S

↓

O

↓

D
```

Lambda

↓

Functional Interface

↓

Stream

↓

Optional

↓

Date-Time API

---

# Expected Follow-up Questions

### Q1

Which Java 8 feature should be learned first?

---

### Q2

Can Stream API work without Lambda?

---

### Q3

Why Optional is considered Modern API?

---

### Q4

Which Java 8 feature is asked most in interviews?

---

# Summary

Top 5 Java 8 Features

* Lambda Expressions

* Functional Interfaces

* Stream API

* Optional

* Date-Time API

---

# Interview Rating

⭐⭐⭐⭐⭐

Very Frequently Asked

---

# Question 4

## Question

**"Behavior should be passed, not duplicated" ko real-world example ke saath explain karo.**

---

# Answer

Ye sentence Java 8 ki sabse important philosophy hai.

Isko samajhna

Java 8 ko samajhne ke barabar hai.

---

# What Does It Mean?

Suppose tumhare paas ek list hai.

Aur tumhe alag-alag conditions ke basis par filtering karni hai.

Java 7

Salary Filter

```java id="kw8zj3"
for(Employee employee : employees){

    if(employee.getSalary()>50000){

        System.out.println(employee);

    }

}
```

Department Filter

```java id="2r3l0m"
for(Employee employee : employees){

    if(employee.getDepartment().equals("IT")){

        System.out.println(employee);

    }

}
```

Age Filter

```java id="0oazt7"
for(Employee employee : employees){

    if(employee.getAge()>30){

        System.out.println(employee);

    }

}
```

Observe carefully.

Har jagah

Loop

Same.

Traversal

Same.

Printing

Same.

Sirf

Condition

change hui.

Ye duplication hai.

---

# Java 8 Philosophy

Loop ko baar-baar mat likho.

Sirf

Behavior

pass karo.

Diagram

```text id="h6a79i"
Collection

↓

Common Processing

↓

Behavior

↓

Result
```

Java 8 me

Behavior ko Lambda ke form me pass kiya jata hai.

Example

```java id="jlwmco"
employees.stream()
         .filter(employee -> employee.getSalary() > 50000)
         .collect(Collectors.toList());
```

Yahan

```java id="10mx2o"
employee -> employee.getSalary() > 50000
```

Behavior hai.

Loop

Stream khud handle kar rahi hai.

---

# Another Example

Student Management System

Requirement 1

Marks > 90

Requirement 2

Age > 18

Requirement 3

Class = 12

Java 7

Teen alag loops.

Java 8

Ek processing pipeline.

Sirf behavior change.

---

# Real World Example

Suppose tumhare ghar me Washing Machine hai.

Machine same hai.

Sirf mode change hota hai.

```text id="qk5rza"
Cotton

↓

Quick Wash

↓

Heavy Wash

↓

Wool
```

Machine duplicate nahi hoti.

Sirf behavior change hota hai.

Exactly

Java 8 bhi

same processing ko reuse karta hai.

Sirf behavior change karta hai.

---

# Another Real World Example

Restaurant

Same Chef

Same Kitchen

Different Orders

```text id="wbnnn2"
Pizza

Burger

Pasta

Sandwich
```

Kitchen same.

Cooking Process same.

Sirf recipe change hoti hai.

Recipe

↓

Behavior.

---

# Why Is This Important?

Benefits

* Less Code

* Better Reusability

* Better Readability

* Better Maintenance

* Easy Testing

* Easy Extension

---

# Interview Tip

Question

What is the biggest philosophy of Java 8?

Best Answer

Behavior should be passed instead of repeatedly writing the same implementation.

---

# Common Mistake

❌

Behavior Passing

matlab

Methods pass karna.

Wrong.

Behavior

Functional Interface ke through

Lambda Expression ki help se represent kiya jata hai.

---

# Memory Trick

```text id="fgjlwm"
Duplicate Code

↓

Bad

----------------

Behavior Passing

↓

Good
```

---

# Expected Follow-up Questions

### Q1

Why is Behavior Passing important?

---

### Q2

How does Lambda support Behavior Passing?

---

### Q3

Can Anonymous Classes also pass behavior?

---

### Q4

Which Java 8 feature made Behavior Passing practical?

Answer

Lambda Expressions.

---

# Summary

Java 8 ka main objective tha

Repeated implementation ko avoid karna.

Sirf behavior ko reusable banana.

Yehi Java 8 ki core philosophy hai.

---

# Interview Rating

⭐⭐⭐⭐⭐

Most Frequently Asked

---

# Section 2 Summary

Aaj humne complete kiya.

✅ Java 8 ke Top 5 Features

✅ Behavior should be passed, not duplicated

Ye dono topics Java 8 interviews me bahut frequently puche jaate hain.

---

# Self-Assessment Checklist

✅ Main Java 8 ke Top 5 Features confidently bata sakta hoon.

✅ Mujhe har feature ka purpose yaad hai.

✅ Main Behavior Passing ko real-world examples ke saath explain kar sakta hoon.

✅ Mujhe Java 7 aur Java 8 ki philosophy ka difference samajh aa gaya.

✅ Main interview me "Behavior should be passed, not duplicated" confidently explain kar sakta hoon.
