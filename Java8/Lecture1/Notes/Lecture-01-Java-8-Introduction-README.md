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

Java 7

``` java
for(Employee e : employees){

    if(e.getSalary()>50000){

        System.out.println(e);

    }

}
```

Ab department IT.

``` java
for(Employee e : employees){

    if(e.getDepartment().equals("IT")){

        System.out.println(e);

    }

}
```

Ab Age \>30.

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

Ek principle hai.

> **Behavior should be passed, not duplicated.**

Yahi Java 8 ka birth reason tha.

------------------------------------------------------------------------

# Java 8 ki Philosophy

Java developers ne socha.

Instead of writing

    Loop
    Condition
    Loop
    Condition
    Loop
    Condition

Why not write loop once?

Aur sirf condition pass karo.

Pseudo code

    filter(list, condition)

Ye condition hi Lambda ban gayi.

------------------------------------------------------------------------

# Functional Programming

Programming paradigm = programming likhne ka style.

-   Procedural
-   Object-Oriented
-   Functional

Functional Programming me functions/behavior par focus hota hai.

------------------------------------------------------------------------

# Real World Example

Traditional Flow

Customer → Manager → Chef → Pizza

Functional Style

Order() → Function → Pizza

Tum bas instruction dete ho, execution system karta hai.

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

Loop internally handle hota hai.

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

Java 8

``` java
list.sort((a,b)->a.getSalary()-b.getSalary());
```

------------------------------------------------------------------------

# Biggest Revolution

Java me functions true first-class citizens nahi hain.

Lekin Lambda Expressions aur Functional Interfaces ke through
function-like behavior ko object ke form me pass kiya ja sakta hai.

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

Collections ko declarative way me process karna.

    Filter
    ↓
    Map
    ↓
    Sort
    ↓
    Collect

------------------------------------------------------------------------

# Why Optional Came

Old

``` java
Employee e=findEmployee();
e.getName();
```

Null hone par NullPointerException.

Java 8

``` java
Optional<Employee>
```

------------------------------------------------------------------------

# Why New Date API Came

Problems with old API: - Mutable - Not Thread Safe - Confusing

Java 8: - LocalDate - LocalTime - LocalDateTime - Instant - Duration -
Period

------------------------------------------------------------------------

# Why Default Methods

Interfaces ko backward compatible banane ke liye.

``` java
default void eat(){

}
```

------------------------------------------------------------------------

# Java 8 ki Internal Philosophy

    Collection
    ↓
    Stream
    ↓
    Operations
    ↓
    Result

Aur

    Behavior
    ↓
    Lambda
    ↓
    Functional Interface
    ↓
    Execution

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

1.  Why Java 8 is considered revolutionary?
2.  Biggest feature of Java 8?
3.  Why Functional Programming?
4.  Does Java support Functional Programming?
5.  Is Java a Functional Language?

------------------------------------------------------------------------

# Lecture 1 Notes

-   Java 8 was the biggest Java release.
-   Goal: Reduce boilerplate code.
-   Introduced Functional Programming support.
-   Behavior can be passed using Lambdas.
-   Stream API enables declarative programming.
-   Optional helps reduce null handling issues.
-   Default methods improve interface evolution.
-   Date-Time API is immutable and thread-safe.

------------------------------------------------------------------------

# Homework

1.  Why was Java 8 needed?
2.  What were the limitations of Java 7?
3.  What is Functional Programming?
4.  Imperative vs Declarative Programming.
5.  Why Lambda Expressions?
6.  Why Stream API?
7.  Why Optional?
8.  Why Default Methods?
9.  Why Java is not a purely Functional language?
