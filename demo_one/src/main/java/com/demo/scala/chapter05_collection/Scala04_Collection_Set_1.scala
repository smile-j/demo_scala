package com.demo.scala.chapter05_collection

import scala.collection.mutable

object Scala04_Collection_Set_1 {

  /**
    *  集合 -- set(集)
    *  可变Set集合,需要根据包名区分
    *
    */
  def main(args: Array[String]): Unit = {
     var set1 = mutable.Set(1,2,3,4)
     var set2 = mutable.Set(5,6,7,8)

    //set集合没有append,insert方法,因为没有顺序的概念
    set1.add(9)

//    set1.update(9,false)
//    set1.update(5,true)
    set1(6)=true

    set1.remove(2)

    println(set1)
  }

}
