package com.android.activity01_a

fun main() {

    val library = listOf("Education", "Textbook", "Novels")
    val education =listOf("1.1.Philippines Educational System","1.2.Democracy and Education","1.3.Educated")
    val textbook = listOf("2.1.Practical English Usage ","2.2.College Physics","2.3.Calculus")
    val novel = listOf("3.1.The Adventure of Sherlock Holmes","3.2.The A.B.C Murder","3.3.The Study in Scarlet")

    println("Type/genre of book in the library:")
    for (x in library) {
        println(x)
    }

    println("In the list, what type or genre of book would you like to borrow?")
    val type = readLine()

    val result = type?.lowercase()

    if (result == "education".lowercase() ) {
        println("Here is the list of book under Education:")
        for (y in education) {
            println(y)
        }
        println("What book would you like to borrow? Type the no. of the book")
        val book = readLine()!!.toDouble()
        if (book == 1.1) {

            println(
                "Philippines Educational System:" +
                        "Available copy:4 " +
                        "Author: Elena Tanodra " +
                        "Date Published: 2003" +
                        "Length:220 pages"
            )
        } else if (book == 1.2) {
            println("Democracy and Education:" +
                    "Available copy:6 "+
                    "Author: John Dewey " +
                    "Date Published: 1916")
        } else if (book == 1.3) {
            println("Educated:" +
                    "Available copy:10 "+
                    "Author: Tara Westover " +
                    "Date Published: 2018")
        }else {
            println("Its not in the list.")
        }
    }else if (result == "textbook".lowercase()) {
        println("Here is the list of book under Textbook:")
        for (z in textbook) {
            println(z)
        }
        println("What book would you like to borrow? Type the no. of the book")
        val book1 = readLine()!!.toDouble()
        if (book1 == 2.1) {
            println("Practical English Usage:" +
                    "Available copy:20 "+
                    "Author: Micheal Swan " +
                    "Date Published: 1980")
        }else if (book1 == 2.2) {
            println("College Physics:" +
                    "Available copy:0 "+
                    "Author: Paul Peter Urone " +
                    "Date Published: 1996")
            println("Sorry its not available")
        }else if (book1 == 2.3) {
            println("Calculus:" +
                    "Available copy:15 "+
                    "Author: James Stewart " +
                    "Date Published: 1987")
        }else {
            println("Its not in the list")
        }
    }else if (result == "novel".lowercase()) {
        println("Here is the list of book under Novel:")
        for (a in novel) {
            println(a)
        }
        println("What book would you like to borrow? Type the no. of the book")
        val book2 = readLine()!!.toDouble()
        if (book2 == 3.1) {
            println("The Adventure of Sherlock Holmes:" +
                    "Available copy:1 (digitalized) "+
                    "Author: Arthur Conan Doyle " +
                    "Date Published: 1892")
        }else if (book2 == 3.2) {
            println("The A.B.C. Murder:" +
                    "Available copy:1 (digitalized) "+
                    "Author: Agatha Christie " +
                    "Date Published: 1936")
        }else if (book2 == 3.3 ) {
            println("The Study in Scarlet:" +
                    "Available copy:1 (digitalized) "+
                    "Author: Arthur Conan Doyle " +
                    "Date Published: 1887")
        }else{
            println("Its not in the list.")
        }
    }else{
        println("Not found in the library.")
    }


}