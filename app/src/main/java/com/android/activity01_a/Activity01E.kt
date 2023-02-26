package com.android.activity01_a
//Set and Map
fun main() {
    // Map
    val countries = mapOf("Japan" to 1, "Korea" to 2, "Philippines" to 3, "China" to 4, "Canada" to 5)

    // Know the value of a key
    val key = "Philippines"
    val value = countries[key]
    if (value != null) {
        println("The value of $key is $value")
    } else {
        println("$key is not in the map")
    }

    println("List of countries: ")
    for (country in countries) {
        println(country)
    }

    // Set
    val flower = setOf("Rose", "Santana", "Orchid", "Daisy", "Jasmin", "Tulip")

    // Check if its in the set
    val input = "Marigold"
    if (flower.contains(input)) {
        println("$input is in the set")
    } else {
        println("$input is not in the set")
    }

    println("List of Flowers: ")
    for (flowers in flower) {
        println(flowers)
    }
}

//print element, finding the sum and largest number using array
/*fun main() {
    val numbers = arrayOf(100, 80, 300, 50, 25)

    // Print all numbers in the array
    println("All numbers in the array: ")
    for (number in numbers) {
        println(number)
    }

    // Find the sum of all numbers in the array
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    println("The sum of all numbers in the array is $sum")


    // Find the largest number in the array
    var largest = numbers[0]
    for (i in 1 until numbers.size) {
        if (numbers[i] > largest) {
            largest = numbers[i]
        }
    }
    println("The largest number in the array is $largest")
}

 */
//use cases in arrayList
/*
fun main() {
    val subjects = arrayListOf<String>()

    subjects.add("Ethics")
    subjects.add("Science")
    subjects.add("Math in Modern World")
    subjects.add("Filipino")

    for (subject in subjects) {
        println("List of subjects in school:")
        print(subject)
    }

    //remove elements from the list
    subjects.remove("Ethics")
    println("Subjects list:")
    print(subjects)

    //sort the order in the elements by its length
    subjects.sortBy { it.length }
    println("List of subjects: ")
    print(subjects)


}
*/

