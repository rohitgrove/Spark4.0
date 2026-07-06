# JAVA 8 MASTER HANDBOOK

# Lecture 1 – Java 8 Introduction

# Part 1 – Homework Solutions

> **Objective**
>
> Is file me Lecture 1 – Part 1 ke homework questions ke detailed answers diye gaye hain. Har answer interview-oriented hai aur concept ko deeply explain karta hai.

---

# Table of Contents

```text
1. Boilerplate Code
2. Duplicate Code vs Boilerplate Code
3. Why Collection Processing Was Difficult in Java 7
4. Behavior Should Be Passed, Not Duplicated
5. Real-World Example (Student Management System)
```

---

# Question 1

## Question

**Boilerplate code kya hota hai?**

---

## Answer

**Boilerplate Code** wo code hota hai jo baar-baar likhna padta hai aur jisme actual business logic bahut kam hota hai. Ye code application chalane ke liye zaruri hota hai, lekin isme zyada creativity ya problem-solving nahi hoti.

Simple words me:

> **Boilerplate code = Repeated supporting code jo har jagah almost same hota hai.**

Java 7 me collections process karte waqt hume baar-baar same loop likhna padta tha.

Example:

```java
for(Employee employee : employees){

    if(employee.getSalary() > 50000){

        System.out.println(employee);

    }

}
```

Ab agar Department ke basis par filter karna ho.

```java
for(Employee employee : employees){

    if(employee.getDepartment().equals("IT")){

        System.out.println(employee);

    }

}
```

Aur agar Age ke basis par filter karna ho.

```java
for(Employee employee : employees){

    if(employee.getAge() > 30){

        System.out.println(employee);

    }

}
```

Observe karo.

Har baar:

* Same loop
* Same traversal
* Same printing

Sirf condition change ho rahi hai.

Ye repeated structure hi **boilerplate code** hai.

---

## Real-Life Example

Suppose tumhe roz office jana hai.

Har din tum:

* Bike start karte ho.
* Helmet pehnte ho.
* Gate lock karte ho.
* Office jaate ho.

Ye same process roz repeat hota hai.

Bas destination ya route kabhi-kabhi change hota hai.

Ye repeated process boilerplate code jaisa hi hai.

---

## Interview Tip

Agar interviewer puche:

> **What is Boilerplate Code?**

To short answer:

> Boilerplate code is repeated supporting code that has to be written frequently while the actual business logic changes very little.

---

## Common Mistake

❌ Boilerplate code ka matlab sirf duplicate code nahi hota.

✅ Boilerplate code repeated structure hota hai jo framework, language ya implementation style ki wajah se baar-baar likhna padta hai.

---

# Question 2

## Question

**Duplicate code aur Boilerplate code me kya difference hai?**

---

## Answer

Bahut log in dono terms ko same samajhte hain.

Ye completely same nahi hain.

### Boilerplate Code

Boilerplate code wo repeated structure hota hai jo baar-baar likhna padta hai.

Example:

```java
for(Employee employee : employees){

}
```

Har jagah same loop likhna.

---

### Duplicate Code

Duplicate code ka matlab hai same business logic ko multiple places par copy-paste kar dena.

Example

Class A

```java
public double calculateTax(double salary){

    return salary * 0.10;

}
```

Class B

```java
public double calculateTax(double salary){

    return salary * 0.10;

}
```

Ye duplicate code hai.

Yahan pura business logic repeat hua hai.

---

## Difference Table

| Boilerplate Code                        | Duplicate Code                                 |
| --------------------------------------- | ---------------------------------------------- |
| Supporting structure repeat hoti hai    | Business logic repeat hota hai                 |
| Language/framework ki wajah se hota hai | Copy-paste ya poor design ki wajah se hota hai |
| Har boilerplate duplicate nahi hota     | Duplicate code avoid karna chahiye             |
| Example: Same `for` loop                | Example: Same tax calculation method           |

---

## Interview Tip

Agar interviewer bole:

> **Are Boilerplate Code and Duplicate Code the same?**

Answer:

No.

Boilerplate code repeated supporting structure hota hai.

Duplicate code repeated business logic hota hai.

Dono overlap kar sakte hain, lekin same concept nahi hain.

---

## Common Mistake

❌ Dono ko same bolna.

✅ Difference clearly explain karna.

---

# Question 3

## Question

**Java 7 me collections process karna difficult kyun tha?**

---

## Answer

Java 7 me collections process karna difficult isliye tha kyunki developer ko har operation manually implement karna padta tha.

Example:

* Filtering
* Sorting
* Searching
* Mapping
* Counting

Sab ke liye explicit loops likhne padte the.

Example

```java
for(Employee employee : employees){

    if(employee.getSalary() > 50000){

        System.out.println(employee);

    }

}
```

Agar ek aur condition add ho jaye.

```java
employee.getDepartment().equals("IT")
```

To fir code aur bada ho jayega.

Large applications me aise hazaron loops hote the.

Isse:

* Boilerplate code badhta tha.
* Readability kam hoti thi.
* Maintenance difficult hoti thi.
* Reusability kam hoti thi.

Java 8 ne Stream API aur Lambda Expressions introduce karke collection processing ko declarative bana diya.

---

## Interview Tip

Java 7 ki problem sirf long code nahi thi.

Actual problem thi:

> **Behavior ko reusable tarike se pass nahi kiya ja sakta tha.**

---

## Common Mistake

❌ "Java 7 me Streams nahi thi."

Ye answer incomplete hai.

Correct answer me reason bhi explain karo.

---

# Question 4

## Question

**"Behavior should be passed, not duplicated" ko apne words me explain karo.**

---

## Answer

Is principle ka matlab hai ki agar kisi program me sirf logic change ho raha hai aur baaki structure same hai, to pura code dobara likhne ki jagah sirf logic ko reusable form me pass karna chahiye.

Example

Java 7

Salary filter

```java
for(Employee employee : employees){

    if(employee.getSalary() > 50000){

    }

}
```

Department filter

```java
for(Employee employee : employees){

    if(employee.getDepartment().equals("IT")){

    }

}
```

Age filter

```java
for(Employee employee : employees){

    if(employee.getAge() > 30){

    }

}
```

Observe karo.

Loop same hai.

Sirf condition alag hai.

Java 8 ne kaha:

Loop ek baar likho.

Condition ko behavior ke roop me pass karo.

Pseudo Code

```text
filter(employeeList, salaryCondition)

filter(employeeList, departmentCondition)

filter(employeeList, ageCondition)
```

Isi concept ki wajah se Lambda Expressions introduce hui.

---

## Real-Life Example

Suppose washing machine hai.

Har baar machine banana zaruri nahi.

Sirf mode change karte ho.

* Cotton
* Wool
* Quick Wash
* Heavy Wash

Machine same hai.

Behavior change hota hai.

Java 8 bhi exactly yehi philosophy follow karta hai.

---

## Interview Tip

Ye line yaad rakho.

> Java 8 focuses on passing behavior instead of repeatedly writing the same implementation.

---

# Question 5

## Question

**Employee example ko modify karke Student Management System ka real-world example banao.**

---

## Answer

Suppose school ke paas students ki list hai.

```text
Rahul
Marks = 92
Class = 12
Age = 17

Priya
Marks = 81
Class = 11
Age = 16

Aman
Marks = 95
Class = 12
Age = 17
```

### Requirement 1

Marks greater than 90.

```java
for(Student student : students){

    if(student.getMarks() > 90){

        System.out.println(student);

    }

}
```

---

### Requirement 2

Class 12 ke students.

```java
for(Student student : students){

    if(student.getStudentClass() == 12){

        System.out.println(student);

    }

}
```

---

### Requirement 3

Age greater than 16.

```java
for(Student student : students){

    if(student.getAge() > 16){

        System.out.println(student);

    }

}
```

Observe karo.

Har baar:

* Loop same
* Traversal same
* Printing same

Sirf condition change hui.

Yehi Java 7 ki problem thi.

Java 8 approach:

```text
filter(studentList, marksCondition)

filter(studentList, classCondition)

filter(studentList, ageCondition)
```

Yahan sirf behavior pass ho raha hai.

---

## Interview Tip

Agar interviewer bole:

> Employee ke alawa koi aur real-world example do.

Tum confidently:

* Student Management System
* Product Catalog
* Order Management System
* Banking Transactions
* Hospital Patient Records

me se koi bhi example de sakte ho.

---

# Part 1 Homework Summary

Aaj ke homework se tumne ye concepts revise kiye:

* Boilerplate Code
* Duplicate Code
* Java 7 Collection Processing Problems
* Behavior Passing Philosophy
* Real-World Design Thinking

Agar tum in 5 questions ke answers bina notes dekhe explain kar sakte ho, to **Lecture 1 – Part 1** ki foundation strong hai.

---

# Self-Assessment Checklist

✅ Mujhe Boilerplate Code samajh aa gaya.

✅ Mujhe Duplicate Code aur Boilerplate Code ka difference pata hai.

✅ Mujhe Java 7 ki limitations explain karni aati hain.

✅ Main "Behavior should be passed, not duplicated" ko real-world example ke saath explain kar sakta hoon.

✅ Main Student example ki help se Java 8 ki philosophy explain kar sakta hoon.
