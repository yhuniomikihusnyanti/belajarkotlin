/**
 * Created by SAINTEK 101 on 10/10/2017.
 */
fun main(args: Array<String>) {
    for (i in 1..5) {
        for (j in 4 downTo i) {
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println()
    }
}
