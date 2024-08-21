package com.demo.scala.chapter06_match

object Scala06_Partial {

  /**
    * 模式匹配 - 偏函数
    * 功能函数中，存在偏函数和全函数的概念
    *     所谓的全函数，表示功能函数会对对象数据集合中所有的数据进行处理
    *     偏函数：表示功能函数只会对满足条件的数据进行处理
    *
    */
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,"4",5)
//    val newList = list.map {
//      case i: Int => i + 1
//      case s: String =>
//    }
//    val newList = list.filter(_.isInstanceOf[Int]).map {
//      case i: Int => i + 1
//    }
    //如果想对满足条件的数据进行处理，那么采用偏函数
    //偏函数其实就是模式匹配，但是不是所有的功能都支持
    val newList = list.collect {
      case i: Int => i + 1
    }
    println(newList)
  }
}
