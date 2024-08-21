package com.demo.scala.chapter05_collection

object Scala07_Collection {

  /**
    * 集合
    * 1.集合互相转换
    * 2.
    */

  def main(args: Array[String]): Unit = {

//    var list = List(
//      ("a",1)
//    )
//    val map:Map[String,Int] = list.toMap

//    val list = List(1,2,1,2)
//
//    val array:Array[Int] = list.toArray
//    val set = list.toSet
//
//    println(list)
//    println(array)
//    println(set)

//        var set = Set(
//          ("a",1)
//        )
//        val map:Map[String,Int] = set.toMap

//    val set = Set(1,2,3,4)
//    val array = set.toArray
//    val list = set.toList
//        println(list)
//        println(array)
//        println(set)

//    val map = Map(
//      ("a", 1), ("b", 2), ("c", 3)
//    )
//    val array:Array[(String,Int)] = map.toArray
//    val list:List[(String,Int)] = map.toList
//    val set:Set[(String,Int)] = map.toSet


    println(firstToUpper("lili"))
    println(firstToUpper(null))
    println(firstToUpper(""))
    println(firstToUpper("a"))
    println(".....end")
  }

  def firstToUpper(str: String):String={
    val opt = Option(str)
    if(opt.isEmpty ){
        opt.getOrElse("")
    }else{
      val value = opt.get
      if(value.trim.length==0){
        ""
      }else {
        opt.get.substring(0,1).toUpperCase+opt.get.substring(1)
      }

    }
//    str.substring(0,1).toUpperCase+str.substring(1)
  }

}
