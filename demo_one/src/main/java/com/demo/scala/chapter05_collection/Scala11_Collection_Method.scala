package com.demo.scala.chapter05_collection

object Scala11_Collection_Method {

  /**
    * 集合 功能函数   计算
    * 1.reduce 用于将数据集合中的数据两辆聚合，获取最终结果
    * 2.fold 数据集和外部的数据进行聚合，聚合原则还是两辆聚合
    * 3.scan 可以将fold,foldLeft,foldRight的执行过程记录下来
    */

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)
    list.reduce((e1,e2)=>e1+e2)
    val sum = list.reduce(_ + _)
    //reduce的底层就是reduceLeft
    println(list.reduceLeft(_ + _))
    println(list.reduceLeft(_ - _))

    //reduceRight的底层实现reduceLeft[B]((x, y) => op(y, x))
    //1-(2-(3-(4-5)))
    println(list.reduceRight(_ - _))


    println("fold-"*10)
    //fold 方法存在柯里化，有俩个参数
    //第一个参数列表传递一个参数：计算初始化值
    //第二个参数列表传递一个参数：参数类型为函数类型，表示计算逻辑（A1,A1）=>A1
//    println(list.fold(6)(_ + _))
    println(list.fold(5)(_ - _))
    println(list.foldLeft(5)(_ - _))
    //
    println(list.foldRight(5)(_ - _))
    println("scan-"*10)
    //扫描功能
    //可以将fold,foldLeft,foldRight的执行过程记录下来
    println(list.scan(5)(_ - _))
    //((((5-1)-2)-3)-4)
    println(list.scanLeft(5)(_ - _))
    //1-(2-(3-(4-5)))
    println(list.scanRight(5)(_ - _))


  }


}
