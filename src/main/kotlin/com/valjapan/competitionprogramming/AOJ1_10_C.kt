package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val n = readLine()!!.toInt()
        if (n == 0) break
        val s = readLine()!!.split(" ").map(String::toInt)
        println(Math.sqrt(s.map { Math.pow(it - s.average(), 2.0) }.sum().div(n)))
    }
}
