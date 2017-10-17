/**
 * Created by SAINTEK 101 on 9/29/2017.
 */
fun main(args: Array<String>) {
    print("Masukkan nama : ")
    var name = readLine()
    print("masukkan umur : ")
    var age:Int = readLine()!!.toInt()
    print("Masukkan department : ")
    var department:String?
    department= readLine()
    println("name:"+ name)
    println("age:" + age)
    println("department:" + department)
    val pi:Double=3.4
    println("pi:" + pi)
}