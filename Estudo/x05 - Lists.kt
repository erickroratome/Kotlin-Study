fun main(){
    /----------------------------------------Lists----------------------------------------
    // Create a read-only list     --> listOf()
    // Create a mutable list       --> mutableListOf()
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes) // [triangle, square, circle]

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle") //Mutable list with explicit type declartion
    println(shapes) // [triangle, square, circle]

    
}
