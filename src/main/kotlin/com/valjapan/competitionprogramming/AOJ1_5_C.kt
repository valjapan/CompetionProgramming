package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val (H, W) = readLine()!!.split(" ").map(String::toInt)
        if (H == 0 && W == 0) break
        for (i in 1..H) {
            for (j in 1..W) {
                if ((i + j) % 2 == 0) print("#")
                else print(".")
            }
            println("")
        }
        println("")
    }
}
