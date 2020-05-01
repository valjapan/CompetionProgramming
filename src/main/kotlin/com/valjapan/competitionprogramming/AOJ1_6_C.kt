package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val a = arrayListOf<ArrayList<ArrayList<Int>>>()
    for (i in 0 until 4) {
        a.add(ArrayList())
        for (j in 0 until 3) {
            a[i].add(ArrayList())
            for (k in 0 until 10) {
                a[i][j].add(0)
            }
        }
    }

    for (i in 0 until n) {
        val (b, f, r, v) = readLine()!!.split(" ").map { it.toInt() - 1 }
        a[b][f][r] += v + 1
    }

    for (i in 0 until 4) {
        if (i != 0) println("#".repeat(20))
        for (j in 0 until 3) {
            println(" " + a[i][j].joinToString(" "))
        }
    }
}
