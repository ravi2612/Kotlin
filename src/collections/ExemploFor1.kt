package collections

fun main() {
    val alunos = arrayListOf("Amanda", "Andre", "Bernardo", "Carlos")

    for (aluno in alunos) {
        println(aluno)
    }

    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1}  - $aluno")
    }
}