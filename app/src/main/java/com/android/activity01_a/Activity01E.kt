package com.android.activity01_a
//Set and Map
fun main() {
    /*
    // Use Case ArrayList: Storing a playlist of songs
    val playlist = ArrayList<String>()
    playlist.add("Calm Down")
    playlist.add("Flower")
    playlist.add("Georgia")
    playlist.add("All to Well")

    println("Song playlist: $playlist")
    println("Add another song to the playlist: ")
    val addsong: String = readLine()!!.toString()
    playlist.add(addsong)
}
*/

/*
// Use Case Map: Count occurrences
val names = listOf("Maria", "Alex", "John, "Alex", "Marie", "Apple")

val counts = mutableMapOf<String, Int>()
    for (name in names) {
        counts[name] = counts.getOrDefault(name, 0) + 1
    }

    // Printing the counts
    for ((name, count) in counts) {
        println("$name: $count")
    }
}
*/


// Example of a dictionary using a Map
    val dictionary = mapOf(
        "mad" to "very angry",
        "ethereal" to "extremely delicate and light in a way that seems not to be at this world",
        "vad" to "wild, untamed, uncontrolled, unregulated ",
        "leal" to "faithful and true",
        "meas" to "a sense of respect"
    )

    for (word in dictionary) {
        print(word)
    }


// Accessing a definition
    println("Definition of the Word: ")
    val def = readLine()

    println(dictionary["$def"])
}

/*
// Example of checking for membership using a Set
    val setOfNumbers = setOf(1, 2, 3, 4, 5)

    println(setOfNumbers.contains(3)) // Output: true
    println(setOfNumbers.contains(6)) // Output: false
}
*/

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


}*/
