package com.demo.scala.chapter05_collection

object Scala03_Collection_Seq {

  /**
    * 集合-seq (序列)
    * scala集合中的seq表示就是有序,数据可重复的数据集合
    * 有序:插入顺序
    *
    */


  def main(args: Array[String]): Unit = {

    //构建
    //需要指定泛型
    //seq 是一个trait,所以无法直接构建对象,一般采用伴生对象的apply方法
    //seq是一个trait ,无法创建对象,所以底层采用List集合
    val seq :Seq[Int] = Seq.apply[Int](1,2,3,4)
    val seq2 :Seq[Int] = Seq(1,2,3,4)
    val list1 = List.apply[Int](1,2,3,4)
    val list2 = List.apply[Int](1,2,3,4)
    println(seq)
    //增删改查
    //seq list集合默认使用就是不可变的,所以常用的数据操作方法其实就是特殊符合
    //默认情况下,不可变的集合的数据操作,会产生新的集合
//    list1.:+(5)
//    list1.+:(6)
//    list2.++:(list1)

    val list3 = list1:+5
    val list4= 5 +:list1
    val list5 = list1.updated(0,6)

    println(list3)
    println(list4)
    println(list5)

    println(list1(0))
    println(list1.mkString(","))
    list1.foreach(println)

  }

}
