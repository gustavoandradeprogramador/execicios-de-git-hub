fun main() {
    val a = listOf(7.0, 8.0, 9.0)
    var b = 0.0

    for (x in a) {
        b = b + x
    }

    val c = b / a.size
    println("Resultado: $c")

    var d = 0
    for (x in a) {
        if (x >= 7.0) {
            d++
        }
    }

    println("Aprovadas: $d")
}
