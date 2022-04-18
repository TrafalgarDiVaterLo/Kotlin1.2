fun main() {
    val likes = 1000

    if (likes == 0) println("Лайков нет")
    else if (likes == 11 || likes % 100 == 11) println("Понравилось $likes людям")
    else if (likes == 1 || likes % 10 == 1) println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")
}