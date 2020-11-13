fun main() {
    println("Кол-во сек.: ")
    var input = readLine()
    val time = input!!.toInt()

    when (time){
        in 0..59 -> println("меньше минуты назад")
        in 0..3600 -> oneHour(time)
        in 3600..7199 -> println("час назад")
        in 7200..10799 -> println("2 часа назад")
        in 10800..86399 -> println("несколько часов назад")
        in 86400..604799 -> oneDay(time)
        in 604800..2678399 -> oneWeek(time)
        in 2678400..31622399 -> oneMonth(time)
        in 31622399..157679999 -> oneYear(time)
        in 157680000..Int.MAX_VALUE -> println("несколько лет назад")
        else -> println("Неверные данные")
    }
}

fun oneHour(sec:Int){
    val time = ( sec / 60 )
    println("$time минут назад")
}

fun oneDay(sec:Int){
    val time = ( sec / 60 / 60 / 24 )
    println("$time дней назад")
}

fun oneWeek(sec:Int){
    val time = ( sec / 60 / 60 / 24 / 7 )
    println("$time недель назад")
}

fun oneMonth(sec:Int){
    val time = ( sec / 60 / 60 / 24 / 30 )
    println("$time месяц назад")
}

fun oneYear(sec:Int){
    val time = ( sec / 60 / 60 / 24 / 30 / 12 )
    println("$time лет назад")
}