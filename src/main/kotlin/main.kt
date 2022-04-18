fun main() {
    val totalPrice = 100_000
    val discount = 100
    val discount5 = 0.05
    val discountMeloman = 0.01
    val discountStart = 1_000
    val discountEnd = 10_001
    var regularСustomer: Boolean


    var result =
        if (totalPrice > discountStart && totalPrice < discountEnd) totalPrice - discount else if (totalPrice > discountEnd) totalPrice - (totalPrice * discount5) else totalPrice
    println("К оплате: $result руб.")
    regularСustomer = true
    var resultMeloman =
        if (regularСustomer)result.toInt() - (result.toInt() * discountMeloman) else result
    println("К оплате меломану: $resultMeloman руб.")
}


