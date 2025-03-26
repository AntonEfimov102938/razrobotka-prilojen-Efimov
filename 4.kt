// 4. Самое маленькое число в списке
fun findMinNumber(numbers: List<Int>): Int? {
    return numbers.minOrNull()
}
fun main() {
    println("Введите список чисел через пробел:")
    val input = readLine() ?: return
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }
    val minNumber = findMinNumber(numbers)
    if (minNumber != null) {
        println("Самое маленькое число: $minNumber")
    } else {
        println("Список пуст или содержит нечисловые значения")
    }
}
