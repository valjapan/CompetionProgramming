package com.valjapan.competitionprogramming

fun main(args: Array<String>) {
    val (daysInYear, daysInMonth, daysInWeek, date) = readLine()!!.split(" ")
    val (dateInYear, dateInMonth, dateInDay) = date.split("-").map(String::toInt)
    val alpha = mutableListOf(
        "A",
        "B",
        "C",
        "D",
        "E",
        "F",
        "G",
        "H",
        "I",
        "J",
        "K",
        "L",
        "M",
        "N",
        "O",
        "P",
        "Q",
        "R",
        "S",
        "T",
        "U",
        "V",
        "W",
        "X",
        "Y",
        "Z"
    )
//    val leapMonth = dateInYear * remainderInYear

    if (daysInMonth.toInt() < dateInDay) {
        error()
        return
    }
    if (daysInMonth.toInt() >= 100) {
        error()
        return
    }
    if (daysInYear.toInt() / daysInMonth.toInt() >= 100) {
        error()
        return
    }


    val remainderInYear: Int = daysInYear.toInt() % daysInMonth.toInt()
    if (remainderInYear == 0) {
        val weekNumber = dateInDay % daysInWeek.toInt()
        if (weekNumber == 0) {
            println(alpha[dateInDay - 1])
        } else {
            println(alpha[weekNumber - 1])
        }
        return
    } else if (dateInYear == 1) {
        val weekNumber = dateInDay % daysInWeek.toInt()
        if (weekNumber == 0) {
            println(alpha[dateInDay - 1])
        } else {
            println(alpha[weekNumber - 1])
        }
        return
    } else {
        val day =
            dateInYear * daysInYear.toInt() +
                    dateInMonth * daysInMonth.toInt() +
                    dateInDay
        println(alpha[day % daysInWeek.toInt()])
    }
}

fun error() {
    println("-1")
}
