import org.example.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest{
    @Test
    fun checkPreu(){ // quotaFixa: Double, precioPorLitro: Double, litres: Int, descuento: Int

        var expected = 19.5
        assertEquals(expected, preuTotal(6.0, 0.15, 90, 0))
        expected = 21.0
        assertEquals(expected, preuTotal(6.0, 0.15, 200, 50))
        expected = 33.0
        assertEquals(expected, preuTotal(3.0, 0.3, 500, 80))
        expected = 1926.0
        assertEquals(expected, preuTotal(6.0, 0.3, 8000, 20))
    }
}