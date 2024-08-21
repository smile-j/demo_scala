package com.demo.scala.chapter05_collection

import scala.collection.mutable.ListBuffer

object Scala09_Collection_Method_2 {

  /**
    * 集合 通用方法- 功能方法（函数）\
    * map
    * flatten
    * flatMap
    * filter
    * groupBy
    * mapValues
    * sortBy
    */

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)
    val listBuffer = ListBuffer(1,2,3,4)
    //map 用于将数据的每一条进行转换，获取转换后的新的数据集
    def mapFun(num:Int):Int={
      num * 2
    }
//    println(list.map(mapFun))
//    println(list.map(_ * 3))
    println(listBuffer)
    println(listBuffer.map(_ * 3))
    println("*"*10)
    //将集合中的整体数据拆分成个体来使用的功能，称之为扁平化
    val list2 = List(
      List(1, 2), List(3, 4)
    )
//    val flatten = list2.flatten
//    println(flatten)
    val list3 = List("Hello Scala","Hello Hadoop")
    // flatMap String =>
    val list4 = list3.flatMap(_.split(" "))
//    println(list4)
    val list5 = List(1,2,3,4)
    //过滤
//    println(list5.filter(_ %2 ==0))
    //分组
    println(list5.groupBy((e:Int)=>{
      if(e%2!=0){
        "奇"
      }else{
        "偶"
      }
    }))
    println(list5.groupBy(_ %2 ==0))
    println("*"*10)
    //mapValue
    val dataMap:Map[String,Int] = Map(
      ("a", 1), ("b", 2) ,("c", 3)
    )

    def test11(k:String,v:Int)={
      (k,v*2)
    }

    val newMap = dataMap.map { case (k:String, v:Int) => {
      (k, v * 2 )
    }
    }
    println(newMap)
//    dataMap.map(test11)
//    dataMap.map
//    dataMap.map(test11)
//val newMap = dataMap.mapValues(_ *2)
//    newMap.foreach(println)
//   println(dataMap)
//    val sortList = List(3,2,1,9)
//    println(sortList.sortBy((e)=>e))
//    val newList = sortList.sortBy(e=>e.toString)(Ordering.String.reverse)
//    println(sortList.sortBy(e=>e.toString)(Ordering.String.reverse))


  }


}
