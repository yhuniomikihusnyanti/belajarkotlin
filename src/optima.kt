/**
 * Created by SAINTEK 101 on 10/2/2017.
 */

import java.util.*

fun main(args: Array<String>) {
    print("Enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

    var year=Calendar.getInstance().get(Calendar.YEAR)
    var Age=Int?
    Age=year-DOB


    println("your age is $Age years")
}