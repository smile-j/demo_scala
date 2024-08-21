package com.demo.scala.chapter05_collection

object Scala05_Collection_Map {

  /**
    * 集合-map
    * k-v
    * 数据是无序的
    */
  def main(args: Array[String]): Unit = {

    //构建
    //scala的kv键值对可以采用特殊的方式构建
    val kv ="a"->1
    val map1 = Map(kv,"b"->2,"c"->3,"a"->10)
    val map2 = Map(kv,"b"->2,"c"->3,"d"->4,"e"->5,"f"->6)

    //增删改
    //不可变Map集合的数据基本操作还是特殊符合

    println(map1)
    //新版本 map
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

  }

}
