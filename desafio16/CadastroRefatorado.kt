fun gerarLog(mensagem: String) {
    println("LOG: $mensagem")
}

fun validarDados(nome: String, email: String): Boolean {
    return nome.isNotBlank() && email.contains("@")
}

fun salvarUsuario(nome: String, email: String) {
    println("Usuário salvo: $nome - $email")
}

fun enviarEmail(email: String) {
    println("E-mail enviado para: $email")
}

fun cadastrarUsuario(nome: String, email: String) {
    gerarLog("Iniciando cadastro")

    if (!validarDados(nome, email)) {
        gerarLog("Dados inválidos")
        return
    }

    salvarUsuario(nome, email)
    enviarEmail(email)
    gerarLog("Cadastro concluído")
}

fun main() {
    cadastrarUsuario("João", "joao@email.com")
}
