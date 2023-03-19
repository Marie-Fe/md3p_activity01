package com.android.activity01_a


class Student (val firstName: String,
               val lastName: String,
               val nickName: String,
               val id: Int,
               val yearEnrolled: Int) {

    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName', nickName='$nickName', id=$id, yearEnrolled=$yearEnrolled)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false
        if (nickName != other.nickName) return false
        if (id != other.id) return false
        if (yearEnrolled != other.yearEnrolled) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + nickName.hashCode()
        result = 31 * result + id
        result = 31 * result + yearEnrolled
        return result
    }

}

