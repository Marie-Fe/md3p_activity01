package com.android.activity01_a
import java.time.LocalDate


fun main () {

    //Book
    val book1 = Book("The Great Gatsby", listOf(Author("Francis", "Fitzgerald", "Scott", "September 24, 1896")), 1925, 1, "978-0743273565", listOf(Publisher("Scribner", "1230 Avenue of the Americas, New York, NY 10020", 1846)), listOf("Chapter 1", "Chapter 2", "Chapter 3", "...", "Chapter 9"), 180)
    val book2 = Book("Murder on the Orient Express", listOf(Author("Agatha", "Christie", "Mary Clarissa", "September 15, 1890" )), 1934, 1, "978-0-06-207249-5 (current edition)", listOf(Publisher("Collins Crime Club (first edition)", "London, UK", 1930) ,Publisher("HarperCollins (current edition)", "195 Broadway, New York, NY 10007, USA", 1989)), listOf("Part 1", "Part 2", "Part 3", "..."), 256)
    val book3 = Book("The Da Vinci Code", listOf(Author("Dan", "Brown", null, "June 22, 1964")), 2003, 1, "978-0-385-50420-1", listOf(Publisher("Doubleday", "Garden City, Long Island, where its headquarters were located at 245 Park Avenue", 1897)), listOf("Chapter 1", "Chapter 2", "Chapter 3", "...", "Chapter 105"), 454)


    // Magazine
    val magazine1= Magazine("Adam Moss", "New York Magazine", "June", 2018, listOf(Article(
        "The Future of Work: How Technology is Changing the Way We Work and Live",
        "The future of work is changing rapidly, and technology is at the forefront of this transformation. From artificial intelligence to remote work, technology is shaping the way we work and live. As we move towards a more digital world, the nature of work is evolving, and workers must adapt to keep up.\n" +
                "\n" +
                "One of the most significant changes in the future of work is the rise of remote work. With advancements in technology, more and more companies are allowing their employees to work from home or anywhere in the world. Remote work offers greater flexibility and work-life balance, allowing workers to be more productive and happier.\n" +
                "\n" +
                "Artificial intelligence is also transforming the way we work. AI is already being used in industries such as healthcare and finance to automate repetitive tasks and increase efficiency. In the future, AI will become more sophisticated and could replace human workers in some jobs. While this could lead to job loss, it also presents opportunities for workers to reskill and move into new, higher-paying roles.\n" +
                "\n" +
                "Technology is also changing the way we learn and acquire new skills. Online education platforms such as Coursera and edX are democratizing education and making it more accessible to people around the world. Workers can now learn new skills and earn credentials without having to attend traditional universities.\n" +
                "\n" +
                "However, there are also challenges to the future of work. As technology advances, some jobs will become obsolete, and workers in those industries will need to reskill and adapt to stay relevant. Additionally, the rise of automation could exacerbate income inequality, as workers in low-skilled jobs are more likely to be replaced by machines.\n" +
                "\n" +
                "The future of work is exciting, but it is also uncertain. As we continue to embrace technology, we must also consider the impact it will have on workers and society as a whole. By investing in education and reskilling programs, we can ensure that workers are equipped with the skills they need to succeed in the digital economy.",
        listOf(Author("Sarah", "Kim", null, null)),
    )))
    val magazine2=  Magazine("Anna Wintour", "Vogue", "October", 2022, listOf(Article(
        "The Rise of Sustainable Fashion: How Brands are Embracing Eco-Friendly Practices",
        "In recent years, the fashion industry has faced growing scrutiny for its impact on the environment. From pollution to waste, the industry has been criticized for its unsustainable practices. However, there is a growing movement towards sustainable fashion, with more brands embracing eco-friendly practices.\n" +
                "\n" +
                "One of the key ways in which brands are becoming more sustainable is through the use of eco-friendly materials. Brands are experimenting with materials such as organic cotton, recycled polyester, and even pineapple leaves to create clothing that is both stylish and sustainable.\n" +
                "\n" +
                "In addition to using eco-friendly materials, brands are also taking steps to reduce waste. This includes using production techniques that minimize waste, such as zero-waste pattern cutting and up-cycling. Some brands are even creating closed-loop systems, where clothing can be recycled or repurposed at the end of its life cycle.\n" +
                "\n" +
                "Another aspect of sustainable fashion is ethical labor practices. Brands are beginning to take responsibility for the treatment of workers in their supply chains, ensuring fair wages and safe working conditions. This includes efforts to eradicate forced labor and child labor from the industry.\n" +
                "\n" +
                "Consumers are also playing a role in driving the sustainable fashion movement. With growing awareness of the environmental impact of the fashion industry, consumers are demanding more sustainable options. Brands that fail to embrace sustainable practices risk losing customers to those that do.\n" +
                "\n" +
                "The rise of sustainable fashion is a positive development for the industry and the environment. However, there is still much work to be done to make the industry truly sustainable. By continuing to innovate and push for change, brands can create a more responsible and eco-friendly fashion industry.",
        listOf(Author("Maya", "Singh", null, null)),
    )))
    val magazine3= Magazine("Edward Enninful", "British Vogue", "January", 2023, listOf(Article(
        "The Power of Sustainable Fashion: How Our Choices Can Make a Difference",
        "Sustainability has become a buzzword in the fashion industry, and for good reason. The impact of fast fashion on our planet is catastrophic, with billions of tonnes of clothing ending up in landfills every year. But it's not just the environment that's suffering; the human cost of our insatiable appetite for cheap, disposable fashion is equally concerning.\n" +
                "\n" +
                "Thankfully, there are plenty of brands and individuals who are championing a more sustainable approach to fashion. From up-cycling and recycling to using eco-friendly materials, there are a plethora of ways that we can make a difference with our fashion choices.\n" +
                "\n" +
                "One brand that's leading the way is Stella McCartney, who has been a vocal advocate of sustainable fashion for many years. Her brand uses innovative materials such as vegetarian leather, and her designs are all about longevity and timelessness rather than following fleeting trends.\n" +
                "\n" +
                "But it's not just high-end designers who are making a difference. Many independent brands and even high street retailers are starting to embrace sustainability, with H&M being a prime example. The brand has launched a Conscious collection made from recycled and organic materials, and has committed to becoming 100% circular and climate positive by 2030.\n" +
                "\n" +
                "As consumers, we also have a role to play. By choosing to buy from sustainable brands, and investing in quality pieces that will stand the test of time, we can reduce the demand for fast fashion and encourage more brands to adopt sustainable practices.\n" +
                "\n" +
                "It's important to remember that sustainability isn't just about the materials that clothing is made from. It's also about the conditions in which it's produced, and the impact that the production process has on the environment. This is why transparency is key; brands need to be honest about their practices and work towards greater transparency in order to build trust with their customers.\n" +
                "\n" +
                "In conclusion, sustainable fashion isn't just a passing trend; it's the future of the industry. By supporting sustainable brands and making conscious choices about the clothing we buy, we can all play a role in reducing the impact of fashion on our planet and its people.",
        listOf(Author("Sarah", "Johnson", null, null)),
    )))


    //Newspaper
    val newspaper1 = Newspaper(
            "Le Monde",
            "Saturday",
            "December",
            2021,
            "COVID-19: le gouvernement durcit les règles pour Noël",
            listOf(Article(
                "COVID-19: French Government Tightens Rules for Christmas",
                "As the holiday season approaches, the French government has announced new measures to combat the spread of COVID-19. With infection rates still high and concerns about a surge in cases after the holidays, the government is taking a cautious approach to Christmas celebrations.\n" +
                        "\n" +
                        "From December 15th, a curfew will be in place from 8pm to 6am, with exceptions for essential activities such as work and medical emergencies. This means that any gatherings or parties that would normally take place in the evening will be prohibited. The curfew will remain in place until at least January 20th.\n" +
                        "\n" +
                        "In addition to the curfew, the government has also announced restrictions on travel. Travel between regions will be banned from December 18th to January 4th, with exceptions for essential reasons such as work or family emergencies. Travel outside the country will also be limited, with a requirement for a negative COVID-19 test to be taken before departure and a quarantine period upon return.\n" +
                        "\n" +
                        "The government has emphasized the importance of following these rules to prevent a surge in cases over the holiday period. Health Minister Olivier Véran has warned that a third wave of the virus is possible if people do not take the necessary precautions.\n" +
                        "\n" +
                        "However, these new measures have been met with mixed reactions. Some people have expressed frustration at the limitations on their holiday plans, while others support the government's cautious approach. Businesses, especially in the hospitality industry, are also concerned about the impact of the restrictions on their operations.\n" +
                        "\n" +
                        "Despite the challenges, the French government is urging people to find new ways to celebrate the holidays safely. This could include virtual gatherings or outdoor activities that allow for social distancing. The government has also announced financial support for businesses that are affected by the restrictions.\n" +
                        "\n" +
                        "As the pandemic continues to evolve, the French government is emphasizing the importance of flexibility and adaptation. While the current restrictions may be difficult, they are necessary to protect public health and prevent a surge in cases over the holidays.",
                listOf(Author("Jeanne", "Dupont", null, null)),
            ))
        )
    val newspaper = Newspaper(
            "The Times of India",
            "Friday",
            "August",
            2022,
            "Indian Athletes Create History at Asian Games",
            listOf(Article(
                "Indian Athletes Create History at Asian Games",
                "Indian athletes have made history at the Asian Games, securing their highest ever medal tally at the event. With a total of 69 medals, including 15 gold, 24 silver, and 30 bronze, India finished in eighth place overall.\n" +
                        "\n" +
                        "The Indian contingent performed exceptionally well across a range of sports, with standout performances in athletics, wrestling, shooting, and badminton. In particular, the women's relay team won gold in the 4x400m event, while Vinesh Phogat made history by becoming the first Indian woman wrestler to win gold at the Asian Games.\n" +
                        "\n" +
                        "The success of Indian athletes at the Asian Games has been celebrated across the country, with many people expressing their pride and admiration for the team. The government has also recognized the achievements of the athletes, with Prime Minister Narendra Modi congratulating them on their performance.\n" +
                        "\n" +
                        "The success of Indian athletes at the Asian Games is a testament to the hard work and dedication of the athletes, as well as the support they have received from coaches, trainers, and the Indian Olympic Association. It is also a reflection of the growing importance of sports in India, with more and more young people taking up athletics, wrestling, and other sports.\n" +
                        "\n" +
                        "However, there are also concerns about the lack of investment and infrastructure for sports in India, as well as the need for greater support for athletes from marginalized communities. The success of Indian athletes at the Asian Games should serve as a reminder of the potential that exists in India for sports, and the need for greater investment and support to ensure that Indian athletes can compete at the highest level.\n" +
                        "\n" +
                        "As the Indian athletes return home from the Asian Games, they will be celebrated as heroes and role models for the next generation of Indian athletes. Their achievements have shown that with hard work, determination, and support, anything is possible.",
                listOf(Author("Rajesh", "Kumar", null, null)),
            ))
        )

    val newspaper3=  Newspaper(
            "The New York Times",
            "Sunday",
            "March",
            2022,
            "Biden Administration Announces Major Infrastructure Plan",
            listOf(Article(
                "Biden Administration Announces Major Infrastructure Plan",
                "The Biden administration has announced a major infrastructure plan that would invest more than \$2 trillion in upgrading the country's roads, bridges, airports, and public transportation systems. The proposal, known as the American Jobs Plan, is designed to create millions of jobs, boost economic growth, and address long-standing infrastructure challenges.\n" +
                        "\n" +
                        "The plan includes a range of initiatives, including investments in electric vehicles, renewable energy, broadband internet access, and affordable housing. It also includes funding for research and development in areas such as artificial intelligence, biotechnology, and climate change.\n" +
                        "\n" +
                        "President Biden has described the plan as a once-in-a-generation opportunity to transform the country's infrastructure and tackle some of its most pressing challenges. In a speech announcing the plan, he emphasized the need to invest in America's future and create a more equitable and sustainable economy.\n" +
                        "\n" +
                        "The plan has been welcomed by many Democrats, who see it as a bold and necessary step to address the country's infrastructure needs. However, it has also been met with criticism from Republicans, who have raised concerns about the cost and the potential impact on the national debt.\n" +
                        "\n" +
                        "The American Jobs Plan is part of a broader agenda by the Biden administration to invest in the country's future and address a range of challenges, including climate change, racial inequality, and economic inequality. The plan is also part of a larger effort to reshape the role of government in American society, by investing in public goods and services and expanding the social safety net.\n" +
                        "\n" +
                        "As the plan moves forward, it is likely to face significant challenges in Congress, where Democrats hold a narrow majority in the House of Representatives and an evenly split Senate. However, President Biden has emphasized the need for bipartisanship and has called on Congress to work together to pass the plan.\n" +
                        "\n" +
                        "The American Jobs Plan is a major initiative by the Biden administration and represents a significant investment in the country's future. It remains to be seen whether it will be successful in Congress, but it has already sparked an important debate about the role of government in addressing the country's most pressing challenges.",
                listOf(Author("Katie", "Rogers", null, null)),
            ))
        )


    //Comics
    val comic1 = Comics("Dragon Ball", "December", 1984, listOf(Illustrator("Akira", "Toriyama", null, "April 5, 1955")), listOf(Publisher("Shueisha", "2-5-10 Hitotsubashi, Chiyoda-ku, Tokyo 101-8050, Japan", 1925)))
    val comic2 = Comics("One Piece", "July", 1997, listOf(Illustrator("Eiichiro", "Oda", null, "January 1, 1975")), listOf(Publisher("Shueisha", "2-5-10 Hitotsubashi, Chiyoda-ku, Tokyo 101-8050, Japan", 1925)))
    val comic3 = Comics("Attack on Titan", "September", 2009, listOf(Illustrator("Hajime", "Isayama", null, "August 29, 1986")), listOf(Publisher("Kodansha", "2-12-21 Otowa, Bunkyo-ku, Tokyo 112-8001, Japan", 1909)))
    val comic4 = Comics("Death Note", "December", 2003, listOf(Illustrator("Tsugumi", "Ohba", null, null), Illustrator("Takeshi", "Obata", null, "February 11, 1969")), listOf(Publisher("Shueisha", "2-5-10 Hitotsubashi, Chiyoda-ku, Tokyo 101-8050, Japan", 1925)))



    //avr
    val publisher8 =
        Publisher("Tech Insider ", "1 Liberty Plaza, 8th Floor New York, NY 10006", 2015)
    val publish7 = listOf(publisher8)

    val publisher9 = Publisher(
        "The New York Public Library",
        "Stephen A. Schwarzman Building 476 Fifth Avenue New York, NY 10018",
        1895
    )
    val publish8 = listOf(publisher9)

    val publisher10 = Publisher("TEDx Talks", "330 Hudson St, 11th Floor New York, NY 10013", 2009)
    val publish9 = listOf(publisher10)

    val publisher11 = Publisher(
        "The Green Energy Podcast",
        "240 Chestnut Street, Suite 101 Providence, RI 02903",
        2018
    )
    val publish10 = listOf(publisher11)

    val avrs = listOf(
        AudioVideoRecording(
            title = "How to Start a Successful YouTube Channel",
            publisher = publish7,
            length = 30,
            dateRecorded = LocalDate.of(2021, 1, 17)
        ),
        AudioVideoRecording(
            title = "A Conversation with the Author of 'The Vanishing Half",
            publisher = publish8,
            length = 90,
            dateRecorded = LocalDate.of(2020, 12, 3)
        ),
        AudioVideoRecording(
            title = "The Power of Mindfulness",
            publisher = publish9,
            length = 12,
            dateRecorded = LocalDate.of(2021, 5, 23)
        ),
        AudioVideoRecording(
            title = "The Future of Renewable Energy",
            publisher = publish10,
            length = 45,
            dateRecorded = LocalDate.of(2022, 3, 15)
        )
    )

    println("Search for Title or Author? 1 = Title / 2 = Author/ 3 = No")
    val searchOption = readLine()?.toInt()
    if (searchOption == 1) {
        println("Search Title: ")
        val search = readLine()
        val publications = listOf(magazine1, magazine2, magazine3, newspaper1, newspaper, newspaper3, comic1, comic2, comic3, comic4)
        val matches = search?.let { searchTitle(it, publications) }
        if (matches?.isNotEmpty()!!) {
            for (publication in matches) {
                when (publication) {
                    is Magazine -> println("Found magazine: ${publication.title}" +
                            " Editor: ${publication.editor}" +
                            " Editor: ${publication.title}" +
                            " Month Published: ${publication.monthPublished}" +
                            " Year Published: ${publication.yearPublished}" +
                            " Article: ${publication.articles}")
                    is Newspaper -> println("Found newspaper: ${publication.headline} " +
                            " Name: ${publication.name}" +
                            " Day Published: ${publication.dayPublished}" +
                            " Month Published: ${publication.monthPublished}" +
                            " Year Published: ${publication.yearPublished}" +
                            " Headline: ${publication.headline}" +
                            " Article: ${publication.articles}")
                    is Comics -> println("Found comic: ${publication.title}, " +
                            " Month Published: ${publication.monthPublished}, " +
                            " Year Published: ${publication.yearPublished}, " +
                            " Illustrator/s: ${publication.illustrators}," +
                            " Publisher: ${publication.publisher}")
                }
            }
        } else {
            println("No matches found for \"$search\"")
        }

    } else if (searchOption == 2) {
        val firstName = readLine()?.trim() ?: ""
        val lastName = readLine()?.trim() ?: ""
        val middleName = readLine()?.trim() ?: ""
        val dateOfBirth = readLine()?.trim() ?: ""
        val author = Author(firstName, lastName, middleName, dateOfBirth)
        val publications = listOf(book1, book2, book3, magazine1, magazine2, magazine3, newspaper, newspaper1, newspaper3, comic1, comic2, comic3)

        val titles = getPublicationsByAuthor(author, publications)
        println(titles)
    }

    else if (searchOption == 3) {
        println("Okay.")
    }
}


fun searchTitle(title: String, publications: List<Any>): List<Any> {
    val matches = mutableListOf<Any>()
    for (publication in publications) {
        when (publication) {
            is Magazine -> if (publication.title.equals(title, ignoreCase = true)) matches.add(publication)
            is Newspaper -> if (publication.headline.equals(title, ignoreCase = true)) matches.add(publication)
            is Comics -> if (publication.title.equals(title, ignoreCase = true)) matches.add(publication)
        }
    }
    return matches
}



fun getPublicationsByAuthor(author: Author, publications: List<Any>): List<String> {
    val titles = mutableListOf<String>()
    for (publication in publications) {
        when (publication) {
            is Book -> if (publication.authors.equals("${author.firstName} ${author.lastName}")) {
                titles.add(publication.toString())
            }
            is Magazine -> if ("${author.firstName} ${author.lastName}" == publication.editor) {
                titles.add(publication.title)
            }
            is Newspaper -> for (article in publication.articles) {
                if (article.author.equals( "${author.firstName} ${author.lastName}")) {
                    titles.add("${publication.name} - ${article.title}")
                }
            }
            is Comics -> for (illustrator in publication.illustrators) {
                if (illustrator.equals( "${author.firstName} ${author.lastName}")) {
                    titles.add(publication.title)
                }
            }
        }
    }
    return titles
}


/*
fun getPublicationsByAuthor(author: Author, publications: List<Publication>): List<String> {
    val titles = mutableListOf<String>()
    for (publication in publications) {
        if (publication is Book && author in publication.authors) {
            titles.add(publication.title)
        } else if (publication is Magazine && author.equals(publication.editor)) {
            titles.add(publication.title)
        } else if (publication is Newspaper) {
            for (article in publication.articles) {
                if (author in article.author) {
                    titles.add(publication.name + " - " + article.title)
                }
            }
        } else if (publication is Comics) {
            for (illustrator in publication.illustrators) {
                if (author.equals(illustrator)) {
                    titles.add(publication.title)
                }
            }
        }
    }
    return titles
}

*/