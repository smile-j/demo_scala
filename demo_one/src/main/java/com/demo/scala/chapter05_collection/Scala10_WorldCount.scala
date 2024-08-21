package com.demo.scala.chapter05_collection

import scala.io.Source

object Scala10_WorldCount {

  def main(args: Array[String]): Unit = {

    val source = Source.fromFile("D:\\project\\github\\bigdata_demo\\demo_scala\\datas\\word.txt")

//    val wordCount = source.getLines().toList
//      .flatMap(line => line.split(" "))
//      .map(k => (k, 1))
//      .groupBy((kv) => kv._1)
//      .mapValues(v => v.size)
//    val value = wordCount.toList.sortBy(kv=>kv._2)(Ordering.Int.reverse)
//    println(wordCount.mkString(","))
//    println(value)
//    //取前3名
//    println(value.take(3))

    val newRes = source.getLines().toList
      .flatMap(line => line.split(" "))
      .groupBy(v => v)
      .mapValues(v => v.size)
      .toList.sortBy(kv => kv._2)(Ordering.Int.reverse)
    println(newRes)

    source.close()

  }

}
