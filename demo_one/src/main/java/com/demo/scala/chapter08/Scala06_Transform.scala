package com.demo.scala.chapter08

object Scala06_Transform {

  /**
    * 隐式转换
    *
    */

  def main(args: Array[String]): Unit = {
      val list = List(1,3,2,4)

    /**
      * sortBy有俩个参数
      * 第二个参数列表，表示的隐式参数，调用时，无需加小括号，会自动查找排序规则
      * 如果不想使用隐式参数，需要增加括号
      */
    println(list.sortBy(num=>num))
    println(list.sortBy(num=>num)(Ordering.Int.reverse))
  }

}
