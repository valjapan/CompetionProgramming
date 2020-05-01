package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    readLine()!!.toInt()
    println(readLine()!!.split(" ").map { it.toInt() }.reversed().joinToString(" "))
}
