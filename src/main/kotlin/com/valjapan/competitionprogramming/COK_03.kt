package com.valjapan.competitionprogramming

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun main(args: Array<String>) {
    val dragon = "dragon"
    var dragonCount = 0
    val griffin = "griffin"
    var griffinCount = 0
    val medusa = "medusa"
    var medusaCount = 0
    val troll = "troll"
    var trollCount = 0
    val vanpire = "vanpire"
    var vanpireCount = 0
    var resultJson = ""


    var FIRST_MONSTER = ""
    var SECOND_MONSTER = ""
    val strongName = mutableListOf<String>()


    for (i in 0..9) {
        when (i) {
            0 -> {
                FIRST_MONSTER = dragon
                SECOND_MONSTER = griffin
            }
            1 -> {
                FIRST_MONSTER = dragon
                SECOND_MONSTER = medusa
            }
            2 -> {
                FIRST_MONSTER = dragon
                SECOND_MONSTER = troll
            }
            3 -> {
                FIRST_MONSTER = dragon
                SECOND_MONSTER = vanpire
            }
            4 -> {
                FIRST_MONSTER = griffin
                SECOND_MONSTER = medusa
            }
            5 -> {
                FIRST_MONSTER = griffin
                SECOND_MONSTER = troll
            }
            6 -> {
                FIRST_MONSTER = griffin
                SECOND_MONSTER = vanpire
            }
            7 -> {
                FIRST_MONSTER = medusa
                SECOND_MONSTER = troll
            }
            8 -> {
                FIRST_MONSTER = medusa
                SECOND_MONSTER = vanpire
            }
            9 -> {
                FIRST_MONSTER = troll
                SECOND_MONSTER = vanpire
            }
        }

        val API_URL = "https://ob6la3c120.execute-api.ap-northeast-1.amazonaws.com/Prod/battle/" +
                FIRST_MONSTER + "+" +
                SECOND_MONSTER
        var url = URL(API_URL)
        var br = BufferedReader(InputStreamReader(url.openStream()))

        for (line in br.lines()) resultJson += line
        val (win, _) = resultJson.split(",")
        val (_, winName) = win.split(":")
        var winString = Regex(winName)

        if (winString.containsMatchIn(dragon)) dragonCount++
        if (winString.containsMatchIn(griffin)) griffinCount++
        if (winString.containsMatchIn(medusa)) medusaCount++
        if (winString.containsMatchIn(troll)) trollCount++
        if (winString.containsMatchIn(vanpire)) vanpireCount++

        val list = mutableListOf(dragonCount, griffinCount, medusaCount, trollCount, vanpireCount)
        list.sort()
        for (i in 0 until list.size) {
            when (list[i]) {
                dragonCount -> strongName.add(i, dragon)
                griffinCount -> strongName.add(i, griffin)
                medusaCount -> strongName.add(i, medusa)
                trollCount -> strongName.add(i, troll)
                vanpireCount -> strongName.add(i, vanpire)
            }
        }
    }
    println(strongName)
}
