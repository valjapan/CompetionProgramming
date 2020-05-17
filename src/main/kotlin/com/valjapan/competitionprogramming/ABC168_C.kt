package com.valjapan.competitionprogramming

import kotlin.math.*
fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map(String::toInt)
    var hour = 30 * c + d * 0.5
    var minuets = d * 6.0
    var angle = hour - minuets
    if (angle >= 180) {
        angle = 360 - angle
    }
    val ans = a * a + b * b - 2 * a * b * cos(Math.toRadians(angle))
    println(sqrt(ans))
}
