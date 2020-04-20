package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    println("${a.min()} ${a.max()} ${a.sum()}")
}
