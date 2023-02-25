package com.android.activity01_a

import androidx.navigation.NavArgs

fun main(args: Array<String>){
    print("Enter a word:")
    val word: String? = readLine()

   var reverse = word!!.reversed()

    if (word == reverse) {
        print("Palindrome")
    }else{
        print("Not a Palindrome")
    }

}

/*fun main (array: String): Boolean {
    println("Enter a word: ")
    val word: String? = readLine()

    var a = 0
    var b = word!!.length - 1

    while (a < b) {
        if (word.chars() != word.chars())
            return false

        a++
        b--
    }
    return true
}*/



