fun main(args: Array<String>) {
    var map= hashMapOf("nama_depan" to "yhunio","nama_tengah" to "miki")
    map.put("nama_belakang","husnayanti")
    println(map.get("nama_belakang"))
    println(map["nama_belakang"])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    var lint = mutableListOf(11,22,33,22)
    lint[0]=22

    for (item in lint){
        println(item)
    }


}