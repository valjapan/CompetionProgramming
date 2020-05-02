package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        val num = readLine()!!
        if (num == "0") break
        println(num.split("").filter(String::isNotEmpty).map(String::toInt).sum())
    }
}
