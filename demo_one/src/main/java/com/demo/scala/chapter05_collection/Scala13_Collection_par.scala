package com.demo.scala.chapter05_collection

import scala.collection.parallel.CollectionConverters._


object Scala13_Collection_par {

  /**
    * 并行计算
    *
    */

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)
    val value = list.map(e=>Thread.currentThread().getName)
    println(value)

    val res1 = (1 to 5).map(e=>Thread.currentThread().getName)
    val res2 = (1 to 5).par.map(e=>Thread.currentThread().getName)
    println(res1)
    println(res2)

  }

}
