package com.android.activity01_a

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
    print("Enter a word to know if its a Palindrome or not")
    println("Enter word: ")
    val word = readLine()

    //call function
    if (palindromcheck(word)) {
        println("$word is a palindrome")
    }else {
        println("$word is not a palindrome")
    }

}

fun palindromcheck(input: String?): Boolean {
    // check input length of both ends to the middle

     var a = 0
    var b = input!!.length-1

    while (a < b) {
        if (input[a] != input[b]) {
            return false
        }
        //to continue loop
        a++
        b--
    }
    return true
}


