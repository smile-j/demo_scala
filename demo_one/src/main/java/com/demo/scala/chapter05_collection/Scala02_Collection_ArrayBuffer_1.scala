package com.demo.scala.chapter05_collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_ArrayBuffer_1 {

  def main(args: Array[String]): Unit = {

    //集合--可变数组
    //scala中绝大数的集合对象都是通过apply方法构建出来的
    val array = ArrayBuffer.apply(1,2,3)
    val array1 = Array.apply(1,2,3,4)

    //将不可变数组变成可变数组
    val buffer:mutable.Buffer[Int] = array1.toBuffer

    //将可变数组变成不可变数组
    val array3:Array[Int] = array.toArray


  }

}
