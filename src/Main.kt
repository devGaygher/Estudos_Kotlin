fun main() {
    ex1(15)
    ex2(150)
    ex3(50)
    ex4(15)
    ex5(true)
    ex6(10)
    ex7("Concluído")
    ex8(4)

}
// exercícios de if-else

fun ex1(x: Int) {

    if (x > 10) println("Maior que 10.") else println("Menor que 10.")

}

fun ex2(y: Int){

    if (y > 100) println("Maior que 100.") else println("Menor que 100.")
}

fun ex3(number: Int){

    if(number > 0){
        if (number > 50) println("Maior que 50.") else println("Menor ou igual a 50.")
    }
}

fun ex4(z: Int){
    if (z in 20..30) println("Entre 20 e 30.")
}

fun ex5(isActive: Boolean){
    if (isActive == true) println("Ativo") else println("Inativo")
}


fun ex6(idade: Int){
    if (idade < 13) {
        println("Criança")
    } else if (idade in 13..17){
        println("Adolescente")
    } else {
        println("Adulto")
    }
}

fun ex7(status: String) {
    if (status == "Concluído") println("Tarefa concluída") else println("Tarefa pendente.")
}

fun ex8(numero: Int){
    if(numero in 5..15) println("Dentro do intervalo") else println("Fora do intervalo.")
}
