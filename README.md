📘 KotlinAssignment1


This repository contains my solutions for Assignment #1, where we practiced fundamental Kotlin concepts, including functions, loops, recursion, and lambda expressions.

📚 Assignment Overview

During this week, we learned:

How to create functions in Kotlin

Loops (for, while)

Lambda expressions

Recursion

IntelliJ project setup

Gradle + Kotlin configuration

Using Git & GitHub for version control

This assignment includes four core tasks plus optional enhancements.

📝 Tasks Completed
A) Sum of integers from 1 to a maximum

Function:

fun sumUpTo(max: Int): Long


Uses a loop to compute the sum of all integers from 1 to max.

B) Iterative factorial

Function:

fun factorialIterative(n: Int): Long


Computes factorial using a for-loop.

C) Lambda factorial

Lambda:

val factorialLambda: (Int) -> Long


Implements factorial using a lambda expression.

D) Recursive factorial

Function:

fun factorialRecursive(n: Int): Long


Computes factorial using recursion.

⭐ Optional Task (Included): Fibonacci Function
fun fibonacci(n: Int): Long {
    if (n <= 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}

▶️ Program Output

Here is the output produced by running Main.kt:

=== Kotlin Assignment 1 ===
Sum from 1 to 10 = 55
Iterative factorial of 5 = 120
Lambda factorial of 6 = 720
Recursive factorial of 7 = 5040
📂 Project Structure
KotlinAssignment1/
 ├── src/
 │   └── main/
 │       └── kotlin/
 │           └── Main.kt
 ├── build.gradle.kts
 ├── settings.gradle.kts
 ├── gradle/
 ├── gradlew
 └── README.md

🛠 Technologies Used

Kotlin 2.0.21

IntelliJ IDEA

JDK 17 (Temurin)

Gradle

Git & GitHub

👤 Author

Samreen Baig
Kotlin Assignment 1 – 2025
Android Development – TriOS College
