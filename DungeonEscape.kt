import kotlin.random.Random

/*fun main() {
    var lvl = 0
    println("Вы в подземелье")
    while (lvl < 5) {
        println("Вы на уровне $lvl.")
        println("Выбирай действие: 1 - Вперед, 2 - Осмотреться, 0 - Сдаться")

        val input = readLine()
        when (input) {
            "1" -> {
                lvl++
                println("Переход на уровень $lvl")
            }
            "2" -> {
                println("Вы осмотрелись. Тут ничего нет")
                continue
            }
            "0" -> {
                println("Ты сдался, лузер")
                break
            }
            else -> {
                println("Неверный ввод")
                continue
            }
        }

        if (lvl == 5) {
            println("Ты выбрался из подземелья, молодец!")
        }
    }
}*/

//fun main() {
    /*var num: Int
    do{
        print("Введи число больше 10: ")
        num = readln().toInt()
    }while (num <=10)
    println("Спасибо, вы ввели $num.")
*/

    /* var password: String?
    do{
        print("Введи пароль:")
        password = readln()

    } while (password != "qwerty")
    println("Доступ разрешен")
*/


    /*fun main() {
        /*for ( i in 1 .. 5){
            println("Shag $i")
        }
        val fruits = listOf("apple","banana","cherry")
        for (fruit in fruits){
            println("Frykt:$fruit")
        }*/
    }*/

    /*fun main() {
        val sentence = "Kotlin is awesome"
        val words = sentence.split(delimiters = " ")
        for (word in words) {
            println(word)
        }
    }*/
/*
    fun main() {
        print("Введи числа через пробел: ")
        val input = readln()
        val numbers = input.split(" ")
        var sum = 0
        for (number in numbers) {
            sum += number.toInt()
        }
        println("Сумма чисел: $sum")
    }
}*/
/*fun main()
{
    print("Введите 1-е число, знак операции и 2-е число через пробел: ")
    val input = readln().split(" ")
    val symbol = input [1]
    val firstNumber = input[0].toDouble()
    val secondNumber = input[2].toDouble()
    var result = 0.0
    when (symbol){
        "/" ->  result = firstNumber / secondNumber
        "*" -> result = firstNumber * secondNumber
        "+" ->  result =firstNumber + secondNumber
        "-" ->  result =firstNumber - secondNumber
        else -> println("Некорректный ввод")
    }
    println("$firstNumber $symbol $secondNumber = $result")
}*/

/*import kotlin.random.Random
fun  main() {
    println(Random.nextInt())
    println(Random.nextLong())
    println(Random.nextFloat())
    println(Random.nextDouble())
    Random.nextInt(until=100)
    Random.nextInt(from =1, until = 100)
    Random.nextLong(until = 100)
    Random.nextLong(from = 1, until = 100)
    Random.nextDouble(until=5.0)
    Random.nextDouble(from = 0.0, until=5.0)

}*/

/*import kotlin.random.Random
fun main() {
    val target = Random.nextInt(from = 1, until = 101)
    println("Угадай число от 1 до 100")

    while (true) {
        print("Введи число: ")
        val input = readln().toInt()
        when {
            input < target -> println("Загаданное число больше.")
            input > target -> println("Загаданное число меньше.")
            else -> {
                println("Поздравляю. Ты угадал число $target")
                break
            }
        }
    }
}*/

/*
fun main(){
    val dice1=Random.nextInt(from=1,until=7)
    val dice2= Random.nextInt(from=1, until=7)
    val sum = dice1+dice2
    println("первый кубик $dice1")
    println("второй кубик $dice2")
    println("Cymma: $sum")
    val num1=Random.nextDouble(from = 0.0, until = 10.0)
    val num2=Random.nextDouble(from = 0.0, until = 10.0)
    val num3=Random.nextDouble(from = 0.0, until = 10.0)
    val sred = (num1+num2+num3)/3.0
    println("Числа $num1 , $num2 , $num3")
    println("Среднее $sred")
}*/
