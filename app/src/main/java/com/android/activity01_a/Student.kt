package com.android.activity01_a


class Student (val firstName: String,
               val lastName: String,
               val nickName: String,
               val id: Int,
               val yearEnrolled: Int) {

    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName', nickName='$nickName', id=$id, yearEnrolled=$yearEnrolled)"
    }
}

