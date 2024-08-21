package com.demo.scala.chapter05_collection

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala03_Collection_Seq_Buffer {

  /**
    * 集合-seq (序列)
    *  1.Seq,List =>不可变
    *  2.ListBuffer =>可变
    */


  def main(args: Array[String]): Unit = {

    val buffList1 = ListBuffer(1,2,3,4)
    val buffList2 = ListBuffer(5,6,7,8)

    buffList1.append(9)
    buffList1.appendAll(buffList2)
    buffList1.insert(0,0)
//    buffList1.insertAll()
    buffList1.update(8,8)
    val buffList3 = buffList1.updated(8,8)

//    buffList1.remove(0)
//    buffList1.remove(0,2)
    println(buffList1)
    println(buffList3)

    println("*"*10)
    //List 与BufferList互相转换
    val list = List(1,2,3,4)
    var buffer = ListBuffer(5,6,7,8)
    val buffer2:mutable.Buffer[Int] = list.toBuffer
    val list2 = buffer.toList


  }

}
