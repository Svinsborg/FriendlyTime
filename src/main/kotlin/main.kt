fun main() {
    println("Кол-во сек.: ")
    val input = readLine()
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
        in 157680000..Int.MAX_VALUE -> println("A long time ago, in a galaxy far, far away…")
        else -> println("Неверные данные")
    }
}

fun oneHour(sec:Int){
    val time = ( sec / 60 )
    val lastСharacter = time%10
        if(time in 5..20){
            println("$time минут назад")
        } else {
            if (lastСharacter == 1 ) {
                println("$time минуту назад")
            } else if (lastСharacter in 5..9 || lastСharacter == 0) {
                println("$time минут назад")
            } else{
                println("$time минуты назад")
            }
        }
}

fun oneDay(sec:Int){
    val time = ( sec / 60 / 60 / 24 )
    println("$time дней назад")
}

fun oneWeek(sec:Int){
    when (val time = ( sec / 60 / 60 / 24 / 7 )) {
        1 -> {
            println("$time неделю назад")
        }
        in 2..4 -> {
            println("$time недели назад")
        }
        else -> {
            println("$time недель назад")
        }
    }
}

fun oneMonth(sec:Int){
    when (val time = ( sec / 60 / 60 / 24 / 30 )) {
        in 2..4 -> {
            println("$time месяца назад")
        }
        in 5..12 -> {
            println("$time месяцев назад")
        }
        else -> {
            println("$time месяц назад")
        }
    }
}

fun oneYear(sec:Int){
    when (val time = ( sec / 60 / 60 / 24 / 30 / 12 )) {
        1 -> {
            println("$time год назад")
        }
        in 2..4 -> {
            println("$time года назад")
        }
        else -> {
            println("$time лет назад")
        }
    }
}