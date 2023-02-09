package com.android.activity01_a


fun main() {

    // for list of students
    var students = listOf(
        "Alexander Chou",
        "Vic Recopuerto Amable",
        "John Chris Bolan",
        "Aziza Villanueva San Buenaventura",
        "andrew bustos",
        "Condino Mark Andrei",
        "Laurence De Dios",
        "Jerome Elenzano",
        "Noven Rey M. Gumnad",
        "Hanz Bradford Jaramillo",
        "Junzon Velasco",
        "ZR Lopez",
        "Victor Paolo Luzares",
        "Ryan Malacao",
        "Phil Seong Manabat",
        "Ray Andrew Manila",
        "Dad Ivan Navidad",
        "Marie Fe Y. Dela Peña",
        "Arthur Aldrin Ramos",
        "Emmanuel De Los Reyes",
        "Gretchen Roque",
        "Rey Brezuela Saliot",
        "Jeffrey Saltiga",
        "Rene Galo Tajos",
        "MARK TALIMAN",
        "Jother John Tirador",
        "Joe Mari Pasicolan Ubay",
        "Vince Melmar Ybañez",
        "Raffy Yalung"
    )
    println("Students of MD3P:")
    for (x in students) {
        println(x)
    }

    //Update in the class
    println("Any updates regarding the class? Y or N:")
    val update = readLine()
    //Answerable by string Y and N (not a char)
    val y = "Y"
    val n = "N"
    if (update == y) {
        println("Update: ")
        var up = readLine()
        println(up)
    } else if (update == n) {
        println("None")
    }

    println("Name: ")
    var progress = readLine()
    println("Rate progress of student from 1 - 5:")
    var prorate = readLine()!!.toInt()
    if (prorate <= 2) {
        println("The student $progress has a slow progress in the class, need to catch up.")
    } else if (prorate >= 3) {
        println("The student $progress is active and passed.")
    }




  /*   //Nwwithin the [] is an index within 0-
     println("Progress of $students[3]: ")
     var progress = readLine()
     println("Student $students[Any?] $progress")
 */

}