fun main() {
 // 1. Калькулятор
    println("Введите первое число:")
    val num1 = readLine()?.toDoubleOrNull() ?: return
    println("Введите оператор (+, -, *, /):")
    val operator = readLine()
    println("Введите второе число:")
    val num2 = readLine()?.toDoubleOrNull() ?: return
    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            println("Неверный оператор")
            return
        }
    }
    println("Результат: $result")
}

