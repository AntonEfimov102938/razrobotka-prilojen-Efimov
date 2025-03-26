// 6. 21
fun playBlackjack() {
    val deck = mutableListOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11)
    deck.shuffle()
    var playerScore = 0
    var dealerScore = 0
    playerScore += deck.removeAt(0)
    playerScore += deck.removeAt(0)
    dealerScore += deck.removeAt(0)
    dealerScore += deck.removeAt(0)
    println("Ваши карты: $playerScore")
    println("Карты дилера: $dealerScore")
    while (playerScore < 21) {
        println("Хотите взять еще карту? (да/нет)")
        val choice = readLine() ?: return
        if (choice.equals("да", ignoreCase = true)) {
            playerScore += deck.removeAt(0)
            println("Ваши карты: $playerScore")
        } else {
            break
        }
    }
    while (dealerScore < 17) {
        dealerScore += deck.removeAt(0)
    }
    println("Ваши карты: $playerScore")
    println("Карты дилера: $dealerScore")
    when {
        playerScore > 21 -> println("Вы проиграли")
        dealerScore > 21 -> println("Вы выиграли")
        playerScore > dealerScore -> println("Вы выиграли")
        playerScore < dealerScore -> println("Вы проиграли")
        else -> println("Ничья")
    }
}
fun main() {
    playBlackjack()
}
