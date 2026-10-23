fun calcularPrecoComDesconto(
    valorCompra: Double,
    percentualDesconto: Double
): Double {
    return valorCompra - (valorCompra * percentualDesconto)
}

fun main() {
    val valorCompra = 200.0

    val precoComum = calcularPrecoComDesconto(valorCompra, 0.05)
    val precoPremium = calcularPrecoComDesconto(valorCompra, 0.10)
    val precoVip = calcularPrecoComDesconto(valorCompra, 0.20)

    println("Cliente comum: R$ $precoComum")
    println("Cliente premium: R$ $precoPremium")
    println("Cliente VIP: R$ $precoVip")
}
