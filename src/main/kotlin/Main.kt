package org.example

import java.beans.beancontext.BeanContextChildComponentProxy

fun main() {
    do {

        menuApp()

        var quotaFixa = 6.0
        var precioPorLitro = 0.0
        val errorMSG1 = "Has de introduir un numero enter!"
        val errorMSG2 = "Has de introduir true/false"


        val litresMSG = ("Quants litres has gastat aquest mes?")
        val litres = readInt(litresMSG, errorMSG1)

        if (litres in 0..49) {
            precioPorLitro = 0.0
        } else if (litres in 50..200) {
            precioPorLitro = 0.15
        } else if (litres > 200) {
            precioPorLitro = 0.30
        }

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
            } while (numFamilia == 0)
        } else {
            println("No tens descompte")
            descuento = 0
        }

        // COmprobem si el client te un bo social

        val boSocialMSG = ("Tens bo social?")
        val boSocial = readBoolean(boSocialMSG, errorMSG2)

        if (boSocial) {
            quotaFixa = 3.0
            descuento = 80
        }


        resum(quotaFixa, precioPorLitro, litres, descuento)

        val calcul = readBoolean(WHITE_BACKGROUND_BRIGHT + BLUE_BOLD + "Vols tornar a començar?", errorMSG2)
        if (!calcul) println("Gracies! Fins la propera!")

    } while (calcul)


}