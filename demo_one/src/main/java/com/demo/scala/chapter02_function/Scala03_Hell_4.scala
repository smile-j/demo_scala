package com.demo.scala.chapter02_function

object Scala03_Hell_4 {

  /**
    * 将函数最为对象返回
    */

  def main(args: Array[String]): Unit = {

      def outer()={
        def inner():Unit={
            println("inner...hello")
        }
        inner _
    }
//    val f = outer()
//    f()
    outer()()

    def outer2(a:Int)={
      def mid(f:(Int,Int)=>Int)={
          def inner(b:Int)={
            f(a,b)
          }
        inner _
      }
      mid _
    }
    val unit = outer2(10)
    val value = unit(_ + _)
    println(value(20))
    println(outer2(20)(_ + _)(30))

  }

}
