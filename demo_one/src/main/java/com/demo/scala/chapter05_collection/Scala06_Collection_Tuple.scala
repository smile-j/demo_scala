package com.demo.scala.chapter05_collection

object Scala06_Collection_Tuple {

  /**
    * 集合- tuple 元组
    *
    */

  def main(args: Array[String]): Unit = {
    //元组声明,采用小括号声明,将数据包含到小括号即可
    //Tuple也是集合,所以也有类型:TupleN[ClassName]
    //Tuple是元素的集合,但是有个数的限制:22个
    //Tuple集合限制的数据个数,但是没有限制数据类型,也就意味将集合对象放置在Tuple中也可以
    var t1:Tuple3[Int,String,Int] = (1,"zhangsan",23)
//    var t2 = (1,"zhangsan",23,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
//    println(t1)
    //Tuple如果采用集合类型表示比较麻烦,可以采用简化版本
    var t2:(Int,String,Int) = (1,"zhangsan",23)
    //tuple元素的访问
    //无法采用循环操作
    //如果想要访问其中的数据,可以采用顺序号
//    println(t2._1)
//    println(t2._2)
//    println(t2._3)

    //索引的方式访问
    val unit = t2.productElement(0)
    println(unit)
    val iterator = t2.productIterator
    while (iterator.hasNext){
      println(iterator.next())
    }

  }

}
