fun calcularMedia(notas: List<Double>): Double {
    return notas.sum() / notas.size
}

fun contarAprovadas(notas: List<Double>): Int {
    var quantidadeAprovadas = 0

    for (nota in notas) {
        if (nota >= 7.0) {
            quantidadeAprovadas++
        }
    }

    return quantidadeAprovadas
}

fun main() {
    val notas = listOf(7.0, 8.0, 9.0)

    val media = calcularMedia(notas)
    val aprovadas = contarAprovadas(notas)

    println("Média: $media")
    println("Aprovadas: $aprovadas")
}
