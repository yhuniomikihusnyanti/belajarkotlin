fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"yhunio")
    map.put(2,"miki")
    map.put(33,"husnayanti")
    println(map.get(33))
    map.put(33,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }

    var map2=HashMap<String,String>()
    map2.put("nama_depan :","yhunio")
    map2.put("nama_tengah :","miki")
    map2.put("nama_belakang :","husnayanti")
    map2.put("nama_tengah :","Unisnu Jepara")
    //println(map.keys)
    for (j in map2.keys){
        println(j + ""+map2.get(j))
    }
}