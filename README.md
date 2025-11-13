📘 Kotlin Assignment 1

This repository contains my solutions for Assignment #1, demonstrating fundamental Kotlin programming concepts such as functions, loops, recursion, and lambda expressions.

📚 Assignment Overview

_In this assignment, I learned how to:

_Define and call functions in Kotlin

_Use for and while loops effectively

_Work with lambda expressions

_Implement recursive functions

_Set up a Kotlin project in IntelliJ IDEA

_Configure Gradle with Kotlin

_Manage version control using Git & GitHub

_The assignment includes four core programming tasks plus one optional enhancement.

🧩 Tasks Implemented
A) Sum of Integers (1 → max)
fun sumUpTo(max: Int): Long


Calculates the sum of all integers from 1 to max using a loop.

B) Iterative Factorial
fun factorialIterative(n: Int): Long


Computes the factorial of a number using a for-loop.

C) Lambda Factorial
val factorialLambda: (Int) -> Long


Implements factorial logic using a lambda expression.

D) Recursive Factorial
fun factorialRecursive(n: Int): Long


Computes factorial using recursion, demonstrating function self-calls.

⭐ Optional Task: Fibonacci Function
fun fibonacci(n: Int): Long {
    if (n <= 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}


Generates the Fibonacci sequence recursively.

▶️ Sample Output
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

Gradle Build System

Git & GitHub for Version Control

👤 Author

Samreen Baig
Android Development – TriOS College
📅 Kotlin Assignment 1 – 2025
