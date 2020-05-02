package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val (n, x) = readLine()!!.split(" ").map(String::toInt)

        if ((n == 0) and (x == 0)) {
            break
        }

        var combinationNum = 0

        for (a in (1..n)) {
            for (b in (1 until a)) {
                if (x <= a + b) {
                    break
                }
                val c = x - (a + b)
                if (c < b) {
                    combinationNum += 1
                } else {
                    continue
                }
            }
        }

        println("$combinationNum")
    }
}
