package org.example

fun menuApp() {
    println(CYAN_BACKGROUND + WHITE_BOLD_BRIGHT +
        "          _____ _____ _    _           __  __ ______ _   _ _    _ \n" +
            "    /\\   |_   _/ ____| |  | |  /\\     |  \\/  |  ____| \\ | | |  | |\n" +
            "   /  \\    | || |  __| |  | | /  \\    | \\  / | |__  |  \\| | |  | |\n" +
            "  / /\\ \\   | || | |_ | |  | |/ /\\ \\   | |\\/| |  __| | . ` | |  | |\n" +
            " / ____ \\ _| || |__| | |__| / ____ \\  | |  | | |____| |\\  | |__| |\n" +
            "/_/    \\_\\_____\\_____|\\____/_/    \\_\\ |_|  |_|______|_| \\_|\\____/ ")

    println(WHITE_BACKGROUND_BRIGHT + BLUE_BOLD +
            "\nBenvingut al programa on podràs calcular quant has de pagar en aigua!")
}

fun resum(quotaFixa: Double,
          precioPorLitro: Double,
          litres: Int,
          descuento: Int
):String {

    val quotaVariable = ((precioPorLitro*litres ) - ((precioPorLitro*litres)) * descuento / 100)
    val preuFinal = quotaVariable + quotaFixa

    val sortida:String = println(WHITE_BACKGROUND_BRIGHT + BLUE_BOLD +"\n" + BLACK_BACKGROUND + YELLOW_BOLD_BRIGHT +
            "Amb aquestes dades, has de pagar $preuFinal€ al mes\n" +
            "ESTADÍSTIQUES: " +
            "Quota fixa: $quotaFixa\n" +
            "Litres esgotats: $litres\n" +
            "Preu per litre: $precioPorLitro\n" +
            "Descompte: $descuento%").toString()
    return sortida
}

