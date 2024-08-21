package com.demo.scala.chapter05_collection

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_ArrayBuffer {

  def main(args: Array[String]): Unit = {

    //集合 -- 可变数组
    val array = new ArrayBuffer[Int]()

    //增加
    array.append(1,2,3,4)
//    val array1 = Array(7,8,9)
//    array.addAll(array1)
//    array.insert(0,5)

    //修改
//    array.update(3,10)
    //创建新的数组
//    val newArray = array.updated(3,7)

    //删除
//    array.remove(1)
//    array.remove(1,2)

    //查询
    array.mkString(",")
//    array.foreach(println)
    val i = array(2)
    //等同于
    var ii = array.apply(0)
    println(ii)
    println(i)

    println(array)
//    println(newArray)

  }

}
