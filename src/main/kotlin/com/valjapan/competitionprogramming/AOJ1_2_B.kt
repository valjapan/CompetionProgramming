package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    when {
        a < b -> {
            if (b < c) {
                println("Yes")
            } else {
                println("No")
            }
        }
        else -> println("No")
    }
}
