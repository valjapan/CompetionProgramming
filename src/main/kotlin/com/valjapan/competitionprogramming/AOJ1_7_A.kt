package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val (m, f, r) = readLine()!!.split(" ").map(String::toInt)

        if (m == -1 && f == -1 && r == -1) break

        val rank = when {
            m == -1 || f == -1 -> "F"
            m + f >= 80 -> "A"
            m + f >= 65 -> "B"
            m + f >= 50 -> "C"
            m + f >= 30 && r >= 50 -> "C"
            m + f >= 30 && r < 50 -> "D"
            else -> "F"
        }

        println(rank)
    }
}
