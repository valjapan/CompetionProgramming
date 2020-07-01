package com.valjapan.competitionprogramming

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    val (d, e, f) = readLine()!!.split(" ").map(String::toInt)
    val (g, h, i) = readLine()!!.split(" ").map(String::toInt)
    var check = false

    when (a) {
        b -> check == invailed(check)
        c -> check == invailed(check)
        d -> check == invailed(check)
        g -> check == invailed(check)
    }

    when (b) {
        c -> check == invailed(check)
        e -> check == invailed(check)
        h -> check == invailed(check)
    }

    when (c) {
        f -> check == invailed(check)
        i -> check == invailed(check)
    }

    when (d) {
        e -> check == invailed(check)
        f -> check == invailed(check)
        g -> check == invailed(check)
    }

    when (e) {
        f -> check == invailed(check)
        h -> check == invailed(check)
    }

    when (f) {
        i -> check == invailed(check)
    }

    when (g) {
        h -> check == invailed(check)
        i -> check == invailed(check)
    }

    when (h) {
        i -> check == invailed(check)
    }

    vailed(check)
}

fun vailed(check: Boolean) {
    if (!check) {
        println("invailed")
    }
}

fun invailed(check: Boolean): Boolean {
    if (!check) {
        println("vailed")
        check
    }
    return check
}
