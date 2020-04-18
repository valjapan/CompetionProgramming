package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    var i = 0
    while (true) {
        val x = readLine()!!.toInt()
        if (x == 0) break
        println("Case ${++i}: $x")
    }
}