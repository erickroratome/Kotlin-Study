fun main(){
    // Os mapas armazenam itens como pares de valores-chave. Você acessa o valor referenciando a chave.
    // mutable map --> mutableMapOf()
    // read-only   --> mapOf()

    // Usar to entre cada chave e seu valor relacionado
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu) //{apple=100, kiwi=190, orange=100}

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu) //{apple=100, kiwi=190, orange=100}

    // Para evitar modificações indesejadas
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    // Pegar valor do produto
    println("O valor da maça é: ${readOnlyJuiceMenu["apple"]}") // O valor dessa maça é: 100

    // .count -- obter o número de chaves de um mapa
    println("O map tem ${readOnlyJuiceMenu.count()} itens") // O mapa tem 3 itens

    // .put     -- adcionar uma nova chave no map
    // .remove  -- remover um item existente do map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100)
    juiceMenu.put("coconut", 150) // adcionar
    println(juiceMenu) // {apple=100,coconut=100}
    juiceMenu.remove("coconut")
    println(juiceMenu) // {apple=100}

    // Verificar se há uma chave espefíca
    println (readOnlyJuiceMenu.containsKey("kiwi")) // true

    // Ver apenas as chaves e os valores
    // .keys   --> itens
    // .values --> valores
    println(readOnlyJuiceMenu.keys) // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values) // [100, 190, 100]

    // Testar se uma chave ou valor está no mapa --> in
    println (" orange" in readOnlyJuiceMenu.keys) // true
    println ("200" in readOnlyJuiceMenu) //false
}
