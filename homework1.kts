fun main() {
    //1
    val array = arrayOf(1, 2, 3, 4, 5)
    val list = listOf("apple", "banana", "cherry")
    println("Array: ${array.joinToString()}, List: ${list.joinToString()}")

    //2
    var str = "Hello, "
    str += "world!"
    val substring = str.substring(0, 5)
    val upperCase = str.toUpperCase()
    println("Modified String: $str, Substring: $substring, Uppercase: $upperCase")

    // 3
    val map = mapOf("Name" to "John", "Age" to 30)
    for ((key, value) in map) {
        println("$key: $value")
    }

    // 4
    fun checkNumber(num: Int): String {
        return when {
            num > 0 -> "Positive"
            num < 0 -> "Negative"
            else -> "Zero"
        }
    }

    val numbersToCheck = listOf(5, -2, 0)
    for (num in numbersToCheck) {
        val result = checkNumber(num)
        println("$num is $result")
    }

    // 5
    print("Enter your name: ")
    val name = readLine()
    print("Enter your age: ")
    val age = readLine()?.toInt()

    if (name != null && age != null) {
        println("Hello, $name! You are $age years old.")
        when {
            age < 18 -> println("You are a child.")
            age in 18..64 -> println("You are an adult.")
            else -> println("You are a senior.")
        }
    } else {
        println("Invalid input.")
    }

    // 6
    fun divide(a: Double, b: Double): Double? {
        return if (b != 0.0) a / b else null
    }

    val result = divide(10.0, 2.0)
    val errorMessage = "Division by zero is not allowed."
    if (result != null) {
        println("Result of division: $result")
    } else {
        println(errorMessage)
    }

    // 7
    val currentDateTime = java.time.LocalDateTime.now()
    val formattedDateTime = currentDateTime.toString()
    println("Current Date and Time: $formattedDateTime")

    // 8
    data class Person(val name: String, val age: Int)
    val person = Person("Alice", 25)
    println("Person's Name: ${person.name}, Age: ${person.age}")

    // 9
    fun getLifeStage(age: Int): String {
        return when {
            age < 13 -> "Child"
            age in 13..19 -> "Teenager"
            else -> "Adult"
        }
    }

    val lifeStage = getLifeStage(person.age)
    println("Life Stage: $lifeStage")

    // 10
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers: ${evenNumbers.joinToString()}")
}