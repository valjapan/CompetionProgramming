package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (w, h, x, y, r) = readLine()!!.split(" ").map(String::toInt)
    when {
        x - r < 0 || y - r < 0 || x + r > w || y + r > h -> println("No")
        else -> println("Yes")
    }
}
