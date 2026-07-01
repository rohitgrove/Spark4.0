# Lecture 1 --- Java 8 Introduction (The Biggest Java Release Ever)

> **Goal:** Lecture ke end tak tumhe ye samajh aa jana chahiye ki Java 8
> sirf naye APIs ka collection nahi tha, balki Java ko **Object-Oriented
> Programming (OOP)** ke saath **Functional Programming (FP)** support
> dene wala major evolution tha.

------------------------------------------------------------------------

# Table of Contents

1.  Why Java 8 was needed
2.  Problems in Java 7
3.  Evolution of Java
4.  Java 8 Features Overview
5.  Functional Programming
6.  Imperative vs Declarative Programming
7.  Why Lambda came
8.  Why Streams came
9.  Why Functional Interfaces came
10. Why Optional came
11. Why Date-Time API came
12. Internal Philosophy of Java 8
13. Interview Questions
14. Notes

------------------------------------------------------------------------

# Before Java 8

Sabse pehle samajhte hain Java ki philosophy.

Java shuru se hi ek **Object-Oriented Language** thi.

Har cheez classes aur objects ke around thi.

Example

``` java
class Employee{

}
```

``` java
Employee emp = new Employee();
```

Har kaam object se hota tha.

------------------------------------------------------------------------

## Example

Suppose tumhe 1 se 100 tak print karna hai.

``` java
for(int i=1;i<=100;i++){
    System.out.println(i);
}
```

Simple.

Ab suppose tumhe numbers filter karne hain.

``` java
for(int i=1;i<=100;i++){

    if(i%2==0){
        System.out.println(i);
    }

}
```

Aur agar odd chahiye.

``` java
for(int i=1;i<=100;i++){

    if(i%2!=0){
        System.out.println(i);
    }

}
```

Aur agar multiples of 5 chahiye.

``` java
for(int i=1;i<=100;i++){

    if(i%5==0){
        System.out.println(i);
    }

}
```

Observe carefully.

Sirf condition change ho rahi hai.

Baaki pura loop same hai.

Yahi software engineering me **duplicate code** kehlata hai.

------------------------------------------------------------------------

# Java 7 ki Biggest Problem

Suppose Employee list hai.

``` text
Rahul 50000
Amit 40000
Ankit 90000
Riya 70000
```

Salary \> 50000 print karo.

``` java
for(Employee e : employees){

    if(e.getSalary()>50000){

        System.out.println(e);

    }

}
```

Department IT:

``` java
for(Employee e : employees){

    if(e.getDepartment().equals("IT")){

        System.out.println(e);

    }

}
```

Age \>30:

``` java
for(Employee e : employees){

    if(e.getAge()>30){

        System.out.println(e);

    }

}
```

Phir duplicate code.

Loop same.

Condition change.

------------------------------------------------------------------------

## Software Engineering Principle

> **Behavior should be passed, not duplicated.**

Yahi Java 8 ka birth reason tha.

------------------------------------------------------------------------

# Java 8 ki Philosophy

Instead of:

Loop

Condition

Loop

Condition

Loop

Condition

Why not write loop once?

Pseudo code:

    filter(list, condition)

Ye condition hi Lambda ban gayi.

------------------------------------------------------------------------

# Functional Programming

Programming paradigms:

-   Procedural
-   Object-Oriented
-   Functional

Programming likhne ka style hi paradigm hota hai.

## Real World Example

Traditional:

Customer → Manager → Chef → Pizza

Functional:

Order() → Function → Pizza

Tum bas instruction dete ho. Execution system karta hai.

------------------------------------------------------------------------

# Imperative Programming

Machine ko HOW batana.

``` java
int sum=0;

for(int i=1;i<=10;i++){

    sum+=i;

}
```

------------------------------------------------------------------------

# Declarative Programming

Sirf WHAT batana.

``` java
IntStream.rangeClosed(1,10)
         .sum();
```

Loop internally execute hota hai.

Companies Declarative Programming ko pasand karti hain kyunki:

-   Less Bugs
-   Less Code
-   Readable
-   Parallelizable
-   Easy Maintenance

------------------------------------------------------------------------

# Java Before Java 8

``` java
Collections.sort(list,new Comparator<Employee>(){

    @Override

    public int compare(Employee o1,Employee o2){

        return o1.getSalary()-o2.getSalary();

    }

});
```

Java 8:

``` java
list.sort((a,b)->a.getSalary()-b.getSalary());
```

------------------------------------------------------------------------

# Biggest Revolution

Java 8 ne Objects ke saath-saath Functions ko bhi First-Class Style me
use karna possible banaya.

**Important:** Java me functions true first-class citizens nahi hain.
Lambda Expressions aur Functional Interfaces ke through function-like
behavior ko objects ke roop me pass kiya ja sakta hai.

------------------------------------------------------------------------

# What is Behavior?

``` java
int square(int x){
    return x*x;
}
```

Ye behavior hai.

Same sort algorithm me salaryLogic, ageLogic, nameLogic pass kiya ja
sakta hai.

------------------------------------------------------------------------

# Java 8 Features

1.  Lambda Expressions
2.  Functional Interface
3.  Stream API
4.  Method Reference
5.  Default Methods
6.  Static Methods in Interface
7.  Optional
8.  Date-Time API
9.  Nashorn JavaScript Engine (later removed)

------------------------------------------------------------------------

# Why Streams Came

Collections ko SQL ki tarah process karna.

Filter → Map → Sort → Collect

------------------------------------------------------------------------

# Why Optional Came

Old:

``` java
Employee e=findEmployee();
e.getName();
```

Boom → NullPointerException

New:

``` java
Optional<Employee>
```

------------------------------------------------------------------------

# Why New Date API Came

Old: - Date - Calendar - SimpleDateFormat

Problems: - Mutable - Not Thread Safe - Confusing

Java 8: - LocalDate - LocalTime - LocalDateTime - Instant - Duration -
Period

Immutable and Thread Safe.

------------------------------------------------------------------------

# Why Default Methods

100 classes implement kar rahi hain.

Interface me naya method add karoge to sab break ho jayengi.

Solution:

``` java
default void eat(){

}
```

Backward Compatibility.

------------------------------------------------------------------------

# Java 8 ki Internal Philosophy

Collection ↓ Stream ↓ Operations ↓ Result

Behavior ↓ Lambda ↓ Functional Interface ↓ Execution

------------------------------------------------------------------------

# Real Industry Example

``` java
products.stream()
        .filter(...)
        .filter(...)
        .sorted(...)
        .limit(10)
        .toList();
```

------------------------------------------------------------------------

# Interview Questions

## Q1. Why Java 8 is considered revolutionary?

Because it introduced Functional Programming concepts, Lambda
Expressions, Stream API, Optional, Default Methods, and the new
Date-Time API, making Java more expressive and concise while improving
collection processing.

## Q2. Biggest feature?

Most people say Stream API.

Technically Lambda Expressions are the foundation.

Without Lambda, Streams would not be practical.

## Q3. Why Functional Programming?

-   Reduce boilerplate
-   Improve readability
-   Easy Parallel Processing
-   Code Reusability

## Q4. Java supports Functional Programming?

Java is primarily an Object-Oriented language, but from Java 8 onward it
also supports Functional Programming features.

## Q5. Is Java a Functional Language?

No. Java supports Functional Programming. It is not purely Functional.

------------------------------------------------------------------------

# Lecture 1 Notes (Revision)

-   Java 8 was the biggest Java release.
-   Goal: Reduce boilerplate code.
-   Introduced Functional Programming support.
-   Behavior can be passed using Lambdas (through Functional
    Interfaces).
-   Stream API provides declarative collection processing.
-   Optional reduces explicit null handling.
-   Default methods improve interface evolution and backward
    compatibility.
-   New Date-Time API is immutable and thread-safe.

------------------------------------------------------------------------

# Homework

1.  Why was Java 8 needed?
2.  What were the limitations of Java 7?
3.  What is Functional Programming?
4.  Difference between Imperative and Declarative Programming.
5.  Why are Lambda Expressions important?
6.  Why did Stream API get introduced?
7.  Why was Optional introduced?
8.  Why were Default Methods added to interfaces?
9.  Why is Java not considered a purely Functional language?

If tum bina notes dekhe in sab ka answer de sakte ho, to Lecture 1 clear
hai.

# Next Lecture

Lecture 2: Lambda Expressions (Deep Dive)

-   Anonymous class vs Lambda
-   Lambda syntax
-   Functional Interface relation
-   Variable capture
-   Effectively final
-   this keyword behavior
-   Compilation and internal working
-   Bytecode overview
-   Interview questions
-   Coding examples
