# Lecture 1 -- Java 8 Introduction (Complete Interview Edition)

> Goal: Java 8 ko interview level par samajhna. Ye README lecture ka
> complete version hai.

# Table of Contents

1.  Why Java 8 was needed
2.  Problems in Java 7
3.  Java 8 Philosophy
4.  Functional Programming
5.  Imperative vs Declarative Programming
6.  Why Lambda Expressions?
7.  Why Stream API?
8.  Why Optional?
9.  Why New Date-Time API?
10. Why Default Methods?
11. Internal Philosophy
12. Real Industry Example
13. Interview Questions (Detailed Answers)
14. Revision Notes
15. Homework

------------------------------------------------------------------------

# Why Java 8 was Needed

Java 7 tak Java primarily Object-Oriented Programming language thi.
Collection processing ke liye baar-baar loops likhne padte the. Sirf
condition badalti thi, loop wahi rehta tha. Isse boilerplate aur
duplicate code badhta tha.

Example:

``` java
for(int i=1;i<=100;i++){
    if(i%2==0){
        System.out.println(i);
    }
}
```

Odd ya multiples of 5 ke liye sirf condition badalti hai.

Software Engineering Principle:

> Behavior should be passed, not duplicated.

Isi problem ko solve karne ke liye Java 8 ne Lambda Expressions aur
Stream API introduce ki.

------------------------------------------------------------------------

# Java 8 Philosophy

Purana approach:

Loop → Condition

Naya approach:

filter(list, condition)

Yahan "condition" ko behavior ke roop me pass kiya ja sakta hai.

------------------------------------------------------------------------

# Functional Programming

Programming paradigms: - Procedural - Object-Oriented - Functional

Java pure functional language nahi hai. Java 8 ke baad Functional
Programming features support karta hai.

Real World Example:

Traditional: Customer → Manager → Chef → Pizza

Functional: Order() → Function → Pizza

------------------------------------------------------------------------

# Imperative vs Declarative

Imperative (HOW batana)

``` java
int sum = 0;
for(int i=1;i<=10;i++){
    sum += i;
}
```

Declarative (WHAT batana)

``` java
IntStream.rangeClosed(1,10)
         .sum();
```

Benefits: - Less code - Better readability - Easier maintenance -
Parallel execution friendly

------------------------------------------------------------------------

# Java Before Java 8

``` java
Collections.sort(list,new Comparator<Employee>(){
    @Override
    public int compare(Employee o1, Employee o2){
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

Java me functions true first-class citizens nahi hain.

Lekin Lambda Expressions + Functional Interfaces ki help se
function-like behavior ko object ke form me pass kiya ja sakta hai.

------------------------------------------------------------------------

# Java 8 Features

1.  Lambda Expressions
2.  Functional Interfaces
3.  Stream API
4.  Method References
5.  Default Methods
6.  Static Methods in Interfaces
7.  Optional
8.  Date-Time API
9.  Nashorn JavaScript Engine (later removed)

------------------------------------------------------------------------

# Why Stream API?

Collection processing ko SQL-style declarative banana.

Pipeline:

Filter ↓ Map ↓ Sort ↓ Collect

------------------------------------------------------------------------

# Why Optional?

Old:

``` java
Employee e = findEmployee();
e.getName();
```

Risk: NullPointerException

New:

``` java
Optional<Employee>
```

Null ko explicitly represent karta hai.

------------------------------------------------------------------------

# Why New Date-Time API?

Old API Problems: - Mutable - Not thread-safe - Confusing

Java 8 Solution: - LocalDate - LocalTime - LocalDateTime - Instant -
Duration - Period

Benefits: - Immutable - Thread-safe - Cleaner API

------------------------------------------------------------------------

# Why Default Methods?

Interface evolution without breaking existing implementations.

``` java
interface Animal{
    default void eat(){
        System.out.println("Eating...");
    }
}
```

------------------------------------------------------------------------

# Internal Philosophy

Collection ↓ Stream ↓ Intermediate Operations ↓ Terminal Operation ↓
Result

Behavior ↓ Lambda ↓ Functional Interface ↓ Execution

------------------------------------------------------------------------

# Real Industry Example

``` java
products.stream()
        .filter(p -> p.getPrice() > 1000)
        .filter(p -> p.getRating() > 4)
        .sorted()
        .limit(10)
        .toList();
```

------------------------------------------------------------------------

# Interview Questions (Detailed)

## Q1. Why is Java 8 considered revolutionary?

Answer:

Java 8 introduced Functional Programming support through Lambda
Expressions, Stream API, Functional Interfaces, Optional, Default
Methods and the modern Date-Time API. It reduced boilerplate code,
improved readability and enabled declarative programming.

------------------------------------------------------------------------

## Q2. What is the biggest feature of Java 8?

Answer:

Interview perspective se Lambda Expressions foundation hain. Stream API
sabse popular feature hai, lekin Streams effectively Lambdas par depend
karte hain.

------------------------------------------------------------------------

## Q3. Why was Functional Programming introduced?

Answer: - Less boilerplate - Better readability - Code reusability -
Easier maintenance - Easier parallel processing

------------------------------------------------------------------------

## Q4. Does Java support Functional Programming?

Answer:

Yes. Java is primarily an Object-Oriented language but from Java 8
onward it also supports Functional Programming features.

------------------------------------------------------------------------

## Q5. Is Java a Functional Language?

Answer:

No. Java is not a pure functional language.

------------------------------------------------------------------------

## Q6. Difference between Imperative and Declarative Programming?

Imperative: - HOW batate hain. - Explicit loops likhte hain.

Declarative: - WHAT batate hain. - Framework execution handle karta hai.

------------------------------------------------------------------------

## Q7. Why was Optional introduced?

Answer:

To reduce explicit null handling and encourage safer APIs. Optional does
not eliminate all NullPointerExceptions but helps design APIs that
represent absence of a value explicitly.

------------------------------------------------------------------------

## Q8. Why were Default Methods introduced?

Answer:

Backward compatibility. Existing implementing classes ko break kiye bina
interface evolve kiya ja sakta hai.

------------------------------------------------------------------------

# Revision Notes

-   Java 8 = Biggest Java release.
-   Supports Functional Programming features.
-   Lambda reduces boilerplate.
-   Streams provide declarative collection processing.
-   Optional improves null handling.
-   Default methods help interface evolution.
-   Date-Time API is immutable and thread-safe.

------------------------------------------------------------------------

# Homework

1.  Why was Java 8 needed?
2.  Explain Functional Programming.
3.  Imperative vs Declarative.
4.  Why Lambda?
5.  Why Streams?
6.  Why Optional?
7.  Why Default Methods?
8.  Is Java a Functional language? Explain.
9.  Explain Java 8 philosophy in your own words.

------------------------------------------------------------------------

# Next Lecture

Lecture 2 -- Lambda Expressions (Deep Dive)

Topics: - Syntax - Anonymous Class vs Lambda - Functional Interfaces -
Variable Capture - Effectively Final - this keyword - Internal Working -
Bytecode Overview - Interview Questions - Coding Examples
