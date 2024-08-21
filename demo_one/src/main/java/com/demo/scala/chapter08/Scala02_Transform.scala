package com.demo.scala.chapter08

object Scala02_Transform {

  def main(args: Array[String]): Unit = {
    /**
      * 隐式转换 - 二次编译
      *
      * 程序碰见了问题，如果是类型转换上的问题，可以通过编程手段转换类型解决
      * 编译器可以理解为代码生成器
      * 编译器在编译的时候，如果出现了错误，此时可以自动查找相应的操作。如果查找到，会自动进行转换，进行二次编译
      * 如果想让编译器可以找到指定的转换规则，那么需要将方法使用特殊的关键字声明 implicit
      */

    implicit def transfrom(d:Double)={
      d.toInt
    }
    val age :Int = thirdPartGetAge()
    println(s"age:${age}")
  }

  def thirdPartGetAge()={
    10.5
  }

}
