package org.example

import java.beans.beancontext.BeanContextChildComponentProxy

fun main() {
    var quotaMensual = 6.0
    var quotaVariable = 0.0
    val errorMSG1 = "Has de introduir un numero enter!"

    println("Benvingut al programa per calcular el cost del teu aigua!")

        val litres = ("Quants litres has gastat aquest mes?")
        val comprobarAigua = readInt(litres, errorMSG1)

        if (comprobarAigua in 0..49) {
            quotaVariable = 0.0
        } else if (comprobarAigua in 50..200) {
            quotaVariable = 0.15
        } else if (comprobarAigua > 200) {
            quotaVariable = 0.30
        }


    val errorMSG2 = "Has de introduir true/false"
    val familiaMSG = ("Tens familia nombrosa o monoparental?")
    val familia = readBoolean(familiaMSG, errorMSG2)

    // Comprobem si la familia es monoparental o familia numerosa, i apliquem descomptes segons el numero de persones
    var descuento = 10
    if (familia) {
        do {
            val numeroFamMSG = ("Quants membres sou a la familia?")
            val numFamilia = readInt(numeroFamMSG, errorMSG1)

            if (numFamilia in 1..5) {
                descuento *= numFamilia
            }   else if (numFamilia > 5) {
                descuento *= 5
            } else if (numFamilia == 0) {
                descuento = 0
                println("Mentiros!!!")
            }
        } while (numFamilia > 0)
    } else {
        println("No tens descompte")
        descuento = 0
    }

    // COmprobem si el client te un bo social
    val boSocialMSG = ("Tens bo social?")
    val boSocial = readBoolean(boSocialMSG, errorMSG2)

    if (boSocial) {
        quotaMensual = 3.0
    }



}