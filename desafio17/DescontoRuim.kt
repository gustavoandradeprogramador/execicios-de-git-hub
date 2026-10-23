fun main() {
    val valorCompra = 200.0

    val descontoComum = valorCompra * 0.05
    println("Cliente comum: ${valorCompra - descontoComum}")

    val descontoPremium = valorCompra * 0.10
    println("Cliente premium: ${valorCompra - descontoPremium}")

    val descontoVip = valorCompra * 0.20
    println("Cliente VIP: ${valorCompra - descontoVip}")
}
