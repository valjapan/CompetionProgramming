package com.valjapan.competitionprogramming

import java.util.*

data class DiceD(val value: List<Int>) {

    private var x = 1
    private var z = 2
    private var y = 3

    fun copy(): DiceD {
        val copy = DiceD(value)
        copy.x = this.x
        copy.z = this.z
        copy.y = this.y
        return copy
    }

    fun rolls(ds: String): DiceD {
        for (d in ds) {
            roll(d)
        }
        return this
    }

    fun roll(d: Char) {
        if (d == 'S') {
            val w = x
            x = 7 - z
            z = w
        } else if (d == 'N') {
            val w = x
            x = z
            z = 7 - w
        } else if (d == 'E') {
            val w = x
            x = 7 - y
            y = w
        } else if (d == 'W') {
            val w = x
            x = y
            y = 7 - w
        }
    }

    fun top() = this.value.get(x - 1)

    fun south() = this.value.get(z - 1)

    fun east() = this.value.get(y - 1)

    fun west() = this.value.get(7 - y - 1)

    fun north() = this.value.get(7 - z - 1)

    fun bottom() = this.value.get(7 - x - 1)

    fun isSame(other: DiceD): Boolean {
        val patterns = mutableListOf<DiceD>(
            other.copy(),
            other.copy().rolls("E"),
            other.copy().rolls("EE"),
            other.copy().rolls("EEE"),
            other.copy().rolls("S"),
            other.copy().rolls("SE"),
            other.copy().rolls("SEE"),
            other.copy().rolls("SEEE"),
            other.copy().rolls("SS"),
            other.copy().rolls("SSE"),
            other.copy().rolls("SSEE"),
            other.copy().rolls("SSEEE"),
            other.copy().rolls("SSS"),
            other.copy().rolls("SSSE"),
            other.copy().rolls("SSSEE"),
            other.copy().rolls("SSSEEE"),
            other.copy().rolls("WS"),
            other.copy().rolls("WSE"),
            other.copy().rolls("WSEE"),
            other.copy().rolls("WSEEE"),
            other.copy().rolls("ES"),
            other.copy().rolls("ESE"),
            other.copy().rolls("ESEE"),
            other.copy().rolls("ESEEE")
        )

        return patterns.any { p ->
            this.top() == p.top()
                    && this.south() == p.south()
                    && this.east() == p.east()
                    && this.west() == p.west()
                    && this.north() == p.north()
                    && this.bottom() == p.bottom()
        }
    }

    fun setTopAndSouth(n: Int, m: Int) {

        val x = value.indexOf(n) + 1
        val z = value.indexOf(m) + 1

        if (x == -1 || z == -1) {
            return
        }

        this.x = x
        this.z = z
        if ((x == 1 && z == 2)
            || (x == 2 && z == 6)
            || (x == 6 && z == 5)
            || (x == 5 && z == 1)
        ) {
            y = 3
        } else if ((x == 1 && z == 3)
            || (x == 3 && z == 6)
            || (x == 6 && z == 4)
            || (x == 4 && z == 1)
        ) {
            y = 5
        } else if ((x == 1 && z == 4)
            || (x == 4 && z == 6)
            || (x == 6 && z == 3)
            || (x == 3 && z == 1)
        ) {
            y = 2
        } else if ((x == 1 && z == 5)
            || (x == 5 && z == 6)
            || (x == 6 && z == 2)
            || (x == 2 && z == 1)
        ) {
            y = 4
        } else if ((x == 2 && z == 3)
            || (x == 3 && z == 5)
            || (x == 5 && z == 4)
            || (x == 4 && z == 2)
        ) {
            y = 1
        } else if ((x == 2 && z == 4)
            || (x == 4 && z == 5)
            || (x == 5 && z == 3)
            || (x == 3 && z == 2)
        ) {
            y = 6
        }
    }

    override fun toString(): String {
        return "top:${top()}, south:${south()}, east:${east()}, west:${west()}, north:${north()}, bottom:${bottom()}"
    }
}

fun isAllDifferent(diceDS: List<DiceD>): Boolean {
    for (i in diceDS.indices) {
        for (j in i + 1 until diceDS.size) {
            if (diceDS[i].isSame(diceDS[j])) {
                return false
            }
        }
    }
    return true
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val dices = mutableListOf<DiceD>()
    (1..n).forEach {
        dices.add(
            DiceD(
                listOf(
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt()
                )
            )
        )
    }
    if (isAllDifferent(dices)) {
        println("Yes")
    } else {
        println("No")
    }
}
