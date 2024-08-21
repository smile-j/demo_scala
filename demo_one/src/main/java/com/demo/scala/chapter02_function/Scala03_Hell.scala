package com.demo.scala.chapter02_function

object Scala03_Hell {

  /**
    * 函数加深版本
    *
    * scala完全面向对象的语言，所以万物皆对象
    * scala语言是完全面向函数式编程语言，所以万物皆函数
    */

  def main(args: Array[String]): Unit = {

    def test():Unit={

    }
    //如果一个函数声明时，参数列表中没有参数，那么可以省略小括号
    println(test)
    //如果不想让函数执行，只想访问这个函数本身
    println(test _)

  }

}
