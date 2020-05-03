package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    while (true) {
        var s = readLine()!!.toString() //最初の文字列
        if (s == "-") break
        val m = readLine()!!.toInt() //シャッフル回数
        val h = (0 until m).map { readLine()!!.toInt() }
        h.forEach { i ->
            s = s.slice(i until s.length) + s.slice(0 until i)
        }
        println(s)
    }
}
