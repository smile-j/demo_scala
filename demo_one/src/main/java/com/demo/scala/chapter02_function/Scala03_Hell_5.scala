package com.demo.scala.chapter02_function

object Scala03_Hell_5 {

  /**
    * 闭包
    * 如果一个函数使用了外部的变量，但是改变了这个变量的声明周期
    * 将这个变量包含到当前函数的作用域内，形成闭合的效果（环境），这个环境称之为闭包环境，简称闭包
    */

  def main(args: Array[String]): Unit = {

      def outer(a: Int)={
        def inner(b:Int)={
            a+b
        }
        inner _
    }
//    val f = outer()
//    f()
    val unit = outer(10)(20)
    println(unit)


  }

}
