object HelloWorld {
  def main(args: Array[String]) {
    val str = "Hello,World!"

    var n1 = 12313

    n1 = 333
    println("Hello,World!            " + str + "      " +  n1.toDouble)

    println("----------------------------------------")
    zsw()
  }


  def zsw(): Unit ={
    println("ddddddddddddddddddddddd")
    val str = "zsw123"
    str.foreach(f =>{ println(f)
      println("ddddddddd"+f)
    })

    println("---------------------------------------")

    val array = Array("ss","sg")
    array.update(1,"sdfsdf")
    array.foreach(println)

    println("---------------------------------------")

    val list1 = List( 2,3,4)
    val list2 = List(5,6)
    val list3 =1 :: 2 :: "3" ::  list2
    val list4 = list1 ::: list2

    println(list4)
    list3.foreach(println)

    println("---------------------------------------")

    val tuple1 = (2323, 33, "dsfs" ,true)
    println(tuple1._1)
    println(tuple1._2)
    println(tuple1._3)
    println(tuple1._4)

    println("---------------------------------------")

    var set1  = Set("sdf", "ffdf")
    set1 += "fdfdfdf"

    set1.foreach(println)
    println("---------------------------------------")

    var map1 = Map(1->"11",2->"22")
    map1 += (3->"3333")
    map1.foreach(println)

  zswobj.zsp()


  }

}


object zswobj {
  def zsp (): Unit ={
    println("zzzzzzzzzzzzz")
  }


}