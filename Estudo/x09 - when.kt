fun main(){
  //When = quando
  //Use whenquando você tiver uma expressão condicional com múltiplas ramificações. whenpode ser usado como uma declaração ou como uma expressão.  
  //Coloque a expressão condicional entre parênteses ()e as ações a serem executadas entre chaves {}

  val obj = "Hello"
  when (obj) {
    "1" -> println("One")
    "Hello" -> println("Greeting")
    else -> println("Unknown")
  }

  // Aqui está um exemplo de uso whencomo expressão. A whensintaxe é atribuída imediatamente a uma variável:
  val result = when (obj) {
    "1" -> "One"
    "Hello" -> "Greeting"
    else -> "Unknown"
  }
  println(result)

  
}
