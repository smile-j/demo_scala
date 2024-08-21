package com.demo.scala.chapter05_collection

object Scala09_Collection_Method {

  /**
    * 集合 通用方法
    */

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)

//    println(list.length)
//    println(list.size)
//    println(list.isEmpty)
//    println(list.contains(2))
//    println(list.reverse)//反转
//    println(list.distinct)//去重
//    println(list.mkString(","))
//    list.foreach(println)

    //从集合获取一部分数据
    println(list.head)
    println(list(0))
    //集合除了头，都是尾，是一个集合
    println(list.tail)
    println(list.tails)
    //最后一个
    println(list.last)
    //除了最后一个
    println(list.init)
    println("*"*10)
    val list1 = list.take(2)
    println(list1)
    println(list.takeRight(2))
    println(list.drop(1))
    println(list.drop(2))
    println(list.dropRight(2))
    val option = list.find(x=>x %2 ==0)
    println(option.getOrElse(-1))
    println("*"*10)
    val list2 = List(1,2,3,4,5,6,7,8)
    //切分
    println(list2.splitAt(2))
    //滑动
    val unit = list2.sliding(2)
    //
    val unit2 = list2.sliding(2,2)
    println(unit.mkString(","))

  }


}
