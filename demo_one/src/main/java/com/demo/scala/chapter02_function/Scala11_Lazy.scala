package com.demo.scala.chapter02_function

object Scala11_Lazy {

  /**
    * 惰性函数
    *
    */

  def main(args: Array[String]): Unit = {

    def test():String={
      println("function。。。。。")
      "zhangsan"
    }
    lazy val res = test()
//    val res = test();
    println(".........main")
    println(res)

  }

}
