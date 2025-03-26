// 2. Палиндром
fun isPalindrome(word: String): Boolean {
    return word == word.reversed()
}
fun main() {
    println("Введите слово:")
    val word = readLine() ?: return

    if (isPalindrome(word)) {
        println("$word является палиндромом")
    } else {
        println("$word не является палиндромом")
    }
}

