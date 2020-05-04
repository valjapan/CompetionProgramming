package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    var (x1, y1, x2, y2) = readLine()!!.split(" ").map(String::toDouble)
    val distance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))
    println("$distance")
}
