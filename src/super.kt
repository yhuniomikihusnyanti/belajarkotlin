/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
open class pesawat2(val sayap: Int=2){
    init {
        println("object pesawat dibuat...")
    }
    fun cetaksayap(){
        println("Sayap : " + sayap)
    }
}

class pesawattempur2(val rudal : Int=4) : pesawat2(){
    init {
        println("object pesawat tempur dibuat...")
        super.cetaksayap()
    }
}

fun main(args: Array<String>) {
    val f16 = pesawattempur2()
}
