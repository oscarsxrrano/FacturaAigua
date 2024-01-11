package org.example

/**
 * Función para enseñar el menu por pantalla
 * @author oscarsxrrano
 * @since 2024-01-11
 */

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

/**
 * Función para calcular el precio total
 * Recoge los datos introducidos por el usuario anteriormente, y hace una operación para conseguir el precio del agua
 * @param quotaFixa La quota fija a pagar
 * @param precioPorLitro El precio por litro según lo gastado
 * @param litres Los litros gastados por el cliente
 * @param descuento El porcentaje de descuento según familia/bono
 * @return Double: La suma entre 'quotaVariable' y 'quotaFija'
 * @author oscarsxrrano
 * @since 2024-01-11
 */

fun preuTotal(
    quotaFixa: Double,
    precioPorLitro: Double,
    litres: Int,
    descuento: Int
): Double {
    val quotaVariable = ((precioPorLitro * litres) - ((precioPorLitro * litres)) * descuento / 100)
    return quotaVariable + quotaFixa
}

/**
 * Función para calcular el precio total
 * Recoge los datos introducidos por el usuario anteriormente, y hace una operación para conseguir el precio del agua
 * @param quotaFixa La quota fija a pagar
 * @param precioPorLitro El precio por litro según lo gastado
 * @param litres Los litros gastados por el cliente
 * @param descuento El porcentaje de descuento según familia/bono
 * @param preuFinal El total del calculo hecho em la funcion 'preuTotal'
 * @return String: Estadisticas con todos los datos del cliente
 * @author oscarsxrrano
 * @since 2024-01-11
 */

fun resum(quotaFixa: Double,
          precioPorLitro: Double,
          litres: Int,
          descuento: Int,
          preuFinal: Double
):String {


    val sortida:String = println(WHITE_BACKGROUND_BRIGHT + BLUE_BOLD +"\n" + BLACK_BACKGROUND + YELLOW_BOLD_BRIGHT +
            "Amb aquestes dades, has de pagar $preuFinal€ al mes\n" +
            "ESTADÍSTIQUES: " +
            "Quota fixa: $quotaFixa\n" +
            "Litres esgotats: $litres\n" +
            "Preu per litre: $precioPorLitro\n" +
            "Descompte: $descuento%").toString()
    return sortida
}

