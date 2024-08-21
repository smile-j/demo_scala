package com.demo.scala.chapter05_collection

import scala.collection.mutable.ListBuffer

object Scala09_Collection_Method_1 {

  /**
    * 集合 通用方法
    */

  def main(args: Array[String]): Unit = {

      val list1 = List(1,2,3,4)
      val list2 = List(5,6,3,4,7,8)

    val set1 = Set(1,2,3,4)
    val set2 = Set(3,4,5,6)

    //交集 并集 差集

    println(list1.intersect(list2))
    println(list1.union(list2))
    println(list1.concat(list2))
    //差集
    println(list1.diff(list2))

    println("----------------------------")
    //拉链：将俩个数据集拉在一起
    //将两个数据集相同的位置的数据拉在一起,形成对偶元组
    //如果俩个数据集的数据长度不相同，那么以较少的数据集为准
    println(list1.zip(list2))
    println(list1.zip(list2).toMap)
    println(set1.zip(set2))

    //每个元素乘以2
    val list = List(1,2,3,4)
    println(transform(list,(e:Int)=>e*3))
    println(transform(list,_*2))
    //map 用于将数据的每一条进行转换，获取转换后的新的数据集
    println(list.map(_ * 3))

  }
  def transform(list:List[Int],f:(Int)=>Int)={
    val resList = ListBuffer[Int]()
    list.foreach(ele=>{
      resList.append(f(ele))
    })
    resList.toList
  }


}
