fun disply(n:Int=0):Unit{
    println("n:$n")

}

fun displyNotInput():Unit{
    println("welcome to display")
}

fun main(args: Array<String>) {
    disply(10)
    disply()
    displyNotInput()
}