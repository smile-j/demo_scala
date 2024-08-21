package com.demo.scala.chapter05_collection

import scala.io.Source

object Scala14_Collection_Test {

  def main(args: Array[String]): Unit = {
    //不同省份商品排名
//    val source = Source.fromFile("D:\\project\\github\\bigdata_demo\\demo_scala\\datas\\data.txt")
    var list = List(
                  ("zhangsan","河北","鞋"),
                  ("lisi","河北","衣服"),
                  ("wangwu","河北","鞋"),
                  ("zhangsan","河南","鞋"),
                  ("lisi","河南","衣服"),
                  ("wangwu","河南","鞋"),
                  ("zhaoliu","河南","衣服"),
                  ("aa","河南","帽子"),
                  ("bb","河南","帽子"),
                  ("cc","河南","帽子")
                )
    val value = list.groupBy(kv=>kv._2)
      .mapValues(list=>list.map(v=>v._3).groupBy(item=>item).mapValues(subList=>subList.size).toList.sortBy(_._2)(Ordering.Int.reverse))

    value.foreach(e=>println(e._1+":"+e._2.mkString(",")))


  }

}
