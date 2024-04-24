fun main() {
    //SET --> Enquanto as listas são ordenadas e permitem itens duplicados, os conjuntos não são ordenados e armazenam apenas itens únicos .
    //Set mutable   --> MutableSet()
    //Set read-only --> setOf()
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println (readOnlyFruit) //[apple, "banana, cherry]

    // .count --> conta o tanto 
    println ("Este conjunto tem $[readOnlyFruit.count()] itens") //Este conjunto tem 3 itens

    // ver se um item está no conjunto
    println ("banana" in readOnlyFruit) //true

    // .add e .remove no conjunto
    val fruta: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    fruta.add("dragonfruit") // adicionando dragonfruit no conjunto
    println(fruta) // [apple, banana, cherry, dragonfruit]

    fruta.remove("dragonfruit") // remove dragonfruit do conjunto
    println(fruta) // [apple, banana, cherry]
}
