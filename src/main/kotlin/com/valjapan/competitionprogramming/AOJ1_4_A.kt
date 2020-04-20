package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val split = a / b
    val remainder = a % b
    val spritDouble = a.toDouble() / b.toDouble()
    println("%d %d %.8f\n".format(split, remainder, spritDouble))
}
