package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val (H, W) = readLine()!!.split(" ").map(String::toInt)
        if (H == 0 && W == 0) break
        println("${"#".repeat(W)}\n".repeat(H))
    }
}
