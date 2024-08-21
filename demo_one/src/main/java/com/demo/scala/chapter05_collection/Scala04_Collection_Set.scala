package com.demo.scala.chapter05_collection

object Scala04_Collection_Set {

  /**
    *  集合 -- set(集)
    *  描述: 无序,数据不可重复集合
    *
    */
  def main(args: Array[String]): Unit = {

    Set.apply(1,2,3,5)
    val set1 = Set.apply(1,2,1,3,5)
    val set2 = Set.apply(2,4,6)
    val set3 = Set.apply(1,2,3,4)

    //不可变集合的基本数据操作都是采用特殊符合
    val set4=  set3+5



    println(set3)
  }

}
