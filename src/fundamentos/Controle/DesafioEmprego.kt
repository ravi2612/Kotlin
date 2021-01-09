package fundamentos

fun main() {

    for (i in 0..100){
        if (i % 2 == 0) {
            println("$i é um numero par ")
        }else if (i % 2 == 1) {
            println("$i é um numero impar ")
        }
    }
}