package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    when {
        a < b -> println("a < b")
        a > b -> println("a > b")
        a == b -> println("a == b")
    }
}
