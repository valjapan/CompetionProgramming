package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (a, b, C) = readLine()!!.split(" ").map(String::toInt)
    val radC = Math.toRadians(C.toDouble())
    val sinC = Math.sin(radC)
    val cosC = Math.cos(radC)

    val S = a * b * sinC / 2
    val L = a + b + Math.sqrt(square(a) + square(b) - 2 * a * b * cosC)
    val h = b * sinC
    println(S)
    println(L)
    println(h)
}

fun square(n: Int): Double = Math.pow(n.toDouble(), 2.0)
