package fundamentos.Controle

fun main() {
    val alunos = arrayListOf("Andre", "Carla", "marcos")
    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}