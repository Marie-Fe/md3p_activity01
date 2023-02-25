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


