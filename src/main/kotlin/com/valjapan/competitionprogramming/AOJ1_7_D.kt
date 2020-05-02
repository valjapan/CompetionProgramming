package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (n, m, l) = readLine()!!.split(" ").map(String::toInt)
    val a = (0 until n).map { readLine()!!.split(" ").map(String::toLong) }
    val b = (0 until m).map { readLine()!!.split(" ").map(String::toLong) }
    val ans = (0 until n).map { i -> (0 until l).map { j -> (0 until m).map { k -> a[i][k] * b[k][j] }.sum() } }
    ans.map { it.joinToString(" ") }.forEach(::println)
}
