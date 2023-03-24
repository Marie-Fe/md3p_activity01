package com.android.activity01_a
//Set and Map
fun main() {

    // Use Case ArrayList: Storing a playlist of songs


    val playlist = ArrayList<String>()
    playlist.add("Flowers")
    playlist.add("Evangeline")
    playlist.add("All too well")
    playlist.add("Alone")
    playlist.add("Lemon")
    playlist.add("Orange")
    playlist.add("We are")
    playlist.add("Shock!")


    println("Would you like to see your playlist? Y/N")
    val ans = readLine()

    if (ans == "Y" || ans == "y") {
        println("$playlist")

        println("Would you like to add some songs or remove some songs to your playlist: Add/Remove")
        val ans1 = readLine()
        if (ans1 == "Add" || ans1 == "add") {
            while (true) {
                println("Enter the name of a song to add to the playlist (or enter 'quit' to exit):")
                val song = readLine()

                if (song == "quit") {
                    break
                }

                playlist.add(song!!)
                println("'$song' has been added to the playlist.")
            }

            println("Your playlist contains ${playlist.size} songs:")
            playlist.forEach { println("- $it") }
        } else if (ans1 == "Remove" || ans1 == "remove") {
            while (true) {
                println("Enter a song you would like to remove (or enter 'quit' to exist):")
                val song1 = readLine()

                if (song1 == "quit") {
                    break
                }

                playlist.remove(song1!!)
                println("'$song1' has been remove")
            }
            println("Your playlist now contains ${playlist.size} songs: ")
            playlist.forEach { println("- $it") }

        }


    } else {
        println("Okay")
    }

}
