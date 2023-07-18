// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        println("Matriculando ${usuario.nome} na formação ${nome}");
        add.inscritos(usuario);
    }

    fun matricular(usuarios: List<Usuario>) {
        println();
        println("Matricular Lista da usuários INICIO");

        foreach(usuario in usuarios) {
            println("Matriculando ${usuario.nome} na formação ${nome}");
            add.inscritos(usuario);
        }
        println("Matricular Lista da usuários FIM");
        println();
    }

    fun listarUsuarios() {
        println("Listar usuarios INICIO");
        foreach(usuario in usuarios) {
            println("Nome: ${usuario.nome}, idade: ${usuario.idade}")
        }
        println("Listar usuario FIM");
        println();
    }

    fun listarConteudo() {
        println();
        println("Listar conteudo INICIO");
        foreach(conteudo in conteudos) {
            println("Nome: ${conteudo.nome}, Duração: ${conteudo.duracao}, Nivel: ${conteudo.nivel}");
        }
        println("Listar conteudo FIM");
        println();
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")


    println("Exemplo com matricula de um usuario");
    val conteudo1 = ConteudoEducacional("Logica de Programação 1", 30, Nivel.BASICO);
    val conteudo2 = ConteudoEducacional("Logica de Programação 2", 60, Nivel.INTERMEDIARIO);
    val conteudo3 = ConteudoEducacional("Logica de Programação 3", 120, Nivel.AVANCADO);

    val conteudos = listOf(conteudo1, conteudo2, conteudo3);

    val formacao1 = Formacao("Lógica de programação", conteudos, Nivel.BASICO);

    val usuario1 = Usuario("Usuario 1", 20);
  

    formacao1.matricular(usuario1);
    formacao1.listarUsuarios;
    formacao1.listarConteudo;


    println("Exemplo com matricula de multiplos usuarios");

    val usuario2 = Usuario("Usuario 2", 18);
    val usuario3 = Usuario("Usuario 3", 25);

    matricular(listOf(usuario2, usuario3));
    formacao1.listarUsuarios;

}
