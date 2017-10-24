/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
open class Pesawat{
    val sayap : Int=2

    open fun terbang(){
        println("terbang...")
    }

    fun mendarat(){
        println("mendarat...")
    }
}

class PesawatTempur : Pesawat() {
    var rudal : Int = 4

    fun manuver(){
        println("manuver...")
    }

    override fun terbang(){
        println("terbang ala tempur...")
    }
}

fun main(args: Array<String>) {
    var boeing = Pesawat()
    var f16 = PesawatTempur()

    boeing.terbang()
    f16.terbang()

    boeing.mendarat()
    f16.mendarat()

    f16.manuver()
}
