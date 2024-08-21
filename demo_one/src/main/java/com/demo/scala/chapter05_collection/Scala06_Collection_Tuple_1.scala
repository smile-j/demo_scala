package com.demo.scala.chapter05_collection

object Scala06_Collection_Tuple_1 {

  /**
    * 集合- tuple 元组
    *
    */

  def main(args: Array[String]): Unit = {
  //如果元组的元素个数的数量为2,称之为对偶元组.也称之为键值对对象
    val t1 = ("a",1)
    val t2 = ("b",2)

    val tuple:(String,Int) = "a"->3

    val tuple2 = 1->2->3->4
//    (((1,2),3),4)
    println(tuple2)

    //map集合的操作有了变化
    val map = Map(
      ("a",1),("b",2),("c",3)
    )
    for (kv<-map){
      println(kv._1+"="+kv._2)
    }
  }

}
