package com.demo.scala.chapter05_collection

import scala.collection.mutable

object Scala12_Queue {

  /**
    * 集合 queue
    * 队列的特点，先进先出
    * 进队和出队的方法分别为enqueue和dequeue
    *
    */

  def main(args: Array[String]): Unit = {

    val que = new mutable.Queue[String]()
    //添加元素
    que.enqueue("a","b","c")
    val que1 = que += "d"
    println(que eq que1)
    //获取元素
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
  }

}
