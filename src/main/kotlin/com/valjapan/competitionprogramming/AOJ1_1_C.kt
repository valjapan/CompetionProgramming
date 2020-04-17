package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    val area = a * b
    val side = a * 2 + b * 2
    println("$area $side")
}
