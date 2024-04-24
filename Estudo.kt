fun main(){
    //----------------------------------------Prints----------------------------------------
    // print   == printa e não pula linha
    // println == printa e pula linha
    println("Hello, World!")



    //----------------------------------------Variavel----------------------------------------//
    // variavel read-only --> val
    // variavel mutable   --> var
    val cinco = 5
    val sete = 7
    var custom = 10

    custom = 8
    println(custom)



    //----------------------------------------Strings Templates----------------------------------------
    // $
    // {}
    println("Apenas mostrando a variavel custom = $custom")
    println("Somando a variavel custom com + 1 = ${custom + 1}")

    //----------------------------------------Basic Types----------------------------------------
    custom = custom + 3 // custom == 11
    custom += 7 // custom == 18 | soma
    custom -= 3 // custom == 15 | subtração
    custom *= 2 // custom == 30 | multiplicação
    custom /= 3 // custom == 10 | divisão



    /*
    Integers                    Byte, Short, Int, Long
    Unsigned integers           UByte, UShort, UInt, ULong
    Floating-point numbers      Float, Double
    Booleans                    Boolean
    Characters                  Char
    Strings                     String
     */
    val d: Int
    d = 3
    val e: String = "Hello!"

    println (d)
    println (e)
    //Exercise
    /*
    fun main() {
    val a: Int      = 1000                    --> Int
    val b: String   = "log message"           --> String
    val c: Double   = 3.14                    --> Double
    val d: Long     = 100_000_000_000_000     --> Long
    val e: Boolean  = false                   --> Boolean
    val f: Char     = '\n'                    --> Char
    }
    */
}
