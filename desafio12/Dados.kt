fun main() {
    print("Digite seu nome: ")
    val nome = readLine() ?: ""

    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull()

    print("Digite seu salario: ")
    val salario = readLine()?.toDoubleOrNull()

    if (nome.isBlank() || idade == null || salario == null) {
        println("Erro: digite os dados corretamente!")
    } else {
        println("Nome: $nome")
        println("Idade: $idade")
        println("Salario: $salario")
    }
}
