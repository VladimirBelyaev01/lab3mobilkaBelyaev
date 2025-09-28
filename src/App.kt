fun main() {
    /*println("Введите уровень:")
    val a = readln().toInt()
    if (a<10) {
        println("Новичок! Вы получаете +10 НР.")
    }
    else if (a in 10 until  50){
        println("Опытный! Вы получаете +30 НР.")
    }
    else print("Легенда! Вы получаете +100НР.")*/

    //N2:
    /*
    println("Введи возраст: ")
    val age = readln().toInt()
    if (age<12){
        println("Вы ребёнок")
    }
    else if ( age in 12 until 17){
        println("Вы подросток")
    }
    else{
        println("Вы взрослый")*/

//N3:
   /* println("Введите число от 1 до 100")
    val a = readln().toInt()
    if (a in 1..100){
        if (a in 10..50) {
            println("Входит в диапозон")
        }
    else{
        print("Не входит")
        }
    }*/

    //N4:
    /*
    println("Введите:")
    val a: Char = readln().first()
    when {
        a in 'a'..'z' || a in 'A'..'Z' -> println("Эт буква")
        a in '0'..'9' -> println("Эт цифра")
        a == ' ' -> println("Эт пробел")
        else -> println("Эт спецсимвол")
    }*/

    //N5:
/*
    println("Табл. умножения на 5: ")
    var chet=1
    repeat(10){
        println("5 x $chet = ${5*chet}")
        chet++
    }*/

    //N6:

    /*val films = listOf("Воронины","Интерны","Дюна"," Бруталист "," Субстанция")
    println("Список:")
    for(i in films){
        println(i)
    }
    println("Длина  назв.фильма:")
    for ( i in films){
        println("фильм $i  его длина ${i.length}")
    }*/

    //N7:

    println("Ваше имя: ")
    val a = readln()
    println("Введите возраст: ")
    val age = readln().toInt()
    println("Введите любимый цвет: ")
    val col = readln()
    println("Привет,$a! Тебе $age год, и ты любишь $col.")

}