//----------------------------------------Inputs----------------------------------------

import java.util.Scanner // Importa a classe do scanner do java

fun main(){

    // Cria o objeto "scan" a partir da classe importada
    val scan = Scanner(System.`in`)

    //------------------Input de String-----------------
    print("Digite seu nome: ")
    var nome = readLine()

    //------------------Input de INT--------------------
    print("Digite sua idade: ")
    var idade = scan.nextInt()

    //------------------Input de Float------------------
    print ("Digite sua altura: ")
    var altura = scan.nextFloat()

    //===================================================

    println("Nome: $nome")
    println("Idade: $idade")
    println("Altura $altura")

}
