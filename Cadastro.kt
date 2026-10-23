data class Usuario(
    val id: Int,
    var nome: String,
    var email: String
)

val usuarios = mutableListOf<Usuario>()
var proximoId = 1

fun cadastrarUsuario() {
    print("Nome: ")
    val nome = readLine()?.trim().orEmpty()

    print("E-mail: ")
    val email = readLine()?.trim().orEmpty()

    if (nome.isBlank() || !email.contains("@")) {
        println("Erro: informe um nome e um e-mail válido.")
        return
    }

    usuarios.add(Usuario(proximoId, nome, email))
    println("Usuário cadastrado com ID $proximoId.")
    proximoId++
}

fun listarUsuarios() {
    if (usuarios.isEmpty()) {
        println("Nenhum usuário cadastrado.")
        return
    }

    for (usuario in usuarios) {
        println("ID: ${usuario.id} | Nome: ${usuario.nome} | E-mail: ${usuario.email}")
    }
}

fun buscarUsuario() {
    print("Digite o ID do usuário: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Erro: digite um ID numérico.")
        return
    }

    val usuario = usuarios.find { it.id == id }

    if (usuario == null) {
        println("Usuário não encontrado.")
    } else {
        println("ID: ${usuario.id} | Nome: ${usuario.nome} | E-mail: ${usuario.email}")
    }
}

fun atualizarUsuario() {
    print("Digite o ID do usuário: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Erro: digite um ID numérico.")
        return
    }

    val usuario = usuarios.find { it.id == id }

    if (usuario == null) {
        println("Usuário não encontrado.")
        return
    }

    print("Novo nome: ")
    val nome = readLine()?.trim().orEmpty()

    print("Novo e-mail: ")
    val email = readLine()?.trim().orEmpty()

    if (nome.isBlank() || !email.contains("@")) {
        println("Erro: informe um nome e um e-mail válido.")
        return
    }

    usuario.nome = nome
    usuario.email = email

    println("Usuário atualizado com sucesso.")
}

fun removerUsuario() {
    print("Digite o ID do usuário: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Erro: digite um ID numérico.")
        return
    }

    val usuario = usuarios.find { it.id == id }

    if (usuario == null) {
        println("Usuário não encontrado.")
        return
    }

    usuarios.remove(usuario)
    println("Usuário removido com sucesso.")
}

fun main() {
    while (true) {
        println("\n===== SISTEMA DE CADASTRO =====")
        println("1 - Cadastrar usuário")
        println("2 - Listar usuários")
        println("3 - Buscar usuário")
        println("4 - Atualizar usuário")
        println("5 - Remover usuário")
        println("0 - Sair")
        print("Escolha uma opção: ")

        when (readLine()?.trim()) {
            "1" -> cadastrarUsuario()
            "2" -> listarUsuarios()
cat > Cadastro.kt <<'EOF'
data class Usuario(
    val id: Int,
    var nome: String,
    var email: String
)

val usuarios = mutableListOf<Usuario>()
var proximoId = 1

fun cadastrarUsuario() {
    print("Nome: ")
    val nome = readLine()?.trim().orEmpty()

    print("E-mail: ")
    val email = readLine()?.trim().orEmpty()

    if (nome.isBlank() || !email.contains("@")) {
        println("Erro: informe um nome e um e-mail válido.")
        return
    }

    usuarios.add(Usuario(proximoId, nome, email))
    println("Usuário cadastrado com ID $proximoId.")
    proximoId++
}

fun listarUsuarios() {
    if (usuarios.isEmpty()) {
        println("Nenhum usuário cadastrado.")
        return
    }

    for (usuario in usuarios) {
        println("ID: ${usuario.id} | Nome: ${usuario.nome} | E-mail: ${usuario.email}")
    }
}

fun buscarUsuario() {
    print("Digite o ID do usuário: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Erro: digite um ID numérico.")
        return
    }

    val usuario = usuarios.find { it.id == id }

    if (usuario == null) {
        println("Usuário não encontrado.")
    } else {
        println("ID: ${usuario.id} | Nome: ${usuario.nome} | E-mail: ${usuario.email}")
    }
}

fun atualizarUsuario() {
    print("Digite o ID do usuário: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Erro: digite um ID numérico.")
        return
    }

    val usuario = usuarios.find { it.id == id }

    if (usuario == null) {
        println("Usuário não encontrado.")
        return
    }

    print("Novo nome: ")
    val nome = readLine()?.trim().orEmpty()

    print("Novo e-mail: ")
    val email = readLine()?.trim().orEmpty()

    if (nome.isBlank() || !email.contains("@")) {
        println("Erro: informe um nome e um e-mail válido.")
        return
    }

    usuario.nome = nome
    usuario.email = email

    println("Usuário atualizado com sucesso.")
}

fun removerUsuario() {
    print("Digite o ID do usuário: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Erro: digite um ID numérico.")
        return
    }

    val usuario = usuarios.find { it.id == id }

    if (usuario == null) {
        println("Usuário não encontrado.")
        return
    }

    usuarios.remove(usuario)
    println("Usuário removido com sucesso.")
}

fun main() {
    while (true) {
        println("\n===== SISTEMA DE CADASTRO =====")
        println("1 - Cadastrar usuário")
        println("2 - Listar usuários")
        println("3 - Buscar usuário")
        println("4 - Atualizar usuário")
        println("5 - Remover usuário")
        println("0 - Sair")
        print("Escolha uma opção: ")

        when (readLine()?.trim()) {
            "1" -> cadastrarUsuario()
            "2" -> listarUsuarios()
            "3" -> buscarUsuario()
            "4" -> atualizarUsuario()
            "5" -> removerUsuario()
            "0" -> {
                println("Sistema encerrado.")
                return
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
