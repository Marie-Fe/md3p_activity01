package com.android.activity01_a

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")
fun main() {

    val students = listOf(
        Student("Mary", "Bob", "Mar", 12345, 2021),
        Student("Joy", "Lim", "JJ", 13456, 2021),
        Student("Bea", "Sy", "Bea", 14567, 2020),
        Student("Jhunie", "Abasa", "Jhun", 15678, 2021),
        Student("Mark", "Lani", "Mark", 16789, 2021),
        Student("Lester", "Hamoy", "Les", 17890, 2020),
    )

    println("Search student: ")
    val search = readLine()

    val matchingStudent = searchStudentWildSearch(students, "$search")
    println(matchingStudent)
    val matchingStudents = searchStudentWildSearch(students, "$search", "lastname")
    println(matchingStudents)
}

fun searchStudentWildSearch(students: List<Student>, searchStr: String): ArrayList<Student> {
    val matchingStudent = ArrayList<Student>()
    for (student in students) {
        if (student.firstName.contains(
                searchStr,
                ignoreCase = true
            ) || student.nickName.contains(
                searchStr,
                ignoreCase = true
            ) || student.lastName.contains(searchStr, ignoreCase = true)
        ) {
            matchingStudent.add(student)
        }
    }
    return matchingStudent
}

fun searchStudentWildSearch(students: List<Student>, searchStr: String, searchBy: String): ArrayList<Student> {
    val matchingStudents = ArrayList<Student>()
    for (student in students) {
        when (searchBy) {
            "lastName" -> {
                if (student.lastName.contains(searchStr, ignoreCase = true)) {
                    matchingStudents.add(student)
                }
            }
            "middleName" -> {
                if (student.firstName?.contains(searchStr, ignoreCase = true) == true) {
                    matchingStudents.add(student)
                }
            }
            "nickName" -> {
                if (student.nickName.contains(searchStr, ignoreCase = true)) {
                    matchingStudents.add(student)
                }
            }
        }
    }
    return matchingStudents
}
