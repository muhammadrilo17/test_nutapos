data class TaxResult(val pajakRp: Double, val netSales: Double)

fun calculateTaxAndPriceBeforeTax(input: Double): TaxResult {
    val netSales = input - (input * 0.1)
    val pajakRp = input - netSales

    return TaxResult(pajakRp, netSales)
}