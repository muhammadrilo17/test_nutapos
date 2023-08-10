data class PriceResult(val netUntukResto: Double, val shareUntukOjol: Double)

enum class FoodDeliveryService(val markupPercentage: Double) {
    GOFOOD(0.10),
    GRABFOOD(0.20),
    SHOPPEFOOD(0.25)
}

fun calculatePriceWithMarkup(originalPrice: Double, service: FoodDeliveryService): PriceResult {
    val hargaMarkup = originalPrice + (originalPrice * service.markupPercentage)
    val shareUntukOjol = hargaMarkup * 0.20
    val netUntukResto = hargaMarkup - shareUntukOjol

    return PriceResult(netUntukResto, shareUntukOjol)
}