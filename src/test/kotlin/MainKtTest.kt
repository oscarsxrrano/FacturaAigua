import org.example.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest{
    @Test
    fun checkString(){
        val expected = "1.5"
        assertEquals(expected, readInt("a", "a"))
    }

    @Test
    fun checkBoolean(){
        val expected = true
        assertEquals(expected, readBoolean(pMessageIn = "tRUE", pMessageErrorDT = "Has de introduir true/false"))
    }

    @Test
    fun checkPreu(){ // quotaFixa: Double, precioPorLitro: Double, litres: Int, descuento: Int

        val expected = 19.5
        assertEquals(expected, preuTotal(6.0, 0.15, 90, 0))
    }
}