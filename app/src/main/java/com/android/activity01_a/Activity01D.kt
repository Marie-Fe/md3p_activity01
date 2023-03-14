package com.android.activity01_a
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val amounts = mutableListOf<Double>()

    // Ask user to input 5 monetary amounts
    for (i in 1..5) {
        print("Enter amount $i: ")
        val amount = readLine()!!.toDouble()
        amounts.add(amount)
    }

    // Ask user to input divisor with conditions
    var divisor: Int? = null
    while (divisor == null) {
        print("Divide the total by: ")
        val input = scanner.nextLine()
        try {
            divisor = input.toInt()
            if (divisor <= 0) {
                throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a positive integer or number.")
        }
    }

    // Calculate total and divisor
    val total = amounts.sum()
    val quotient = total / divisor

    // Display results
    println("Total amount: $total")
    println("Quotient: $quotient")
}