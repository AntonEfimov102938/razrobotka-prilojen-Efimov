// 3. Очки команды
fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws * 1 + losses * 0
}
fun main() {
    println("Введите количество побед:")
    val wins = readLine()?.toIntOrNull() ?: return

    println("Введите количество ничьих:")
    val draws = readLine()?.toIntOrNull() ?: return

    println("Введите количество поражений:")
    val losses = readLine()?.toIntOrNull() ?: return

    val points = calculatePoints(wins, draws, losses)
    println("Команда набрала $points очков")
}
