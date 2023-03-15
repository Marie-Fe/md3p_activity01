package com.android.activity01_a

fun main() {
    //1.
    val grocery = arrayListOf(
        "Pancit Canton", "Corned Beef", "Noodles", "Nescafe coffee", "Beef loaf",
        "Bear Brand", "Milo", "Butter", "Cheese", "Tang",
        "Spaghetti", "Pasta", "Soy milk", "Magic Sarap", "Sugar",
        "Hotdog", "Shampoo", "Soap", "Oats", "Smart"
    )
    println("Grocery List:")
    for (item in grocery) {
        println("$item")
    }
//2.
    val cart = hashMapOf<String, Int>()


    for (i in 1..3) {
        println("Add to cart $i: ")
        val item = readLine()
        println("$i Quantity: ")
        val quantity: Int = readLine()!!.toInt()

        addToCart("$item", quantity, cart)
        println(cart)
    }



    println("Would you like to remove some items? Y/N")
    val ans1 = readLine()

    if (ans1 == "Y" || ans1=="y"){
        println("Item: ")
        val item = readLine()
        removeFromCart("$item",cart)
        println(cart)
    }else if (ans1 == "N" || ans1 == "n") {
        print("Thanks for adding it.")
    }

    println("Would you like to check your total items? Y/N")
    val ans = readLine()
    if (ans == "Y" || ans=="y"){
        checkOut(cart)
        println(cart)
    }else if (ans == "N" || ans == "n") {
        print("Okay.")
    }
}
//3.
fun addToCart(item: String, quantity: Int, cart: HashMap<String, Int>) {
    if (cart.containsKey(item)) {
        // if the item already exists in the cart, add the quantity to the existing quantity
        cart[item] = cart[item]!! + quantity
    } else {
        // if the item doesn't exist in the cart, add a new entry with the quantity
        cart[item] = quantity
    }
}
//4.
fun checkOut(cart: HashMap<String, Int>): Int {
    var totalItems = 0
    for ((_, quantity) in cart) {
        totalItems += quantity
    }
    return totalItems
}
//5.
fun removeFromCart(item: String, cart: HashMap<String, Int>) {
    cart.remove(item)
}


