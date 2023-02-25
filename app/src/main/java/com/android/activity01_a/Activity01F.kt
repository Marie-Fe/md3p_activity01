package com.android.activity01_a



fun main() {
    println("Enter two words to print its union unique word")

    print("First word: ")
    val first: String = readLine().toString()
    if (first.isBlank()) {
        println("Blank, try again")
    }

    print("Second word: ")
    val second: String = readLine().toString()
    if (second.isBlank()) {
        println("Blank, try again")
    }

    val words = uniqueWord(first,second)
    println(words)

}

fun uniqueWord(first:String, second:String): String {
    val result = StringBuilder()

    for (char in first) {
        if (!result.contains(char)) {
            result.append(char)
        }
    }

    for (char in second) {
        if (!result.contains(char)) {
            result.append(char)
        }
    }
    return result.toString()
}