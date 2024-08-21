package com.demo.scala.chapter05_collection

object Scala02_Collection_Array_1 {

  def main(args: Array[String]): Unit = {

    //集合 - 数组
    //多维数组
//    val myMatrix = Array.ofDim[Int](3,3)
//    myMatrix.foreach(list=>list.foreach(println))
//    myMatrix.foreach(list=>list.mkString(","))

    //合并数组
    var array1 = Array(1,2,3,4)
    var array2 = Array(5,6,7,8)
    val array6 : Array[Int] = Array.concat(array1,array2)
//    array6.foreach(println)
    //创建指定范围的数组[1,3)
     val ints = Array.range(1,3)
    println(ints.mkString(","))
    println("*"*10)
    //创建并填充指定数量的数组
    val array8 = Array.fill[Int](5)(-1)
    array8.foreach(println)

  }

}
