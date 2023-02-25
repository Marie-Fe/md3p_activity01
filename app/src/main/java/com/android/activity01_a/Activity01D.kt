package com.android.activity01_a

import androidx.lifecycle.viewmodel.CreationExtras


fun main() {
    println("Input 5 monetary amount:")

    do {

        print("Input first number:")
        val a = readLine()!!.toDouble()
        print("Input second number:")
        val b = readLine()!!.toDouble()
        print("Input third number:")
        val c = readLine()!!.toDouble()
        print("Input fourth number:")
        val d = readLine()!!.toDouble()
        print("Input fifth number:")
        val e = readLine()!!.toDouble()


        print("Divide by how many?")
        val f = readLine()!!.toInt()

        val result = a + b + c + d + e
        val divide = result / f
        println("Result: $divide")
    } while (!(a == null && b == null && c == null && d == null && e == null))

}


