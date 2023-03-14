package com.android.activity01_a

import java.util.Locale

// First try
/*fun main(args: Array<String>){
    print("Enter a word:")
    val word: String? = readLine()

   var reverse = word!!.reversed()

    if (word == reverse) {
        print("Palindrome")
    }else{
        print("Not a Palindrome")
    }

}*/

fun main() {
    print("Enter a string: ")
    val input: String? = readLine()?.uppercase()

    if (input != null && isPalindrome(input)) {
        println("$input is a palindrome!")
    } else {
        println("$input is not a palindrome.")
    }
}

fun isPalindrome(str: String): Boolean {
    val len = str.length
    for (i in 0 until len / 2) {
        if (str[i] != str[len - i - 1]) {
            return false
        }
    }
    return true
}



