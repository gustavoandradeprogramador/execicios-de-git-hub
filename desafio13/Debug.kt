fun main() {
    println("[LOG] Etapa 1: Recebendo usuario")
    print("Digite seu nome: ")
    val usuario = readLine() ?: ""

    println("[LOG] Etapa 2: Validando usuario")
    if (usuario.isBlank()) {
        println("[ERRO] O nome nao pode ficar vazio!")
        return
    }

    println("[LOG] Etapa 3: Buscando dados")
    val idade = 20

    println("[LOG] Etapa 4: Calculando resultado")
    val resultado = idade * 2

    println("[LOG] Etapa 5: Exibindo resultado")
    println("Usuario: $usuario")
    println("Resultado: $resultado")

    println("[LOG] Programa finalizado!")
}
