package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (r, c) = readLine()!!.split(" ").map { it.toInt() }

    var sheets = MutableList(r) { MutableList(c) { 0 } }

    (0 until r).forEach { sheets[it] = readLine()!!.split(" ").map(String::toInt).toMutableList() }

    (0 until r).forEach { row ->
        sheets[row].forEach { print("$it ") }
        print("${sheets[row].sum()}")
        println()
    }

    (0 until c).forEach { column ->
        print("${sheets.sumBy { it[column] }} ")
    }

    println("${sheets.sumBy { it -> it.sumBy { it } }}")
}
