/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var arraylist=ArrayList<String>()
    arraylist.add("Akhmad")
    arraylist.add("Khanif")
    arraylist.add("Zyen")
    arraylist.add("Jepara")

    println("First name:"+ arraylist.get(0))

    println("all element by object")
    for (iteam in arraylist){
        println(iteam)
    }

    arraylist.set(0,"Unisnu Jepara")

    println("all element by index")
    for(index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    //Search
    if (arraylist.contains("Husein")){
        println("name is found")
    }else{
        println("name is not found")
    }
}
