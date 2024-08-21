package com.demo.scala.chapter06_match

object Scala04_Test {

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,"4",5,6)
    val newList = list.filter {
      e =>
        e match {
          case i: Int => true
          case _ => false
        }
    }.map(e=>e.asInstanceOf[Int])
      .map(_ + 1)
//    println(newList)
    val newList2 = list.map { e =>
      e match {
        case i: Int => i + 1
        case s: String => s + 1
      }
    }
    println(newList2)


  }

}
