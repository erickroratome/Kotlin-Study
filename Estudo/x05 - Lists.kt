fun main(){
    //----------------------------------------Lists----------------------------------------
    // Create a read-only list     --> listOf()
    // Create a mutable list       --> mutableListOf()
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes) // [triangle, square, circle]

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle") //Mutable list with explicit type declartion
    println(shapes) // [triangle, square, circle]

    //Ver itens expecificos da lista
    println("Primeiro item da lista ${readOnleShapes[0]}") //triangle

    // .first() .last() --> primeiro e ultimo item da lista
    println("Primeiro item da lista é: ${readOnlyShapes.first()}") //triangle
    println("Primeiro item da lista é: ${readOnlyShapes.last()}")  //circle

    // .count() --> conta o tanto de itens que tem na lista
    println("Essa lista $[readOnlyShapes.count()] itens")

    // saber se tem tal item na lista
    println("circle" in readOnlyShapes)

    // .add ou .remove itens na lista
    readOnlyShapes.add("pentagon")
    println(shapes) // [triangle, square, circle, pentagon]
    readOnlyShapes.remove("pentagon") // [triangle, square, circle]
}
