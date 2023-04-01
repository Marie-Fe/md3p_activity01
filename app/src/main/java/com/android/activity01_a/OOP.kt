package com.android.activity01_a
import java.util.*

// Define Customer class
data class Customer(
    val firstName: String,
    val lastName: String,
    val mobileNumber: String,
    val address: String
)

// Define Cart class
class Cart(
    val id: UUID,
    val customer: Customer,
    val items: MutableList<Item> = mutableListOf(),
    var status: OrderStatus = OrderStatus.PENDING
) {

    fun addItem(item: Item) {
        items.add(item)
    }
    fun removeItem(item: Item) {
        items.remove(item)
    }
}
// Define Item class (abstract)
open class Item(val name: String)

// Define Fruit class (subclass of Item)
class Fruit(name: String) : Item(name)

// Define Shake class (subclass of Item)
class Shake(name: String) : Item(name)

// Define Juice class (subclass of Item)
class Juice(name: String) : Item(name)

// Define Sandwich class (subclass of Item)
class Sandwich(name: String) : Item(name)

// Define Salad class (subclass of Item)
class Salad(name: String) : Item(name)


// Define OrderStatus enumeration
enum class OrderStatus {
    SENT_TO_KITCHEN,
    BEING_PREPARED,
    PENDING,
    PAID
}

// Define function to update order
fun updateOrder(cart: Cart, status: OrderStatus): Cart {
    // Update cart status
    cart.status = status
    return cart
}

fun showOrderStatus(cart: Cart) {
    println("Order status: ${cart.status}")
}

// Main function to test program
fun main() {

    // Add items to carts
    //List of Fruits
    val fruits = listOf(
        Fruit("Apple"),
        Fruit("Kiwi"),
        Fruit("Watermelon")
    )

    // List of Shakes
    val shakes = listOf(
        Shake("Chocolate Shake"),
        Shake("Vanilla Shake"),
        Shake("Ube Shake")
    )

    //List of Juices
    val juices = listOf(
        Juice("Orange Juice"),
        Juice("Pineapple Juice"),
        Juice("Mango Juice")
    )

    //List of Sandwiches
    val sandwiches = listOf(
        Sandwich("BLT"),
        Sandwich("Muffuletta"),
        Sandwich("Ham and Cheese decker sandwich")
    )

    //List of Salads
    val salads = listOf(
        Salad("Green Goddess Salad"),
        Salad("Caesar Salad")
    )

    println("Here are the items:")
    for (fruit in fruits) {
        println("Fruits : ${fruit.name}")
    }
    for (shake in shakes) {
        println("Shake: ${shake.name}")
    }
    for (juice in juices) {
        println("Juice: ${juice.name}")
    }
    for (sandwich in sandwiches) {
        println("Sandwich: ${sandwich.name}")
    }
    for (salad in salads) {
        println("Salad: ${salad.name}")
    }


    // Create customers
    println("Enter First Name: ")
    val fn = readLine()
    println("Enter Last Name: ")
    val ln = readLine()
    println("Enter Mobile Number: ")
    val mn = readLine()?.toInt()
    println("Enter Address: ")
    val address = readLine()
    val costumer1 = Customer("$fn", "$ln", "$mn", "$address")

    // Create carts for customers
    val cart = Cart(UUID.randomUUID(), costumer1)
    // Print carts
    println(cart)

    while (true) {
        println("What would you like to do?")
        println("1. Add item")
        println("2. Remove item")
        println("3. View cart")
        println("4. Status of the order")
        println("5. Exit")

        val choice = readLine()?.toIntOrNull() ?: continue

        when (choice) {
            1 -> {
                println("What would you like to add?")
                val itemName = readLine()?.trim() ?: continue
                val item = Item(itemName)
                cart.addItem(item)
                println("$itemName added to cart.")
                when (item) {
                    fruits -> {
                        //Update order status
                        updateOrder(cart, OrderStatus.PENDING)
                    }
                    juices -> {
                        updateOrder(cart, OrderStatus.BEING_PREPARED)
                    }
                    shakes -> {
                        updateOrder(cart, OrderStatus.BEING_PREPARED)
                    }
                    salads -> {
                        updateOrder(cart, OrderStatus.SENT_TO_KITCHEN)
                    }
                    sandwiches -> {
                        updateOrder(cart, OrderStatus.SENT_TO_KITCHEN)
                    }
                }
                showOrderStatus(cart)
            }
            2 -> {
                println("What would you like to remove?")
                val itemName = readLine()?.trim() ?: continue
                val item = cart.items.find { it.name == itemName }
                if (item != null) {
                    cart.removeItem(item)
                    println("$itemName removed from cart.")
                } else {
                    println("$itemName not found in cart.")
                }
            }
            3 -> {
                println("Items in the cart:")
                for (item in cart.items) {
                    println("- ${item.name}")
                }
            }
            4 -> {
                //Update order status
                println("Would you like to pay? Y/N")
                val pay = readLine()
                if (pay == "Y" || pay =="y"){
                    updateOrder(cart, OrderStatus.PAID)
                    showOrderStatus(cart)
                }
            }
            5 -> {
                println("Goodbye.")
                return
            }
            else -> println("Invalid choice.")
        }
    }

}

