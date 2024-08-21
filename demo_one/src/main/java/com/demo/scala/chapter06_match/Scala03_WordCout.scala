package com.demo.scala.chapter06_match

object Scala03_WordCout {

  def main(args: Array[String]): Unit = {
    val list = List(
      ("Hello World Scala Spark", 4),
      ("Hello World Scala", 3),
      ("Hello World", 2),
      ("Hello", 1)
    )
    list.map{
      case (k,v) => {
        (k+" ") * v
      }
    }.flatMap(s => s.split(" "))
      .map((_,1))
      .groupBy{
        case (k,v) =>{
          k
        }
      }.mapValues(_.size)
      .toList.sortBy{
      case (k,count) =>{
        count
      }
    }(Ordering.Int.reverse)
      .take(3)
      .foreach(println)


  }

}
