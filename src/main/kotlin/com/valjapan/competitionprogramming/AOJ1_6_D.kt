package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val a = arrayListOf<ArrayList<Int>>()
    val b = arrayListOf<Int>()
    val ans = arrayListOf<Int>()

    for (i in 0 until n) {
        a.add(ArrayList())
        val list = readLine()!!.split(" ").map { it.toInt() }
        list.forEach { t ->
            a[i].add(t)
        }
    }

    for (i in 0 until m) {
        b.add(readLine()!!.toInt())
    }

    for (i in 0 until n) {
        ans.add(0)
        for (j in 0 until m) {
            ans[i] += a[i][j] * b[j]
        }
    }
    println(ans.joinToString("\n"))
}
