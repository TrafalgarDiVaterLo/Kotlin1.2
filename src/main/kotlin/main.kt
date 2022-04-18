fun main() {
    val amount = 13436_00
    val minCommission = 35
    val commissionTransfer = 0.0075

    val resultCommission = if (amount * commissionTransfer > minCommission) (amount * commissionTransfer) else minCommission

    println("Комиссия: ${resultCommission.toInt()} коп.")
}


