// KotlinAssignment1 - Assignment #1
// During this week, you explored fundamental Kotlin concepts, including lambdas.
// This file contains solutions for:
// A) Sum of integers from 1 to a specified maximum
// B) Iterative factorial function
// C) Factorial using a lambda expression
// D) Recursive factorial function

// -------------------------------
// A) Sum integers from 1 up to a specified maximum
// -------------------------------
fun sumUpTo(max: Int): Long {
    require(max >= 1) { "max must be at least 1" }

    var sum = 0L
    for (i in 1..max) {
        sum += i
    }
    return sum
}

// -------------------------------
// B) Iterative factorial function
// -------------------------------
fun factorialIterative(n: Int): Long {
    require(n >= 0) { "n must be non-negative" }

    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

// -------------------------------
// C) Factorial using a lambda expression
// -------------------------------

// Lambda that computes factorial iteratively
val factorialLambda: (Int) -> Long = { n ->
    require(n >= 0) { "n must be non-negative" }

    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    result
}

// -------------------------------
// D) Recursive factorial function
// -------------------------------
fun factorialRecursive(n: Int): Long {
    require(n >= 0) { "n must be non-negative" }

    return if (n == 0 || n == 1) {
        1L
    } else {
        n * factorialRecursive(n - 1)
    }
}

// -------------------------------
// Main function for testing
// -------------------------------
fun main() {
    println("=== Kotlin Assignment 1 ===")

    // Test A) sumUpTo
    val max = 10
    println("Sum from 1 to $max = ${sumUpTo(max)}")

    // Test B) factorialIterative
    val n1 = 5
    println("Iterative factorial of $n1 = ${factorialIterative(n1)}")

    // Test C) factorialLambda
    val n2 = 6
    println("Lambda factorial of $n2 = ${factorialLambda(n2)}")

    // Test D) factorialRecursive
    val n3 = 7
    println("Recursive factorial of $n3 = ${factorialRecursive(n3)}")
}
