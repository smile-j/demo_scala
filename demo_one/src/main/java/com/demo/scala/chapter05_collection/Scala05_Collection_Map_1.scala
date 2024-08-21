package com.demo.scala.chapter05_collection

import scala.collection.mutable

object Scala05_Collection_Map_1 {

  /**
    * 集合-map
    * k-v
    * 数据是无序的
    * 可变的
    */
  def main(args: Array[String]): Unit = {

    //构建可变的map集合
    val map = mutable.Map("a"->1,"b"->2,"c"->3,"c"->4)

    map.put("e",10)
    map.update("g",6)

    map.remove("gg")
//    map.clear()
    map.foreach(println)
    val iterator = map.keysIterator
    val viterator = map.valuesIterator
    println(map)
    println(map.mkString(","))

    println("*"*10)

    //get的返回结果:Option
//    val maybeInt:Option[Int] = map.get("a")
//    val maybeInt:Option[Int] = map.get("a")
//    println(maybeInt.getOrElse(-1))

    val v = map.getOrElse("aa",-1)
    println(v)
  }

}
