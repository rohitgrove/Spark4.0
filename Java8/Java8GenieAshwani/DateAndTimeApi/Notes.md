# Java 8 Date & Time API (java.time)

## Why was the Date & Time API introduced in Java 8?

Before Java 8, Java provided the following classes for handling date and time:

- `java.util.Date`
- `java.util.Calendar`
- `java.text.SimpleDateFormat`

Although they worked, they had several design problems. Therefore, Java 8 introduced a completely new package:

```java
java.time
```

The new API is **immutable**, **thread-safe**, **easy to use**, and follows a much cleaner design.

---

# Problems with the Old Date API

## 1. Mutable Objects

The old `Date` class was mutable.

```java
Date date = new Date();
date.setYear(126);
```

The original object gets modified.

This can lead to bugs when the same object is shared.

### Java 8 Solution

Classes like `LocalDate` are immutable.

```java
LocalDate date = LocalDate.now();

date.plusDays(5);

System.out.println(date);
```

Output:

```
2026-07-11
```

The original object does not change.

To modify it:

```java
date = date.plusDays(5);
```

---

## 2. Not Thread Safe

`SimpleDateFormat` is **not thread-safe**.

Sharing the same object among multiple threads can produce incorrect results.

Java 8 introduced:

```java
DateTimeFormatter
```

It is immutable and thread-safe.

---

## 3. Months were 0-Based

Old API:

```java
Calendar c = Calendar.getInstance();

c.set(2026, 0, 10);
```

Here,

```
0 = January
1 = February
...
11 = December
```

This was confusing.

### Java 8

```java
LocalDate.of(2026, 1, 10);
```

```
1 = January
2 = February
...
12 = December
```

Months are human-readable.

---

## 4. Poor API Design

Old Date API mixed:

- Date
- Time
- Time Zone

into one class.

Java 8 separated them into dedicated classes.

---

## 5. Date Calculations were Difficult

Old API required manual calculations.

Java 8 provides:

- `Period`
- `Duration`

for calculating differences easily.

---

# Mutable vs Immutable

## Mutable

An object whose data can be changed after creation.

Example:

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" 8");

System.out.println(sb);
```

Output

```
Java 8
```

Examples:

- StringBuilder
- ArrayList
- HashMap

---

## Immutable

An object whose data cannot be changed after creation.

Whenever modification is required, a new object is created.

Example:

```java
String str = "Java";

str.concat(" 8");

System.out.println(str);
```

Output

```
Java
```

Correct:

```java
str = str.concat(" 8");
```

Examples:

- String
- LocalDate
- LocalTime
- LocalDateTime
- DateTimeFormatter

---

# Important Classes

## 1. LocalDate

Stores only Date.

```java
LocalDate today = LocalDate.now();
```

Example Output

```
2026-07-11
```

Create Custom Date

```java
LocalDate dob = LocalDate.of(2002, 8, 20);
```

Common Methods

```java
today.getDayOfMonth();
today.getMonth();
today.getYear();
today.getDayOfWeek();
```

---

## 2. LocalTime

Stores only Time.

```java
LocalTime time = LocalTime.now();
```

---

## 3. LocalDateTime

Stores Date and Time.

```java
LocalDateTime now = LocalDateTime.now();
```

---

## 4. ZonedDateTime

Stores Date, Time and Time Zone.

```java
ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
```

---

# Date Operations

```java
LocalDate today = LocalDate.now();

today.plusDays(5);

today.minusMonths(2);

today.plusYears(1);
```

Remember:

These methods return a new object.

---

# Formatting Date

```java
DateTimeFormatter formatter =
DateTimeFormatter.ofPattern("dd/MM/yyyy");

String formatted = LocalDate.now().format(formatter);
```

Output

```
11/07/2026
```

---

# Parsing Date

```java
String input = "25/12/2026";

DateTimeFormatter formatter =
DateTimeFormatter.ofPattern("dd/MM/yyyy");

LocalDate date =
LocalDate.parse(input, formatter);
```

---

# Period

Used to find difference between two dates.

```java
Period period =
Period.between(startDate, endDate);
```

Example

```java
System.out.println(period.getYears());
System.out.println(period.getMonths());
System.out.println(period.getDays());
```

---

# Duration

Used to find difference between two times.

```java
Duration duration =
Duration.between(startTime, endTime);

System.out.println(duration.toMinutes());
```

---

# Comparing Dates

```java
date1.isBefore(date2);

date1.isAfter(date2);

date1.equals(date2);
```

---

# Java 8 Months

Java 8 months are **1-based**.

```
1 -> January
2 -> February
3 -> March
4 -> April
5 -> May
6 -> June
7 -> July
8 -> August
9 -> September
10 -> October
11 -> November
12 -> December
```

Old Calendar API:

```
0 -> January
...
11 -> December
```

---

# Old API vs Java 8 API

| Old API | Java 8 API |
|----------|------------|
| Date | LocalDate |
| Date | LocalTime |
| Date | LocalDateTime |
| Calendar | ZonedDateTime |
| SimpleDateFormat | DateTimeFormatter |
| Manual Calculation | Period |
| Manual Time Difference | Duration |

---

# Frequently Asked Interview Questions

## Q1. Why was the new Date & Time API introduced in Java 8?

**Answer:**

The old Date API had several issues:

- Mutable objects
- Not thread-safe
- 0-based months
- Poor API design
- Difficult date calculations

Java 8 introduced the `java.time` package to provide an immutable, thread-safe and cleaner API.

---

## Q2. Difference between Mutable and Immutable?

**Mutable**

- Object can be modified.
- Same object changes.

Examples:

- ArrayList
- StringBuilder

**Immutable**

- Object cannot be modified.
- Every modification creates a new object.

Examples:

- String
- LocalDate
- LocalDateTime

---

## Q3. Are Java 8 Date classes mutable?

**No.**

Classes like `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, and `DateTimeFormatter` are immutable.

---

## Q4. What is the difference between Period and Duration?

**Period**

Used for Date.

Returns:

- Years
- Months
- Days

**Duration**

Used for Time.

Returns:

- Hours
- Minutes
- Seconds

---

## Q5. Which Date & Time classes are most commonly used in Spring Boot?

- LocalDate
- LocalTime
- LocalDateTime
- ZonedDateTime
- DateTimeFormatter
- Period
- Duration