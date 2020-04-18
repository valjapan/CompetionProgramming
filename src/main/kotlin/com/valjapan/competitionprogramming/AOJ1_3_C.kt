package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if (x == 0 && y == 0) return
        if (x < y) println("$x $y")
        else println("$y $x")
    }
}
