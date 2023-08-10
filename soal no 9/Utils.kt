data class DiscountResult(val totalDiskon: Int, val totalHargaSetelahDiskon: Int)

fun calculateTotalDiscountAndTotalPriceAfterDiscount(totalBeforeDiscount: Int, discounts: IntArray): DiscountResult {
    var totalBeforeDiscountTemp = totalBeforeDiscount
    var totalDiscount = 0

    for (discount in discounts) {
        val discountAmount = (totalBeforeDiscountTemp * discount) / 100
        totalDiscount += discountAmount
        totalBeforeDiscountTemp -= discountAmount
    }

    return DiscountResult(totalDiscount, totalBeforeDiscountTemp)
}