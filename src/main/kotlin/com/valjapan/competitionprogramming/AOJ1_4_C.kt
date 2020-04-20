package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val x = readLine()!!.split(" ")
        val a = x[0].toInt()
        val op = x[1]
        val b = x[2].toInt()
        if (op == "?") break
        when (op) {
            "+" -> println(a + b)
            "-" -> println(a - b)
            "*" -> println(a * b)
            "/" -> println(a / b)
        }
    }
}
