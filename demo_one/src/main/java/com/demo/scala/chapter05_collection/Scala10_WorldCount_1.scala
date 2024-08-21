package com.demo.scala.chapter05_collection

import scala.io.Source

object Scala10_WorldCount_1 {

  def main(args: Array[String]): Unit = {

    val list = List(
      ("Hello World Scala Spark", 4),
      ("Hello World Scala", 3),
      ("Hello World", 2),
      ("Hello", 1)
    )
//    val value = list.map(kv=>(kv._1+" ")*kv._2)
//      .flatMap(line => line.split(" "))
//      .groupBy(v => v)
//      .mapValues(v => v.size)
//      .toList.sortBy(kv => kv._2)(Ordering.Int.reverse)
    val value = list.flatMap(kv=>kv._1.split(" ").toList.groupBy(v=>v).mapValues(v=>v.size * kv._2))
                    .groupBy(kv=>kv._1)
                    .mapValues(values=>values.map(_._2).sum)
    println(value.mkString(","))

    val list2 = List(
      ("hello", 4)
      , ("hello", 3)
      , ("hello", 2)
      , ("hello", 1)
    )
    val sum = list2.map(kv=>kv._2).sum
    println(sum)
  }

}
