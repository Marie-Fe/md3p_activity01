package com.android.activity01_a

import java.time.LocalDate


class Book (
    val title: String,
    val authors: List<Author>,
    val yearPublished: Int,
    val edition: Int,
    val isbn: String,
    val publisher: List<Publisher>,
    val chapters: List<String>,
    val numPages: Int
) : Publication()
{
    override fun toString(): String {
        return "Book(title='$title', authors=$authors, yearPublished=$yearPublished, edition=$edition, isbn='$isbn', publisher=$publisher, chapters=$chapters, numPages=$numPages)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        if (title != other.title) return false
        if (authors != other.authors) return false
        if (yearPublished != other.yearPublished) return false
        if (edition != other.edition) return false
        if (isbn != other.isbn) return false
        if (publisher != other.publisher) return false
        if (chapters != other.chapters) return false
        if (numPages != other.numPages) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + authors.hashCode()
        result = 31 * result + yearPublished
        result = 31 * result + edition
        result = 31 * result + isbn.hashCode()
        result = 31 * result + publisher.hashCode()
        result = 31 * result + chapters.hashCode()
        result = 31 * result + numPages
        return result
    }

}

class Magazine(
    val editor: String,
    val title: String,
    val monthPublished: String,
    val yearPublished: Int,
    val articles: List<Article>
) :Publication()
{
    override fun toString(): String {
        return "Magazine(editor='$editor', title='$title', monthPublished='$monthPublished', yearPublished=$yearPublished, articles=$articles)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Magazine

        if (editor != other.editor) return false
        if (title != other.title) return false
        if (monthPublished != other.monthPublished) return false
        if (yearPublished != other.yearPublished) return false
        if (articles != other.articles) return false

        return true
    }

    override fun hashCode(): Int {
        var result = editor.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + monthPublished.hashCode()
        result = 31 * result + yearPublished
        result = 31 * result + articles.hashCode()
        return result
    }

}

class Newspaper(
    val name: String,
    val dayPublished: String,
    val monthPublished: String,
    val yearPublished: Int,
    val headline: String,
    val articles: List<Article>
) :Publication()
{
    override fun toString(): String {
        return "Newspaper(name='$name', dayPublished='$dayPublished', monthPublished='$monthPublished', yearPublished=$yearPublished, headline='$headline', articles=$articles)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Newspaper

        if (name != other.name) return false
        if (dayPublished != other.dayPublished) return false
        if (monthPublished != other.monthPublished) return false
        if (yearPublished != other.yearPublished) return false
        if (headline != other.headline) return false
        if (articles != other.articles) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + dayPublished.hashCode()
        result = 31 * result + monthPublished.hashCode()
        result = 31 * result + yearPublished
        result = 31 * result + headline.hashCode()
        result = 31 * result + articles.hashCode()
        return result
    }

}

data class Author(
     val firstName: String?,
     val lastName: String,
     val middleName: String?,
     val dateOfBirth: String?,

    ) :Publication() {
    override fun toString(): String {
        return "Author(firstName='$firstName', lastName='$lastName', middleName=$middleName, dateOfBirth=$dateOfBirth)"
    }

}

class Comics(
    val title: String,
    val monthPublished: String,
    val yearPublished: Int,
    val illustrators: List<Illustrator>,
    val publisher: List<Publisher>
) :Publication()
{
    override fun toString(): String {
        return "Comics(title='$title', monthPublished='$monthPublished', yearPublished=$yearPublished, illustrators=$illustrators, publisher=$publisher)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comics

        if (title != other.title) return false
        if (monthPublished != other.monthPublished) return false
        if (yearPublished != other.yearPublished) return false
        if (illustrators != other.illustrators) return false
        if (publisher != other.publisher) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + monthPublished.hashCode()
        result = 31 * result + yearPublished
        result = 31 * result + illustrators.hashCode()
        result = 31 * result + publisher.hashCode()
        return result
    }


}
class Illustrator(
    val firstName: String,
    val lastName: String,
    val middleName: String?,
    val dateOfBirth: String?,
)
{
    override fun toString(): String {
        return "Illustrator(firstName='$firstName', lastName='$lastName', middleName=$middleName, dateOfBirth=$dateOfBirth)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Illustrator

        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false
        if (middleName != other.middleName) return false
        if (dateOfBirth != other.dateOfBirth) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + (middleName?.hashCode() ?: 0)
        result = 31 * result + (dateOfBirth?.hashCode() ?: 0)
        return result
    }

}

class Article(
    val title: String,
    val content: String,
    val author: List<Author>,
) :Publication()
{
    override fun toString(): String {
        return "Article(title='$title', content='$content', author=$author)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Article

        if (title != other.title) return false
        if (content != other.content) return false
        if (author != other.author) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + content.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }
}

class AudioVideoRecording(
    val title: String,
    val publisher: List<Publisher>,
    val length: Int,
    val dateRecorded: LocalDate,
)
{
    override fun toString(): String {
        return "AudioVideoRecording(title='$title', publisher=$publisher, length=$length, dateRecorded=$dateRecorded)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AudioVideoRecording

        if (title != other.title) return false
        if (publisher != other.publisher) return false
        if (length != other.length) return false
        if (dateRecorded != other.dateRecorded) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + publisher.hashCode()
        result = 31 * result + length
        result = 31 * result + dateRecorded.hashCode()
        return result
    }

}
class Publisher(
    val name: String,
    val address: String,
    val dateEstablished: Int
) :Publication()
{
    override fun toString(): String {
        return "Publisher(name='$name', address='$address', dateEstablished=$dateEstablished)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Publisher

        if (name != other.name) return false
        if (address != other.address) return false
        if (dateEstablished != other.dateEstablished) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + address.hashCode()
        result = 31 * result + dateEstablished
        return result
    }

}

open class Publication {

    override fun toString(): String {
        return "Publication()"
    }


    }





