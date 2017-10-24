/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class mobil4(val mesin: Int, val roda: Int, val body: Int) {
    init {
        println("Mesin: $mesin, Roda: $roda, Body: $body")
    }

}

fun main(args: Array<String>) {
    var innova = mobil4 (1,4,1)

    println("mesin : ${innova.mesin}")
    println("roda : ${innova.roda}")
    println("body : ${innova.body}")

}
