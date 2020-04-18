package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for (x in a..b) {
        if (c % x == 0) {
            count += 1
        }
    }
    println(count)
}